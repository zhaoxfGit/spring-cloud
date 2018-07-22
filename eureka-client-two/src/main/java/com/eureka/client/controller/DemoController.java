package com.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.templates.EurekaClients;

/**
 * @Description: 
 * @author: zhaoxuefeng
 * @date: 2018年7月22日 下午6:19:23
 */
@RestController
@RequestMapping(value = "/client-two")
public class DemoController {
	@Autowired
	private EurekaClients eurekaClients;

	@RequestMapping("/demo")
	public String demo(@RequestParam String id) {
		return eurekaClients.demo(id);
	}
}
