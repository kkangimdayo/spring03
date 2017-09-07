package com.example.spring;

public class DeptExample {

	public static void main(String[] args) {
		
		Dept dept = new Dept();
		dept.setDeptno(10);
		dept.setDname("개발부");
		dept.setLoc("서울");
		
		System.out.println(dept); // 정의해주면 이렇게 쓸수있다. toString이용하여서... 이게 반복해서 소스 재정의하는게 힘들다
		System.out.println(dept.getDeptno()+", " + dept.getDname()+"," + dept.getLoc() );
	}

}
