package com.lingh;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings({"SqlDialectInspection", "SqlNoDataSourceInspection"})
public class HiveTest {

    @Test
    void test() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("jdbc:hive2:///demo_ds_0");
        hikariConfig.setDriverClassName("org.apache.hive.jdbc.HiveDriver");
        try (HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);
             Connection connection = hikariDataSource.getConnection();
             Statement statement = connection.createStatement()) {
            String tableName = "testHiveDriverTable";
            statement.execute("drop table if exists %s".formatted(tableName));
            statement.execute("create table %s (key int, value string)".formatted(tableName));
            String sql = "show tables '%s'".formatted(tableName);
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
            sql = "describe " + tableName;
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.printf("%s\t%s%n", resultSet.getString(1), resultSet.getString(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
