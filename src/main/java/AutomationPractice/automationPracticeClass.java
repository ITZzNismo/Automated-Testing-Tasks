package AutomationPractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationPracticeClass 
{
    private static WebDriver driver;

    @Before
    public void setup() 
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 768));
    }
    
    @Test
    public void automationPracticeTest() throws InterruptedException
    {
    	driver.get("http://automationpractice.com/index.php");
    	WebElement tshirts = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
    	tshirts.click();
    	Thread.sleep(1500);
    	WebElement firstTshirt = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]"));
    	firstTshirt.click();
    	Thread.sleep(5000);
    	WebElement addToCartButton = driver.findElement(By.id("add_to_cart"));
    	addToCartButton.click();
    	Thread.sleep(5000);
    }
    
    @After
    public void tearDown() 
    {
        driver.close();
    }
}