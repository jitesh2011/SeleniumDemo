package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

    public static void main(String args[])
    {

        // TC_01 -- open the browser
        String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        WebDriver driver=new ChromeDriver();

        driver.get(url);

        System.out.println("Open Browser");

        System.out.println("Trial of github");

    }
}
