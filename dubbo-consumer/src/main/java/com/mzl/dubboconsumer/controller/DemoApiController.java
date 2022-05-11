package com.mzl.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mzl.dubboapi.service.DemoApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName :   DemoApiController
 * @Description: 控制器类
 * @Author: mzl
 * @CreateDate: 2022/5/11 17:50
 * @Version: 1.0
 */
@RestController
@RequestMapping("demoApi")
public class DemoApiController {

    /**
     * dubbo引用服务注解
     */
    @Reference
    private DemoApi demoApi;

    @GetMapping("/sayHello")
    public String sayHello(){
        System.out.println("消费者消费调用服务接口成功...");
        return demoApi.sayHello();
    }

}
