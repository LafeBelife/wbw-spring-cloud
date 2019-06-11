package cn.wbw.feignservice.hystric;

import cn.wbw.feignservice.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * 断路器错误支持
 * SchedualServiceHiHystric需要实现SchedualServiceHi 接口，并注入到Ioc容器中
 *
 * @author wbw
 * @date 2019/6/10 17:14
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}

