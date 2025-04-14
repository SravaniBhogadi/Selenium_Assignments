import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		
		WebElement open_second_Window = driver.findElement(By.xpath("//a[@class = 'blinkingText']"));
		open_second_Window.click();

		WebElement text = driver.findElement(By.xpath("//p[@class='im-para red']"));
		System.out.println(text.getText());
}
}