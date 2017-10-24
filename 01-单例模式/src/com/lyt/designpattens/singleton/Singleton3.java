package com.lyt.designpattens.singleton;

/**
 * 静态内部类
 * 
 */
public class Singleton3 {

	private Singleton3() {
	}

	private static class Inner {
		private static Singleton3 instance = new Singleton3();
	}

	public static Singleton3 getInstance() {
		return Inner.instance;
	}

}
