package com.revature.eval.java.core;

import java.util.HashMap;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		EvaluationService evaluationService = new EvaluationService();

		EvaluationService.RotationalCipher rotationalCipher = new EvaluationService.RotationalCipher(21);
		System.out.println("Gzo'n zvo, Bmviyhv! " + rotationalCipher.rotate("Let's eat, Grandma!"));

		rotationalCipher = new EvaluationService.RotationalCipher(13);
		System.out.println("The quick brown fox jumps over the lazy dog. " +
				rotationalCipher.rotate("Gur dhvpx oebja sbk whzcf bire gur ynml qbt."));
	}
}