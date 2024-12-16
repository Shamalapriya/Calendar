package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class editaccount {

	public static void main(String[] args) {
		ChromeDriver values=new ChromeDriver();
		values.get("https://demo.guru99.com/V4");
		String title = values.getTitle();
		System.out.println(title);
		values.findElement(By.name("uid")).sendKeys("mngr578060");
		values.findElement(By.name("password")).sendKeys("gEbemAs");
		values.findElement(By.name("btnLogin")).click();
		
	

	}

}
