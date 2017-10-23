package com.lyt.designpattens.singleton.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import com.lyt.designpattens.singleton.Singleton6;

/**
 * 反射破解单例和序列化破解
 * 
 * @author MJ
 *
 */
public class Test2 {
	public static void main(String[] args) throws Exception {

		System.out.println(Singleton6.getInstance() == Singleton6.getInstance());

		// 通过反射的方式直接调用私有构造器
		Class<Singleton6> clazz = (Class<Singleton6>) Class.forName("com.lyt.designpattens.singleton.Singleton6");
		Constructor<Singleton6> ctor = clazz.getDeclaredConstructor(null);
		ctor.setAccessible(true);
		System.out.println(ctor.newInstance() == ctor.newInstance());

		// 通过反序列化的方式构造多个对象
		Singleton6 instance1 = Singleton6.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:/a.txt"));
		oos.writeObject(instance1);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:/a.txt"));
		Singleton6 instance2 = (Singleton6) ois.readObject();
		System.out.println(instance2);
		ois.close();

		new File("F:/a.txt").delete();
	}
}
