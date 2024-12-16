package framework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class limitingwebdriver {

	public static void main(String[] args) {
		ChromeDriver web=new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.selenium.dev/");
		int size = web.findElements(By.tagName("a")).size();
		System.out.println(size);
		WebElement element = web.findElement(By.tagName("footer"));
		int size2 = element.findElements(By.tagName("a")).size();
		System.out.println(size2);
		WebElement element2 = web.findElement(By.xpath("(//div[@class='row justify-content-around pt-4 pb-5 px-5'])[2]"));
		int size3 = element2.findElements(By.tagName("a")).size();
		System.out.println(size3);
		for(int i=0;i<size3;i++) {
			String chord = Keys.chord(Keys.CONTROL,Keys.ENTER);
			element2.findElements(By.tagName("a")).get(i).sendKeys(chord);
		}
		Set<String> windowHandles = web.getWindowHandles();	
        Iterator<String> iterator = windowHandles.iterator();
        while(iterator.hasNext()) {
        	web.switchTo().window(iterator.next());
        	String title = web.getTitle();
        	System.out.println(title);
        }
	}

}
