package com.hanbitg.horse.domain;

public class Horse {
	private String name,number;
	public Horse(){}
	public Horse(String number,String name){//Line 4,5 의 이름이 같은것 : 오버로딩 
		this.name=name;
		this.number=number;//이런식으로 코딩을 하려면 setter는 사용하지 않는다
	}
	public String getName(){
		return name;
	}
	public String getNumber(){
		return number;
	}
}
