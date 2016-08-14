package com.tecgle.noble.fibonacci;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class FibonacciTest {
	
	@Test
	public void fibonacciof_0is_0(){
		assertEquals(0, Fibonacci.getFibonacci(0));
	}
	
	@Test
	public void fibonacciof_1is_1(){
		assertEquals(1, Fibonacci.getFibonacci(1));
	}
	
	@Test
	public void fibonacciof_2is_1(){
		assertEquals(1, Fibonacci.getFibonacci(2));
	}
	
	@Test
	public void fibonacciof_3is_2(){
		assertEquals(2, Fibonacci.getFibonacci(3));
	}
	
	@Test
	public void fibonacciof_9is_34(){
		assertEquals(34, Fibonacci.getFibonacci(9));
	}
	
	@Ignore @Test
	public void IgnoreMe(){
		assertEquals(134, Fibonacci.getFibonacci(9));
	}

}
