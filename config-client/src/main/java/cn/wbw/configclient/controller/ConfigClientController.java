package cn.wbw.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 * @author wbw
 * @date 2019/6/11 9:13
 */
@RestController
public class ConfigClientController {
    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/hi")
    public String hi() {
        return foo;
    }
}
