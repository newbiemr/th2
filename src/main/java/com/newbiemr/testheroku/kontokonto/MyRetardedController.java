package com.newbiemr.testheroku.kontokonto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newbiemr.testheroku.sorvmi.DenyoService;

@RestController
public class MyRetardedController {
	
	@Autowired
	private DenyoService denyoService;
	
	@RequestMapping("/hi")
	public String sayHi() {
		return denyoService.sayHi();
	}

}
