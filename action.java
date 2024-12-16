package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {
		ChromeDriver data=new ChromeDriver();
		data.manage().window().maximize();
		data.get("https://www.amazon.in/");
		Actions a = new Actions(data);
	    a.moveToElement(data.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("iphone").doubleClick().perform();
        WebElement element = data.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        a.moveToElement(element).contextClick().build().perform();
	}

}
