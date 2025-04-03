import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlings {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		webElement multipleWindow = driver.findElement(By.xpath("//a[text() = 'Multiple Windows']");
		multipleWindow.click();

		webElement text = driver.findElement(By.xpath("//h3[text() = 'Opening a new window']"));
		System.out.println(text.getText());

		webElement second_window = driver.findElement(By.xpath("//a[text() = 'Click Here']");
		second_window.click();
		
		webElement secon_window_text = driver.findElement(By.xpath("//div[@class = 'example']");
		system.out.println(second_window_text.getText());

		driver.switchTOWindow()
			
			
		


	}

}




https://rahulshettyacademy.com/AutomationPractice/
	
	
	
	
	
	