package com.example.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString   // tostring 해주는것이다. 
@Getter
@Setter    // 문복을깔면 이렇게 된다.~ toString getter setter 다만들어진다
@AllArgsConstructor // 필드를 생성자를 만들어준다.
@NoArgsConstructor // 디폴드 생성자가 만들어진다.
public class Dept {
	int deptno;
	String dname;
	String loc;

	public void print1() {
		System.out.println("###"+toString());
	}
	public void print2() {
		System.out.println("###"+toString());
	}
//	public int getDeptno() {
//		return deptno;
//	}
//	public void setDeptno(int deptno) {
//		this.deptno = deptno;
//	}
//	public String getDname() {
//		return dname;
//	}
//	public void setDname(String dname) {
//		this.dname = dname;
//	}
//	public String getLoc() {
//		return loc;
//	}
//	public void setLoc(String loc) {
//		this.loc = loc;
//	} 

}
