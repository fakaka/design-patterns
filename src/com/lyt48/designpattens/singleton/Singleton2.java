package com.lyt48.designpattens.singleton;

/**
 * 饿汉式单例模式
 * 
 */
public class Singleton2 {
	// 已经初始化好了调用时不用重复创建
	private static Singleton2 instance = new Singleton2();

	private Singleton2() {
	}

	public static Singleton2 getInstance() {
		return instance;
	}

}
