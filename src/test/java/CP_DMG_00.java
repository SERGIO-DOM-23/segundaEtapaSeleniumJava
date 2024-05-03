import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class CP_DMG_00 {
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
    public void CP_DMG_00() {

        try {
            WebElement registro = driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
            registro.click();
            System.out.println("click registro");

        }catch (Exception e){
            System.out.println(e);
        }
        try {
            WebElement campoName = driver.findElement(By.name("firstName"));
            campoName.sendKeys("Sergio");
            System.out.println("enviamos nombre");

        }catch (Exception e){
            System.out.println(e);
        }
        try {
            WebElement campoLastName = driver.findElement(By.xpath("//input[@name='lastName']"));
            campoLastName.sendKeys("Dominguez");
            System.out.println("enviamos apellido");

        }catch (Exception e){
            System.out.println(e);
        }
        try {
            WebElement campoPhone = driver.findElement(By.xpath("//input[@name='phone']"));
            campoPhone.sendKeys("3815468044");
            System.out.println("enviamos telefono");

        }catch (Exception e){
            System.out.println(e);
        }
        try {
            WebElement campoEmail = driver.findElement(By.xpath("//input[@name='userName']"));
            campoEmail.sendKeys("sergio@gmail.com");
            System.out.println("enviamos correo");

        }catch (Exception e){
            System.out.println(e);
        }
        try {
            WebElement campoAdress = driver.findElement(By.name("address1"));
            campoAdress.sendKeys("Psj Marti 2571");
            System.out.println("enviamos direccion");

        }catch (Exception e){
            System.out.println(e);
        }
        try {
            WebElement campoCity = driver.findElement(By.name("city"));
            campoCity.sendKeys("San Miguel Tucuman");
            System.out.println("enviamos ciudad");

        }catch (Exception e){
            System.out.println(e);
        }
        try {
            WebElement campoState = driver.findElement(By.name("state"));
            campoState.sendKeys("Tucuman");
            System.out.println("enviamos provincia");

        }catch (Exception e){
            System.out.println(e);
        }
        try {
            WebElement campoPostal = driver.findElement(By.name("postalCode"));
            campoPostal.sendKeys("4000");
            System.out.println("enviamos codigo postal");

        }catch (Exception e){
            System.out.println(e);
        }
        try {
        WebElement selectElement = driver.findElement(By.name("country"));
        Select seleccionPais = new Select(selectElement);
        seleccionPais.selectByValue("ARGENTINA");
        System.out.println("seleccionamos pais");

        }catch ( Exception e){
        System.out.println(e);
        }
        try {
            WebElement campoUser = driver.findElement(By.xpath("//input[@name='email']"));
            campoUser.sendKeys("SergioDominguez");
            System.out.println("enviamos userName");

        }catch (Exception e){
            System.out.println(e);
        }
        try {
            WebElement campoPass = driver.findElement(By.name("password"));
            campoPass.sendKeys("SDDguru");
            System.out.println("enviamos contraseña");

        }catch (Exception e){
            System.out.println(e);
        }
        try {
            WebElement repetPass = driver.findElement(By.name("confirmPassword"));
            repetPass.sendKeys("SDDguru");
            System.out.println("repetimos contraseña");

        }catch (Exception e){
            System.out.println(e);
        }

        WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();







    }

    @After
    public void tearDown(){
        //driver.quit();
    }

}
