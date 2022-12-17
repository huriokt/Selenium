package day01.DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_04ManageMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");
//        Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari = " + driver.manage().window().getSize());
//        Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
//        simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().maximize();
//        Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanin Max Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin Max Boyutu = " + driver.manage().window().getSize());
//        Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
//        Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin Fullscreen Konumu= " + driver.manage().window().getPosition());
        System.out.println("Sayfanin Fullscreen Boyutu = " + driver.manage().window().getSize());
//        Sayfayi kapatin
        driver.close();
    }
    }
