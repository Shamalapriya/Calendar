package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	    String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		while(!(month.equals("August")&& year.equals("2024"))) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			 month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			 
		}
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='1']")).click();
		

	}

}
