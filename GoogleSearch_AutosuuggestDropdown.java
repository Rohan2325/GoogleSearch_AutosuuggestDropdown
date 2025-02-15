package TestngProjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch_AutosuuggestDropdown {
    WebDriver driver;

    	@Parameters("browser")
    	
       @BeforeClass
       public void setUp(@Optional("chrome")String Browser) {
           if (Browser.equalsIgnoreCase("chrome")) {
      	      WebDriverManager.chromedriver().setup();
      	      driver = new ChromeDriver();
      	 }
      	  else if (Browser.equalsIgnoreCase("firefox")) {
      	      WebDriverManager.firefoxdriver().setup();
      	      driver = new FirefoxDriver();
      	 }
      	  else { 
      		  throw new IllegalArgumentException("Browser not supported: " + Browser);
      	 }
        	  driver.get("https://www.google.com/");
        	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 }

	        @Test
	        public void testGoogleSearch() {	    	
	        driver.findElement(By.id("APjFqb")).sendKeys("automation");
		    List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
            System.out.println(list.size());
            for(int i=0;i<list.size();i++)
         {
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().equals("automation"))
         {
        	list.get(i).click();
        	break;
        }
        }
	    }
     @AfterClass
     public void teardown()
     {
        driver.quit();
     }
	
	}
