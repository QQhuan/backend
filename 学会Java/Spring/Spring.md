# Spring

## 简介

Java EE的一款轻量级的开源框架

- 广义的Spring：以Spring Framework为核心的Spring技术栈

  > `Spring Framework、Spring MVC、SpringBoot、Spring Cloud、Spring Data、Spring Security` 

- 侠义的Spring：特指Spring Framework，也就是Spring框架，也是Spring技术栈的核心和基础

## Spring的两个核心

- IoC，Inverse of Control，控制反转，把创建对象的过程交给Spring管理

- AOP，Aspect Oriented Programming，面向切向编程

  > AOP 用来封装多个类的公共行为，将那些与业务无关，却为业务模块所共同调用的逻辑封装起来，减少系统的重复代码，降低模块间的耦合度。另外，AOP 还解决一些系统层面上的问题，比如日志、事务、权限等。

## JavaBean

Bean是Java中的一个概念，它是指一个被实例化的Java类。Bean类通常具有以下特征：

1. 具有默认的无参构造函数

2. 一系列读写属性，属性通过getters和setters方法进行访问

3. 实现了Serializable接口，以便于在网络中传输或存储到磁盘中

   > Serializable接口，一个标记接口，用于指示类的对象可以被序列化为字节流，以便在网络上传输或保存到文件中。
   >
   > 要实现Serializable接口，只需在类声明中添加关键字"implements Serializable"即可。这样，类的对象就可以通过ObjectOutputStream进行序列化，通过ObjectInputStream进行反序列化。

Bean类可以用于各种用途，例如表示用户、订单、商品等等。在Java EE中，Bean类通常用于实现业务逻辑和持久化数据。

- 每一个bean对象对应了数据库表中的每一条记录

## Java开发数据流

在web应用中，java的作用的作用其实是：

①控制数据流的流向，将前台传过来的数据包起来，然后一个一个地插入数据库中；

②从数据库中用jdbc取出数据，然后包起来，最终传递到前端展示。

> - 前端页面数据
>
> - ajax传递到Controller层
> - 与JavaBean做映射，将数据保存到JavaBean中
> - 进入Service层，对数据做逻辑操作、判断
> - 进入Dao层，访问并操作数据库