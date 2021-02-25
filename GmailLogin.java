import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class GmailLogin {
	public static void main(String[] args) throws InterruptedException   
	   {
	      System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\PAPALI\\\\eclipse-workspace\\\\Sampleapplication\\\\src\\\\Testing\\\\TestGmail.java");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.gmail.com");
	      Object WebElement;
		  driver.findElement( By.id("identifierId")).sendKeys(" xzx19351",Keys.ENTER);
	      Thread.sleep(3000);
	      driver.findElement(By.name("password"))).sendKeys("XyzPs19351",Keys.ENTER);
	      Thread.sleep(4000);
	      driver.close();
	}

}
