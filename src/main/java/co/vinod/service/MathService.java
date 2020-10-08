package co.vinod.service;

public class MathService {

	public long factorial(int num) {
		if (num <= 1)
			return 1;

		long f = 1;
		for (int i = 2; i <= num; i++) {
			f *= i;
		}
		return f;
	}
}
