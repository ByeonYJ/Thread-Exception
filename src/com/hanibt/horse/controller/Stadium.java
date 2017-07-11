package com.hanibt.horse.controller;

import com.hanbitg.horse.domain.Horse;
import com.hanibt.race.serviceImpl.Race;

public class Stadium {
	public static void main(String[] args) {
		Race target = new Race();
		Horse h1 = new Horse("1번말", "김하윤");
		Horse h2 = new Horse("1번말", "변용주");
		Horse h3 = new Horse("1번말", "조봉기");
		Thread th1 = new Thread(target,h1.getNumber()+h1.getName());
		Thread th2 = new Thread(target,h2.getNumber()+h2.getName());
		Thread th3 = new Thread(target,h3.getNumber()+h3.getName());
		th1.start();
		th2.start();
		th3.start();
		try{
			th1.join();//join은 th1, th2이 끝날때까지 기다린다.
			th2.join();//두개 다 언제 끝날지 모르기떄문에 join을 두개 걸어준다.
			th3.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		for(int i=0;i<Race.list.size();i++){//Race.list 는 static(클레스 변수다 Race클레스에서 호출하기 때문 : Race에 있는 list를 호출)
			System.out.println((i+1)+"등은 "+Race.list.get(i));
		}
	}
}
