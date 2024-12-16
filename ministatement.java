package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ministatement {

	public static void main(String[] args) {
		ChromeDriver mini=new ChromeDriver();
		mini.manage().window().maximize();
		mini.get("https://demo.guru99.com/V4");
		String title = mini.getTitle();
		System.out.println(title);
		mini.findElement(By.name("uid")).sendKeys("mngr578060");
		mini.findElement(By.name("password")).sendKeys("gEbemAs");
		mini.findElement(By.name("btnLogin")).click();
		mini.findElement(By.name("accountno")).sendKeys("3456789");
		mini.findElement(By.name("AccSubmit")).click();

		
	}

}
