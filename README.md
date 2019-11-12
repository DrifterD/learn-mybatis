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