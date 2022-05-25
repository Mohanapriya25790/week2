package week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 driver.findElement(By.linkText("Create New Account")).click();
		 driver.findElement(By.name("firstname")).sendKeys("mohana priya");
		 driver.findElement(By.name("lastname")).sendKeys("gopalakrishnan");
		 driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[contains(@name,'reg_email')]")).sendKeys("9994455297");
		 driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[contains(@name,'reg_passwd')]")).sendKeys("Rohadi257@");
		 WebElement downday= driver.findElement(By.id("day"));
		   Select down= new Select(downday);
		 down.selectByValue("25");
		 WebElement downmonth= driver.findElement(By.id("month"));
		   Select down1= new Select(downmonth);
		 down1.selectByValue("7");
		 WebElement downyear= driver.findElement(By.id("year"));
		   Select down2= new Select(downyear);
		 down2.selectByValue("1990");
		 driver.findElement(By.xpath("//span[contains(@class,'_5k_2')]/label")).click();
		 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}
}
