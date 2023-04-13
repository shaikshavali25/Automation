package com.pack.demotest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class IgnoreTestsExample {
	
	@Test(enabled=false)
	public void Test1() {
		System.out.println("Test1");
	}

	@Ignore
	@Test(enabled=true)
	public void Test2() {
		System.out.println("Test2");
	}

	@Test
	public void Test3() {
		System.out.println("Test3");
	}

	@Test
	public void Test4() {
		System.out.println("Test4");
	}
	
	@Ignore
	@Test
	public void Test5() {
		System.out.println("Test5");
	}

	@Test
	public void Test6() {
		System.out.println("Test6");
	}
}
