package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newaccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("uid")).sendKeys("mngr578060");
		driver.findElement(By.name("password")).sendKeys("gEbemAs");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.name("cusid")).sendKeys("67890");
		driver.findElement(By.name("selaccount")).sendKeys("Savings");
		driver.findElement(By.name("inideposit")).sendKeys("50000");
		driver.findElement(By.name("button2")).click();

	}

}
