
public class Windowhandlings {

	public static void main(String[] args) {
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
			
		2. https://rahulshettyacademy.com/loginpagePractise	
		
		3. nested frames -- print middle text
			
			amazon -- mousehover actions
			

	}

}
