package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class debugging {

	public static void main(String[] args) {
		ChromeDriver fb=new ChromeDriver();
		fb.manage().window().maximize();
		fb.get("https://www.facebook.com/");
		fb.findElement(By.id("email")).sendKeys("xyz@gmail.com");

	}

}
