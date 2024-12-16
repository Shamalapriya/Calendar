package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaalert {

	public static void main(String[] args) {
		ChromeDriver java=new ChromeDriver();
		java.manage().window().maximize();
		java.get("https://demo.guru99.com/test/delete_customer.php");
		java.findElement(By.name("cusid")).sendKeys("123456");
		java.findElement(By.name("submit")).click();
		//java.switchTo().alert().accept();
		//java.switchTo().alert().dismiss();
		String text = java.switchTo().alert().getText();
		System.out.println(text);

	}

}
