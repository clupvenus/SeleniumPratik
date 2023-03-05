package day02;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_LinkAdetiBulma {
//1- Bir test class’i olusturun ilgili ayarlari yapin
//2- https://www.automationexercise.com/ adresine gidin
//3- Sayfada 147 adet link bulundugunu test edin.
//4- Products linkine tiklayin
//5- special offer yazisinin gorundugunu test edin
//6- Sayfayi kapatin
public static void main(String[] args) throws InterruptedException {

    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.automationexercise.com/");
    List<WebElement> Links= driver.findElements(By.tagName("a"));
    if (Links.size()==147) System.out.println("Test PAssed");
   else System.out.println("Test Failed");
   driver.findElement(By.xpath("//a[text()=' Products']")).click();
//reklam ciktigi icin ilerleyemiyoruz yapacak birsey yok
   driver.findElement(By.id("dismiss-button")).click();
   if(driver.findElement(By.id("sale_image")).isDisplayed()) System.out.println("Yazi gorunuyor.");
   else System.out.println("yazi gorunmuyor");

    driver.close();
}





}
