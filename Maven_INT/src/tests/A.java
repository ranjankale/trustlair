package tests;

import org.testng.annotations.Test;

public class A {
	
	@Test(groups= {"t1","t2"})
	public void t1() {
		System.out.println("test1");
	}

	@Test(groups= {"t1"})
	public void t2() {
		System.out.println("test2");
	}
	@Test(groups= {"t1"})
	public void t3() {
		System.out.println("test3");
	}
	@Test
	public void t4() {
		System.out.println("test4");
	}
}
