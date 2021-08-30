import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test_Otomobil_Click extends BaseTest{


    @Test
    @Order(1)
    public void testAotoClick(){
        practiceSahibindenPages.clickOtomobil();

    }

    @Test
    @Order(2)
    public void testBfordClick(){
        practiceSahibindenPages.clickFord();
    }

    @Test
    @Order(3)
    public void testCmustangClick(){
        practiceSahibindenPages.clickMustang();
    }

    @Test
    @Order(4)
    public void testDsetPrice() throws InterruptedException {
        practiceSahibindenPages.setMaxPrice("500.000");
        Assertions.assertEquals("500.000",practiceSahibindenPages.getName(),"Price value is not correct!");
    }

    @Test
    @Order(5)
    public void testEsetMinYear(){
        practiceSahibindenPages.setMinYear("2005");
        Assertions.assertEquals("2005",practiceSahibindenPages.getYear(),"Min year is not correct value");
    }

    @Test
    @Order(6)
    public void testFclickSearchButton() throws InterruptedException {
        practiceSahibindenPages.ClickButton();
    }
}
