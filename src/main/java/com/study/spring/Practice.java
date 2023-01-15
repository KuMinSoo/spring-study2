package com.study.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice {
	
	
	@RequestMapping("/spring")
	public void sss() {
		System.out.println("가나다라마바");
	}
}
