package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class AbstractTheOLXGroup2020Test {
	abstract TheOLXGroup2020Interface getTestObject();

	@Test
	void test01() {
		int[] juice = new int[] { 10, 2, 1, 1 };
		int[] capacity = new int[] { 10, 3, 2, 2 };
		int a = 2;

		assertEquals(a, getTestObject().solution(juice, capacity));
	}

	@Test
	void test02() {
		int[] juice = new int[] { 1, 2, 3, 4 };
		int[] capacity = new int[] { 3, 6, 4, 4 };
		int a = 3;

		assertEquals(a, getTestObject().solution(juice, capacity));
	}

	@Test
	@DisplayName("Test not able to mix")
	void test03() {
		int[] juice = new int[] { 2, 3 };
		int[] capacity = new int[] { 3, 4 };
		int a = 1;

		assertEquals(a, getTestObject().solution(juice, capacity));
	}

	@Test
	@DisplayName("Test biggest empty glass is not the base")
	void test04() {
		int[] juice = new int[] { 1, 1, 5 };
		int[] capacity = new int[] { 6, 5, 8 };
		int a = 3;

		assertEquals(a, getTestObject().solution(juice, capacity));
	}

	@Test
	@DisplayName("Test all glasses are full, glass same size")
	void test05() {
		int[] juice = new int[] { 5, 5, 5, 5, 5, 5 };
		int[] capacity = new int[] { 5, 5, 5, 5, 5, 5 };
		int a = 1;

		assertEquals(a, getTestObject().solution(juice, capacity));
	}

	@Test
	@DisplayName("Test all glasses are full, glass not same size")
	void test06() {
		int[] juice = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] capacity = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int a = 1;

		assertEquals(a, getTestObject().solution(juice, capacity));
	}

	@Test
	@DisplayName("Test biggest capacity not the base")
	void test07() {
		int[] juice = new int[] { 9, 2, 1, 1 };
		int[] capacity = new int[] { 10, 6, 2, 2 };
		int a = 3;

		assertEquals(a, getTestObject().solution(juice, capacity));
	}

	@Test
	@DisplayName("Test all glasses same capacity")
	void test08() {
		int[] juice = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] capacity = new int[] { 8, 8, 8, 8, 8, 8, 8, 8 };
		int a = 3;

		assertEquals(a, getTestObject().solution(juice, capacity));
	}

	@Test
	@DisplayName("All glasses are almost empty.")
	void test09() {
		int[] juice = new int[] { 1, 1, 1, 1, 1, 1, 1, 1 };
		int[] capacity = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int a = 8;

		assertEquals(a, getTestObject().solution(juice, capacity));
	}

	@Test
	void test10() {
		int[] juice = new int[] { 9, 1, 1, 1, 2, 1, 1, 1 };
		int[] capacity = new int[] { 10, 2, 2, 2, 6, 2, 2, 2 };
		int a = 5;

		assertEquals(a, getTestObject().solution(juice, capacity));
	}
}
