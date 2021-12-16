package svggraphsselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class covidNewcasesandDeath 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/search?q=covid+cases+graph&oq=covid+&aqs=chrome.1.69i57j69i59.3247j0j15&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		List<WebElement> List = driver.findElements(By.xpath("(//*[local-name()='svg' and @class=\"uch-psvg\"])[1]//*[name()='rect']"));
		Actions act=new Actions(driver);
		for(WebElement e: List)
		{
			act.moveToElement(e).perform();
			String textitem=driver.findElement(By.xpath("//div[@class=\"GxwVnb\"]")).getText();
			System.out.println(textitem);
			
		}
		

	}

}
