package com.spring.ex4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
	/*	
		StudentImpl student = new StudentImpl();
		student.setName("Á¶Á¤¼®");
		student.setAge(10);
		
		student.setGradeNum(3);
		student.setClassNum(5);
		
		student.getStudentInfo();
		
	*/
		AbstractApplicationContext context = new GenericXmlApplicationContext("aop.xml");
		Student student = (Student)context.getBean("student");
		student.getStudentInfo();
		
		System.out.println("=================");
		
		Worker worker = (Worker)context.getBean("worker");
		worker.getWorkerInfo();
	}
}
