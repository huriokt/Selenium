package day01.DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01_Selenium {
    public static void main(String[] args) {/*
 /* En temel haliyle otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan
webdriver'in yerini gostermemiz gerekir. Bunun icin Java kutuphanesinden System.setProperty()
method'unun icine ilk olarak driver'i yazariz. Ikinci olarak driver'in fiziki yolunu kopyalariz.
 */


// uzerine geldigimizde interface yazdigini göruruz.webdriver interface oldugu icin ondan obje olusturamiyoruz ama
// chrome driver klasindan obje olusturabiliyoruz.

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");//Parantez icerisindeki adrese gider






    }
}
