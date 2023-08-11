package firstdemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.findElement(By.name("email")).sendKeys("kinjal.gmail.com");
        driver.findElement(By.name("email")).clear();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());
        System.out.println (   driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());
        System.out.println ( driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
        System.out.println (driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getText());
        System.out.println (driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
        System.out.println (driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
        System.out.println ( driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());
       
         
     
  
        
	}

}
