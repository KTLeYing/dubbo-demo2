package com.mzl.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mzl.dubboapi.service.DemoApi;

/**
 * @ClassName :   ApiDemoImpl
 * @Description: 接口实现类
 * @Author: mzl
 * @CreateDate: 2022/5/11 17:08
 * @Version: 1.0
 */
@Service  //dubbo里的Service注解，用于暴露发布服务接口
public class DemoApiImpl implements DemoApi {

    @Override
    public String sayHello() {
        System.out.println("提供者启动和注册服务成功...");
        return "Hello World！";
    }
}
