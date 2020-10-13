package FTSE100;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FTSE100Class {
	private static WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
	}

	@Test
	public void ftse100Test() throws InterruptedException 
	{
		WebElement risers;
		List<WebElement> risersList;

		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100/risers");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		risersList = (List<WebElement>) driver.findElement(By.xpath("//*[@id=\"view-constituents\"]/div[2]/table/tbody"));

		ArrayList<String[]> myResults = new ArrayList();

		String message;

		for (WebElement element : risersList) 
		{
			message = element.getText();
		}
		
		int x = 0;
		double highestVal = 0;
		String nameHighest = "";
		String[] resultHighest = {};
		
		for (String[] stringArray : myResults) 
		{
			for (String item : stringArray)
			{
			if (x == 0) 
			{
				System.out.println(stringArray);
				item = item.replace(",", "");
				if(Double.parseDouble(item) > highestVal)
				{
					highestVal = Double.parseDouble(item);
					resultHighest = stringArray;
				}
			}
			x++;
		}
			System.out.println();
			x = 0;
	}
	System.out.println("Highest Price: " + highestVal);
	
	for(String y : resultHighest)
	{
		System.out.println(y);
	}
}
}
