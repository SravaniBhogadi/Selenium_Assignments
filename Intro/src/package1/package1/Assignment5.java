package package1;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window.maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id = 'username']"));
		username.sendKeys("rahulshettyacademy");

		WebElement password = driver.findElement(By.xpath("//input[@id = 'password']"));
		password.sendKeys("learning");

		WebElement dropdown = driver.findElement(By.cssSelector("select[class = 'form-control']"));
		Select dropdownSelect = new Select(dropdown);
		dropdownSelect.selectByVisibleText("Consultant");

		WebElement acceptTerms = driver.findElement(By.cssSelector("input[name = 'terms']"));
		acceptTerms.click();

		WebElement signIn = driver.findElement(By.cssSelector("#signInBtn"));
		signIn.click();

		List <WebElement> product_name = driver.findElements(By.xpath("//h4[@class = 'card-title']/a]"));

		WebElement add_to_cart = driver.findElements(By.cssSelector("//button[@class = 'btn btn-info']"));

		String[] items = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};


	public static void select_items(WebDriver driver, String[] items){
	for(int i = 0; i<product_name.size();i++){
		String[] name= product_name.get(i).getText();
		String final_name=name[i];
		List products_needed_list = Arrays.asList(items);
		if(items.contains(final_name))
		{
			j++;
		add_to_cart.get(i).click();
		if(j==items.length)
		{
			break;
		}
		}
		}
		driver.close();

		}
			


		}









		
		
	}

}
