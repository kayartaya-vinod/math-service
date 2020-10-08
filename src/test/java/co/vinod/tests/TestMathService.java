package co.vinod.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.vinod.service.MathService;

class TestMathService {

	MathService service;

	@BeforeEach
	void init() {
		service = new MathService();
	}

	@Test
	void testFactorialForNumGreaterThanOne() {
		long actual = service.factorial(5);
		long expected = 120;
		Assertions.assertEquals(expected, actual);
		
		actual = service.factorial(10);
		expected = 3628800;
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testFactorialForNumEqualsOne() {
		long actual = service.factorial(1);
		long expected = 1;
		Assertions.assertEquals(expected, actual);
	}
	
}
