package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicecalendar {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver web=new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.irctc.co.in/nget/train-search");
		web.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
        String month = web.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
        String year = web.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
        while(!(month.equals("August")&& year.equals("2024"))) {
        	web.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
        	month = web.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
             year = web.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
             Thread.sleep(1000);
        	
        }
        web.findElement(By.xpath("(//a[@class='ui-state-default ng-tns-c58-10 ng-star-inserted'])[16]")).click();
	}

}
// ChromeDriver driver =new ChromeDriver();
/*
 * driver.get("https://www.irctc.co.in/nget/train-search");
 * 
 * driver.manage().window().maximize();
 * 
 * driver.findElement(By.cssSelector(".ng-tns-c58-10.ui-inputtext.ui-widget.ui-state-default.ui-corner-all.ng-star-inserted")).click(); 
 * 
 * List<WebElement> findElements =
 * driver.findElements(By.xpath("//tbody[@class='ng-tns-c58-10']/tr/td")); int
 * count=
 * driver.findElements(By.xpath("//tbody[@class='ng-tns-c58-10']/tr/td")).size()
 * ; for(int i=0;i<count;i++
 * 
 *  { String text =driver.findElements(By.xpath("//tbody[@class='ng-tns-c58-10']/tr/td")).get(i).getText();
 *   if(text.equalsIgnoreCase("25")) {
 * driver.findElements(By.xpath("//tbody[@class='ng-tns-c58-10']/tr/td")).get(i).click(); break;
 *  } 
 *  }
 */