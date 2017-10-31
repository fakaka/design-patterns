package com.lyt.designpatterns.factorymethod.example1;

public class BenzFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Benz();
	}

}
