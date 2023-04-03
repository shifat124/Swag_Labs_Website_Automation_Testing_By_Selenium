package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Browser Driver\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver(); //Invoke WebDriver 
		WebDriver driver = new ChromeDriver(); //Invoke WebDriver By Interface Idea
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	    Thread.sleep(3000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		String expectedTitle = "Swag Labs";
		
		//Validation Part
		
		if(expectedTitle.equals(driver.getTitle())) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
		}
		driver.close();
		
		
		

	}

}
