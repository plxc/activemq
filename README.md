# ActiveMQ

### ActiveMQ安装

- ActiveMQ基于Java开发，需要有jdk环境。
- ActiveMQ[http://activemq.apache.org/download.html](http://activemq.apache.org/download.html)
- 运行：bin/activemq start
- 默认控制台地址默认端口：8161     用户名/密码：admin/admin

### ActiveMQ简述

    
JMS定义了五种不同的消息正文格式

- StreamMessage -- Java原始值的数据流
- MapMessage--一套名称-值对
- TextMessage--一个字符串对象
- ObjectMessage--一个序列化的 Java对象
- BytesMessage--一个字节的数据流

对于消息的传递有两种类型

- 点对点的，即一个生产者和一个消费者一一对应；Queue   
- 发布/订阅模式，即一个生产者产生消息并进行发送后，不保存，可以由多个消费者进行接收。Topic  
- 默认：单点，未消费持久化消息；广播，非持久   可通过配置持久化消息

### ActiveMQ使用

添加依赖

    <dependency>
        <groupId>org.apache.activemq</groupId>
        <artifactId>activemq-all</artifactId>
        <version>5.15.2</version>
    </dependency>