package Testing;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.webElemet;
import org.openqa.selenium.chrome.chromeDriver;


public class TestGmail {
	static {
		System.setProperty("wedriver.chrome.driver","C:\\Users\\PAPALI\\eclipse-workspace\\Sampleapplication\\src\\Testing\\TestGmail.java");
	
	}
		public static void main(String[] args) throws  InterruptedException { 
		
		
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
  driver.manage().Window().maximize();
  driver.get("https://www.gmail.com"); 
  driver.manage().timeouts().implicitlywait(10,TimeUnit.SECONDS);
  WebElement Username=driver.findElement(By.xpath("/Input[@type='email']"));
  Username.sendkeys("xzx19351@gmail.com");
  driver.findElement(By.xpath("//span[@class='Rven snByac']")).click();
  WebElement pwd= driver.findElement(By.xpath("//input[@name='password'"));
  Thread.sleep( 1000);
  pwd.sendkeys("XyzPs19351");
  driver.findElement(By.xpath("//span[.='Next']")).click();
  Thread.sleep( 500);
  driver.findElement(By.xpath("//div[@class='T-I J-JS-Ji T-I-KE L3")).click();
  WebElement to= driver.findElement (By.xpath("//textarea[@name='to']"));
  to.sendkeys("xzx19351@gmail.com");
 
  WebElement txt = driver.findElement(By.xpath("//input[@name='subjectbox']"));
  WebElement sub;
sub.sendkeys("Hello");
  Object txt1 = driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']"));
   ((WebElement) txt1).sendkeys("Hello Friends");
  ((WebElement) txt1).sendkeys("This is my frist automated test mail");
  Thread.sleep(500);
  driver.findElement(By.xpath("//div[@class='T-I J-JS-Ji aoO v7 T-I-atl L3']")).click();
  Thread.sleep( 500);
  //driver.close();
  
  
  
	}
		private static Object window() {
			// TODO Auto-generated method stub
			return null;
		}

	}
