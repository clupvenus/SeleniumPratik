package day03;

import Utilities.TestBaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_Assertion extends TestBaseClass {
    //1) Bir class oluşturun: BestBuyAssertions
    //2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak
    //asagidaki testleri yapin
    //○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    //○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    //○ logoTest => BestBuy logosunun görüntülendigini test edin
    //○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin

    @Test
    public void test01(){
        driver.get("https://www.bestbuy.com/");
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.bestbuy.com/";

        Assert.assertEquals(expectedUrl,actualUrl);



    }
    @Test
    public void test02(){
        driver.get("https://www.bestbuy.com/");
        String actualTitle=driver.getTitle();
        String expectedIcerik="Rest";

        Assert.assertFalse(actualTitle.contains(expectedIcerik));
        System.out.println("Actual title: "+actualTitle);

    }
    @Test
    public void test03(){
        //○ logoTest => BestBuy logosunun görüntülendigini test edin
        driver.get("https://www.bestbuy.com/");
        WebElement logo=driver.findElement(By.xpath("(//*[@class='logo'])[1]"));

        Assert.assertTrue(logo.isDisplayed());

    }
    @Test
    public void test04(){
        //○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        driver.get("https://www.bestbuy.com/");
        WebElement fransiz=driver.findElement(By.className("is-active"));
        Assert.assertTrue(fransiz.isDisplayed());
    }


}
