package framework;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowsactivity {

	public static void main(String[] args) {
		ChromeDriver data=new ChromeDriver();
		data.manage().window().maximize();
		data.get("https://www.google.com/");
		data.navigate().to("https://www.amazon.in/");
		data.navigate().back();
		data.navigate().forward();

	}

}
