package com.base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;
import com.base.MathUtils;

class MathUtilsTest {

	@Test
	void test() {
		System.out.println("this test ran");
	}

	@Test
	void testAdd() {
		MathUtils mathutils = new MathUtils();
		int expected = 20;
		int actual = mathutils.add(10, 10);
		assertEquals(expected, actual);
		//asserEquals(expcted and actual)
		//assertArrayEquals(expectedarray)
		
		
		
			
		}
		
	 
	public MathUtils mathUtils;
	
	@BeforeEach
	void initEach() {
		mathUtils = new MathUtils();
	}
	
	@Nested
	class AddTest{
		@Test
		void testAddTwoPositiveNumbers() {
			assertEquals(30, mathUtils.add(10, 20), "add method returing the sum of two positive numbers ");
			
		}
		@Test
		void testAddTwoNegativeNumbers() {
			assertEquals(-2, mathUtils.add(-1, -1), "add method returing the sum of two negative numbers ");
			
		}
		@Test
		void testAddOneNegativeOnePositiveNumber() {
			assertEquals(0, mathUtils.add(-1, 1), "add method returing the sum of one positive  and one negative numbers ");
			
		}
	}
	
	@Test
	void testMultiply() {
		assertAll(
				() -> assertEquals(0, mathUtils.multiply (10,0)),
				() -> assertEquals(10, mathUtils.multiply(10,1)),
				() -> assertEquals(100, mathUtils.multiply(10,10))
				);

	}
	
	@Test
	void computeCircleArea() {
		assertEquals(314.1592653589793238, mathUtils.computeCircleArea(10), "should return right circle area");
		
	}
	@Test
	void TestDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.division(1,0), "division should throw an error if there denominator is 0");
	}
}
