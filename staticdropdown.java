package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String[] args) {
		ChromeDriver dropdown=new ChromeDriver();
		dropdown.manage().window().maximize();
		dropdown.get("https://demo.guru99.com/test/newtours/register.php");
		dropdown.findElement(By.name("firstName")).sendKeys("Dinesh");
		dropdown.findElement(By.name("lastName")).sendKeys("k");
		dropdown.findElement(By.name("phone")).sendKeys("9087654321");
		dropdown.findElement(By.id("userName")).sendKeys("aabc54@gmail.com");
		dropdown.findElement(By.name("city")).sendKeys("Chennai");
		dropdown.findElement(By.name("state")).sendKeys("Tamilnadu");
		dropdown.findElement(By.name("postalCode")).sendKeys("600009");
		Select drop=new Select(dropdown.findElement(By.name("country")));
//drop.selectByIndex(1);
		//drop.selectByValue("BANGLADESH");
		drop.selectByVisibleText("BAHRAIN");
//System.out.println(drop.getFirstSelectedOption().getText());
		dropdown.findElement(By.name("email")).sendKeys("Kumar");
		dropdown.findElement(By.name("password")).sendKeys("happy@29");
		dropdown.findElement(By.name("confirmPassword")).sendKeys("happy@29");
		dropdown.findElement(By.name("submit")).click();
	}

}
