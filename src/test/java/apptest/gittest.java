package apptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gittest {
	
	protected WebDriver driver;
	@Test 
	public void search() throws  InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 String baseUrl = "http://demo.guru99.com/test/newtours/";
	     String expectedTitle = "Welcome: Mercury Tours";
	     String actualTitle = "";

	        // launch chrome and direct it to the Base URL
	        driver.get(baseUrl);
	        
	        // maximises  the browser window 
	        driver.manage().window().maximize();

	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } 
	        else {
	            System.out.println("Test Failed");
	        }
	       
	        
	       
	}
}
	

	
	
	
	
	
	
	
	
	

	
	
	


