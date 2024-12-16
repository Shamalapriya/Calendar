package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonautosuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver data=new ChromeDriver();
		data.manage().window().maximize();
		data.get("https://www.amazon.in/?ref=aisgw_intl_stripe_in");
		data.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
		Thread.sleep(1000);
		List<WebElement> element = data.findElements(By.xpath("//div[@class='two-pane-results-container']/div[1]/div"));
		for(WebElement eachobject:element) {
			System.out.println(eachobject.getText());
			if(eachobject.getText().equals("mobile stand for table")) {
				eachobject.click();
				break;
			}
		}
		
		

	}

}
