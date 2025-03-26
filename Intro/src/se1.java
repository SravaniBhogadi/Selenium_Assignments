import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class se1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("sravani");
        driver.findElement(By.name("inputPassword")).sendKeys("sra");
        driver.findElement(By.className("signInBtn")).click();
        String error = driver.findElement(By.cssSelector("p.error")).getText();
        System.out.println(error);
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder = 'Name']")).sendKeys("bob");
        driver.findElement(By.cssSelector("input[placeholder = 'Email']")).sendKeys("sra@123");
        driver.findElement(By.xpath("//input[@type = 'text'][2]")).clear();
        driver.findElement(By.cssSelector("input[placeholder = 'Email']")).sendKeys("bho@231");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("3454364");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String err = driver.findElement(By.cssSelector("form p[class = 'infoMsg']")).getText();
        System.out.println(err);
        driver.quit();



        }

}
