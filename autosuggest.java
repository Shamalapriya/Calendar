package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggest {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver data=new ChromeDriver();
		data.manage().window().maximize();
		data.get("https://www.meesho.com/");
		data.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']")).sendKeys("Laptop");
		Thread.sleep(1000);
List<WebElement> element = data.findElements(By.xpath("//div[@class='sc-ftTHYK eHVGcU autosuggest autosuggest__desk autosuggest autosuggest__desk']/div]"));
for(WebElement eachobject:element) {
	System.out.println(eachobject.getText());
	if(eachobject.getText().equals("Laptop accessories")) {
		eachobject.click();
	}
}
	}

}
