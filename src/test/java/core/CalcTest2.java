package core;

import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
	 public class CalcTest2 {

		@Test(timeout=500)//@Ignore
		public void test_01_add_2() {System.out.println("Test 1:adding 2 params");
		assertEquals("Not correct", Calculator.add(200.0, 150.0), 350.0, 0.09);}
		@Test(timeout=500)//@Ignore
		public void test_02_add_3() {System.out.println("Test 2:adding 3 params");
	     assertEquals("Not correct", Calculator.add(8.0, 5.0, 7.0), 20.0, 0.09);}
		@Test(timeout=500)//@Ignore
		public void test_03_add_4() {System.out.println("Test 3:adding 4 params");
		 assertEquals("Not correct", Calculator.add(185.3, 0.7, 10.0, 74.0), 270.0, 0.09);}
		@Test(timeout=500)//@Ignore
		public void test_04_subtract_2() {System.out.println("Test 4:subtract 2 params");
		  assertEquals("Not correct", Calculator.subtract(20.0, 10.0), 10.0, 0.09);}
		@Test(timeout=500)//@Ignore
		public void test_05_subtract_3() {System.out.println("Test 5: Subtract 3 params");
		assertEquals("Not correct", Calculator.subtract(200.0, 50.0, 50.0), 100.0, 0.09);}
		@Test(timeout=500)//@Ignore
		public void test_06_subtract_4() {System.out.println("Test 6: Subtract 4 params");
		assertEquals("Not correct", Calculator.subtract(200.0, 50.0, 50.0, 50.0), 50.0, 0.09);}
		@Test(timeout=500) //@Ignore
		public void test_07_multiply_2() {System.out.println("Test 7: * 2 params");
		 assertEquals("Not correct", Calculator.multiply(5.0, 5.0), 25.0, 0.09);}
		@Test(timeout=500) //@Ignore
		public void test_08_multiply_3() {System.out.println("Test 8: * 3 params");
		 assertEquals("Not correct", Calculator.multiply(5.0, 5.0, 2.0), 50.0, 0.09);}
		@Test(timeout=500) //@Ignore
		public void test_09_multiply_4() {System.out.println("Test 9: * 4 params");
		 assertEquals("Not correct", Calculator.multiply(5.0, 5.0, 2.0, 4.0), 200.0, 0.09);}
		@Test(timeout=500) //@Ignore
		public void test_10_divide_2() {System.out.println("Test 10: / 2 params");
		 assertEquals("Not correct", Calculator.divide(5.0, 5.0), 1.0, 0.09);}
	    @Test(timeout=500) //@Ignore
		public void test_11_divide_3() {System.out.println("Test 11: / 3 params");
		 assertEquals("Not correct", Calculator.divide(40.0, 8.0, 2.0), 2.5, 0.09);}
	    @Test(timeout=500) //@Ignore
	   	public void test_12_divide_4() {System.out.println("Test 12: / 4 params");
	   	 assertEquals("Not correct", Calculator.divide(40.0, 2.0, 2.0, 2.0), 5.0, 0.09);}
	
}

	
	

