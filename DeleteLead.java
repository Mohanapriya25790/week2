package week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	   driver.findElement(By.className("decorativeSubmit")).click();
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.linkText("Find Leads")).click();
	   driver.findElement(By.linkText("Phone")).click();
	   driver.findElement(By.xpath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']/input[@name='phoneNumber']")).sendKeys("99");
	   driver.findElement(By.xpath("//td[@class='x-btn-center']//button[@class='x-btn-text']")).click();
	   WebElement leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String leadId1 = leadId.getText();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		System.out.println(leadId1);
		leadId.click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Name and ID")).click();
		driver.findElement(By.className("x-form-item-label")).sendKeys("10097");
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[@class='x-btn-text']")).click();
		if(driver.findElement(By.className("x-paging-info")).isDisplayed()) {
			System.out.println("No Records to Display");
		}else {
			System.out.println("Records to Display");
		}
		
		
		driver.close();
	}

}
