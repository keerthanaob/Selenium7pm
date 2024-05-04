package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionEx1 {
	
	@Test
	public void m1() {
		System.out.println("step1");
		System.out.println("step2");
		
		Assert.assertEquals(false, false);
		
		System.out.println("step3");
		System.out.println("step4");
	}
	
	@Test
	public void m2()
	{
		String expt = "QSpiders";
		String act = "QSpiders";
		
		Assert.assertEquals(act, expt);
	}

}
