package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletecustomer {

	public static void main(String[] args) {
		ChromeDriver value=new ChromeDriver();
		value.manage().window().maximize();
		value.get("https://demo.guru99.com/V4/");
		String title = value.getTitle();
		System.out.println(title);
		value.findElement(By.name("uid")).sendKeys("mngr578060");
		value.findElement(By.name("password")).sendKeys("gEbemAs");
		value.findElement(By.name("btnLogin")).click();
		value.findElement(By.name("cusid")).sendKeys("75178");
		value.findElement(By.name("AccSubmit")).click();

	}

}
