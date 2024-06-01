## hive-embedded-mode-test

- For https://github.com/apache/shardingsphere/issues/29052 .

- Verified under Ubuntu 22.04.4 and `SDKMAN!`.

```shell
sdk install java 22.0.1-graalce
sdk use java 22.0.1-graalce

git clone git@github.com:linghengqian/hive-embedded-mode-test.git
cd ./hive-embedded-mode-test/
./mvnw clean test
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
[INFO] Copying 0 resource from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ hive-embedded-mode-test ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 1 source file with javac [debug target 22] to target/test-classes
[INFO] 由于在类路径中发现了一个或多个处理程序，因此启用了
  批注处理。未来发行版的 javac 可能会禁用批注处理，
  除非至少按名称指定了一个处理程序 (-processor)，
  或指定了搜索路径 (--processor-path, --processor-module-path)，
  或显式启用了批注处理 (-proc:only, -proc:full)。
  可使用 -Xlint:-options 隐藏此消息。
  可使用 -proc:none 禁用批注处理。
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ hive-embedded-mode-test ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.lingh.HiveTest
SLF4J: Class path contains multiple SLF4J bindings.
SLF4J: Found binding in [jar:file:/home/linghengqian/.m2/repository/org/apache/logging/log4j/log4j-slf4j-impl/2.18.0/log4j-slf4j-impl-2.18.0.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: Found binding in [jar:file:/home/linghengqian/.m2/repository/org/slf4j/slf4j-reload4j/1.7.36/slf4j-reload4j-1.7.36.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
SLF4J: Actual binding is of type [org.apache.logging.slf4j.Log4jLoggerFactory]
Hive Session ID = f2421f60-0e22-441b-81e2-a0ea632c3c97
15:29:24.906 [main] ERROR DataNucleus.Datastore.Schema - An exception was thrown while adding/validating class(es) : Required table missing : "VERSION" in Catalog "" Schema "". DataNucleus requires this table to perform its persistence operations. Either your MetaData is incorrect, or you need to enable "datanucleus.schema.autoCreateTables"
Required table missing : "VERSION" in Catalog "" Schema "". DataNucleus requires this table to perform its persistence operations. Either your MetaData is incorrect, or you need to enable "datanucleus.schema.autoCreateTables"
org.datanucleus.store.rdbms.exceptions.MissingTableException: Required table missing : "VERSION" in Catalog "" Schema "". DataNucleus requires this table to perform its persistence operations. Either your MetaData is incorrect, or you need to enable "datanucleus.schema.autoCreateTables"
        at org.datanucleus.store.rdbms.table.AbstractTable.exists(AbstractTable.java:593)
        at org.datanucleus.store.rdbms.RDBMSStoreManager$ClassAdder.performTablesValidation(RDBMSStoreManager.java:3424)
        at org.datanucleus.store.rdbms.RDBMSStoreManager$ClassAdder.run(RDBMSStoreManager.java:2946)
        at org.datanucleus.store.rdbms.AbstractSchemaTransaction.execute(AbstractSchemaTransaction.java:118)
        at org.datanucleus.store.rdbms.RDBMSStoreManager.manageClasses(RDBMSStoreManager.java:1643)
        at org.datanucleus.store.rdbms.RDBMSStoreManager.getDatastoreClass(RDBMSStoreManager.java:646)
        at org.datanucleus.store.rdbms.query.RDBMSQueryUtils.getStatementForCandidates(RDBMSQueryUtils.java:430)
        at org.datanucleus.store.rdbms.query.JDOQLQuery.compileQueryFull(JDOQLQuery.java:891)
        at org.datanucleus.store.rdbms.query.JDOQLQuery.compileInternal(JDOQLQuery.java:370)
        at org.datanucleus.store.query.Query.executeQuery(Query.java:1936)
        at org.datanucleus.store.query.Query.executeWithArray(Query.java:1864)
        at org.datanucleus.store.query.Query.execute(Query.java:1846)
        at org.datanucleus.api.jdo.JDOQuery.executeInternal(JDOQuery.java:439)
        at org.datanucleus.api.jdo.JDOQuery.execute(JDOQuery.java:263)
        at org.apache.hadoop.hive.metastore.ObjectStore.getMSchemaVersion(ObjectStore.java:11460)
        at org.apache.hadoop.hive.metastore.ObjectStore.getMetaStoreSchemaVersion(ObjectStore.java:11445)
        at org.apache.hadoop.hive.metastore.ObjectStore.checkSchema(ObjectStore.java:11403)
        at org.apache.hadoop.hive.metastore.ObjectStore.verifySchema(ObjectStore.java:11388)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.apache.hadoop.hive.metastore.RawStoreProxy.invoke(RawStoreProxy.java:97)
        at jdk.proxy2/jdk.proxy2.$Proxy20.verifySchema(Unknown Source)
        at org.apache.hadoop.hive.metastore.HMSHandler.getMSForConf(HMSHandler.java:554)
        at org.apache.hadoop.hive.metastore.HMSHandler.getMS(HMSHandler.java:546)
        at org.apache.hadoop.hive.metastore.HMSHandler.createDefaultDB(HMSHandler.java:630)
        at org.apache.hadoop.hive.metastore.HMSHandler.init(HMSHandler.java:341)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.apache.hadoop.hive.metastore.RetryingHMSHandler.invokeInternal(RetryingHMSHandler.java:91)
        at org.apache.hadoop.hive.metastore.AbstractHMSHandlerProxy.invoke(AbstractHMSHandlerProxy.java:82)
        at org.apache.hadoop.hive.metastore.RetryingHMSHandler.<init>(RetryingHMSHandler.java:58)
        at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:87)
        at org.apache.hadoop.hive.metastore.HMSHandlerProxyFactory.getProxy(HMSHandlerProxyFactory.java:43)
        at org.apache.hadoop.hive.metastore.HiveMetaStore.newHMSHandler(HiveMetaStore.java:153)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.apache.hadoop.hive.metastore.HiveMetaStoreClient.callEmbeddedMetastore(HiveMetaStoreClient.java:308)
        at org.apache.hadoop.hive.metastore.HiveMetaStoreClient.<init>(HiveMetaStoreClient.java:222)
        at org.apache.hadoop.hive.ql.metadata.HiveMetaStoreClientWithLocalCache.<init>(HiveMetaStoreClientWithLocalCache.java:118)
        at org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient.<init>(SessionHiveMetaStoreClient.java:154)
        at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:87)
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.<init>(RetryingMetaStoreClient.java:96)
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:149)
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:120)
        at org.apache.hadoop.hive.ql.metadata.Hive.createMetaStoreClient(Hive.java:5818)
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5896)
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5876)
        at org.apache.hadoop.hive.ql.session.SessionState.setAuthorizerV2Config(SessionState.java:1045)
        at org.apache.hadoop.hive.ql.session.SessionState.setupAuth(SessionState.java:1009)
        at org.apache.hadoop.hive.ql.session.SessionState.applyAuthorizationPolicy(SessionState.java:2058)
        at org.apache.hive.service.cli.CLIService.applyAuthorizationConfigPolicy(CLIService.java:135)
        at org.apache.hive.service.cli.CLIService.init(CLIService.java:119)
        at org.apache.hive.service.cli.thrift.EmbeddedThriftBinaryCLIService.init(EmbeddedThriftBinaryCLIService.java:41)
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:36)
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:356)
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:285)
        at org.apache.hive.jdbc.HiveDriver.connect(HiveDriver.java:94)
        at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:112)
        at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:341)
        at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:193)
        at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:428)
        at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:499)
        at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:112)
        at com.zaxxer.hikari.HikariDataSource.<init>(HikariDataSource.java:72)
        at com.lingh.HiveTest.test(HiveTest.java:20)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:765)
        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
        at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
        at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)

15:29:24.918 [main] ERROR org.apache.hadoop.hive.metastore.RetryingHMSHandler - MetaException(message:Version information not found in metastore.)
        at org.apache.hadoop.hive.metastore.ObjectStore.checkSchema(ObjectStore.java:11410)
        at org.apache.hadoop.hive.metastore.ObjectStore.verifySchema(ObjectStore.java:11388)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.apache.hadoop.hive.metastore.RawStoreProxy.invoke(RawStoreProxy.java:97)
        at jdk.proxy2/jdk.proxy2.$Proxy20.verifySchema(Unknown Source)
        at org.apache.hadoop.hive.metastore.HMSHandler.getMSForConf(HMSHandler.java:554)
        at org.apache.hadoop.hive.metastore.HMSHandler.getMS(HMSHandler.java:546)
        at org.apache.hadoop.hive.metastore.HMSHandler.createDefaultDB(HMSHandler.java:630)
        at org.apache.hadoop.hive.metastore.HMSHandler.init(HMSHandler.java:341)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.apache.hadoop.hive.metastore.RetryingHMSHandler.invokeInternal(RetryingHMSHandler.java:91)
        at org.apache.hadoop.hive.metastore.AbstractHMSHandlerProxy.invoke(AbstractHMSHandlerProxy.java:82)
        at org.apache.hadoop.hive.metastore.RetryingHMSHandler.<init>(RetryingHMSHandler.java:58)
        at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:87)
        at org.apache.hadoop.hive.metastore.HMSHandlerProxyFactory.getProxy(HMSHandlerProxyFactory.java:43)
        at org.apache.hadoop.hive.metastore.HiveMetaStore.newHMSHandler(HiveMetaStore.java:153)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.apache.hadoop.hive.metastore.HiveMetaStoreClient.callEmbeddedMetastore(HiveMetaStoreClient.java:308)
        at org.apache.hadoop.hive.metastore.HiveMetaStoreClient.<init>(HiveMetaStoreClient.java:222)
        at org.apache.hadoop.hive.ql.metadata.HiveMetaStoreClientWithLocalCache.<init>(HiveMetaStoreClientWithLocalCache.java:118)
        at org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient.<init>(SessionHiveMetaStoreClient.java:154)
        at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:87)
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.<init>(RetryingMetaStoreClient.java:96)
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:149)
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:120)
        at org.apache.hadoop.hive.ql.metadata.Hive.createMetaStoreClient(Hive.java:5818)
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5896)
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5876)
        at org.apache.hadoop.hive.ql.session.SessionState.setAuthorizerV2Config(SessionState.java:1045)
        at org.apache.hadoop.hive.ql.session.SessionState.setupAuth(SessionState.java:1009)
        at org.apache.hadoop.hive.ql.session.SessionState.applyAuthorizationPolicy(SessionState.java:2058)
        at org.apache.hive.service.cli.CLIService.applyAuthorizationConfigPolicy(CLIService.java:135)
        at org.apache.hive.service.cli.CLIService.init(CLIService.java:119)
        at org.apache.hive.service.cli.thrift.EmbeddedThriftBinaryCLIService.init(EmbeddedThriftBinaryCLIService.java:41)
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:36)
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:356)
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:285)
        at org.apache.hive.jdbc.HiveDriver.connect(HiveDriver.java:94)
        at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:112)
        at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:341)
        at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:193)
        at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:428)
        at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:499)
        at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:112)
        at com.zaxxer.hikari.HikariDataSource.<init>(HikariDataSource.java:72)
        at com.lingh.HiveTest.test(HiveTest.java:20)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:765)
        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
        at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
        at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)

15:29:24.920 [main] ERROR org.apache.hadoop.hive.metastore.RetryingHMSHandler - HMSHandler Fatal error: MetaException(message:Version information not found in metastore.)
        at org.apache.hadoop.hive.metastore.ObjectStore.checkSchema(ObjectStore.java:11410)
        at org.apache.hadoop.hive.metastore.ObjectStore.verifySchema(ObjectStore.java:11388)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.apache.hadoop.hive.metastore.RawStoreProxy.invoke(RawStoreProxy.java:97)
        at jdk.proxy2/jdk.proxy2.$Proxy20.verifySchema(Unknown Source)
        at org.apache.hadoop.hive.metastore.HMSHandler.getMSForConf(HMSHandler.java:554)
        at org.apache.hadoop.hive.metastore.HMSHandler.getMS(HMSHandler.java:546)
        at org.apache.hadoop.hive.metastore.HMSHandler.createDefaultDB(HMSHandler.java:630)
        at org.apache.hadoop.hive.metastore.HMSHandler.init(HMSHandler.java:341)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.apache.hadoop.hive.metastore.RetryingHMSHandler.invokeInternal(RetryingHMSHandler.java:91)
        at org.apache.hadoop.hive.metastore.AbstractHMSHandlerProxy.invoke(AbstractHMSHandlerProxy.java:82)
        at org.apache.hadoop.hive.metastore.RetryingHMSHandler.<init>(RetryingHMSHandler.java:58)
        at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:87)
        at org.apache.hadoop.hive.metastore.HMSHandlerProxyFactory.getProxy(HMSHandlerProxyFactory.java:43)
        at org.apache.hadoop.hive.metastore.HiveMetaStore.newHMSHandler(HiveMetaStore.java:153)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.apache.hadoop.hive.metastore.HiveMetaStoreClient.callEmbeddedMetastore(HiveMetaStoreClient.java:308)
        at org.apache.hadoop.hive.metastore.HiveMetaStoreClient.<init>(HiveMetaStoreClient.java:222)
        at org.apache.hadoop.hive.ql.metadata.HiveMetaStoreClientWithLocalCache.<init>(HiveMetaStoreClientWithLocalCache.java:118)
        at org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient.<init>(SessionHiveMetaStoreClient.java:154)
        at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:87)
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.<init>(RetryingMetaStoreClient.java:96)
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:149)
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:120)
        at org.apache.hadoop.hive.ql.metadata.Hive.createMetaStoreClient(Hive.java:5818)
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5896)
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5876)
        at org.apache.hadoop.hive.ql.session.SessionState.setAuthorizerV2Config(SessionState.java:1045)
        at org.apache.hadoop.hive.ql.session.SessionState.setupAuth(SessionState.java:1009)
        at org.apache.hadoop.hive.ql.session.SessionState.applyAuthorizationPolicy(SessionState.java:2058)
        at org.apache.hive.service.cli.CLIService.applyAuthorizationConfigPolicy(CLIService.java:135)
        at org.apache.hive.service.cli.CLIService.init(CLIService.java:119)
        at org.apache.hive.service.cli.thrift.EmbeddedThriftBinaryCLIService.init(EmbeddedThriftBinaryCLIService.java:41)
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:36)
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:356)
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:285)
        at org.apache.hive.jdbc.HiveDriver.connect(HiveDriver.java:94)
        at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:112)
        at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:341)
        at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:193)
        at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:428)
        at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:499)
        at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:112)
        at com.zaxxer.hikari.HikariDataSource.<init>(HikariDataSource.java:72)
        at com.lingh.HiveTest.test(HiveTest.java:20)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:765)
        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
        at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
        at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)

15:29:24.942 [main] ERROR org.apache.hadoop.hive.ql.session.SessionState - Error setting up authorization: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient
org.apache.hadoop.hive.ql.metadata.HiveException: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient
        at org.apache.hadoop.hive.ql.session.SessionState.setAuthorizerV2Config(SessionState.java:1049) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.setupAuth(SessionState.java:1009) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.applyAuthorizationPolicy(SessionState.java:2058) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.CLIService.applyAuthorizationConfigPolicy(CLIService.java:135) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.CLIService.init(CLIService.java:119) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.thrift.EmbeddedThriftBinaryCLIService.init(EmbeddedThriftBinaryCLIService.java:41) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:36) ~[hive-jdbc-4.0.0.jar:4.0.0]
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:356) ~[hive-jdbc-4.0.0.jar:4.0.0]
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:285) ~[hive-jdbc-4.0.0.jar:4.0.0]
        at org.apache.hive.jdbc.HiveDriver.connect(HiveDriver.java:94) ~[hive-jdbc-4.0.0.jar:4.0.0]
        at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:112) ~[HikariCP-java7-2.4.12.jar:?]
        at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:341) ~[HikariCP-java7-2.4.12.jar:?]
        at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:193) ~[HikariCP-java7-2.4.12.jar:?]
        at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:428) ~[HikariCP-java7-2.4.12.jar:?]
        at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:499) ~[HikariCP-java7-2.4.12.jar:?]
        at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:112) ~[HikariCP-java7-2.4.12.jar:?]
        at com.zaxxer.hikari.HikariDataSource.<init>(HikariDataSource.java:72) ~[HikariCP-java7-2.4.12.jar:?]
        at com.lingh.HiveTest.test(HiveTest.java:20) ~[test-classes/:?]
        at jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[?:?]
        at java.lang.reflect.Method.invoke(Method.java:580) ~[?:?]
        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:765) ~[junit-platform-commons-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at java.util.ArrayList.forEach(ArrayList.java:1597) ~[?:?]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at java.util.ArrayList.forEach(ArrayList.java:1597) ~[?:?]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56) ~[surefire-junit-platform-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184) ~[surefire-junit-platform-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148) ~[surefire-junit-platform-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122) ~[surefire-junit-platform-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385) ~[surefire-booter-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162) ~[surefire-booter-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507) ~[surefire-booter-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495) ~[surefire-booter-3.2.5.jar:3.2.5]
Caused by: java.lang.RuntimeException: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:89) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.<init>(RetryingMetaStoreClient.java:96) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:149) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:120) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.createMetaStoreClient(Hive.java:5818) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5896) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5876) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.setAuthorizerV2Config(SessionState.java:1045) ~[hive-exec-4.0.0.jar:4.0.0]
        ... 86 more
Caused by: java.lang.reflect.InvocationTargetException
        at jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:74) ~[?:?]
        at java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502) ~[?:?]
        at java.lang.reflect.Constructor.newInstance(Constructor.java:486) ~[?:?]
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:87) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.<init>(RetryingMetaStoreClient.java:96) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:149) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:120) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.createMetaStoreClient(Hive.java:5818) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5896) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5876) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.setAuthorizerV2Config(SessionState.java:1045) ~[hive-exec-4.0.0.jar:4.0.0]
        ... 86 more
Caused by: org.apache.hadoop.hive.metastore.api.MetaException: Got exception: org.apache.hadoop.hive.metastore.api.MetaException Version information not found in metastore.
        at org.apache.hadoop.hive.metastore.utils.MetaStoreUtils.throwMetaException(MetaStoreUtils.java:193) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.HiveMetaStoreClient.callEmbeddedMetastore(HiveMetaStoreClient.java:311) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.HiveMetaStoreClient.<init>(HiveMetaStoreClient.java:222) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.HiveMetaStoreClientWithLocalCache.<init>(HiveMetaStoreClientWithLocalCache.java:118) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient.<init>(SessionHiveMetaStoreClient.java:154) ~[hive-exec-4.0.0.jar:4.0.0]
        at jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62) ~[?:?]
        at java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502) ~[?:?]
        at java.lang.reflect.Constructor.newInstance(Constructor.java:486) ~[?:?]
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:87) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.<init>(RetryingMetaStoreClient.java:96) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:149) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:120) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.createMetaStoreClient(Hive.java:5818) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5896) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5876) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.setAuthorizerV2Config(SessionState.java:1045) ~[hive-exec-4.0.0.jar:4.0.0]
        ... 86 more
15:29:25.958 [main] ERROR com.zaxxer.hikari.pool.HikariPool - HikariPool-1 - Exception during pool initialization.
java.lang.RuntimeException: Error initializing embedded mode
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:40) ~[hive-jdbc-4.0.0.jar:4.0.0]
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:356) ~[hive-jdbc-4.0.0.jar:4.0.0]
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:285) ~[hive-jdbc-4.0.0.jar:4.0.0]
        at org.apache.hive.jdbc.HiveDriver.connect(HiveDriver.java:94) ~[hive-jdbc-4.0.0.jar:4.0.0]
        at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:112) ~[HikariCP-java7-2.4.12.jar:?]
        at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:341) ~[HikariCP-java7-2.4.12.jar:?]
        at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:193) ~[HikariCP-java7-2.4.12.jar:?]
        at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:428) ~[HikariCP-java7-2.4.12.jar:?]
        at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:499) ~[HikariCP-java7-2.4.12.jar:?]
        at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:112) ~[HikariCP-java7-2.4.12.jar:?]
        at com.zaxxer.hikari.HikariDataSource.<init>(HikariDataSource.java:72) ~[HikariCP-java7-2.4.12.jar:?]
        at com.lingh.HiveTest.test(HiveTest.java:20) ~[test-classes/:?]
        at jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[?:?]
        at java.lang.reflect.Method.invoke(Method.java:580) ~[?:?]
        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:765) ~[junit-platform-commons-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69) ~[junit-jupiter-engine-5.11.0-M2.jar:5.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at java.util.ArrayList.forEach(ArrayList.java:1597) ~[?:?]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at java.util.ArrayList.forEach(ArrayList.java:1597) ~[?:?]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54) ~[junit-platform-engine-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47) ~[junit-platform-launcher-1.11.0-M2.jar:1.11.0-M2]
        at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56) ~[surefire-junit-platform-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184) ~[surefire-junit-platform-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148) ~[surefire-junit-platform-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122) ~[surefire-junit-platform-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385) ~[surefire-booter-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162) ~[surefire-booter-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507) ~[surefire-booter-3.2.5.jar:3.2.5]
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495) ~[surefire-booter-3.2.5.jar:3.2.5]
Caused by: java.lang.RuntimeException: Error applying authorization policy on hive configuration: org.apache.hadoop.hive.ql.metadata.HiveException: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient
        at org.apache.hive.service.cli.CLIService.init(CLIService.java:122) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.thrift.EmbeddedThriftBinaryCLIService.init(EmbeddedThriftBinaryCLIService.java:41) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:36) ~[hive-jdbc-4.0.0.jar:4.0.0]
        ... 80 more
Caused by: java.lang.RuntimeException: org.apache.hadoop.hive.ql.metadata.HiveException: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient
        at org.apache.hadoop.hive.ql.session.SessionState.setupAuth(SessionState.java:1017) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.applyAuthorizationPolicy(SessionState.java:2058) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.CLIService.applyAuthorizationConfigPolicy(CLIService.java:135) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.CLIService.init(CLIService.java:119) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.thrift.EmbeddedThriftBinaryCLIService.init(EmbeddedThriftBinaryCLIService.java:41) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:36) ~[hive-jdbc-4.0.0.jar:4.0.0]
        ... 80 more
Caused by: org.apache.hadoop.hive.ql.metadata.HiveException: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient
        at org.apache.hadoop.hive.ql.session.SessionState.setAuthorizerV2Config(SessionState.java:1049) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.setupAuth(SessionState.java:1009) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.applyAuthorizationPolicy(SessionState.java:2058) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.CLIService.applyAuthorizationConfigPolicy(CLIService.java:135) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.CLIService.init(CLIService.java:119) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.thrift.EmbeddedThriftBinaryCLIService.init(EmbeddedThriftBinaryCLIService.java:41) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:36) ~[hive-jdbc-4.0.0.jar:4.0.0]
        ... 80 more
Caused by: java.lang.RuntimeException: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:89) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.<init>(RetryingMetaStoreClient.java:96) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:149) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:120) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.createMetaStoreClient(Hive.java:5818) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5896) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5876) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.setAuthorizerV2Config(SessionState.java:1045) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.setupAuth(SessionState.java:1009) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.applyAuthorizationPolicy(SessionState.java:2058) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.CLIService.applyAuthorizationConfigPolicy(CLIService.java:135) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.CLIService.init(CLIService.java:119) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.thrift.EmbeddedThriftBinaryCLIService.init(EmbeddedThriftBinaryCLIService.java:41) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:36) ~[hive-jdbc-4.0.0.jar:4.0.0]
        ... 80 more
Caused by: java.lang.reflect.InvocationTargetException
        at jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:74) ~[?:?]
        at java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502) ~[?:?]
        at java.lang.reflect.Constructor.newInstance(Constructor.java:486) ~[?:?]
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:87) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.<init>(RetryingMetaStoreClient.java:96) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:149) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:120) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.createMetaStoreClient(Hive.java:5818) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5896) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5876) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.setAuthorizerV2Config(SessionState.java:1045) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.setupAuth(SessionState.java:1009) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.applyAuthorizationPolicy(SessionState.java:2058) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.CLIService.applyAuthorizationConfigPolicy(CLIService.java:135) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.CLIService.init(CLIService.java:119) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.thrift.EmbeddedThriftBinaryCLIService.init(EmbeddedThriftBinaryCLIService.java:41) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:36) ~[hive-jdbc-4.0.0.jar:4.0.0]
        ... 80 more
Caused by: org.apache.hadoop.hive.metastore.api.MetaException: Got exception: org.apache.hadoop.hive.metastore.api.MetaException Version information not found in metastore.
        at org.apache.hadoop.hive.metastore.utils.MetaStoreUtils.throwMetaException(MetaStoreUtils.java:193) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.HiveMetaStoreClient.callEmbeddedMetastore(HiveMetaStoreClient.java:311) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.HiveMetaStoreClient.<init>(HiveMetaStoreClient.java:222) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.HiveMetaStoreClientWithLocalCache.<init>(HiveMetaStoreClientWithLocalCache.java:118) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient.<init>(SessionHiveMetaStoreClient.java:154) ~[hive-exec-4.0.0.jar:4.0.0]
        at jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62) ~[?:?]
        at java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502) ~[?:?]
        at java.lang.reflect.Constructor.newInstance(Constructor.java:486) ~[?:?]
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:87) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.<init>(RetryingMetaStoreClient.java:96) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:149) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:120) ~[hive-standalone-metastore-common-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.createMetaStoreClient(Hive.java:5818) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5896) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5876) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.setAuthorizerV2Config(SessionState.java:1045) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.setupAuth(SessionState.java:1009) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hadoop.hive.ql.session.SessionState.applyAuthorizationPolicy(SessionState.java:2058) ~[hive-exec-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.CLIService.applyAuthorizationConfigPolicy(CLIService.java:135) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.CLIService.init(CLIService.java:119) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.service.cli.thrift.EmbeddedThriftBinaryCLIService.init(EmbeddedThriftBinaryCLIService.java:41) ~[hive-service-4.0.0.jar:4.0.0]
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:36) ~[hive-jdbc-4.0.0.jar:4.0.0]
        ... 80 more
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 3.850 s <<< FAILURE! -- in com.lingh.HiveTest
[ERROR] com.lingh.HiveTest.test -- Time elapsed: 3.831 s <<< ERROR!
com.zaxxer.hikari.pool.HikariPool$PoolInitializationException: Failed to initialize pool: Error initializing embedded mode
        at com.zaxxer.hikari.pool.HikariPool.throwPoolInitializationException(HikariPool.java:528)
        at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:520)
        at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:112)
        at com.zaxxer.hikari.HikariDataSource.<init>(HikariDataSource.java:72)
        at com.lingh.HiveTest.test(HiveTest.java:20)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
Caused by: java.lang.RuntimeException: Error initializing embedded mode
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:40)
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:356)
        at org.apache.hive.jdbc.HiveConnection.<init>(HiveConnection.java:285)
        at org.apache.hive.jdbc.HiveDriver.connect(HiveDriver.java:94)
        at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:112)
        at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:341)
        at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:193)
        at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:428)
        at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:499)
        ... 6 more
Caused by: java.lang.RuntimeException: Error applying authorization policy on hive configuration: org.apache.hadoop.hive.ql.metadata.HiveException: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient
        at org.apache.hive.service.cli.CLIService.init(CLIService.java:122)
        at org.apache.hive.service.cli.thrift.EmbeddedThriftBinaryCLIService.init(EmbeddedThriftBinaryCLIService.java:41)
        at org.apache.hive.jdbc.EmbeddedCLIServicePortal.get(EmbeddedCLIServicePortal.java:36)
        ... 14 more
Caused by: java.lang.RuntimeException: org.apache.hadoop.hive.ql.metadata.HiveException: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient
        at org.apache.hadoop.hive.ql.session.SessionState.setupAuth(SessionState.java:1017)
        at org.apache.hadoop.hive.ql.session.SessionState.applyAuthorizationPolicy(SessionState.java:2058)
        at org.apache.hive.service.cli.CLIService.applyAuthorizationConfigPolicy(CLIService.java:135)
        at org.apache.hive.service.cli.CLIService.init(CLIService.java:119)
        ... 16 more
Caused by: org.apache.hadoop.hive.ql.metadata.HiveException: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient
        at org.apache.hadoop.hive.ql.session.SessionState.setAuthorizerV2Config(SessionState.java:1049)
        at org.apache.hadoop.hive.ql.session.SessionState.setupAuth(SessionState.java:1009)
        ... 19 more
Caused by: java.lang.RuntimeException: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:89)
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.<init>(RetryingMetaStoreClient.java:96)
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:149)
        at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:120)
        at org.apache.hadoop.hive.ql.metadata.Hive.createMetaStoreClient(Hive.java:5818)
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5896)
        at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:5876)
        at org.apache.hadoop.hive.ql.session.SessionState.setAuthorizerV2Config(SessionState.java:1045)
        ... 20 more
Caused by: java.lang.reflect.InvocationTargetException
        at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:74)
        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)
        at org.apache.hadoop.hive.metastore.utils.JavaUtils.newInstance(JavaUtils.java:87)
        ... 27 more
Caused by: MetaException(message:Got exception: org.apache.hadoop.hive.metastore.api.MetaException Version information not found in metastore.)
        at org.apache.hadoop.hive.metastore.utils.MetaStoreUtils.throwMetaException(MetaStoreUtils.java:193)
        at org.apache.hadoop.hive.metastore.HiveMetaStoreClient.callEmbeddedMetastore(HiveMetaStoreClient.java:311)
        at org.apache.hadoop.hive.metastore.HiveMetaStoreClient.<init>(HiveMetaStoreClient.java:222)
        at org.apache.hadoop.hive.ql.metadata.HiveMetaStoreClientWithLocalCache.<init>(HiveMetaStoreClientWithLocalCache.java:118)
        at org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient.<init>(SessionHiveMetaStoreClient.java:154)
        at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
        ... 30 more

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   HiveTest.test:20 » PoolInitialization Failed to initialize pool: Error initializing embedded mode
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.408 s
[INFO] Finished at: 2024-06-01T15:29:26+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.2.5:test (default-test) on project hive-embedded-mode-test: 
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
