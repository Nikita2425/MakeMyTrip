package TestClasses;

import org.testng.annotations.Test;

import LibraryFile.BaseClass;

public class TestClass1 extends BaseClass
{
	@Test
	public void OpenBrowser() throws InterruptedException 
	{
		initialzeBrowser();
	}
	
	

}
