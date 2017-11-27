package com.lyt.designpatterns.adapter.example1;

public class GreenHeadDuck implements Duck {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println(" Ga Ga");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am flying a long distance");
	}

}
