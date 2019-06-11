package cn.wbw.ribbonservice.configuration;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Ribbon 配置
 * <p>
 * 通过@EnableDiscoveryClient向服务中心注册;并且向程序的ioc注入一个bean: restTemplate;
 * 通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
 * 注解@EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient 可以是其他注册中心。
 * </p>
 * <p>
 * 注解 @EnableHystrix 开启 Hystrix 断路器
 * </p>
 *
 * @author wbw
 * @date 2019/6/10 15:21
 */
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
@Component
public class RibbonConsume {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
