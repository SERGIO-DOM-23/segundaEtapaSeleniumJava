import org.junit.After;
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

public class CP_DES_02 {
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
    public void CP_DES_02() {
        try {
            WebElement cerramosEntendi = driver.findElement(By.xpath("//em[contains(text(),'Entendí')]"));
            cerramosEntendi.click();
            System.out.println("cerramos Entendi");

        }catch (Exception e){
            System.out.println(e);
        }

        try {
            WebElement ayudaPasajero = driver.findElement(By.xpath("//span[text()='Ayuda']"));
            ayudaPasajero.click();
            System.out.println("Clikeamos ayuda");

        }catch (Exception e){
            System.out.println(e);
        }


        // AQUI COMENZAMOS A TRABAJAR SOBRE LA NUEVA VENTANA QUE SE ABRE, LUEGO DE DAR CLICK EN "AYUDA".
        // Obtener el identificador de la ventana principal
        String mainWindowHandle = driver.getWindowHandle();
        // Obtener todos los identificadores de ventanas
        Set<String> allWindowHandles = driver.getWindowHandles();
       // Iterar a través de cada identificador de ventana
        for(String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) { // Verificar si el identificador no es de la ventana principal
                driver.switchTo().window(handle); // Cambiar al identificador de la nueva ventana
            }
        }


        // AQUI CONTINUAN LAS ACCIONES SOBRE LA VENTANA NUEVA
        try {
            WebElement facruracionDevolucionesDudas = driver.findElement(By.xpath("//h6[contains(text(),'Resuelve todas tus consultas sobre tus pagos y tus comprobantes.')]"));
            facruracionDevolucionesDudas.click();
            System.out.println("Clikeamos opcion facturacion");

        }catch (Exception e){
            System.out.println(e);
        }

       try {
           // Aplicamos  espera "explícita" para el elemento "Consultas sobre mi factura"
           WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(15));
           WebElement consultaFactura = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[contains(text(),'Consultas sobre mi factura')]")));
           consultaFactura.click();
           System.out.println("Hemos hecho clic en la opción 'Consultar detalles de mi factura'");

       }catch (Exception e){
           System.out.println(e);
       }

        try {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
            WebElement detalleFactura = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[contains(text(),'No entiendo el detalle de mi factura')]")));
            detalleFactura.click();
            System.out.println("Clikeamos opcion NO entiendo el detalle de mi factura.");

        }catch (Exception e){
            System.out.println(e);
        }



    }

    @After
    public void tearDown(){
        //driver.quit();
    }

}
