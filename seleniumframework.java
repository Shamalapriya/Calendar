package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumframework {

	public static void main(String[] args) {
		ChromeDriver data=new ChromeDriver(); 
	//	WebDriver type=new ChromeDriver(); 
	data.manage().window().maximize();
	data.get("https://demo.guru99.com/V4/");
	data.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr578060");
	data.findElement(By.xpath("//input[@name='password']")).sendKeys("gEbemAs");
	data.findElement(By.xpath("//input[@name='btnLogin']")).click();
	
	  //String title = data.getTitle(); System.out.println(title);
		/*
		 * data.findElement(By.name("uid")).sendKeys("mngr578060");
		 * data.findElement(By.name("password")).sendKeys("gEbemAs");
		 * data.findElement(By.name("btnLogin")).click();
		 */
	 
	  data.findElement(By.linkText("New Customer")).click();
		/*
		 * data.findElement(By.name("name")).sendKeys("Dineshkumar");
		 * data.findElement(By.name("rad1")).click();
		 * data.findElement(By.name("dob")).sendKeys("01-12-2000");
		 * data.findElement(By.name("addr")).sendKeys("Tambaram");
		 * data.findElement(By.name("city")).sendKeys("Chennai");
		 * data.findElement(By.name("state")).sendKeys("Tamilnadu");
		 * data.findElement(By.name("pinno")).sendKeys("600001");
		 * data.findElement(By.name("telephoneno")).sendKeys("9087654321");
		 * data.findElement(By.name("emailid")).sendKeys("dinesh2909@gmail.com");
		 * data.findElement(By.name("password")).sendKeys("happy@2909");
		 * data.findElement(By.name("sub")).click();
		 */
	 //data.close();   
data.findElement(By.cssSelector("input[name='name']")).sendKeys("Nithik");
data.findElement(By.xpath("//input[@name='rad1'][1]")).click();
data.findElement(By.xpath("//input[@name='dob']")).sendKeys("12-2-1998");
data.findElement(By.cssSelector("textarea[name='addr']")).sendKeys("Pammal");
data.findElement(By.cssSelector("input[name='city']")).sendKeys("Chennai");
data.findElement(By.xpath("//input[@name='state']")).sendKeys("Tamilnadu");
data.findElement(By.cssSelector("input[name='pinno']")).sendKeys("600040");
data.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9008765032");
data.findElement(By.cssSelector("input[name='emailid']")).sendKeys("xxy02367@gmail.com");
data.findElement(By.xpath("//input[@name='password']")).sendKeys("Tata@0123");
data.findElement(By.cssSelector("input[name='sub']")).click();

	}

}
