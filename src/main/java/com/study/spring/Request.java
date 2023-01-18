package com.study.spring;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Request {
    
	@RequestMapping("/request")
    public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	
    	//웹에서 요청 서버에서 Request ---> 톰캣에서 httpServletRequest 객체 생성 후 해당 내용을 담아 서버로 보낸다 
    	//서버에서 httpServletRequest 클래스를 사용할 수 있다. 
    	//아래는 사용시 예시이다
    	
    	//자주 사용되는 것!!
    	System.out.println("request.getRequestURL(): "+request.getRequestURL()); // 전체주소: "http://localhost:9090/spring/request?name=sdfs&number=11"
    	System.out.println("request.getScheme():"+request.getScheme());// --> http
    	System.out.println("request.getServerName()"+request.getServerName());// --> localhost
    	System.out.println("request.getServerPort()"+request.getServerPort());// --> 9090
    	System.out.println("request.getRequestURI(): "+request.getRequestURI()); // --> /spring/request
    	System.out.println("request.getContextPath(): "+request.getContextPath());// --> /spring
    	System.out.println("request.getServletPath(): "+request.getServletPath());// --> /request
    	System.out.println("request.getQueryString(): "+request.getQueryString());// --> name=sdfs&number=11
    	System.out.println("request.getMethod(): "+request.getMethod());// --> GET
    	
    	System.out.println("request.getCharacterEncoding(): "+request.getCharacterEncoding());// utf-8 , 알 수 없으면 null
    	System.out.println("request.getContentLength()="+request.getContentLength());  // 요청 내용의 길이. 알수 없을 때는 -1
        System.out.println("request.getContentType()="+request.getContentType());// 요청내용의 타입:application/json , 알 수 없으면 null
        System.out.println("request.getProtocol()="+request.getProtocol());  // 프로토콜의 종류와 버젼 HTTP/1.1

        System.out.println("request.getLocalName()="+request.getLocalName()); // 로컬 이름 0:0:0:0:0:0:0:1
        System.out.println("request.getLocalPort()="+request.getLocalPort()); // 로컬 포트 9090

        System.out.println("request.getRemoteAddr()="+request.getRemoteAddr()); // 원격 ip주소
        System.out.println("request.getRemoteHost()="+request.getRemoteHost()); // 원격 호스트
        System.out.println("request.getRemotePort()="+request.getRemotePort()); // 원격 포트
        
        //html에 출력하려면 HttpServletResponse를 사용한다
        //HttpServletResponse 선언하면 톰캣에서 해당 객체를 생성해준다.
        
        response.setContentType("text/html");//설정하지 않으면 text인지 json인지 등 인식하지 못함/ 중요!
        response.setCharacterEncoding("utf-8");//설정하지 않으면 한글을 인식하지 못함 / 중요!
        PrintWriter out=response.getWriter();
        
        out.println("가나다라");//출력
        
        
        
        
    }
}