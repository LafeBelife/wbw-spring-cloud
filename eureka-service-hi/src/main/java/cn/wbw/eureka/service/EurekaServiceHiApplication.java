package cn.wbw.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 通过 @EnableEurekaClient表明自己是一个eurekaClient.
 *
 * @author wbw
 * @date 2019/6/10 11:23
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceHiApplication.class, args);
    }

}
