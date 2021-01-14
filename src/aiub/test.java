package aiub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://portal.aiub.edu/");
        
          driver.findElement(By. name("UserName")).sendKeys("himi");
          driver.findElement(By.name("Password")).sendKeys("Humayra1*");
          driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/button")).click();
        
        String exp_title= "Index";
        String act_title = driver.getTitle();
        
        if (exp_title.equals(act_title) == true)
        {
      	  System.out.println("Passed");
        }
        else {
      	  System.out.println("Failed");

        }

	}

}
