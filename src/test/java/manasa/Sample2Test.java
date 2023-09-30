package manasa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample2Test {
@Test(groups="smoke,Integration")
public void sample() {
	WebDriver driver =  new ChromeDriver();
	driver.get("https://www.amazon.in/");
			
	
	System.out.println("This is sample2");
}
}

