package TestNG;

import org.testng.annotations.Test;

public class TextNGEx1 {
	
	@Test
	public void createProduct()
	{
		System.out.println("Product Created");
	}
	@Test
	public void modifyProduct()
	{
		System.out.println("Product Modified");
	}
	@Test
	public void deleteProduct()
	{
		System.out.println("Product Deleted");
	}

}
