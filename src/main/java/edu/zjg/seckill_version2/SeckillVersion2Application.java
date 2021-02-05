package edu.zjg.seckill_version2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.zjg.seckill_version2.pojo")
public class SeckillVersion2Application {

    public static void main(String[] args) {
        SpringApplication.run(SeckillVersion2Application.class, args);
    }

}
