package MercuryTours;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryToursClass 
{
    private static WebDriver driver;

    @Before
    public void setup() 
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 768));
    }

    @Test
    public void accountCreation() throws InterruptedException
    {
    	driver.get("http://demo.guru99.com/test/newtours/");
    	Thread.sleep(3000);
    	WebElement register = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
    	register.click();
    	Thread.sleep(1500);
    	
    	WebElement firstName = driver.findElement(By.name("firstName"));
    	firstName.sendKeys(Keys.chord("John"));
    	Thread.sleep(1500);
    	
    	WebElement surname = driver.findElement(By.name("lastName"));
    	surname.sendKeys(Keys.chord("Smith"));
    	Thread.sleep(1500);
    	
    	WebElement phone = driver.findElement(By.name("phone"));
    	phone.sendKeys(Keys.chord("12345678910"));
    	Thread.sleep(1500);
    	WebElement email = driver.findElement(By.name("userName"));
    	email.sendKeys(Keys.chord("email@email.com"));
    	Thread.sleep(1500);
    	
    	WebElement address = driver.findElement(By.name("address1"));
    	address.sendKeys(Keys.chord("1 Roadington Road"));
    	Thread.sleep(1500);
    	
    	WebElement city = driver.findElement(By.name("city"));
    	city.sendKeys(Keys.chord("Roadley"));
    	Thread.sleep(1500);
    	
    	WebElement state = driver.findElement(By.name("state"));
    	state.sendKeys(Keys.chord("West Oxroad"));
    	Thread.sleep(1500);
    	
    	WebElement postcode = driver.findElement(By.name("postalCode"));
    	postcode.sendKeys(Keys.chord("RR1 1RR"));
    	Thread.sleep(1500);

    	WebElement country = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[246]"));
    	country.click();
    	
    	WebElement username = driver.findElement(By.name("email"));
    	username.sendKeys(Keys.chord("email@email.com"));
    	Thread.sleep(1500);
    	
    	WebElement password = driver.findElement(By.name("password"));
    	password.sendKeys(Keys.chord("guest"));
    	Thread.sleep(1500);
    	
    	WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
    	confirmPassword.sendKeys(Keys.chord("guest"));
    	Thread.sleep(1500);
    	
    	WebElement submit = driver.findElement(By.name("submit"));
    	submit.click();
    	Thread.sleep(1500);
    	
    	WebElement signIn = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a"));
    	signIn.click();
    	Thread.sleep(1500);
    	
    	WebElement username2 = driver.findElement(By.name("userName"));
    	username2.sendKeys(Keys.chord("email@email.com"));
    	Thread.sleep(1500);
    	
    	WebElement password2 = driver.findElement(By.name("password"));
    	password2.sendKeys(Keys.chord("guest"));
    	Thread.sleep(1500);
    	
    	WebElement submit2 = driver.findElement(By.name("submit"));
    	submit2.click();
    	Thread.sleep(1500);
    	
    	WebElement flights = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"));
    	flights.click();
    	Thread.sleep(1500);
    	
    	WebElement oneWayRadio = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
    	oneWayRadio.click();
    	Thread.sleep(1500);
    	
    	WebElement numberOfPeople = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select/option[2]"));
    	numberOfPeople.click();
    	Thread.sleep(1500);
    	
    	WebElement departure = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select/option[3]"));
    	departure.click();
    	Thread.sleep(1500);
    	
    	WebElement arrival = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select/option[5]"));
    	arrival.click();
    	Thread.sleep(1500);
    	
    	WebElement classPreference = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"));
    	classPreference.click();
    	Thread.sleep(1500);
    }
    
    @After
    public void tearDown() 
    {
    	driver.close();
    	driver.quit();
    }
}
