package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement comName = driver.findElement(By.id("createLeadForm_companyName"));
		comName.sendKeys("ABC");
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC"); 
		
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Jackson");
		
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jackson");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mossess");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jack");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("DBA");
		WebElement desc = driver.findElement(By.id("createLeadForm_description"));
		desc.sendKeys("Jackson the DBA");
		
		//driver.findElement(By.id("createLeadForm_description")).sendKeys("Jacksone the DBA");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jack.son@gmail.com");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).click();
		
		Select location = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		location.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Please enter the imp notes");

		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ");
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Steffie");
		//firstName.clear();
		//firstName.sendKeys("Steffie");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	

}
