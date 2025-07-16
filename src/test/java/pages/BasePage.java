package pages;
 
// Importaciones necesarias
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class BasePage {
    
    protected static WebDriver driver;
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));

    // Constructor modificado - CLAVE PARA SOLUCIONAR EL ERROR
    public BasePage() {
        if (driver == null) {
            initializeDriver();
        }
       
    }


    public static void initializeDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
    }

    ////////////////////////////////////////////////////////////

    //private WebElement Find(String locator){
    //    return driver.findElement(By.xpath(locator));

    //}
 
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    //Método estático para navegar a una URL.
    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Driver no inicializado. Llama a initializeDriver() primero.");
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


    public void clickElement(String locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        element.click();
    }
    
    public void goToLinkText(String linkText){
        driver.findElement(By.linkText(linkText));
    }

    public static void closeBrowser(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public void submitElement (String locator){
        Find(locator).click();
    }

    public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public void writeSlow (String locator, String textToWrite){ //Write modificado para tipear mas lento (especifico para pasarela de pago)
        Find(locator).clear();
        for (char c : textToWrite.toCharArray()) {
        Find(locator).sendKeys(String.valueOf(c)); // Envía un carácter a la vez
        try {
            TimeUnit.MILLISECONDS.sleep(100); // Pausa entre caracteres
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }



    public void navegarEnModoMovil(String url) {

        WebDriverManager.chromedriver().setup();

        // Configura Chrome para emular un iPhone 15 Pro Max
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 430);  // Ancho del iPhone 15 Pro Max
        deviceMetrics.put("height", 932); // Alto del iPhone 15 Pro Max
        deviceMetrics.put("pixelRatio", 3.0); // Relación de píxeles
        deviceMetrics.put("mobile", true); // Indica que es un dispositivo móvil

        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("mobileEmulation", mobileEmulation);

        // Inicializa el navegador con las opciones configuradas
        driver = new ChromeDriver(options);
        driver.get(url);
    }

    public void seleccionarOpcionHeader(String opcion) {
        WebElement headerOption = driver.findElement(By.linkText(opcion));
        headerOption.click();
    }

    public void seleccionarProducto() {
        WebElement producto = driver.findElement(By.cssSelector(".producto-item"));
        producto.click();
    }
 
}