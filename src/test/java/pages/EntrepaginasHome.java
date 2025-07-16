package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class EntrepaginasHome extends BasePage{

    private String aceptarCookies = "//button[normalize-space()='Aceptar todas']";
    private String botonIniciarSesion = "//p[normalize-space()='Iniciar sesión']";
    private String botonLogoHome = "//a[@class='logo my-2']";

    private String botonSeguirComoInvitado = "//a[@class='btn btn-login btn-g']";

    private String campoEmailIniciarSesion= "//input[@name ='email']";
    private String campoContraseñaIniciarSesion = "//input[@name = 'password']";
    
    private String botonIniciarSesionAceptar = "//span[normalize-space()='INICIAR SESIÓN']";

    //Inicio de sesion google:
    private String botonInicioSesionGoogle = "//div[@id='container']";

    //Registrar un nuevo cliente
    private String registrarIniciarSesionPopup = "//span[normalize-space()='Registrar']";

    private String campoCorreoElectronicoRegistrar = "//input[@id='email']";
    private String campoNombresRegistrar = "//input[@id='first_name']";
    private String campoApellidosRegistrar = "//input[@id='last_name']";
    private String campoDocumentoRegistrar = "//input[@id='document']";
    private String campoContraseñaRegistrar = "//input[@id='password']";
    private String checkAceptoPoliticaPrivacidadRegistrar = "//label[@for='register-policy-2']";
    private String botonRegistrarmeRegistrar = "//button[@class='btn btn-outline-primary-2']";

    private String exisCerrarPopupRegistrar= "//span[@aria-hidden='true']//i[@class='icon-close']";

    private String pathProductosHome = "//p[a[normalize-space()='%s']]";
    private String botonVerCarritoPOPUP = "//*[normalize-space()='Ver carrito']";

    private String campoBuscarPorTitulo = "//div[@class='header-ep-search undefined']//input[@placeholder='Buscar por título...']";
    private String botonBuscarPorTitulo = "//*[@id='__next']/div[1]/header/div[4]/div/div/div/div/div/form/div/button";
    private String pathProductoBuscadoX = "//p[@class='product-title']//a[@itemprop='name' and normalize-space()='%s']";

    private String botonAñadirAlCarrito = "//body/div/div/div/div/div/div/div/div[2]/div[1]/div[1]";
    
    private String botonProcederConElPago = "//button[contains(@class,'btn btn-primary btn-order btn-block')]";

    private String IconoCarritoDeCompras= "//i[@class='icon-shopping-cart']";

    public EntrepaginasHome(){   
        super();
    }
    
    public void navegarALaWebDe(String url) {
        driver.manage().window().maximize();
        driver.get(url);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void seleccionarElBotonAceptarCookies(){
        clickElement(aceptarCookies);
    }
    public void seleccionarElBotonDeIniciarSesion(){
        clickElement(botonIniciarSesion);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void iniciamosSesionX(String email, String contraseña){

        write(campoEmailIniciarSesion, email);
        write(campoContraseñaIniciarSesion, contraseña);
        clickElement(botonIniciarSesionAceptar);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void seleccionarSeguirCompraComoInvitado(){
        clickElement(botonSeguirComoInvitado);
    }

    public void seleccionaElIniciosSesionGoogle(){

        WebElement iframeCVV = driver.findElement(By.xpath("//iframe[contains(@src, 'accounts.google.com/gsi/button')]"));
        driver.switchTo().frame(iframeCVV);
            
        clickElement(botonInicioSesionGoogle);
        
        driver.switchTo().defaultContent();   
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
    }
    public void seleccionarElBotonRegistrarme(){
        clickElement(aceptarCookies);
    }
    public void registrarUnClienteNuevoConDatosX(String correoRegistrar, String nombresRegistrar, String apellidosRegistrar, String dniRegistrar, String contraseñaRegistrar){
        clickElement(registrarIniciarSesionPopup);
        write(campoCorreoElectronicoRegistrar, correoRegistrar);
        write(campoNombresRegistrar, nombresRegistrar);
        write(campoApellidosRegistrar, apellidosRegistrar);
        write(campoDocumentoRegistrar, dniRegistrar);
        write(campoContraseñaRegistrar, contraseñaRegistrar);
        clickElement(checkAceptoPoliticaPrivacidadRegistrar);
        clickElement(botonRegistrarmeRegistrar);

        ((JavascriptExecutor) driver).executeScript("alert('Actualice el estado por la base de datos');");
 
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        
        clickElement(exisCerrarPopupRegistrar);
    }
    public void backHome(){
        clickElement(botonLogoHome);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
    }
    public void selectProductX(String productoX){

        String xpathSeccionX = String.format(pathProductosHome, productoX);
        clickElement(xpathSeccionX);
    }
    public void selectProductXdesdeInicio(String productoX){
        String xpathSeccionX = String.format(pathProductosHome, productoX);
        WebElement elemento = driver.findElement(By.xpath(xpathSeccionX));
                
        Actions actions = new Actions(driver);
        actions.moveToElement(elemento).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(botonAñadirAlCarrito);

    }   
    public void buscarUnLibroPorElTituloX(String producto){
        write(campoBuscarPorTitulo, producto);
        clickElement(botonBuscarPorTitulo);
        String xpathSeccionX = String.format(pathProductoBuscadoX, producto);
        clickElement(xpathSeccionX);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void seleccionarVerCarritoYProcederConElPago(){
        clickElement(botonVerCarritoPOPUP);
        clickElement(botonProcederConElPago);
    }
    public void seleccionaElIconoDeCarritoDeCompras(){
        clickElement(IconoCarritoDeCompras);
    }


}
