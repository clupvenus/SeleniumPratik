package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class C01_x_path {
    public static void main(String[] args) throws InterruptedException {
        //Relative Xpath Soru
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        //2- Add Element butonuna basin
        //3- Delete butonu’nun gorunur oldugunu test edin
        //4- Delete tusuna basin
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin


        //*****Cozum***
        //Relative Xpath Soru
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
       WebElement aramaButonu= driver.findElement(By.xpath("//*[@id='content']/div/button"));
       aramaButonu.click();

        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()) System.out.println("test passed");
        else {
            System.out.println("test failed");
        }
        //4- Delete tusuna basin
        deleteButonu.click();



        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement AddRemoveElements=driver.findElement(By.xpath("//h3"));
        if (AddRemoveElements.isDisplayed()) System.out.println("test2 passed");
        else System.out.println("test failed");

        driver.close();
    }
}
