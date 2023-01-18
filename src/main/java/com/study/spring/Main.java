package com.study.spring;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		
		//Practice 클래스의 인스턴스의 객체 만든 후 private 메서드는 Main에서 호출 불가
		//Practice practice = new Practice();
		//practice.sss // error(X)..sss는 private 메서드임
		
		//Q)com.study.spring.Practice에 있는 메서드 호출하기!
		//Reflection API사용 - 클래스 정보를 다룰 수 있는 강력한 기능(java.lang.reflect 패키지에서 제공)
		
		Class practiceClass= Class.forName("com.study.spring.Practice");
		//Class.forName("패키지 경로를 적어준다")--> 해당 클래스의 정보들을 가져올 수 있다.
		
		Practice practice=(Practice)practiceClass.newInstance();
		//Class 가져온 클래스 정보(practiceClass)의 인스턴스를 생성한다 --> practiceClass.newInstance()
		//newInstance는 object이기에 항변환 --> (Practice)practiceClass.newInstance();
		
		Method sss =practiceClass.getDeclaredMethod("sss");
		//해당 클래서에 매서드 지정
		
		sss.setAccessible(true);//private 매서드 사용가능하게 함
		
		sss.invoke(practice);// 해당 인스턴스의 매서드 호출! 끝!
		
		//정리......
		//클래스 생성(Class.forName)
		//인스턴스 생성(newInstance)
		//클래스 안에 있는 해당 메서드 호출(getDeclaredMethod)
		//private 메소드 호출 가능하게 함(setAccessible(true))
		//해당 인스턴스의 메서드 호출(메서드.invoke.인스턴스변수)

		
		

	}

}
