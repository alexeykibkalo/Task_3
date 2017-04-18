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

        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("//div[@id='miniheader_data']"))).click().build().perform();
        //Thread.sleep(2000);
        builder.sendKeys(Keys.ARROW_RIGHT).build().perform();
       // Thread.sleep(2000);
        builder.sendKeys(Keys.ARROW_RIGHT).build().perform();
       // Thread.sleep(2000);
        builder.sendKeys(Keys.ARROW_RIGHT).build().perform();
       // Thread.sleep(2000);
       // builder.click(driver.findElement(By.xpath("//div[@idx='2']"))).build().perform();
        //builder.moveByOffset(800,600).build().perform();
       // builder.click().build().perform();

        //driver.findElement(By.xpath("//input[@id='sb_form_q']")).click();





      // WebElement el = driver.findElement(By.xpath("//a[@class='iol_nav' and @id = 'iol_navr']"));


    }




}
