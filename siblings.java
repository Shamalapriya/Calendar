package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class siblings {

	public static void main(String[] args) {
		ChromeDriver value=new ChromeDriver();
		value.manage().window().maximize();
		value.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#");
		value.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input[1]")).sendKeys("Vimala");
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)value;
		 * js.executeScript("window.scrollBy(0,800)"); value.findElement(By.
		 * xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")).
		 * click();
		 */
	}

}
