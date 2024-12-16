package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		ChromeDriver path=new ChromeDriver();
		path.manage().window().maximize();
		path.get("https://selectorshub.com/xpath-practice-page");
		path.findElement(By.xpath("//label[text()='User Email']/following-sibling::input[@name='email']")).sendKeys("nms0543@gmail.com");
		path.findElement(By.xpath("//label[text()='Password']/following-sibling::input[@name='Password']")).sendKeys("happy@24");
		path.findElement(By.xpath("//div[@class='content block panel check-height  parent-inline-cont'and not(contains(@style,'none'))]//label[text()='Company']//parent::div/following-sibling::input[@name='company']")).sendKeys("TCS");
		path.findElement(By.xpath("//div [@class='content block panel check-height  parent-inline-cont'and not (contains(@style,'none'))]//label[text()='Mobile Number']//parent::div/following-sibling::input[@name='mobile number']")).sendKeys("9087654321");
		path.findElement(By.xpath("//button[text()='Submit']")).click();
		path.findElement(By.xpath("//td[text()='Garry White']/preceding-sibling::td/child::input[@type='checkbox']")).click();
        path.findElement(By.xpath("//td[text()='Kevin Mathews']/preceding-sibling::td/child::input[@type='checkbox']")).click();
	}

}
