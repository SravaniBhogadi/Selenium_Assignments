import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment7{
	

public static void main(String[] args){
	
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  WebElement op1 = driver.findElement(By.xpath("//input[@id = 'checkBoxOption2']"));
	  op1.click();
	  String value = op1.getText();
	  
	  WebElement dropdown = driver.findElement(By.xpath("//select[@id = 'dropdown-class-example']"));
	  dropdown.sendKeys(value);
	  
	  WebElement name = driver.findElement(By.xpath("//input[@id = 'name']"));
	  name.sendKeys(value);
	  
	  WebElement alert = driver.findElement(By.xpath("//input[@id = 'alertbtn']"));
	  alert.click();
}
}

  
  
    
