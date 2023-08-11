import org.openqa.selenium.chrome.ChromeDriver;
public class Demofirstjava {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukes\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.goggle.com");
		
	}

}
