package com.dhiva.arraystringtests;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.InfixToPostfixAndEvaluation;
import com.dhiva.ArraysAndStrings.InfixToPrefixAndEvaluation;

public class InfixToPostfixAndEvaluationtest {
	@Test
	public void test() {
		String input = "A*(B+C)/D";
		InfixToPostfixAndEvaluation obj = new InfixToPostfixAndEvaluation();
		obj.infixToPostfix(input);
		obj.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i");
		
	}
	@Test
	public void test1() {
		String input = "5 6 2 + * 1 4 / -";
		InfixToPostfixAndEvaluation obj = new InfixToPostfixAndEvaluation();
		obj.evaluatePostfix(input);	
		
	}
	@Test
	public void test2() {
		String input = "A*(B+C)/D";
		InfixToPrefixAndEvaluation obj = new InfixToPrefixAndEvaluation();
		obj.infixToPrefix(input);
		//obj.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i");
		
	}
}
