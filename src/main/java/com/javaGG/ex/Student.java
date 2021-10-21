package com.javaGG.ex;

public class Student {
	
	private String name;
	private int age;
	private int gradeNum;//학년
	private int classNum;//반
	
	public void getStudentInfo() { //핵심기능
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("학년 : " + getGradeNum());
		System.out.println("반 : " + getClassNum());		
//		System.out.println(10/0);//강제 by zero 에러 발생 -> afterThrowing advice 실행됨			
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}	

}