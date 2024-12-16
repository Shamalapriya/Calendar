package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) {
		ChromeDriver drag=new ChromeDriver();
		drag.manage().window().maximize();
		drag.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		drag.switchTo().frame(drag.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		Actions a=new Actions(drag);
		WebElement image1 = drag.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement target = drag.findElement(By.xpath("//div[@id='trash']"));
		WebElement image2 = drag.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement target1 = drag.findElement(By.xpath("//div[@id='trash']"));
		WebElement image3 = drag.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement target2 = drag.findElement(By.xpath("//div[@id='trash']"));
		WebElement image4= drag.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement target3 = drag.findElement(By.xpath("//div[@id='trash']"));
		a.dragAndDrop(image1, target).perform();
		a.dragAndDrop(image2, target1).perform();
		a.dragAndDrop(image3, target2).perform();
		a.dragAndDrop(image4, target3).perform();
		
	}

}
