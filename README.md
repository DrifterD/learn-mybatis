# mybatis
主要涉及初级使用mybatis，高级mybatis用法，除此之外还介绍使用常规的辅助jar包，例如通用mapper和pageHleper

## sqlSessionFactory
mybatis创建最重要的角色sessionFacotory.可以通过`sqlSessionFactoryBuilder`创建sqlSessionFactory,也可以直接创建sqlSessionFactory对象。
然后再通过sqlSessionFactory创建sqlSession,最后通过sqlSession创建对应的映射器并且完成sql执行。
> sqlSessionFactoryBuilder 最好是局部变量，因为创建完成sqlSessionFactory之后无用咯，但是sqlSessionFactory必须一直存在，
需要不断创建新的sqlSession。sqlSession非线程安全，需要每次请求一个对象（生命周期是scope）

## mybatis 配置

### 配置
#### typeHandler
目的：将java类型转换成db数据结构。应用中常常用于**自定义enum 类型转换**。在高级应用中会详细讲解如何使用


#### defaultExecutor
默认执行器：
simple:常规的slq执行器，每调用一次请求，就会用sqlId重新预处理次sql
reuse:执行器会重用预处理语句
BATCH:BATCH 执行器将重用语句并执行批量更新

>mysql 相关配置信息[官方地址](!https://mybatis.org/mybatis-3/zh/configuration.html#typeHandlers)

#### 



## 基础使用

## 高级应用

### 插件开发
Mybatis 提供插件功能这样可以更加定制化实现自己的需求

#### Interceptor
Mybatis提供`org.apache.ibatis.plugin.Interceptor`接口可以实现具体插件内容
该接口下主要有三个方法：
* `Object intercept(Invocation var1) throws Throwable` 最主要方法自定义插件中需要做的内容
* `default Object plugin(Object target)` 获取插件需要拦截的对象，结合java8，Mybatis定义default关键字，默认已经存在方法体：
```java
 default Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }
```
`Plugin.wrap` 方法就可以自动获取到对应拦截对象，所以这一般没有自定义意义

>target 就是拦截器要拦截的对象，该方法会在创建被拦截的接口实现类时被调用。该方法的实现很简单 ，只需要调用 MyBatis 提供的 Plugin (org . apache. ibatis. plugin. Plugin ）类的 wrap 静态方法就可以通过 Java 的动态代理拦截目标对象
-- Mybatis从入门到精通

* ```default void setProperties(Properties properties)``` 插件参数设置，非必填项。所以这里Mybatis给出一个空方法体：

```java
 default void setProperties(Properties properties) {
    }

```

#### @Interceptors  @Signature
除了实现[Interceptor](#### Interceptor)外还需要在实现拦截接口上注解`@Interceptors`和`@Signature`。`@interceptors` 是`@Signature`的集合父类.
这里具体说下`@Signature`结构：
```java

public @interface Signature {
    Class<?> type();

    String method();

    Class<?>[] args();
}

```
type:需要拦截的对象类
method：需要拦截的对象实例下该方法名称
args：入参

#### 四大插件切入点
Mybatis虽然提供插件接口和插件注解，这并不表示任何一个流程和状态度可以插入，只有在一下规定四个接口中传递

##### Executor
• Executor ( update 、 query 、 flushStatements 、 commit 、 rollback 、
getTransaction 、 close 、 isClosed)

upate:该方法会在所有的 INSERT 、 UPDATE 、 DELETE 执行时被调用
query:查询到时候被执行
flushStatements:只有sqlSession调用flushStatement方法时或者调用带有`@flush`注解的方法才会被调用
commit:sqlsession提交事务
rollback：sqlsession回滚被执行
getTransaction：获取事务
close：关闭事务
isCLosed：事务状态是关闭

>Executor接口中更多入参的query是不可以被拦截器拦截（**还在探索中**）

##### ParameteHandler
• ParameterHandler ( getParameterObject 、 setParameters)

getParameterObject:只有在执行存储过程出参的时候才会被执行
setParameters:参数入参时被执行

##### ResultSetHandler
• ResulSetHandler ( handleResultSets 、 handleCursorResultSets 、
handleOutputParameters)

handleResultSets:查询结果集被执行
handleCursorResultSets:
handleOutputParameters:存储过程出参时被调用

##### StatementHandler
• StatementHandler (prepare 、 parameterize 、 batch 、 update 、 query)

prepare：该方法会在数据库执行所有之前完成
parameterize:在执行`prepare`之后执行关于参数信息的
batch:在全局设置配置 defaultExecutorType＝ ” BATCH ” 时，执行数据操作才会调用该方法
query:在执行`select`时被执行
