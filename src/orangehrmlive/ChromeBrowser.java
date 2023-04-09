package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //open the URL into Browser
        driver.get(baseUrl);

        //Give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the Title of the page
        System.out.println("Page title : " + driver.getTitle());

        //Get the Current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());

        // Get Page Source
        System.out.println("Page source :" + driver.getPageSource());

        // Find and Type the username to Username field element
        driver.findElement(By.name("username")).sendKeys("Admin");


        // Find the password field Element and Type the password
        driver.findElement(By.name("password")).sendKeys("Password");

        // Close the Browser
        //  driver.close();

    }
}
