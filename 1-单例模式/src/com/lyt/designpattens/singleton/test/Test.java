package com.lyt.designpattens.singleton.test;

import com.lyt.designpattens.singleton.Singleton1;
import com.lyt.designpattens.singleton.Singleton2;
import com.lyt.designpattens.singleton.Singleton3;
import com.lyt.designpattens.singleton.Singleton4;
import com.lyt.designpattens.singleton.Singleton5;

public class Test {
	public static void main(String[] args) {

		System.out.println(Singleton1.getInstance() == Singleton1.getInstance());
		System.out.println(Singleton2.getInstance() == Singleton2.getInstance());
		System.out.println(Singleton3.getInstance() == Singleton3.getInstance());
		System.out.println(Singleton4.INSTANCE == Singleton4.INSTANCE);
		System.out.println(Singleton5.getInstance() == Singleton5.getInstance());
	}
}
