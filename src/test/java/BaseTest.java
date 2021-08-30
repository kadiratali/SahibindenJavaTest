import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;
    protected JavascriptExecutor js;
    PracticeSahibindenPages practiceSahibindenPages;

    @BeforeAll
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.get("https://www.sahibinden.com");
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,300)");
        practiceSahibindenPages = new PracticeSahibindenPages(driver, js);
    }

    @AfterAll
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();

    }
}
