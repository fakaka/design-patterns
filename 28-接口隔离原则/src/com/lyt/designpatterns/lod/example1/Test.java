package com.lyt.designpatterns.lod.example1;

public class Test {
	public static void main(String[] args) {
		SomeOne zhangsan = new SomeOne();
		zhangsan.play(new Friend());
		zhangsan.play(new Stranger());
	}
}
