package framework;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {

	public static void main(String[] args) {
		ChromeDriver data=new ChromeDriver();
		data.manage().window().maximize();
		/*
		 * data.get("https://www.amazon.in/"); Set<Cookie> cookies =
		 * data.manage().getCookies(); System.out.println(cookies.size());
		 */
		data.get("https://www.google.com/");
		/*
		 * Set<Cookie> cookies = data.manage().getCookies(); for(Cookie cookie:cookies)
		 * { System.out.println(cookie); }
		 */
			data.manage().deleteCookieNamed("NID");
			Set<Cookie> cookies1 = data.manage().getCookies();
			for(Cookie cookie:cookies1) {
				System.out.println(cookie);
		
		//System.out.println(cookies.size());
		
	}
	data.manage().addCookie(new Cookie("FOO","BAR"));	
	Cookie cookieNamed = data.manage().getCookieNamed("FOO");
	System.out.println(cookieNamed);

	}
}
