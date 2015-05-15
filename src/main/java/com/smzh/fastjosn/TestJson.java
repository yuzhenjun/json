package com.smzh.fastjosn;

import java.util.List;

import com.alibaba.fastjson.JSON;

public class TestJson {
	public static void main(String[] args) {
		String str="{'name':'yuzhenjun','age1':'12'}";
		String l="[{'name':'yu','age1':'22'},{'name':'yuzhenjun','age1':'12'}]";
		
		System.out.println("===========json转化Java对象=============");
		Person person=JSON.parseObject(str, Person.class);
		System.out.println(person.toString());
		System.out.println("===========Java转化json=============");
		System.out.println(JSON.toJSONString(person));
		System.out.println("===========json转化List=============");
        List<Person> list=JSON.parseArray(l, Person.class);	
        for(Person p:list){
        	System.out.println(p.toString());
        }
		
	}
}
