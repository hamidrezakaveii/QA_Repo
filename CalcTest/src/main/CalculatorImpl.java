package main;

public class CalculatorImpl implements Calculator {

	@Override
	public int multiply(int a, int b) {

		return 0;
	}

	@Override
	public int divide(int a, int b) {
		return 0;
	}

	@Override
	public int add(int a, int b) {
		int result = a;

		if (b > 0) {
			for (int i = 0; i < b; i++) {
				result++;
			}
		} else {
			for (int i = 0; i > b; i--) {
				result--;
			}
		}
		return result;
	}

	@Override
	public int substract(int a, int b) {
		return 0;
	}

}
