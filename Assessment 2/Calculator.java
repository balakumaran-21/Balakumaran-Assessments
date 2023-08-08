package assessment3;

import java.util.Scanner;

interface AdvancedArithmetic{
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
	public int divisor_sum(int n) {
		int sum = 0;
		for(int i = 1; i <=n; i++) {
			sum+=((n%i)==0)?i:0;
		}
		return sum;
	}
	
}

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyCalculator calc = new MyCalculator();
		int n = input.nextInt();
		System.out.println(calc.divisor_sum(n));
				
	}
}
