import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CP_DES_01 {
    private WebDriver driver;

    @Before
    public void setUp(){
        //ubicacion del driver del navegador(lo llamamos)
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        //le decimos a la variable que navegador utilizaremos(chorme,edge,brave,etc)
        driver= new ChromeDriver();
        //manipulamos el navegador
        driver.manage().window().maximize();
        //indicamos que pagina trabajaremos
        driver.get("https://www.despegar.com.ar/");
       // driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    }

    @Test
     // a partir de aqui realizamos la automatizacion de la prueba
    public void CP_DES_01() {

        try {
            WebElement chatearIa = driver.findElement(By.className("image-size"));
            chatearIa.click();
            System.out.println("clickeamos para habar con la IA ! ");
        }catch (Exception e){
        System.out.println(e);
        }

        try {
            WebElement hablemosSofia = driver.findElement(By.xpath("//a[@class='shifu-3-link float-button-multiple-selector-link -chat']"));
            hablemosSofia.click();
            System.out.println("click para hablar con sofIA ! ");
        }catch (Exception e){
            System.out.println(e);
        }

    }

    @After
    public void tearDown(){
        //driver.quit();
    }

}
