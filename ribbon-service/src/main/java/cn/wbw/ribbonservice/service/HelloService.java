package cn.wbw.ribbonservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 测试服务
 *
 * @author wbw
 * @date 2019/6/10 15:30
 */
@Service("helloService")
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 注解 ： @HystrixCommand 错误使用方法
     *
     * @author wbw
     * @date 17:02 2019/6/10
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-SERVICE-HI/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
