

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Assignment1 {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//input[@minlength= '2']")).sendKeys("Sravani");
		driver.findElement(By.xpath("//input[@name= 'email']")).sendKeys("sravani@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'exampleInputPassword1']")).sendKeys("sravani@457");
		driver.findElement(By.xpath("//input[@id = 'exampleCheck1']")).click();
		driver.findElement(By.xpath("//select[@id = 'exampleFormControlSelect1']/option[text() = 'Female']")).click();
		driver.findElement(By.xpath("//input[@type= 'date']")).sendKeys("17-05-1999");
		driver.findElement(By.xpath("//input[@type= 'submit']")).click();
		String message = driver.findElement(By.xpath("//div[@class= 'alert alert-success alert-dismissible']")).getText();
		System.out.println(message);
		driver.close();
		
		
	}
	
	

}
