package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class customisedstatement {

	public static void main(String[] args) {
		ChromeDriver statement=new ChromeDriver();
		statement.manage().window().maximize();
		statement.get("https://demo.guru99.com/V4");
		String title = statement.getTitle();
		System.out.println(title);
		statement.findElement(By.name("uid")).sendKeys("mngr578060");
		statement.findElement(By.name("password")).sendKeys("gEbemAs");
		statement.findElement(By.name("btnLogin")).click();
		statement.findElement(By.name("accountno")).sendKeys("3456789");
		statement.findElement(By.name("fdate")).sendKeys("10-2-2024");
		statement.findElement(By.name("tdate")).sendKeys("22-03-2024");
		statement.findElement(By.name("amountlowerlimit")).sendKeys("5000");
		statement.findElement(By.name("numtransaction")).sendKeys("10");
		statement.findElement(By.name("AccSubmit")).click();

	}

}
