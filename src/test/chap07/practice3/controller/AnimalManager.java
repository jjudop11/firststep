package test.chap07.practice3.controller;

import test.chap07.practice3.model.vo.Animal;
import test.chap07.practice3.model.vo.Cat;
import test.chap07.practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {

		Animal[] arr = new Animal[5];
		arr[0] = new Dog("멍멍","웰시코기",5);	
		arr[1] = new Cat("냥냥", "코숏", "한국", "삼색");
		arr[2] = new Cat("냥냥2", "아메숏", "미국", "줄무늬");
		arr[3] = new Cat("냥냥3", "스코트쉬폴트", "여기저기", "여러무늬");
		arr[4] = new Dog("멍멍2","진돗개",10);	
		
		for(Animal a : arr) {
			
			a.speak();

		}
		
	}
}
