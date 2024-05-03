import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CP_DMG_01 {
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
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }


    @Test

     // a partir de aqui realizamos la automatizacion de la prueba
    public void CP_DMG_01() throws InterruptedException {

        try {
            WebElement flights = driver.findElement(By.xpath("//a[contains(text(),'Flights')]"));
            flights.click();
            System.out.println("click en Flights");

        }catch (Exception e){
            System.out.println();
        }

        //CON ESTA PORCION DE CODIGO, CERRAMOS EL AD DE GOOGLE.
        WebElement frame1 = driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"));
        driver.switchTo().frame(frame1);
        WebElement frame2 = driver.findElement(By.id("ad_iframe"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(5000);

        //CONTINUAMOS CON LA EJECUCION DEL SCRIPT
        try {
            WebElement roundTrip = driver.findElement(By.xpath("//input[@value='roundtrip']"));
            roundTrip   .click();
            System.out.println("click en Round Trip");

        }catch (Exception e){
            System.out.println();
        }

        //METODOS SELECTS PARA SELECCIONAR DENTRO DEL "SELECT"
        try {
            WebElement selectElement = driver.findElement(By.name("passCount"));
            Select selectPasajeros = new Select(selectElement);
            selectPasajeros.selectByValue("4");
            System.out.println("seleccionamos cantidad de pasajeros");

        }catch ( Exception e){
            System.out.println();
        }

        try {
            WebElement selectElement = driver.findElement(By.name("fromPort"));
            Select desde = new Select(selectElement);
            desde.selectByValue("Frankfurt");
            System.out.println("seleccionamos lugar de salida:FRANKFURT");

        }catch ( Exception e){
            System.out.println();
        }

        try {
            WebElement selectElement = driver.findElement(By.name("fromMonth"));
            Select desdeMes = new Select(selectElement);
            desdeMes.selectByValue("5");
            System.out.println("seleccionamos mes de salida :MAYO");

        }catch ( Exception e){
            System.out.println();
        }

        try {
            WebElement selectElement = driver.findElement(By.name("fromDay"));
            Select diaSalida = new Select(selectElement);
            diaSalida.selectByValue("10");
            System.out.println("seleccionamos dia de salida :10");

        }catch ( Exception e){
            System.out.println();
        }

        try {
            WebElement selectElement = driver.findElement(By.name("toPort"));
            Select hasta = new Select(selectElement);
            hasta.selectByValue("Acapulco");
            System.out.println("seleccionamos lugar de destino:ACAPULCO");

        }catch ( Exception e){
            System.out.println();
        }
        try {
            WebElement selectElement = driver.findElement(By.name("toMonth"));
            Select hastaMes = new Select(selectElement);
            hastaMes.selectByValue("7");
            System.out.println("seleccionamos mes de salida :JULIO");

        }catch ( Exception e){
            System.out.println();
        }

        try {
            WebElement selectElement = driver.findElement(By.name("toDay"));
            Select diaRetorno = new Select(selectElement);
            diaRetorno.selectByValue("15");
            System.out.println("seleccionamos dia de salida :15");

        }catch ( Exception e){
            System.out.println();
        }

        WebElement tipoVuelo = driver.findElement(By.xpath("//input[@value='Business']"));
        tipoVuelo.click();

        try {
            WebElement selectElement = driver.findElement(By.name("airline"));
            Select servicioAvion = new Select(selectElement);
            servicioAvion.selectByVisibleText("Pangea Airlines");
            System.out.println("selecionamos servicio");
        }catch (Exception e) {
            System.out.println();
        }
        try {
        WebElement submitFlight = driver.findElement(By.name("findFlights"));
        submitFlight.click();
        System.out.println("enviamos consulta y finalizamos test");

        }catch (Exception e){
            System.out.println();
        }







    }

    @After
    public void tearDown(){
        //driver.quit();
    }

}
