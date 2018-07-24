package com.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: zhaoxuefeng
 * @date: 2018年7月22日 下午6:17:50
 */
@RestController
@RefreshScope
@RequestMapping(value = "/client-one")
public class DemoController {

	@Value("${spring.application.name}")
	private String name;
	@Value("${server.port}")
	private String port;

	// 被client-two 通过feign调用
	@RequestMapping
	public String demo() {
		return "client-one被调用成功:" + name + "," + port;
	}

	// 被通过zuul调用
	@RequestMapping(value = "/zuul")
	public String zuulTest() {
		return "client-one zuul测试成功:" + name + "," + port;
	}

	@Value("${username}")
	private String username;
	@Value("${password}")
	private String password;

	@RequestMapping("/getProperties")
	public String getProperties() {
		return "服务模块获取配置中心参数" + username + " : " + password;
	}

}
