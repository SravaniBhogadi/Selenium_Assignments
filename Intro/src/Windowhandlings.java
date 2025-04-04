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
	
	
----------------------------------

import java.util.Iterator;



import java.util.List;



import java.util.Set;



import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;



import org.openqa.selenium.chrome.ChromeDriver;



public class A3 {



public static void main(String[] args) {



// TODO Auto-generated method stub







System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");



WebDriver driver=new ChromeDriver();



driver.get("http://qaclickacademy.com/practice.php");



WebElement table=driver.findElement(By.id("product"));



System.out.println(table.findElements(By.tagName("tr")).size());



System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



System.out.println(secondrow.get(0).getText());



System.out.println(secondrow.get(1).getText());



System.out.println(secondrow.get(2).getText());

}

}


	
	
	