package com.study.spring;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Was {
	
	//두번째 방법
	@GetMapping("/was2")
	public void wass(String name, int age, String gender) {
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);	
	}
	
	@GetMapping("/was3")
	public void was3(HttpServletRequest request) {
		//쿼리스트링에 해당하는 변수이름들을 받을 수 있음
		Enumeration enu=request.getParameterNames();
		
	}
	
	@GetMapping("/was4")
	public void was4(HttpServletRequest request) {
		//쿼리스트링에 있는 변수값을 Map형태로 받을 수 있음
		Map map=request.getParameterMap();
	}
	
	@GetMapping("/was5")
	public void was5(HttpServletRequest request) {
		//쿼리스트링에 있는 변수값을 Map형태로 받을 수 있음
		Map map=request.getParameterMap();
	}
	
	@GetMapping("/was6")
	public void was6(HttpServletRequest request) {
		//쿼리스트링에 있는 변수값을 배열형태로 받을 수 있음
		String nameArr[]=request.getParameterValues("name");
	}
	
	
	
	
}
