package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Locator {
    public static void main(String[] args) throws InterruptedException {
        //Amazon Arama Testi
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        //2- https://www.amazon.com adresine gidin
        //3- amazon arama kutusunu locate edin
        //4- arama kutusuna “Nutella” yazdirin
        //5- arama islemini yapabilmek icin ENTER tusuna basin

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Azrayi cooook seviyorum");
        aramaKutusu.click();




        Thread.sleep(3000);
        driver.close();

    }
}
