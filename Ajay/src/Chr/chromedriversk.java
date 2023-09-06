package Chr;

import java.util.concurrent.TimeUnit;

public class chromedriversk {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	webDriver driver = new chromeDriver();
	driver.manage().timeouts().implicitlyWaits(timeout, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("www.facebook.com");
	

	}

}
