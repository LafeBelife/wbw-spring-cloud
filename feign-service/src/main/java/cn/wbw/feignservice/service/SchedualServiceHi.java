package cn.wbw.feignservice.service;

import cn.wbw.feignservice.hystric.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 测试
 * <p>
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。比如在代码中调用了service-hi服务的“/hi”接口
 * </p>
 *
 * @author wbw
 * @date 2019/6/10 16:19
 */
@FeignClient(value = "eureka-service-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    /**
     * 测试调用
     *
     * @param name 名字
     * @return String
     * @author wbw
     * @date 16:20 2019/6/10
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

