# Eureka  服务客户端

#### 提供服务，向注册中心注册自己
* 如果启动了多个实例此时：service-hi在eureka-server注册了2个实例，这就相当于一个小的集群。
* 通常会把这个程序改变端口单独运行几份，以提供负载均衡使用。
