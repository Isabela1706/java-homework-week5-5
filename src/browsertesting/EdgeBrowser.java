package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

/**
 * Edge Browser
 */

public class EdgeBrowser {


    static String baseURL = "https://courses.ultimateqa.com/";

    public static void main(String[] args) {
        //Set up Edge browser.
        WebDriver driver = new EdgeDriver();
        //Open URL.
        driver.get(baseURL);

        //Set the fullscreen
        driver.manage().window().fullscreen();

        //Set time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



        //Print the title of the page.
        System.out.println(driver.getTitle());

        //Print the current URL.
        System.out.println(driver.getCurrentUrl());

        //Print the page source.
        System.out.println(driver.getPageSource());

        //Click on the Sign In’ link
        WebElement signIn = driver.findElement(By.className("header__nav-sign-in"));
        signIn.click();


        //Print the current URL
        String newUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.out.println("The page on sign in now " + newUrl);

        //Enter the email in the email field.
        WebElement emailF = driver.findElement(By.id("user[email]"));
        emailF.sendKeys("ABC13@GMAIL.COM");


        //Enter the password in the password field.
        WebElement passwordF = driver.findElement(By.name("user[password]"));
        passwordF.sendKeys("abdnjkhudsf");

        //Click on the Login Button.
        WebElement logIn = driver.findElement(By.className("g-recaptcha"));
        logIn.click();

        //Navigate to baseUrl.
        driver.get(baseURL);

        //Navigate forward to the Homepage.
        String homePage = "https://courses.ultimateqa.com/collections";
        driver.get(homePage);

        //Navigate back to baseUrl.
        driver.get(baseURL);

        //Refresh the page.
        driver.navigate().refresh();


        //Close the browser.
        driver.close();


    }

}

