package project5Ultimateqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {

        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //get url
        driver.get(baseurl);
        // get the tittle of the page
        String tittle = driver.getTitle();
        System.out.println("page tittle is :" + driver.getTitle());

        //get current url
        System.out.println("current url :" + driver.getCurrentUrl());

        //find the email field element
        WebElement emailfield = driver.findElement(By.name("user[email]"));
        emailfield.sendKeys("manisha@gmail.com");

        //find the password field element
        WebElement passwordfield = driver.findElement(By.id("user[password]"));
        passwordfield.sendKeys("password123");
        //closing
        driver.quit();

    }
}
