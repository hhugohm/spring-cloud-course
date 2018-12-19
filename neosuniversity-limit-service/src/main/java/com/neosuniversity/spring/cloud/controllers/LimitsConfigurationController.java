package com.neosuniversity.spring.cloud.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosuniversity.spring.cloud.configuration.Configuration;
import com.neosuniversity.spring.cloud.data.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	//@Autowired
	private Configuration configuration;
	
	public LimitsConfigurationController(Configuration configuration) {
		this.configuration=configuration;
	}
	
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfigurations() {
		
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}

}
