package cn.wbw.zuulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul 网关启动程序
 *<p>
 *     注解: @EnableZuulProxy 开启过滤器
 *     注解 @EnableEurekaClient @EnableDiscoveryClient 开启服务注册到 eureka-server
 *</p>
 * @author wbw
 * @date 17:36 2019/6/10
 */
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServiceApplication.class, args);
    }

}
