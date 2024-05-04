import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class ecenarioDespegar{
    private WebDriver driver;

    @BeforeMethod
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
    public void CP_DES_00() throws IOException {
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


    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }
}
