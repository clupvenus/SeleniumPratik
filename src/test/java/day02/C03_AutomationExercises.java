package day02;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_AutomationExercises {
    //Automation Exercise Category Testi
    //1- Bir test class’i olusturun ilgili ayarlari yapin
    //2- https://www.automationexercise.com/ adresine gidin
    //3- Category bolumundeki elementleri locate edin
    //4- Category bolumunde 3 element oldugunu test edin
    //5- Category isimlerini yazdirin
    //6- Sayfayi kapatin
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.automationexercise.com/");

        List<WebElement> category=driver.findElements(By.className("panel-heading"));

        if (category.size()==3) System.out.println("test passed");
        else System.out.println("test failed");
        driver.close();






    }
}
