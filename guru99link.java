package framework;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99link {

	public static void main(String[] args) throws IOException {
		ChromeDriver link=new ChromeDriver();
		link.manage().window().maximize();
		link.get("https://demo.guru99.com/test/newtours/");
		List<WebElement> elements = link.findElements(By.tagName("a"));
		System.out.println(elements.size());
		for(WebElement data:elements) {
			String attribute = data.getAttribute("href");
			URL url=new URL(attribute);
			URLConnection openConnection = url.openConnection();
			HttpURLConnection httpConnection= (HttpURLConnection) openConnection;
			httpConnection.connect();
			if(httpConnection.getResponseCode()==200) {
				System.out.println(attribute + "_" + httpConnection.getResponseCode() + "_" + httpConnection.getResponseMessage());
			}
			else {
				System.err.println(attribute + "_" + httpConnection.getResponseCode() + "_" + httpConnection.getResponseMessage());
				
			}
			
		}

	}

}
