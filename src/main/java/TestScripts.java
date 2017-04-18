import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by China on 15.04.2017.
 */
public abstract class TestScripts {

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver",new File((TestScripts.class
                .getResource("/chromedriver.exe").getFile())).getPath());
        return new ChromeDriver();
    }
    public static WebDriver configurateWebDriver() {
        System.setProperty("webdriver.chrome.driver"
                , "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static void scrollImages(WebDriver driver) {
        String title;
        int imageCount;
        driver.get("https://www.bing.com/");
        driver.findElement(By.xpath("//a[@id='scpl1']")).click();

        title = driver.findElement(By.xpath("//a[@data-tabcontent]")).getText();

        if (title.contentEquals("Лента"))
            System.out.println("issuse 2 is complite");

        //нахождение количества изображений на странице
        List<WebElement> images = driver.findElements(By.xpath("//li[@data-idx]"));
        imageCount = images.size();

        JavascriptExecutor jae = (JavascriptExecutor) driver;
        //скролл страницы вниз
        for (int i = 0; i < 5; i++) {
            jae.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            WebElement explicitWait = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@data-idx]")));
            images = driver.findElements(By.xpath("//li[@data-idx]"));
        }

        if (images.size() > imageCount)
            System.out.println("issuse 3 is complite");
        //скролл страницы вверх
        jae.executeScript("window.scrollTo(0,0)");
    }

    public static void searchCheck(WebDriver driver) {
        WebElement listbox = driver.findElement(By.xpath("//input[@id='sb_form_q']"));
        listbox.sendKeys("Seleniu");

        WebElement explicitWait = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class= 'sa_sg']")));

        listbox.sendKeys(Keys.DOWN);//КОСТЫЛЬ!!!.
        // По другому не удалось выполнить нажатие на элемент списка так как он не <select>
        driver.findElement(By.xpath("//li[@query='selenium']")).click();


    }

    public static void setFilter(WebDriver driver) {
        driver.findElement(By.xpath("//a[@id='fltIdtLnk']")).click();//клик на Фильтр
        WebElement dateDropdown = driver.findElement(By.xpath("//span[@title='Фильтр: Дата']"));
        dateDropdown.click();
        dateDropdown.sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//a[@title='В прошлом месяце']")).click();
        WebElement explicitWait = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class= 'iuscp varh']")));

    }
}
