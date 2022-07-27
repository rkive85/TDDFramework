package com.TDDFramework.TestNGBasics;

import org.testng.annotations.Test;

public class ExpectedException {
	
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void exceptionHandling() {
		int a[] = {1,2,3};
		System.out.println(a[4]);
	}
	
	@Test
	public void exceptionHandling1() {
		String a = "100A";
		Integer.parseInt(a);
	}

}
