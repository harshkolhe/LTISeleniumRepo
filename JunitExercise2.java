package Day4;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitExercise2 {   //Important for Assessment
	
	WebDriver driver;
	@Test
	public void TestCase1() {
		
		//verify whether Register and Login link is available on Home page
		
		WebElement registerlink = driver.findElement(By.linkText("Register"));
		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		assertTrue(registerlink.isDisplayed());
		assertTrue(loginlink.isDisplayed());
		
	}
	
	@Test
	public void TestCase2() {
		
		//click on login
		driver.findElement(By.linkText("Log in")).click();
		
		//enter email
		driver.findElement(By.name("Email")).sendKeys("kavitak@gmail.com");
		
		//enter password
		driver.findElement(By.name("Password")).sendKeys("password123");
		
		//click on log in
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//Verify login success
		String emailtext = driver.findElement(By.linkText("kavitak@gmail.com")).getText();
		assertEquals("kavitak@gmail.com", emailtext);
		assertTrue(emailtext.contains("kavitak@gmail.com"));
		assertTrue(driver.findElement(By.linkText("kavitak@gmail.com")).isEnabled());
	}
	@Before
	public void before() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsh Kolhe\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//open application
		driver.get("http://demowebshop.tricentis.com/register");
	}
	
	
	@After
	public void after() {

		//close application
		driver.close();
	}
}
