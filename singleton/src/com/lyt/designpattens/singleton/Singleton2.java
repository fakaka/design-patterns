package com.lyt.designpattens.singleton;

/**
 * ����ʽ����ģʽ
 * 
 */
public class Singleton2 {
	// �Ѿ���ʼ�����˵���ʱ�����ظ�����
	private static Singleton2 instance = new Singleton2();

	private Singleton2() {
	}

	public static Singleton2 getInstance() {
		return instance;
	}

}
