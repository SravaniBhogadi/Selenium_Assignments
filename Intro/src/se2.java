import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class se2 {
	public static void main (String[] args)
	{
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id = 'checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id = 'checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@id = 'checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id = 'checkBoxOption1']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type = 'checkbox']")).size());


	}

}
