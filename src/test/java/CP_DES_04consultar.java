/*import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class CP_DES_04consultar {
    private WebDriver driver;

    @Before
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
    public void CP_DES_04() {
        try {
            WebElement cerramosEntendi = driver.findElement(By.xpath("//em[contains(text(),'Entendí')]"));
            cerramosEntendi.click();
            System.out.println("cerramos Entendi");

        }catch (Exception e){
            System.out.println(e);
        }


        // ESTE CASO DE PRUEBA ME FALLA AQUI
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement noQuieroBeneficios = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='login-incentive--button login-incentive--button-close shifu-3-btn-ghost")));
            noQuieroBeneficios.click();
            System.out.println("cerramos popUp NO QUIERO BENEFICIOS");
        } catch (Exception e) {
            System.out.println("Error al hacer clic en NO QUIERO BENEFICIOS': ");
        }

        try {
            WebElement canalesContacto = driver.findElement(By.xpath("//em[contains(text(),'Conocer canales')]"));
            canalesContacto.click();
            System.out.println("Clikeamos canales de contacto");

        }catch (Exception e){
            System.out.println("error al hacer click en canales de contacto");
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

        // Y TAMBIEN FALLA A PARTIR DE AQUI

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement ahoraNoOfertas = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'Ahora no')]")));
            ahoraNoOfertas.click();
            System.out.println("Clikeamos AHORA NO A LAS OFERTAS");

        }catch (Exception e){
            System.out.println("NO DIMOS CLICK AHORA NO" + (e));
        }


        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement sucursales = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='Sucursales']")));
            sucursales.click();
            System.out.println("Clic Sucursales realizado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al hacer clic en 'Sucursales' ");
        }

    }

    @After
    public void tearDown(){
        //driver.quit();
    }

}*/