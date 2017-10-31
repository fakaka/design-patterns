package com.lyt.designpatterns.factorymethod.example1;

public class BydFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Byd();
	}

}
