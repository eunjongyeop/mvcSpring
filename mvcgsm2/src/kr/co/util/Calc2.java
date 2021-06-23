package kr.co.util;

public class Calc2 {
	public float calc(int num1, int num2, char op) {
		float result = 0;
		
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
			
		case '-':
			result = num1 - num2;
			break;
			
		case '*':
			result = num1 * num2;
			break;
			
		case '/':
			result = num1 / num2;
			break;
		}
		
		return result;
	}
}
