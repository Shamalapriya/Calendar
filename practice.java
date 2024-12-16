package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		ChromeDriver data=new ChromeDriver();
		data.manage().window().maximize();
		data.get("https://www.irctc.co.in/nget/train-search");
		data.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
String month = data.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
String year = data.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
while(!(month.equals("July")&& year.equals("2024"))){
	 month = data.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
	  year = data.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
	
}
data.findElement(By.xpath("(//a[@class='ui-state-default ng-tns-c58-10 ng-star-inserted'])[23]")).click();
	}

}
