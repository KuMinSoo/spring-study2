package com.study.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerMethod {
	//URL과 서버를 연결하고 싶으면 Controller 등록!
	
	//1. "get" 방식으로 웹주소/write으로 요청하면 --> WEB-INF.views.top.jsp를 찾아서 홈페이지를 뛰어준다
	@RequestMapping(value = "/write", method = RequestMethod.GET)//value="웹주소뒤에 입력할 요청값", method=요청방식:get post 등...
	public String test1() {
		return "top";
	}
	
	//2. 1번 2번은 동일한 같은방식이다. 기본적으로 메서드를 붙이지 않으면 get으로 인식함
	@RequestMapping("/write")
	public String test2() {
		return "top";
	}
	
	//3. Post형식으로 보내고 싶으면 method = RequestMethod.POST 포스트를 적어둔다.
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String test3() {
		
		return "boardWrite";
	}
	
	
	////////////////////////////////////////////////////////////
	
	//4.Get방식으로 바로 보내고 싶으면 RequestMapping 형식이 아닌 
	//GetMapping으로도 어노테이션을 지정하면 get으로 감
	@GetMapping("/edit")
	public String edit(){
		
		return "boardEdit";
	}
	
	//Post형식으로 감.
	@PostMapping("/edit")
	public String edit1(){
		
		return "boardEdit";
	}
	
	@GetMapping(value = {"/edit1","edit2","edit3"})
	public String test5() {
		
		return "boardEdit";
	}
	
	//////////////////
	
	@GetMapping
	public void test4() {
		
	}
	
	
	
}
