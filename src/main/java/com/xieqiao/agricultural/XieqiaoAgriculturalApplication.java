package com.xieqiao.agricultural;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@MapperScan("com.xieqiao.agricultural.dao")
public class XieqiaoAgriculturalApplication {
    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(XieqiaoAgriculturalApplication.class);
        Environment env = app.run(args).getEnvironment();

        String port = env.getProperty("server.port", "80");
        String host = InetAddress.getLocalHost().getHostAddress();

        System.out.println("=====================================");
        System.out.println(" 斜桥农产品供销系统启动成功 ");
        System.out.println(" 访问地址: http://" + host + ":" + port);
        System.out.println("=====================================");
    }
}