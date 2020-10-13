package TheDemoSite;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class theDemoSiteClass 
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
    public void demoSiteTest() throws InterruptedException
    {
    	driver.get("http://thedemosite.co.uk/");
    	WebElement addAUser = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
    	addAUser.click();
    	
    	WebElement username = driver.findElement(By.name("username"));
    	username.click();
    	username.sendKeys(Keys.chord("guest"));
    	Thread.sleep(1500);

    	WebElement password = driver.findElement(By.name("password"));
    	password.click();
    	password.sendKeys(Keys.chord("guest"));
    	Thread.sleep(1500);

    	WebElement submitButton = driver.findElement(By.name("FormsButton2"));
    	submitButton.click();
    	Thread.sleep(1500);

    	WebElement login = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
    	login.click();
    	Thread.sleep(1500);

    	WebElement username2 = driver.findElement(By.name("username"));
    	username2.click();
    	username2.sendKeys(Keys.chord("guest"));
    	Thread.sleep(1500);

    	WebElement password2 = driver.findElement(By.name("password"));
    	password2.click();
    	password2.sendKeys(Keys.chord("guest"));
    	Thread.sleep(1500);

    	WebElement submitButton2 = driver.findElement(By.name("FormsButton2"));
    	submitButton2.click();
    	String expected = "**Successful Login**";
    	Thread.sleep(1500);

    	WebElement webelement = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
    	String actual = webelement.getText();
    	assertEquals(expected, actual);
    	Thread.sleep(1500);

    }
    
    @After
    public void tearDown() 
    {
    	driver.close();
    }
}
