package com.example.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeptSpringExample {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:/spring/beans.xml"); // 스프링을이용하여 공장을만드는것이다. classpath상에있는것을 읽어들여서 빈설계도를 그대로이용하여 빈을다생성한다.
		// 내장된기능과 추상된것을 어떻게쓰는지 알아야한다.
		Dept dept = ctx.getBean(Dept.class);
		
		System.out.println(dept); // 정의해주면 이렇게 쓸수있다. toString이용하여서...
		System.out.println(dept.getDeptno()+", " + dept.getDname()+"," + dept.getLoc() );
		
		ctx.close();
	}

}
