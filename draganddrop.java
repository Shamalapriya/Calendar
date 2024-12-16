package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
    ChromeDriver drop=new ChromeDriver();
    drop.manage().window().maximize();
    drop.get("https://jqueryui.com/droppable/");
    drop.switchTo().frame(drop.findElement(By.xpath("//iframe[@class='demo-frame']")));
    Actions a=new Actions(drop);
    WebElement source = drop.findElement(By.xpath("//div[@id='draggable']"));
    WebElement target = drop.findElement(By.xpath("//div[@id='droppable']"));
    a.dragAndDrop(source, target).perform();
	}

}
