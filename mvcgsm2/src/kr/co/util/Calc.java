package kr.co.util;

public class Calc {
	public int hap() {
		int sum = 0;
		for(int i=1; i<=10; i++)
			sum += i;
		return sum;
	}
	
	public int hap(int su1, int su2) {
		int sum = 0;
		for (int i=su1; i<=su2; i++) {
			sum += i;
		}
		return sum;
	}
}
