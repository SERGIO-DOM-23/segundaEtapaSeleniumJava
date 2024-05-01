import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CP_DES_00 {
    private WebDriver driver;

    @Before
    public void setUp(){
        //ubicacion del driver del navegador(lo llamamos)
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        //le decimos a la variable que driver utilizaremos(chorme,edge,brave,etc)
        driver= new ChromeDriver();
        //manipulamos el navegador
        driver.manage().window().maximize();
        //indicamos que pagina trabajaremos
        driver.get("https://www.despegar.com.ar/");
       // driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    }

    @Test
     // a partir de aqui realizamos la automatizacion de la prueba
    public void CP_DES_00() {

        try {
            WebElement iniciarSesion01 = driver.findElement(By.xpath("//span[@class='header-autogestion-title']"));
            iniciarSesion01.click();
            System.out.println("esperando para hacer click al boton, y si lo hicimos ! ");
        }catch (Exception e){
        System.out.println(e);
        }
        WebElement iniciarSesion02 = driver.findElement(By.xpath("//a[@class='menu-login-padding loginButton'][1]"));
        iniciarSesion02.click();

        WebElement registro1 = driver.findElement(By.xpath("//em[@class='btn-text at-sign-up-btn -eva-3-tc -eva-3-bold']"));
        registro1.click();

        WebElement registro2 = driver.findElement(By.xpath("//em[@class='btn-text at-email-btn']"));
        registro2.click();

        WebElement registro3 = driver.findElement(By.xpath("//div[@class='input-container -eva-3-center']"));
        registro3.click();

        WebElement registro4 = driver.findElement(By.xpath("//input[@class='input-tag at-input-email']"));
        registro4.sendKeys("sergiodominguez21sdd@gmail.com");

        WebElement botonEnviaDatos = driver.findElement(By.xpath("//em[@class='btn-text blue-btn']"));
        botonEnviaDatos.click();
    }

    @After
    public void tearDown(){
        //driver.quit();
    }

}
