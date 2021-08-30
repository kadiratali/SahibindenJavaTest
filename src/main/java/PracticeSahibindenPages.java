import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeSahibindenPages {

    private WebDriver driver;
    private JavascriptExecutor js;
    private final By Otomobil = By.xpath("//a[@title='Otomobil']");
    private final By Ford = By.xpath("//a[@title='Ford']");
    private final By Mustang = By.xpath("//a[@title='Mustang']");
    private final By Price = By.xpath("//*[contains(@placeholder, 'max TL')]");
    private final By Year = By.xpath("//*[contains(@name, 'a5_min')]");
    private final By Button = By.xpath("//*[contains(@class, 'btn btn-block search-submit')]");

    public PracticeSahibindenPages(WebDriver driver, JavascriptExecutor js){
        this.driver = driver;
        this.js = js;
    }

    public void clickOtomobil(){
        WebElement namespace = driver.findElement(Otomobil);
        namespace.click();

    }
    public void clickFord(){
        WebElement ford = driver.findElement(Ford);
        js.executeScript("arguments[0].click();", ford);
    }

    public void clickMustang(){
        WebElement mustang = driver.findElement(Mustang);
        js.executeScript("arguments[0].click();", mustang);
    }

    public void setMaxPrice(String nameAsString) throws InterruptedException {
        Thread.sleep(2000);
        WebElement price = driver.findElement(Price);
        price.sendKeys(nameAsString);
    }
    public void setMinYear(String min_year){
        WebElement minYear=driver.findElement(Year);
        minYear.sendKeys(min_year);
    }

    public void ClickButton() throws InterruptedException {
        Thread.sleep(2000);
        WebElement search= driver.findElement(Button);
        js.executeScript("arguments[0].click();", search);
    }
    public String getName(){
        WebElement fiyat = driver.findElement(Price);
        return fiyat.getAttribute("value");
    }

    public String getYear(){
        WebElement yil=driver.findElement(Year);
        return yil.getAttribute("value");
    }

}
