package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonpractice {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver link=new ChromeDriver();
		link.manage().window().maximize();
		link.get("https://www.amazon.in/");
		link.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("smartwatch");
		Thread.sleep(1000);
		link.findElement(By.xpath("//div[@class='left-pane-results-container']//div[@aria-label='smartwatch for girls']")).click();		
		/*
		 * link.findElement(By.
		 * xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//i[@class='a-icon a-icon-checkbox'])[6]"
		 * )).click();
		 */
        link.findElement(By.xpath("(//span[text()='boAt'])[1]")).click();
        Thread.sleep(1000);
        link.findElement(By.xpath("//span[text()='boAt Wave Style Call Smart Watch w/Advanced BT Calling Chip,DIY Watch Face Studio, Coins, 1.69\" (4.2 cm) HD Display, Health Ecosystem, Live Cricket Scores, Quick Replies, HR & SpO2(Cherry Blossom)']")).click();
        JavascriptExecutor js = (JavascriptExecutor) link;
		js.executeScript("window.scrollBy(0,2000)");
		link.findElement(By.id("(//input[@id='add-to-cart-button'])[1]")).click();
      
        }

}
