/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class CP_DES_03Consultar {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //ubicacion del driver del navegador(lo llamamos)
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");

        //le decimos al driver que navegador utilizaremos(chorme,edge,brave,etc)(MODO NO INCOGNITO)
        driver= new ChromeDriver();

        //manipulamos el navegador
        driver.manage().window().maximize();

        //indicamos que pagina trabajaremos
        driver.get("https://www.despegar.com.ar/");
    }


    @Test

     // a partir de aqui realizamos la automatizacion de la prueba
    public void CP_DES_03() {
        try {
            WebElement cerramosEntendi = driver.findElement(By.xpath("//em[contains(text(),'Entendí')]"));
            cerramosEntendi.click();
            System.out.println("cerramos Entendi");

        }catch (Exception e){
            System.out.println(e);
        }

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement noQuieroBeneficios = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='login-incentive--button login-incentive--button-close shifu-3-btn-ghost']")));
            noQuieroBeneficios.click();
            System.out.println("cerramos popUp NO QUIERO BENEFICIOS DE LA PAGINA PRINCIPAL");
        } catch (Exception e) {
            System.out.println("Error al hacer clic en NO QUIERO BENEFICIOS': " + e.getMessage());
        }

        try {
            WebElement canalesContacto = driver.findElement(By.xpath("//em[contains(text(),'Conocer canales')]"));
            canalesContacto.click();
            System.out.println("cerramos canales de contacto");

        }catch (Exception e){
            System.out.println(e);
        }

        // AQUI COMENZAMOS A TRABAJAR SOBRE LA NUEVA VENTANA QUE SE ABRE, LUEGO DE DAR CLICK EN "conocer canales".
        // Obtener el identificador de la ventana principal
        String mainWindowHandle = driver.getWindowHandle();
        // Obtener todos los identificadores de ventanas
        Set<String> allWindowHandles = driver.getWindowHandles();
       // Iterar a través de cada identificador de ventana
        for(String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
            }
        }

        // AQUI CONTINUAN LAS ACCIONES SOBRE LA VENTANA NUEVA


        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement ahoraNoOfertas = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'Ahora no')]")));
            ahoraNoOfertas.click();
            System.out.println("Cerramos AHORA NO A LAS OFERTAS");

        }catch (Exception e){
            System.out.println("NO DIMOS CLICK AHORA NO QUIERO BENEFICIOS" + (e));
        }


        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement whatsApp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//em[contains(text(),'Abrir Whatsapp')]")));
            whatsApp.click();
            System.out.println("Clikeamos en wtsp");

        }catch (Exception e){
            System.out.println("NO DIMOS CLICK EN WTSP" + (e));
        }

    }

    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }

}*/
