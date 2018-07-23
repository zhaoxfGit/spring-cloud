package com.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description: 配置中心
 * @author: zhaoxuefeng
 * @date: 2018年7月23日 下午4:12:56
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
	
}
