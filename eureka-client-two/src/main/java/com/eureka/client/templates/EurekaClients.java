package com.eureka.client.templates;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: 服务调用 client-two --> client-one
 * @author: zhaoxuefeng
 * @date: 2018年7月22日 下午6:07:31
 */
@Component
@FeignClient(value = "eureka-client-one") // 这里的name对应调用服务的spring.applicatoin.name
public interface EurekaClients {
	
	@RequestMapping(value = "/client-one")
	String demo(@RequestParam("id") String id);
	
}
