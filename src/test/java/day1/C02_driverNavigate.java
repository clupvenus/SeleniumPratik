package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_driverNavigate {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon anasayfaya gidin.
        driver.get("https://www.amazon.com");


        //wisequarter anasayfaya gidin

        driver.get("https://www.wisequarter.com");
        //yeniden amazon anasayfaya gidin

        driver.navigate().back();

        //wisequarter anasayfaya donun.
        driver.navigate().forward();

        // navigate().to()ve driver.get() ile ayni islemi yapar.
        driver.navigate().to("https://www.wisequarter.com");
        driver.navigate().refresh();
//Simdi get.size ve get.postion methodlarini deneyelim.
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        //(1552, 832)
        //(-8, -8)
        //birde fullscreen deki sayilari alalim.

        driver.manage().window().fullscreen();
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        //(1536, 864)
        //(0, 0)

        driver.close();


    }
}
