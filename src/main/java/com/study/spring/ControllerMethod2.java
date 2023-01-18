package com.study.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ControllerMethod2 {

	
	// 위에 RequestMapping /admin을 달기 때문에
	//...../admin/write이렇게 입력해야 인식한다!
	@GetMapping("/write")
	public String test123(){
		
		return "boardWrite";
	}
	
	//...../admin/edit이렇게 입력해야 인식한다!
	@GetMapping("/edit")
	public String test1234(){
		
		return "boardEdit";
	}
}
