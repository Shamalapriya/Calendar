package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver data=new ChromeDriver();
		data.manage().window().maximize();
		data.get("https://www.flipkart.com/");
		data.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[3]")).click();
		JavascriptExecutor js= (JavascriptExecutor)data;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		data.findElement(By.xpath("(//img[@class='xTaogf _3iTqAS'])[4]")).click();
		Thread.sleep(1000);
		data.findElement(By.xpath("(//a[@class='wjcEIp'])[3]")).click();
		Thread.sleep(1000);
		data.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
	}

}
