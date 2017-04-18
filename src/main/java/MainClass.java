import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by China on 15.04.2017.
 */
public class MainClass extends TestScripts {
    private int imageCount;
    public static void main(String[] args) throws InterruptedException {
        int imageCount;
        String title;
        WebDriver driver = configurateWebDriver();
        //скролинг страницы и подсчет эллементов
        scrollImages(driver);
        //поиск с помощью строки поиска
        searchCheck(driver);

        setFilter(driver);

        driver.findElement(By.xpath("//li[@data-idx='1']")).click();

        driver.close();

       // WebElement nextImage = (new WebDriverWait(driver, 10))
               // .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id= 'iol_navr']")));
        //nextImage.click();

       //WebElement element =(WebElement)((JavascriptExecutor)driver)
             //  .executeScript("document.getElementById('b_content').focus();");

       //element.sendKeys("sdsdas");

      //  Actions builder = new Actions(driver);
      //  builder.moveToElement( driver.findElement(By.xpath("//div[@id='b_content']")));
       // builder.click();
      //  builder.sendKeys(Keys.ARROW_RIGHT);
       // builder.build().perform();

//div[@id='b_content']
       // Thread.sleep(5000);

      //  WebElement nextImage = (new WebDriverWait(driver, 100))
     //    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='iol_nav' and @id = 'iol_navr']")));
        //WebElement element =(WebElement)((JavascriptExecutor)driver)
        //  .executeScript("document.getElementById('miniheader').focus();");
  // driver.findElement(By.xpath("//div[@id = 'switcher']"));

     // WebElement temp =  driver.findElement(By.xpath("//div[@id = 'b_content']"))
     //    .findElement(By.id("detail_canvas")).findElement(By.id("iol_navl"));

//        Actions builder = new Actions(driver);
   //      builder.contextClick(temp).build().perform();
        // builder.click();
        //  builder.sendKeys(Keys.ARROW_RIGHT);
        // builder.build().perform();
//driver.findElement(By.xpath("//div[@id = 'b_content']"))
// .findElement(By.id("detail_canvas")).findElement(By.id("iol_navl")).click()

       // driver.findElement(By.xpath("//div[@id = 'b_content'")).click();

     //   WebElement el = driver.findElement(By.xpath("//a[@class='iol_nav' and @id = 'iol_navr']"));

      //  el.click();


       // driver.findElement(By.xpath("//div[@id='can_fav']")).click();



    }




}
