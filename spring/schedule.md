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


## 2021/5/24

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