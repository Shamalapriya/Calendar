package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class changepassword {

	public static void main(String[] args) {
		ChromeDriver key=new ChromeDriver();
		key.manage().window().maximize();
		key.get("https://demo.guru99.com/V4");
		String title = key.getTitle();
		System.out.println(title);
		key.findElement(By.name("uid")).sendKeys("mngr578060");
		key.findElement(By.name("password")).sendKeys("gEbemAs");
		key.findElement(By.name("btnLogin")).click();
		key.findElement(By.name("oldpassword")).sendKeys("happy@2909");
		key.findElement(By.name("newpassword")).sendKeys("unique#24");
		key.findElement(By.name("confirmpassword")).sendKeys("unique#24");
		key.findElement(By.name("Submit")).click();

	}

}
