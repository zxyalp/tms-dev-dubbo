package com.hello.tms.dev.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TmsDevDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmsDevDubboConsumerApplication.class, args);
    }

}
