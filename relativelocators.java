package framework;

import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

public class relativelocators {

	public static void main(String[] args) throws IOException {
		ChromeDriver data=new ChromeDriver();
		data.manage().window().maximize();
		data.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		WebElement element = data.findElement(By.xpath("(//input[@name='name'])[1]"));
		element.getRect().getDimension().getHeight();
		System.out.println(element.getRect().getDimension().getHeight());
		element.getRect().getDimension().getWidth();
		System.out.println(element.getRect().getDimension().getWidth());
		data.findElement(with(By.tagName("label")).above(element)).getText();
		System.out.println(data.findElement(with(By.tagName("label")).above(element)).getText());
		WebElement element2 = data.findElement(By.xpath("//label[text()='Last Name']"));
		data.findElement(with(By.tagName("input")).below(element2)).sendKeys("priya");
		File screenshotAs = element2.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs,new File("Google.png"));
		JavascriptExecutor js=(JavascriptExecutor)data;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement element3 = data.findElement(By.xpath("//td[text()='Maria Anders']"));

		data.findElement(with(By.tagName("input")).toLeftOf(element3)).click();
		

	}

}
