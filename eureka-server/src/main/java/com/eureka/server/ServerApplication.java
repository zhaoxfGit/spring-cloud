package com.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: 服务端入口
 * @author: zhaoxuefeng 
 * @date:   2018年7月21日 下午3:23:06
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}