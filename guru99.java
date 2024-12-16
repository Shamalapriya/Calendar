package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99 {

	public static void main(String[] args) {
		ChromeDriver button=new ChromeDriver();
		button.manage().window().maximize();
		button.get("https://demo.guru99.com/test/radio.html");
		int size = button.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(size);
button.findElement(By.xpath("//input[@id='vfb-7-1']")).click();
	}

}
