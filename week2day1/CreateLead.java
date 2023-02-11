package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jackson");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mossess");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jack");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("DBA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Jacksone the DBA");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jack.son@gmail.com");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).click();
		
		Select location = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		location.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
	}

}
