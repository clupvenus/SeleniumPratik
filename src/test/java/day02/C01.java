package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    //. Yeni bir class olusturun (TekrarTesti)
    //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
    //doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
    //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
    //doğru URL'yi yazdırın.
    //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
    //5. Youtube sayfasina geri donun
    //6. Sayfayi yenileyin
    //7. Amazon sayfasina donun
    //8. Sayfayi tamsayfa yapin
    //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
    //Yoksa doğru başlığı(Actual Title) yazdırın.
    //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
    //doğru URL'yi yazdırın
    //11.Sayfayi kapatin

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.youtube.com");

        String actualTitle=driver.getTitle();

        String exceptedTitle="youtube";
        if(actualTitle.contains(exceptedTitle)){
            System.out.println("Title youtube iceriyor.");
        }else
        System.out.println("Title youtube icermiyor. Title: "+actualTitle);

        driver.get("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().fullscreen();

        driver.close();







    }
}
