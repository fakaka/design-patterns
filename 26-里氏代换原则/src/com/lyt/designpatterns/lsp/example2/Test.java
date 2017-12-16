package com.lyt.designpatterns.lsp.example2;

public class Test {
	public static void main(String[] args) {
		fly(new Laoying());
	}
	
	public static void fly(Bird bird) {
		bird.fly();
	}
}
