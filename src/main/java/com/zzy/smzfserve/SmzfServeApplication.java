package com.zzy.smzfserve;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SmzfServeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmzfServeApplication.class, args);
        log.info("味到家...");
    }

}
