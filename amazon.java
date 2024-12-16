package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver; //*ctrl+shift+o

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver amazon = new ChromeDriver();
		amazon.manage().window().maximize();
		amazon.get("https://www.amazon.in/");          
		amazon.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("mobile");
		Thread.sleep(1000);
		amazon.findElement(By.xpath("//div[@class='two-pane-results-container']/div[1]/div[3]/div[@class='s-suggestion-container']")).click();
		amazon.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).click();
		Thread.sleep(1000);
		amazon.findElement(By.xpath("(//span[@id='submit.add-to-cart'])[2]")).click();

	}
}
