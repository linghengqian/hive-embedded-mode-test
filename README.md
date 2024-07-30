## hive-embedded-mode-test

- For https://github.com/apache/shardingsphere/issues/29052 ,
  https://github.com/dbeaver/dbeaver/issues/22777
  and https://issues.apache.org/jira/browse/HIVE-28295 .

- Verified under Ubuntu 22.04.4 and `SDKMAN!`.

```shell
sdk install java 8.0.422-tem
sdk use java 8.0.422-tem
sdk install maven
git clone git@github.com:apache/hive.git
cd ./hive/
git reset --hard 929305f077f5e40311939ce7256adb3b35d985b0
mvn clean install -DskipTests -T1C 
cd ../

git clone git@github.com:linghengqian/hive-embedded-mode-test.git
cd ./hive-embedded-mode-test/
mkdir -p /tmp/hive
chmod -R 777 /tmp/hive
./mvnw clean test
rm -rf /tmp/hive
```

- Log as follows.

```shell
$ ./mvnw clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------< com.lingh:hive-embedded-mode-test >------------------
[INFO] Building hive-embedded-mode-test 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ hive-embedded-mode-test ---
[INFO] Deleting /home/linghengqian/TwinklingLiftWorks/git/public/hive-embedded-mode-test/target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ hive-embedded-mode-test ---
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/hive-embedded-mode-test/src/main/resources
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ hive-embedded-mode-test ---
[INFO] No sources to compile
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ hive-embedded-mode-test ---
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/hive-embedded-mode-test/src/test/resources
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ hive-embedded-mode-test ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 1 source file with javac [debug target 1.8] to target/test-classes
[INFO] 
[INFO] --- surefire:3.2.2:test (default-test) @ hive-embedded-mode-test ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.lingh.HiveTest
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.127 s <<< FAILURE! -- in com.lingh.HiveTest
[ERROR] com.lingh.HiveTest.test -- Time elapsed: 0.112 s <<< ERROR!
java.lang.NoClassDefFoundError: org/apache/hadoop/mapred/JobConf
        at org.apache.hadoop.hive.conf.HiveConf.initialize(HiveConf.java:6498)
        at org.apache.hadoop.hive.conf.HiveConf.<init>(HiveConf.java:6456)
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.buildOverlayedConf(EmbeddedCLIServicePortal.java:46)
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:36)
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:356)
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:285)
        at org.apache.hive.jdbc.HiveDriver.connect(HiveDriver.java:94)
        at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:121)
        at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:364)
        at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:206)
        at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:476)
        at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:561)
        at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:115)
        at com.zaxxer.hikari.HikariDataSource.<init>(HikariDataSource.java:81)
        at com.lingh.HiveTest.test(HiveTest.java:20)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at java.util.ArrayList.forEach(ArrayList.java:1259)
        at java.util.ArrayList.forEach(ArrayList.java:1259)
Caused by: java.lang.ClassNotFoundException: org.apache.hadoop.mapred.JobConf
        at java.net.URLClassLoader.findClass(URLClassLoader.java:387)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:418)
        at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:352)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:351)
        ... 18 more

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   HiveTest.test:20 » NoClassDefFound org/apache/hadoop/mapred/JobConf
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.232 s
[INFO] Finished at: 2024-07-30T14:43:49+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.2.2:test (default-test) on project hive-embedded-mode-test: 
[ERROR] 
[ERROR] Please refer to /home/linghengqian/TwinklingLiftWorks/git/public/hive-embedded-mode-test/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
