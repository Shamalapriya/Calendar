package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
ChromeDriver login=new ChromeDriver();
login.manage().window().maximize();
login.get("https://demo.guru99.com/v4/");
login.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr578060");
login.findElement(By.xpath("//input[@name='password']")).sendKeys("gEbemAs");
login.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}

}
