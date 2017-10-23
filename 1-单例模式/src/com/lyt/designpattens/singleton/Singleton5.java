package com.lyt.designpattens.singleton;

/**
 * 双重校验锁
 * 
 * @author mj
 *
 */
public class Singleton5 {

	// 增加 volatile 关键字
	private volatile static Singleton5 instance;

	private Singleton5() {
	}

	public static Singleton5 getInstance() {
		if (instance == null) {
			synchronized (Singleton5.class) {
				if (instance == null) {
					instance = new Singleton5();
				}
			}
		}
		return instance;
	}
}
