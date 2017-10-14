package com.lyt.designpattens.singleton;

/**
 * �򵥵�����ʽ����
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