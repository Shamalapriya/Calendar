package framework;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
	ChromeDriver screen=new ChromeDriver();
	screen.manage().window().maximize();
	screen.get("https://www.google.com/");
	File screenshotAs = ((TakesScreenshot)screen).getScreenshotAs(OutputType.FILE);
     //FileUtils.copyFile(screenshotAs,new File(".//screenshot/screen.png"));
	FileUtils.copyFile(screenshotAs,new File("C:\\Users\\Dell.\\google.png"));
	
	
	
	


	}

}
