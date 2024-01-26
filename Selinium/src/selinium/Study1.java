package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/");

	}

}
