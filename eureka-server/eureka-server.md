# Eureka   注册中心

## Eureka是Netflix开源的服务发现组件，本身是一个基于REST的服务。它包含Server和Client两部分。Spring Cloud将它集成在子项目Spring Cloud Netflix中，从而实现微服务的注册与发现。

### Eureka包含两个组件：Eureka Server和Eureka Client。

* Eureka Server提供服务发现的能力，各个微服务启动时，会向Eureka Server注册自己的信息（例如IP、端口、微服务名等），Eureka Server会存储这些信息。
* Eureka Client是一个Java客户端，用于简化与Eureka Server的交互。
* 微服务启动后，会周期性（默认30s）向Eureka Server发送心跳以续约自己的“租期”。
* 如果Eureka Server在一定时间内没有接收到某个微服务实例的心跳，Eureka Server将会注销该实例（默认90s）。
* 默认情况下，Eureka Server同时也是Eureka Client。多个Eureka Server实例，互相之间通过复制的方式，来实现服务注册表中数据的同步。
* Eureka Client会缓存服务注册表中的信息。这种方式有一定的优势 —— 首先，微服务无须每次都查询Eureka Server，从而降低了Eureka Server的压力；其次，即时Eureka Server所有节点都宕掉，服务消费者依然可以使用缓存中的信息找到服务提供者并完成调用。

##### 综上，Eureka通过心跳检查、客户端缓存等机制，提供了系统的灵活性、可伸缩性和可用性。

##### 需要指明spring.application.name,这个很重要，这在以后的服务与服务之间相互调用一般都是根据这个name 

## eureka的作用：
##### 如果所有的后端微服务之间，没有互相通信，那么eureka是可以不要的。
##### 如果后端微服务之间，有互相通信，那么在负载均衡时，相同的服务肯定会启动多个，而且使用不同的端口，这个时候，服务之间就可以通过注册在eureka中的名称来找到对方，而不是根据IP+端口号去找对方。
##### 如果后端微服务之间相互通信，都要知道具体的IP和端口，那开发要怎么干？

###  Eureka 服务注册中心地址

* 注册地址：http://${eureka.instance.hostname}:${server.port}/eureka/

### Eureka 注册中心界面

* 启动 EurekaServerApplication 访问：http://localhost:8761

`注意：No application available 没有服务被发现 ……_
 因为没有注册服务当然不可能有服务被发现了。`
