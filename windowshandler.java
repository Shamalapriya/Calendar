package framework;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandler {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	Thread.sleep(3000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parentid = iterator.next();
		String childid = iterator.next();
		driver.switchTo().window(childid);
	 driver.findElement(By.xpath("//h1[text()='Peace of mind is just a few clicks away!']")).getText();
		System.out.println(driver.findElement(By.xpath("//h1[text()='Peace of mind is just a few clicks away!']")).getText());
		driver.findElement(By.xpath("//h1[text()='Peace of mind is just a few clicks away!']")).getText();
		String string = driver.findElement(By.xpath("//h1[text()='Peace of mind is just a few clicks away!']")).getText().split("is")[0];
		driver.switchTo().window(parentid);
		WebElement element = driver.findElement(By.xpath("//input[@name='username']"));
		element.sendKeys(string);
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs,new File("image.png"));
	}

}
