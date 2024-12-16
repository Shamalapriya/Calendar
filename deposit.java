package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class deposit {

	public static void main(String[] args) {
		ChromeDriver object=new ChromeDriver();
		object.manage().window().maximize();
		object.get("https://demo.guru99.com/V4");
		String title = object.getTitle();
		System.out.println(title);
		object.findElement(By.name("uid")).sendKeys("mngr578060");
		object.findElement(By.name("password")).sendKeys("gEbemAs");
		object.findElement(By.name("btnLogin")).click();
		object.findElement(By.name("accountno")).sendKeys("3456789");
		object.findElement(By.name("ammount")).sendKeys("20000");
		object.findElement(By.name("desc")).sendKeys("deposit");
		object.findElement(By.name("AccSubmit")).click();
				

	}

}
