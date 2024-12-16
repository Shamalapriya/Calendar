package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class withdrawal {

	public static void main(String[] args) {
		ChromeDriver test=new ChromeDriver();
		test.manage().window().maximize();
		test.get("https://demo.guru99.com/V4");
		String title = test.getTitle();
		System.out.println(title);
		test.findElement(By.name("uid")).sendKeys("mngr578060");
		test.findElement(By.name("password")).sendKeys("gEbemAs");
		test.findElement(By.name("btnLogin")).click();
		test.findElement(By.name("accountno")).sendKeys("3456789");
		test.findElement(By.name("ammount")).sendKeys("10000");
		test.findElement(By.name("desc")).sendKeys("withdrawed");
		test.findElement(By.name("AccSubmit")).click();
	}

}
