package com.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.templates.eurekaone.FeignClients;

/**
 * @Description:
 * @author: zhaoxuefeng
 * @date: 2018年7月22日 下午6:19:23
 */
@RestController
@RequestMapping(value = "/client-two")
public class DemoController {

	@Value("${spring.application.name}")
	private String name;
	@Value("${server.port}")
	private String port;

	// 调用client-one模版
	@Autowired
	private FeignClients feignEurekaOneClients;

	// 调用client-one模块
	@RequestMapping("/demo")
	public String demo(@RequestParam String id) {
		return feignEurekaOneClients.demo(id);
	}

	// 通过zuul被调用
	@RequestMapping(value = "/zuul")
	public String zuulTest() {
		return "client-two zuul测试成功:" + name + "," + port;
	}
}
