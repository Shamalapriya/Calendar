package framework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class irctc {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver railway=new ChromeDriver();
		railway.manage().window().maximize();
		railway.get("https://www.irctc.co.in/nget/train-search");
		railway.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
		Thread.sleep(1000);
		Set<String> windowHandles = railway.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		railway.switchTo().window(child);
		Thread.sleep(1000);
	    Actions a=new Actions(railway);
	    WebElement element = railway.findElement(By.cssSelector("a[title='Tour Packages']"));
	    a.moveToElement(element).build().perform();
	    Thread.sleep(1000);
	    element.click();
	    
		  
		 
	
	}

}
