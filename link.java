package framework;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {

	public static void main(String[] args) throws IOException {
		ChromeDriver data=new ChromeDriver();
		data.manage().window().maximize();
		data.get("https://www.hyrtutorials.com/");
		List<WebElement> element = data.findElements(By.tagName("a"));
		System.out.println(element.size());
		for(WebElement link:element) {
			String attribute = link.getAttribute("href");
			URL url = new URL(attribute);
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
