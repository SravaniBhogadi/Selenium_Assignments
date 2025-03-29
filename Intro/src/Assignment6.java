public class Assignment6 {

	public static void main(String[] args) {
		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		
		webElement secondWindow = driver.findElement(By.xpath("//a[@class = 'blinkingText']");
		secondWindow.click();

		webElement text = driver.findElement(By.xpath("//p[@class='im-para red']"));
		System.out.println(text.getText());
