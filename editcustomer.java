package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class editcustomer {

	public static void main(String[] args) {
    ChromeDriver type=new ChromeDriver();
    type.manage().window().maximize();
    type.get("https://demo.guru99.com/V4/");
    String title = type.getTitle();
    System.out.println(title);
    type.findElement(By.name("uid")).sendKeys("mngr578060");
    type.findElement(By.name("password")).sendKeys("gEbemAs");
    type.findElement(By.name("btnLogin")).click();
    type.findElement(By.name("cusid")).sendKeys("75178");
    type.findElement(By.name("AccSubmit")).click();
	}

}
