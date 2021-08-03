package com.liupro.android;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.liupro.android.mapper")
public class AndroidApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndroidApplication.class, args);
    }

}
