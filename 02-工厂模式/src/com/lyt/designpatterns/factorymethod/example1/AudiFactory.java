package com.lyt.designpatterns.factorymethod.example1;

public class AudiFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Audi();
	}

}
