package day05;

import Utilities.TestBaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class C01_Select extends TestBaseClass {
    //● Bir class oluşturun: DropDown
    //● https://the-internet.herokuapp.com/dropdown adresine gidin.
    //1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    //2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
    //3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    //4.Tüm dropdown değerleri(value) yazdırın
    //5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True ,
    //degilse False yazdırın.
    @Test
    public void test01(){

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement ddm=driver.findElement(By.id("dropdown"));

        Select select=new Select(ddm);
        //1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın

        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        //2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın

        select.selectByValue("2");
        //Bu select objesinin value degeri iki oldugu icin 2 yazdik.
        System.out.println(select.getFirstSelectedOption().getText());

        //3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());

        //4.Tüm dropdown değerleri(value) yazdırın
        List<WebElement> tumsecenekler=select.getOptions();

        for (WebElement eachwebElement:tumsecenekler
             ) {
            System.out.println(" ,"+eachwebElement.getText());

        }
        //5. Dropdown’un boyutunu test edin. 4 mu kontrol edin.

        int actualdropdownBoyutu=tumsecenekler.size();
        int expecteddropdownBoyutu=3;
        Assert.assertEquals(expecteddropdownBoyutu,actualdropdownBoyutu);


    }






}
