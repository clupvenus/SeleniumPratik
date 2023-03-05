package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_css {
    public static void main(String[] args) {
        //1- bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        //3- Browseri tam sayfa yapin
        //4- Sayfayi “refresh” yapin
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        //6- Gift Cards sekmesine basin
        //7- Birthday butonuna basin
        //8- Best Seller bolumunden ilk urunu tiklayin
        //9- Gift card details’den 25 $’i secin
        //10-Urun ucretinin 25$ oldugunu test edin
        //11-Sayfayi kapatin

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        driver.navigate().refresh();
        String title= driver.getTitle();
        if(title.contains("Spend less")) System.out.println("Test passed");
        else System.out.println("test failed");
        //arada adres degistirme cikiyor onu onaylamak icin kullaniyorum
        driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]")).click();
        //gift cards a tikla
        driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_gc']")).click();
         // birtday butonuna basin.

        driver.findElement(By.cssSelector("a[aria-label='Birthday']")).click();
        driver.close();
    }
}
