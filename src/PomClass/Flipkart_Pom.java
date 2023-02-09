package PomClass;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Flipkart_Pom {
	
	
	@FindBy (xpath="//button[@class='_2KpZ6l _2doB4z']") private WebElement  popup;
	@FindBy (xpath="//input[@class='_3704LK']") private WebElement searchbox;
	@FindBy (xpath="//ul[@class='col-12-12 _1MRYA1 _38UFBk']//li") private List<WebElement> suggestion;
	@FindBy (xpath="//div[text()='Connectivity']") private WebElement connect;
	@FindBy (xpath="//div[text()='Wi-Fi Only']") private WebElement wifi;
	@FindBy (xpath="//div[@data-id='TABGJ6XUF5KQK7UG']") private WebElement option1;
	@FindBy (xpath="//button[text()='Add to cart']")private WebElement checkout;
	@FindBy (xpath="//span[text()='Place Order']")private WebElement place;
	@FindBy (xpath="//input[@type='text']")private WebElement email;
	
	public Flipkart_Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void popup() {
		popup.click();
	}
	
	public void searchbox(String a) {
		searchbox.sendKeys(a);
	}
	
	public void suggestion(String h) {
		for(int i=0;i<suggestion.size();i++) {
			String str = suggestion.get(i).getText();
			if(str.equalsIgnoreCase(h)) {
				suggestion.get(i).click();
			}
		}
	}
	public  void connectivity() throws InterruptedException {
		connect.click();
		wifi.click();
		Thread.sleep(1000);
	}
	public void option1(WebDriver driver) {
		option1.click();
		Set<String> win = driver.getWindowHandles();
		Iterator<String> itr = win.iterator();
		itr.next();
		String win2 = itr.next();
		driver.switchTo().window(win2);
	}
	public void checkout_Place() {
		checkout.click();
		place.click();
	}
	public void email(String em,String no) {
		email.sendKeys(em+"/"+no);	
	}
}

