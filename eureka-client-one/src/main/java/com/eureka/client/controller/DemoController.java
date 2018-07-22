package com.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: zhaoxuefeng
 * @date: 2018年7月22日 下午6:17:50
 */
@RestController
@RequestMapping(value = "/client-one")
public class DemoController {

	@Value("${spring.application.name}")
	private String name;
	@Value("${server.port}")
	private String port;

	@RequestMapping
	public String demo() {
		return "client-one被调用成功:" + name + "," + port;
	}

}
