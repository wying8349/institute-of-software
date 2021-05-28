## 2021/5/24

### learned:

* [Java Spring框架入门教程](http://c.biancheng.net/spring/)
  1. Java Spring框架是什么？它有哪些好处？
  2. Spring体系结构详解
  3. Spring目录结构和基础JAR包介绍
  4. Spring IoC容器：BeanFactory和ApplicationContext
  5. **第一个Spring程序**
  6. Spring DI（依赖注入）的实现方式：属性注入和构造注入
  7. Spring Bean的配置及常用属性
  8. Spring实例化Bean的三种方法
  9. Spring中Bean的作用域
  10. Spring Bean的生命周期
  11. Spring基于XML装配Bean
  12. **Spring基于Annotation装配Bean**
  13. Spring自动装配Bean
 
* 第一个Spring程序
  1. [Idea中创建Web项目](https://www.cnblogs.com/yangyquin/p/5285272.html)
    - 创建空白项目
    - 创建一个module, 勾选Web Application, 勾选Create web.xml, 在web/WEB-INF下创建两个文件夹：classes和lib, 配置文件夹路径: Project structure -> Paths -> 将Output path和Test output path都选择刚刚创建的classes文件夹, Dependencies ->  将Module SDK选择为1.7 -> 点击右边的“+”号  -> 选择1 “Jars or Directories” -> 设为刚刚的lib文件夹 -> 选择“jar directory”
    - 配置Tomcat容器
      1. Edit Configuration -> 点击“+”号 -> 选择“Tomcat Server” -> 选择“Local”
      2. 在"Name"处输入新的服务名，点击"Application server"后面的"Configure..."，弹出Tomcat Server窗口，选择本地安装的Tomcat目录 -> OK 
      3. 在"Run/Debug Configurations"窗口的"Server"选项板中，取消勾选"After launch"，设置"HTTP port"和"JMX port"（默认值即可），点击 Apply -> OK， 至此Tomcat配置完成。
    - 在Tomcat中部署并运行项目 
      1. Run -> Edit Configurations，进入"Run/Debug Configurations"窗口 -> 选择刚刚建立的Tomcat容器 -> 选择Deployment -> 点击右边的“+”号 -> 选择Artifact ->选择web项目 -> Application context可以填“/hello”(其实也可以不填的~~) -> OK

  2. 导入 `WEB-INF/lib/commons-logging-1.2.jar`, `WEB-INF/lib/spring-beans-3.2.13.RELEASE.jar`, `WEB-INF/lib/spring-context-3.2.13.RELEASE.jar`, `WEB-INF/lib/spring-core-3.2.13.RELEASE.jar`, `WEB-INF/lib/spring-expression-3.2.13.RELEASE.jar`
  3. 将lib设为generated sources root, 不然不会被识别成spring框架
  4. [跟着做就可以了](http://c.biancheng.net/view/4251.html)

* [Spring入门篇](https://www.imooc.com/learn/196)
第1章 概述
本章对课程的情况进行介绍，并介绍框架和Spring概况。
 1-1 Spring入门课程简介 (05:56)
 1-2 Spring概况 (09:39)
 1-3 Spring框架 (04:24)
第2章 Spring IOC容器
介绍Spring IOC容器的基本概念和应用
 2-1 IOC及Bean容器 (20:18)
 2-2 Spring注入方式 (13:24)


## 2021/5/25

### learned:

* [Java Spring框架入门教程](http://c.biancheng.net/spring/)
  14. Spring AOP概述
  15. Spring JDK动态代理
  16. Spring CGLlB动态代理
  17. Spring通知类型和创建AOP代理
  18. Spring使用AspectJ开发AOP
* [面向切面编程AOP](https://www.zhihu.com/question/24863332)
  - Spring AOP就是基于动态代理的
* [Comparing Spring AOP and AspectJ](https://www.baeldung.com/spring-aop-vs-aspectj)



### questions:
* new Enhancer() throw InaccessibleObjectException
  - 网上给出解决方案是，在运行时添加--illegal-access=warn，试了一下不太合适，无法解决
  - 查了类似的问题(new Enhancer()造成IllegalArgumentException)，可能是cglib不支持我使用的某个类文件，因为此库依赖于ASM的过时版本。要解决此错误，我需要一个依赖于支持Java 8的ASM 5+的cglib版本。
  **这个问题还没有解决**
  
* org.springframework.beans.factory.xml.XmlBeanDefinitionStoreException: Line 6 in XML document from class path resource [com/mengma/factorybean/applicationContext.xml] is invalid; nested exception is org.xml.sax.SAXParseException; lineNumber: 6; columnNumber: 72; cvc-elt.1.a: Cannot find the declaration of element 'beans'.
  - 无法识别bean元素
  - 网络上给出的解决方案是，1. 检查有无拼写错误 2. 修改版本，与导入的jar一致
  - 暂时无法解决我遇到的问题
  - 或许需要查依赖树吗？
  - 为了进度先搁置
  **这个问题还没有解决**


## 2021/5/26
### learned
* [spring实战](https://potoyang.gitbook.io/spring-in-action-v5/)
* 早该知道Intellij可以直接用Spring Initializr生成新项目。。[官网教程](https://www.jetbrains.com/help/idea/spring-boot.html)
  - 1.1 什么是 Spring?
  - 1.2 初始化 Spring应用程序
      - 1.2.1 使用 Spring Tool Suite初始化 Spring项目（我使用了Idea，参考[官网教程](https://www.jetbrains.com/help/idea/spring-boot.html)）
      - 1.2.2检查 Spring项目结构
  - 1.3 编写 Spring应用程序（根据书中例子编写了web程序，用于定制玉米饼，代码稍后上传至仓库）
      - 1.3.1处理web请求
      - 1.3.2定义视图
      - 1.3.3测试控制器
      - 1.3.4构建并运行应用程序
      - 1.3.5了解 Spring Boot Dev Tools
      - 1.3.6回顾
  - 2.1 展示信息
      - 2.1.1建立域
      - 2.1.2创建控制器类
      - 2.1.3设计视图
   - 2.2处理表单提交
   - 2.3验证表单输入
      - 2.3.1声明验证规则
      - 2.3.2在表单绑定时执行验证
      - 2.3.3显示验证错误
   - 2.4使用视图控制器


## 2021/5/27
### learned
* [spring实战](https://potoyang.gitbook.io/spring-in-action-v5/)
* 第三章：使用jdbc读写数据，使用jdbctemplate
  - 如果不注解(如:
  ```
  @Repository
      public class JdbcTacoRepository implements TacoRepository
  ```
     中，忘记注解会导致编译时无法识别bean
     
### question
* 报错了，但只在web界面上显示，控制台看不到，应该如何调试？
  ![image](https://user-images.githubusercontent.com/48537562/119805025-e295ff00-beae-11eb-9aa5-4bab379361b9.png)
* 仔细检查后认为需要写一个类型转换器，但似乎没起作用
* 已解决，之前的convert加进去不起作用的原因是，Converter这个接口是spring本身就提供的，不能再单独写一个接口，单独写会导致注入不成功的。
    
## 2021/5/28
### learned
* [spring实战](https://potoyang.gitbook.io/spring-in-action-v5/)
* 阅读软件所代码：fibre中的risk package
  - 解决了gradle配置的问题（报unsupported class file major version 60, [需重新配置环境变量](https://stackoverflow.com/a/67583836/16055099)）
  - Could not resolve all dependencies for configuration ':classpath' 解决了，直接import就好了，不要open
* 阅读软件所代码：domain paclage

* [解析Java框架中entity层，mapper层，service层，controller各层作用](https://blog.csdn.net/u011095110/article/details/86088976)
  - 实体层: entity/domain: 用于存放我们的实体类，与数据库中的属性值基本保持一致，实现set和get的方法
  - mapper层: dao: 对数据库进行数据持久化操作，他的方法语句是直接针对数据库操作的，主要实现一些增删改查操作
  - service层: 给controller层的类提供接口进行调用。一般就是自己写的方法封装起来，就是声明一下，具体实现在serviceImpl中
  - controller层: web层: 控制层，负责具体模块的业务流程控制，需要调用service逻辑设计层的接口来控制业务流程, controller通过接收前端H5或者App传过来的参数进行业务操作，再将处理结果返回到前端

### 笔记
* Annotation:
  - [@ToString注释](https://blog.csdn.net/amoscn/article/details/86558018): 任何类定义都可以用@ToString注释，让lombok生成toString（）方法的实现。
  - [@ApiOperation](https://docs.swagger.io/swagger-core/v1.5.0/apidocs/io/swagger/annotations/ApiOperation.html): swagger的注释，用在方法上，说明方法的作用
  - [@RequestBody](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestBody.html): 用来接收前端传递给后端的json字符串中的数据, 因此不能使用GET方式(无请求体)
