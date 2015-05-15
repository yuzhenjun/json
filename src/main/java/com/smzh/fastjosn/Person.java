package com.smzh.fastjosn;

import com.alibaba.fastjson.annotation.JSONField;

public class Person {
	
	private String name;
	
	@JSONField(name="age1")
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
