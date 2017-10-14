package com.lyt.designpattens.singleton;

/**
 * ��̬�ڲ���ʽ����ģʽ
 * 
 */
public class Singleton3 {

	private Singleton3() {
	}

	private static class Inner {
		private static Singleton3 instance = new Singleton3();
	}

	public static synchronized Singleton3 getInstance() {
		return Inner.instance;
	}

}
