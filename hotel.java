
package framework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hotel {

	public static void main(String[] args) throws IOException {
		ChromeDriver data = new ChromeDriver();
		data.manage().window().maximize();
		data.get("https://adactinhotelapp.com/SearchHotel.php");
		data.findElement(By.name("username")).sendKeys("dhivya0796");
		data.findElement(By.id("password")).sendKeys("F77J3T");
		data.findElement(By.id("login")).click();
		Select type = new Select(data.findElement(By.name("location")));
		type.selectByValue("London");
		Select drop = new Select(data.findElement(By.id("hotels")));
		drop.selectByVisibleText("Hotel Hervey");
		Select driver = new Select(data.findElement(By.id("room_type")));
		driver.selectByIndex(2);
		Select down = new Select(data.findElement(By.id("room_nos")));
		down.selectByValue("5");
		data.findElement(By.name("datepick_in")).sendKeys("01/07/2024");
		data.findElement(By.name("datepick_out")).sendKeys("02/07/2024");
		Select key = new Select(data.findElement(By.name("adult_room")));
		key.selectByValue("2");
		Select file = new Select(data.findElement(By.name("child_room")));
		file.selectByIndex(2);
		data.findElement(By.id("Submit")).click();
		data.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		data.findElement(By.xpath("//input[@id='continue']")).click();
		data.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Shamala");
		data.findElement(By.xpath("//input[@id='last_name']")).sendKeys("K");
		data.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Chennai");
		data.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("9876543210123456");
		Select datas= new Select(data.findElement(By.id("cc_type")));
		datas.selectByValue("VISA");
		Select draw = new Select(data.findElement(By.name("cc_exp_month")));
		draw.selectByValue("7");
		 Select types=new Select(data.findElement(By.name("cc_exp_year")));
		 types.selectByValue("2017");
		data.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("345");
		data.findElement(By.xpath("//input[@id='book_now']")).click();
		data.findElement(By.xpath("//input[@id='logout']")).click();
		
		
	//	File screenshotAs = ((TakesScreenshot)data).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(screenshotAs,new File("C:\\Users\\Dell.\\googlescreen.png"));
	}

}
