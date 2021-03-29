import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(10000);
		Dimension d=new Dimension(200,300);
		Options opt=driver.manage();
		opt.window().setSize(d);
		Thread.sleep(10000);
		Point p=new Point(100,50);
		driver.manage().window().setPosition(p);
		Thread.sleep(10000);
		driver.close();
	}

}
