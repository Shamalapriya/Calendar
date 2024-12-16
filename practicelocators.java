package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.time.Duration;

public class practicelocators {

	public static void main(String[] args) {
		ChromeDriver data=new ChromeDriver();
        data.manage().window().maximize();
        data.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		data.get("https://selectorshub.com/xpath-practice-page/");
		WebElement element = data.findElement(By.xpath("//input[@name='email']"));
		element.getRect().getDimension().getHeight();
		System.out.println(element.getRect().getDimension().getHeight());
		element.getRect().getDimension().getWidth();
		System.out.println(element.getRect().getDimension().getWidth());
		data.findElement(with(By.tagName("label")).above(element)).getText();
		System.out.println(data.findElement(with(By.tagName("label")).above(element)).getText());
		WebElement element2 = data.findElement(By.xpath("//label[text()='Password']"));
		data.findElement(with(By.tagName("input")).below(element2)).sendKeys("xxxxx");
		
	}
    

}
