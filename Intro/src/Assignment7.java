import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment7{
public static void main(String[] args){
WebDriver driver = new ChromeDriver();
  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  WebElement op1 = driver.findElement(By.xpath("//input[@id = 'checkBoxOption2']").click();
  String value = op1.getText();
  driver.findElement(By.xpath("//select[@id = 'dropdown-class-example']").sendKeys(value);
  driver.findElement(By.xpath("//input[@id = 'name']").sendKeys(value);
  driver.findElement(By.xpath("//input[@id = 'alertbtn']").click();
  
  
    
