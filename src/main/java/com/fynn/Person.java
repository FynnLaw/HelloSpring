package com.fynn;

public class Person {
	
	private String name;
	private int age;

	public Person(){
		System.out.println("default constructor");
	}
	
	public Person(String tel,int number){
		System.out.println("parameters constructor");
		System.out.println(tel);
		System.out.println(number);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("method setName");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("method setAge");
		this.age = age;
	}

	public void init(){
		System.out.println("init method");
	}
	
	static{
		System.out.println("static block");
	}
	
	{
		System.out.println("block");
	}
}
