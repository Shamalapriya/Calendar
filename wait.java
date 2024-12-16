package framework;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
    driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
    driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
    
    //* explicit wait
	WebDriverWait data=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement until = data.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium Testing: Detailed Guide']")));
	until.click();
	
	//* fluent wait
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
	WebElement element=wait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver driver) {
		return driver.findElement(By.xpath("//h3[normalize-space()='Selenium Testing: Detailed Guide']"));
		}
		} );
	element.click();
}

	}



