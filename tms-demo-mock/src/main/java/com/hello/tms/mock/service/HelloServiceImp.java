package com.hello.tms.mock.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.hello.tms.dev.client.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author yang.zhou
 * @date 2019/4/1
 */
@Component
@Service(version = "1.0.0")
public class HelloServiceImp implements HelloService {
    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImp.class);

    @Override
    public String SayHello(String name) {
        logger.info("Dubbo Mock Service:Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Dubbo Mock Service: Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
