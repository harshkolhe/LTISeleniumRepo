package Day4;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitExercise1 {
	
	WebDriver driver;
	
	@Test
	public void Testcase1(){
		System.out.println("Test Case 1");
		//maximize the browser
		driver.manage().window().maximize();
				
		//enter username
		driver.findElement(By.name("userName")).sendKeys("mercury");
				
		//enter password
		driver.findElement(By.name("password")).sendKeys("mercury");
				
		//click on submit button
		driver.findElement(By.name("submit")).click();
      }

	@Before
	public void before() {
		System.out.println("Pre-requisite");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsh Kolhe\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	
	@After
	public void after() {
		System.out.println("Postcondition");
		
		//close application
		driver.close();
		
	}
}