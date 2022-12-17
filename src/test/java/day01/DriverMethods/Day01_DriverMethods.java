package day01.DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Day01_DriverMethods {

        public static void main(String[] args) {
            SeleniumManager.getInstance().getDriverPath("chromedriver");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.com");
            driver.close();
            driver.quit();


            SeleniumManager.getInstance().getDriverPath("IEDriverServer");
            InternetExplorerDriver driver1 = new InternetExplorerDriver();
            driver1.get("https://www.amazon.com");

            System.out.println("Sayfa Basligi : "+driver.getTitle()); // Icinde bulunan sayfanin basligini string olarak getirir
            System.out.println("Sayfa Url'i"+driver.getCurrentUrl());
//System.out.println(driver.getPageSource());
            System.out.println(driver.getWindowHandle());// Bize o window'a ait hash değerini verir. Biz bu hash değerlerini
            // bir string'e atayıp pencereler arası geçiş yapabiliriz


        }
        }

