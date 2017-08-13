package com.lyt48.designpattens.singleton;

/**
 * 简单的懒汉式单例
 * 
 * @author mj
 * @version 0.1
 */
public class Singleton1 {

	private static Singleton1 instance = null;

	private Singleton1() {

	}

	public static synchronized Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}

}
