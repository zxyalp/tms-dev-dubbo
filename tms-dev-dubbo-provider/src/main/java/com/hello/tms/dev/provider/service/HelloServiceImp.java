package com.hello.tms.dev.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.hello.tms.dev.client.HelloService;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author alp.zxy
 * @date 2019/3/31
 */
@Component
@Service(version = "1.0.0")
public class HelloServiceImp implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImp.class);

    @Override
    public String SayHello(String name) {
        logger.info("请求参数:"+name);
        return "Hello,"+name;
    }
}
