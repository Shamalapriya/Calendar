package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		ChromeDriver button=new ChromeDriver();
		button.manage().window().maximize();
		button.get("https://www.techlistic.com/p/selenium-practice-form.html");
		JavascriptExecutor js = (JavascriptExecutor) button;
		js.executeScript("window.scrollBy(0,2000)");
		button.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		button.findElement(By.xpath("(//input[@name='exp'])[2]")).click();
		button.findElement(By.xpath("(//input[@name='profession'])[1]")).click();
		button.findElement(By.xpath("(//input[@name='tool'])[2]")).click();
		

	}

}
