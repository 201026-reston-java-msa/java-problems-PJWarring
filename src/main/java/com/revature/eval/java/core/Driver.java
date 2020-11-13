package com.revature.eval.java.core;

import java.util.HashMap;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		EvaluationService evaluationService = new EvaluationService();

		System.out.println(evaluationService.isValidIsbn("3-598-21508-8"));
		System.out.println(evaluationService.isValidIsbn("3-598-21507-X"));
	}
}