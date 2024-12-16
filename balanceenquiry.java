package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class balanceenquiry {

	public static void main(String[] args) {
	ChromeDriver testing=new ChromeDriver();
	testing.manage().window().maximize();
	testing.get("https://demo.guru99.com/V4/");
	String title = testing.getTitle();
	System.out.println(title);
	testing.findElement(By.name("uid")).sendKeys("mngr578060");
	testing.findElement(By.name("password")).sendKeys("gEbemAs");
	testing.findElement(By.name("btnLogin")).click();		
	testing.findElement(By.name("accountno")).sendKeys("3456789");
	testing.findElement(By.name("AccSubmit")).click();
	

	}

}
