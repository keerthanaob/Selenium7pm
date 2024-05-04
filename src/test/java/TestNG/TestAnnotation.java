package TestNG;

import org.testng.annotations.Test;
@Test
public class TestAnnotation {
	
	public void createProduct()
	{
		System.out.println("Product Created");
	}
	
	public void modifyProduct()
	{
		System.out.println("Product Modified");
	}
	
	public void deleteProduct()
	{
		System.out.println("Product Deleted");
	}

    public void newMethod()
    {
	System.out.println("New Product");
	}
	public void updateMethod()
	{
		System.out.println("Product Updated");
	}
	

}
