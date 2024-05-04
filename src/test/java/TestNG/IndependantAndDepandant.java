package TestNG;

import org.testng.annotations.Test;

public class IndependantAndDepandant {
	
	@Test(priority=0)
	public void createProduct()
	{
		System.out.println("Product Created");
	}
	@Test (dependsOnMethods="createProduct") 
	public void modifyProduct()
	{
		System.out.println("Product Modified");
	}
	@Test(dependsOnMethods="createProduct")
	public void deleteProduct()
	{
		System.out.println("Product Deleted");
	}
	@Test(invocationCount=3) //Executes this Method multiple times
public void newMethod()
{
	System.out.println("New Product");
	}
	public void updateMethod()
	{
		System.out.println("Product Updated");
	}
	
}
