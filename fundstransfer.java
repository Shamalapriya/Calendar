package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fundstransfer {

	public static void main(String[] args) {
		ChromeDriver tests=new ChromeDriver();
		tests.manage().window().maximize();
		tests.get("https://demo.guru99.com/V4");
		String title = tests.getTitle();
		System.out.println(title);
		tests.findElement(By.name("uid")).sendKeys("mngr578060");
		tests.findElement(By.name("password")).sendKeys("gEbemAs");
		tests.findElement(By.name("btnLogin")).click();
		tests.findElement(By.name("payersaccount")).sendKeys("098765");
		tests.findElement(By.name("payeeaccount")).sendKeys("222334");
		tests.findElement(By.name("ammount")).sendKeys("60000");
		tests.findElement(By.name("desc")).sendKeys("funds transfer");
		tests.findElement(By.name("AccSubmit")).click();
		

	}

}
