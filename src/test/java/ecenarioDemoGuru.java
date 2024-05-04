import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.io.IOException;

public class ecenarioDemoGuru {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //ubicacion del driver del navegador(lo llamamos)
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");

        //le decimos al driver que navegador utilizaremos(chorme,edge,brave,etc)(MODO NO INCOGNITO)
        driver = new ChromeDriver();

        //manipulamos el navegador
        driver.manage().window().maximize();

        //indicamos que pagina trabajaremos
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }


    @Test(priority = 1, description = "caso de prueba registro-CP_DMG_00 ")
    // a partir de aqui realizamos la automatizacion de la prueba
    public void test1() throws IOException {

        try {
            WebElement registro = driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
            registro.click();
            System.out.println("click registro");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            WebElement campoName = driver.findElement(By.name("firstName"));
            campoName.sendKeys("Sergio");
            System.out.println("enviamos nombre");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            WebElement campoLastName = driver.findElement(By.xpath("//input[@name='lastName']"));
            campoLastName.sendKeys("Dominguez");
            System.out.println("enviamos apellido");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            WebElement campoPhone = driver.findElement(By.xpath("//input[@name='phone']"));
            campoPhone.sendKeys("3815468044");
            System.out.println("enviamos telefono");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            WebElement campoEmail = driver.findElement(By.xpath("//input[@name='userName']"));
            campoEmail.sendKeys("sergio@gmail.com");
            System.out.println("enviamos correo");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            WebElement campoAdress = driver.findElement(By.name("address1"));
            campoAdress.sendKeys("Psj Marti 2571");
            System.out.println("enviamos direccion");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            WebElement campoCity = driver.findElement(By.name("city"));
            campoCity.sendKeys("San Miguel Tucuman");
            System.out.println("enviamos ciudad");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            WebElement campoState = driver.findElement(By.name("state"));
            campoState.sendKeys("Tucuman");
            System.out.println("enviamos provincia");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            WebElement campoPostal = driver.findElement(By.name("postalCode"));
            campoPostal.sendKeys("4000");
            System.out.println("enviamos codigo postal");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            WebElement selectElement = driver.findElement(By.name("country"));
            Select seleccionPais = new Select(selectElement);
            seleccionPais.selectByValue("ARGENTINA");
            System.out.println("seleccionamos pais");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            WebElement campoUser = driver.findElement(By.xpath("//input[@name='email']"));
            campoUser.sendKeys("SergioDominguez");
            System.out.println("enviamos userName");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            WebElement campoPass = driver.findElement(By.name("password"));
            campoPass.sendKeys("SDDguru");
            System.out.println("enviamos contraseña");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            WebElement repetPass = driver.findElement(By.name("confirmPassword"));
            repetPass.sendKeys("SDDguru");
            System.out.println("repetimos contraseña");

        } catch (Exception e) {
            System.out.println(e);
        }

        WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();
    }

    @Test(priority = 1, description = "caso de prueba consulta vuelos- CP_DMG_01")
    // a partir de aqui realizamos la automatizacion de la prueba
    public void test2() throws IOException, InterruptedException {
        try {
            WebElement flights = driver.findElement(By.xpath("//a[contains(text(),'Flights')]"));
            flights.click();
            System.out.println("click en Flights");

        } catch (Exception e) {
            System.out.println();
        }

      /*  //CON ESTA PORCION DE CODIGO, CERRAMOS EL AD DE GOOGLE.
        WebElement frame1 = driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0__"));
        driver.switchTo().frame(frame1);
        WebElement frame2 = driver.findElement(By.id("ad_iframe"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(5000);*/

        //CONTINUAMOS CON LA EJECUCION DEL SCRIPT
        try {
            WebElement roundTrip = driver.findElement(By.xpath("//input[@value='roundtrip']"));
            roundTrip.click();
            System.out.println("click en Round Trip");

        } catch (Exception e) {
            System.out.println();
        }

        //METODOS SELECTS PARA SELECCIONAR DENTRO DEL "SELECT"
        try {
            WebElement selectElement = driver.findElement(By.name("passCount"));
            Select selectPasajeros = new Select(selectElement);
            selectPasajeros.selectByValue("4");
            System.out.println("seleccionamos cantidad de pasajeros");

        } catch (Exception e) {
            System.out.println();
        }

        try {
            WebElement selectElement = driver.findElement(By.name("fromPort"));
            Select desde = new Select(selectElement);
            desde.selectByValue("Frankfurt");
            System.out.println("seleccionamos lugar de salida:FRANKFURT");

        } catch (Exception e) {
            System.out.println();
        }
        try {
            WebElement selectElement = driver.findElement(By.name("fromMonth"));
            Select desdeMes = new Select(selectElement);
            desdeMes.selectByValue("5");
            System.out.println("seleccionamos mes de salida :MAYO");

        } catch (Exception e) {
            System.out.println();
        }
        try {
            WebElement selectElement = driver.findElement(By.name("fromDay"));
            Select diaSalida = new Select(selectElement);
            diaSalida.selectByValue("10");
            System.out.println("seleccionamos dia de salida :10");

        } catch (Exception e) {
            System.out.println();
        }
        try {
            WebElement selectElement = driver.findElement(By.name("toPort"));
            Select hasta = new Select(selectElement);
            hasta.selectByValue("Acapulco");
            System.out.println("seleccionamos lugar de destino:ACAPULCO");

        } catch (Exception e) {
            System.out.println();
        }
        try {
            WebElement selectElement = driver.findElement(By.name("toMonth"));
            Select hastaMes = new Select(selectElement);
            hastaMes.selectByValue("7");
            System.out.println("seleccionamos mes de salida :JULIO");

        } catch (Exception e) {
            System.out.println();
        }
        try {
            WebElement selectElement = driver.findElement(By.name("toDay"));
            Select diaRetorno = new Select(selectElement);
            diaRetorno.selectByValue("15");
            System.out.println("seleccionamos dia de salida :15");

        } catch (Exception e) {
            System.out.println();
        }
        WebElement tipoVuelo = driver.findElement(By.xpath("//input[@value='Business']"));
        tipoVuelo.click();
        try {
            WebElement selectElement = driver.findElement(By.name("airline"));
            Select servicioAvion = new Select(selectElement);
            servicioAvion.selectByVisibleText("Pangea Airlines");
            System.out.println("selecionamos servicio");
        } catch (Exception e) {
            System.out.println();
        }
        try {
            WebElement submitFlight = driver.findElement(By.name("findFlights"));
            submitFlight.click();
            System.out.println("enviamos consulta y finalizamos test");

        } catch (Exception e) {
            System.out.println();
        }
    }

    @AfterMethod
    public void tearDown() {
        //driver.quit();
    }
}

