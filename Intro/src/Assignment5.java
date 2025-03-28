import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

       
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("rahulshettyacademy");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("learning");

        WebElement dropdown = driver.findElement(By.cssSelector("select.form-control"));
        Select dropdownSelect = new Select(dropdown);
        dropdownSelect.selectByVisibleText("Consultant");

        WebElement acceptTerms = driver.findElement(By.name("terms"));
        acceptTerms.click();

        
        WebElement signIn = driver.findElement(By.id("signInBtn"));
        signIn.click();
        

        
        List<WebElement> product_name = driver.findElements(By.xpath("//h4[@class='card-title']/a"));
        List<WebElement> add_to_cart = driver.findElements(By.cssSelector("button.btn.btn-info"));

        
        String[] items = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};

        select_items(product_name, add_to_cart, items);

        driver.quit();
    }

   
    public static void select_items(List<WebElement> product_name, List<WebElement> add_to_cart, String[] items) {
        int j = 0;
        List<String> product_needed_list = Arrays.asList(items);

        for (int i = 0; i < product_name.size(); i++) {
            String final_name = product_name.get(i).getText();
            if (product_needed_list.contains(final_name)) {
                add_to_cart.get(i).click();
                j++;
                if (j == items.length) {
                    break;
                }
            }
        }
    }
}
