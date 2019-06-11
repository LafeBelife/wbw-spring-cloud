package cn.wbw.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka服务注册中心
 * <p>
 * 在这里 @SpringBootApplication 相当于 :
 * 注解 @Configuration（替代相应的xml配置文件）
 * 注解 @EnableAutoConfiguration（自动配置spring的上下文）
 * 注解 @ComponentScan （自动扫描指定包下的全部标有@Component的类，
 * 并注册成bean，当然包括@Component下的子注解@Service,@Repository,@Controller。）
 * </p>
 * <p>
 * 通过 @EnableEurekaServer 表示 Eureka服务注册中心启动
 * </p>
 *
 * @author wbw
 * @date 10:24 2019/6/10
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
