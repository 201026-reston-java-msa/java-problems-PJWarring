package com.revature.eval.java.core;

public class Driver {

	public static void main(String[] args) {
		String[] stringArr = "Uniform resource locator".split(" ");
		String acro = "";
		for (int i = 0; i < stringArr.length; i++) {
			acro += Character.toString(stringArr[i].charAt(0)).toUpperCase();
		}
		System.out.println(acro);
	}
}