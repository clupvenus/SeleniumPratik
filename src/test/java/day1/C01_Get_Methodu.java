package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Get_Methodu {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //amazon sayfasina gidin
        driver.get("https://amazon.com");

        //Gittiginiz sayfadaki title ve url yi yazdirin.
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //Amazon Anasayfaya gittiginiz test edin.

        String exceptedIcerik="amazon";
        String actualIcerik=driver.getCurrentUrl();
        //Amazon.com. Spend less. Smile more.
        //https://www.amazon.com/

        if(exceptedIcerik.contains(actualIcerik)){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed.");
          //Test Failed.
        //TEST EXPected ILE ACTUAL result in karsilastirilmasidir.


         //getWindowHandle selenium tarafindan her driver sayfasi icin uretir.
         //unique handle degerleri dondurur
         //getWindowHandels() ise test edilen butun driver sayfasi icin uretilen sayfalari
         //Set olarak dondurur.

        System.out.println(driver.getWindowHandle());
         //CDwindow-171DCF05B2AB27D6B6B40B5DF1CA9B8E
        //Bu kod uniq dir ilerde isimize yarayacakmis.

        System.out.println(driver.getPageSource());
        //Buda sayfanin tum kaynak kodlarini getirir.

        driver.close();
        //actigimiz sayfa otomatik kapansin diye bunu yaziyoruz.

    }
}
