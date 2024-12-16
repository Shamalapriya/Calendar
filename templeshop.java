package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class templeshop {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver studio=new ChromeDriver();
		studio.manage().window().maximize();
		studio.get("https://templedesigner.com/");
		JavascriptExecutor js= (JavascriptExecutor) studio;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		studio.findElement(By.xpath("(//button[@class='product-item__action-button button button--small button--primary'])[1]")).click();
		Thread.sleep(1000);
		studio.findElement(By.xpath("//a[@class='button button--secondary']")).click();
		Thread.sleep(1000);
		studio.findElement(By.xpath("(//button[@class='quantity-selector__button'])[1]")).click();
	}

}
