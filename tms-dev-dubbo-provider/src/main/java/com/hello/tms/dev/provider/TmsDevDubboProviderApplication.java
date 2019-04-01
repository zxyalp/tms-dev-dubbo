package com.hello.tms.dev.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class TmsDevDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmsDevDubboProviderApplication.class, args);
    }

}
