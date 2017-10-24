package com.lyt.designpattens.singleton;

/**
 * 饿汉式
 * 
 * @author MJ
 *
 */
public class Singleton2 {
	// 直接生成实例
	private static Singleton2 instance = new Singleton2();

	private Singleton2() {
	}

	public static Singleton2 getInstance() {
		return instance;
	}

}
