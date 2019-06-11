package cn.wbw.ribbonservice.controller;

import cn.wbw.ribbonservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 测试
 *
 * @author wbw
 * @date 2019/6/10 15:32
 */
@RestController
public class HelloController {
    private static final Logger LOG = Logger.getLogger(HelloController.class.getName());

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }

    @RequestMapping("/info")
    public String info() {
        LOG.log(Level.INFO, "calling trace service-hi ");
        return "i'm service-hi";
    }

}


