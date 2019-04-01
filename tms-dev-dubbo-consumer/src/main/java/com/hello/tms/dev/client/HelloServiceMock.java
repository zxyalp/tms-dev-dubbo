package com.hello.tms.dev.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yang.zhou
 * @date 2019/4/1
 */
public class HelloServiceMock implements HelloService {

        private static final Logger logger = LoggerFactory.getLogger(HelloServiceMock.class);

        @Override
        public String SayHello(String name) {
            logger.info("Hello " + name + "This is HelloServiceMock." );
            return "调用Consumer的Mock服务: Hello " + name + ", This is HelloServiceMock";
        }
}
