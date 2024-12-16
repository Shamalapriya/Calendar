package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demosite {

	public static void main(String[] args) {
    ChromeDriver demo=new ChromeDriver();
    demo.get("https://demo.automationtesting.in/Register.html");
    demo.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Shamala");
    demo.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("K");
    demo.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Tambaram");
    demo.findElement(By.xpath("//input[@type='email']")).sendKeys("nms011324@gmail.com");
    demo.findElement(By.cssSelector("input[value='FeMale']")).click();
    demo.findElement(By.cssSelector("input[value='Cricket']")).click();
    List<WebElement> elements = demo.findElements(By.cssSelector("input[type='checkbox']"));
    
    System.out.println( elements.size());
    
    

	}

}
