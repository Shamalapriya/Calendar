package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		ChromeDriver data=new ChromeDriver();
		data.manage().window().maximize();
		data.get("https://www.amazon.in/");
		List<WebElement> elements = data.findElements(By.tagName("a"));
		int size = elements.size();
		System.out.println(size);
		for(int i=0;i<elements.size();i++) {
		String text = elements.get(i).getText();
		System.out.println(text);
		 String attribute = elements.get(i).getAttribute("href");
		  System.out.println(attribute);
		 
		}
			

	}

}
