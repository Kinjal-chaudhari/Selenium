package firstdemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		 String str= driver.getCurrentUrl();
		 System.out.println(str);
		 String titile=driver.getTitle();
		 System.out.println(titile);
		 driver.navigate().to("http://www.google.com") ;
		 driver.close();
		

	}

}
