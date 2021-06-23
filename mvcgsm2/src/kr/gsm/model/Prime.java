package kr.gsm.model;

public class Prime {
	public int primeNumber(int su1, int su2) {
		int sum = 0;
		
		for (int i = su1; i <= su2; i++) {
			if (i == 1) {
				continue;
			}
			
			sum += i;
			
			for (int j = 2; j<=i/2; j++) {
				if (i % j == 0) {
					sum -= i;
					break;
				}
			}
		}
				
		return sum;
	}
}
