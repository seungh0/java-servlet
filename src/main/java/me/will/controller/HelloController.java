package me.will.controller;

import me.will.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	private final HelloService helloService;

	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello" + helloService.getName();
	}

	@GetMapping("/sample")
	public String sample() {
		return "/WEB-INF/sample.jsp";
	}

}
