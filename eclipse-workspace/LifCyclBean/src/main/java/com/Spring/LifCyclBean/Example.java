package com.Spring.LifCyclBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Bean life cycle Using : annotation , adding dependency into pom "annotation-api"
public class Example {
	
	private String subject;

	
	
	
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Example(String subject) {
		super();
		this.subject = subject;
	}




	public String getSubject() {
		return subject;
	}




	public void setSubject(String subject) {
		this.subject = subject;
	}




	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Start subject init method");
	}
	
	@PreDestroy
	public void end() {
		// TODO Auto-generated method stub
		System.out.println("End Subject destroy method");

	}

}
