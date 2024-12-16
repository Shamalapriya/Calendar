package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteaccount {

	public static void main(String[] args) {
		ChromeDriver rules=new ChromeDriver();
		rules.manage().window().maximize();
		rules.get("https://demo.guru99.com/V4");
		String title = rules.getTitle();
		System.out.println(title);
		rules.findElement(By.name("uid")).sendKeys("mngr578060");
		rules.findElement(By.name("password")).sendKeys("gEbemAs");
		rules.findElement(By.name("btnlogin")).click();
		rules.findElement(By.name("accountno")).sendKeys("1234567");
		rules.findElement(By.name("AccSubmit")).click();
		

	}

}
