package com.neosuniversity.spring.cloud.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:configuration-limits.properties")
//@ConfigurationProperties(prefix="neosuniversity-limit-service")
@ConfigurationProperties("neosuniversity-limit-service")
public class Configuration {

	private int maximum;
	private int minimum;
	
	
	public Configuration() {
	}
	
	public Configuration(int maximum, int minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	@Override
	public String toString() {
		return "LimitConfiguration [maximum=" + maximum + ", minimum=" + minimum + "]";
	}


}
