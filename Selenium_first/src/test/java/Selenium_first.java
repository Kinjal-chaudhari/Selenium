import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // chrome driver
		String url="https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mukes\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
		//edge driver
		String url1="https://www.google.com/";
		System.setProperty("Webdriver.edge.driver", "C:\\Users\\mukes\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver1=new  EdgeDriver();
        driver1.manage().window().maximize();
        driver1.get(url1);
        // firefox driver
        String url2="https://meet.google.com/kuo-ibsw-frk";
        System.setProperty("Webdriver.gecko.driver","C:\\Users\\mukes\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver2=new FirefoxDriver();
        driver2.manage().window().maximize();
        driver2.get(url2);

		String Exceptedresult="facebook.com";
		String actualresult=driver.getTitle();
		System.out.println(actualresult);
		if(Exceptedresult==actualresult) {
			System.out.print("pass");
		}
		else {
			System.out.print("fail");
		}
	}

	}

	
