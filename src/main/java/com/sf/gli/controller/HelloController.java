package com.sf.gli.controller;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(path = "/")
	public String sayHello() {
		return "First SB deployment in AWs";
	}

	@GetMapping(path = "/welcome")
	public String sayWelcome() throws UnknownHostException {
		Inet4Address.getLocalHost().getHostAddress();

		Inet4Address.getLocalHost().getHostName();

		return "Welcome to Spring rest Service :Host Address--" + Inet4Address.getLocalHost().getHostAddress()
				+ "--Host Name:--" + Inet4Address.getLocalHost().getHostName();
	}
}
