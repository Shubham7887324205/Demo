package TestClass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PomClass.Flipkart_Pom;

public class Flipkart_testClass {

	WebDriver driver;
	Flipkart_Pom fp;
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void url() {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		fp=new Flipkart_Pom(driver);
	}
	
	@Test
	public void Test_Case() throws InterruptedException {
		fp.popup();
		fp.searchbox("ipad");
		fp.suggestion("ipad pro");
		fp.connectivity();
		fp.option1(driver);
		fp.checkout_Place();
		fp.email("abcd@gmail.com", "7895657845");
	}
	
	
}
