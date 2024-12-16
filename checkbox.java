package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {

	public static void main(String[] args) {
		ChromeDriver box=new ChromeDriver();
		box.manage().window().maximize();
		box.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html"); //assertion
		/*
		 * Assert.assertFalse(box.findElement(By.xpath("//input[@value='red']")).
		 * isSelected()); box.findElement(By.xpath("//input[@value='red']")).click();
		 * Assert.assertTrue(box.findElement(By.xpath("//input[@value='red']")).
		 * isSelected());
		 * box.findElement(By.xpath("//input[@value='Mozilla']")).click();
		 */
List<WebElement> elements = box.findElements(By.xpath("//input[@type='checkbox'and contains(@name,'color')]"));
/*
 * for(int i=0;i<elements.size();i++) { elements.get(i).click(); }
 */
//int totalcheckboxes = elements.size();
/*for(int i=totalcheckboxes-2;i<totalcheckboxes;i++) //select last 2 checkboxes
	elements.get(i).click();
	}*/
/*for(int i=0;i<totalcheckboxes;i++) {  //1st 3checkboxes
	if(i<3) {
		elements.get(i).click();
	}*/
for(WebElement checkbox:elements) {
	String attribute = checkbox.getAttribute("value");
	if(attribute.equals("red")|| attribute.equals("orange")) {     //select multiple checkboxes
		checkbox.click();
	}
}
	}
}
