package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EntrepaginasCheckout extends BasePage{
        public EntrepaginasCheckout(){   
            super();
        }
    
        private String  campoRUC= "//input[@name='user.ruc']";
        private String  campoRazonSocial= "//input[@name='user.bussines_name']";

        private String botonDeseaFactura = "//label[text()='¿Desea factura?']";

        private String botonSiguientePaso = "//button[text()='Siguiente paso']";

        //Envio
        private String pathTiendaX = "//b[normalize-space()='%s']";
        private String envioRecojoEnTienda = "//label[@for='free-shipping']";

        private String envioPedidoADomicilio = "//label[@for='express-shipping']";
        private String botonDireccionGuardada = "//label[@for='store-checked-119']";

        private String  botonAgregarNuevaDireccion= "//button[text()='+ Agregar nueva dirección']";

        private String siguientepaso2 = "//div[@class='d-flex justify-content-end mt-2']//button[@type='submit'][normalize-space()='Siguiente paso']";
        private String botonPagoConTarjeta = "//label[@for='card_payment']";
        private String botonPagoConTarjetaW = "//label[@for='payment_w_card']";

        private String campoNombresTarjeta= "//input[@name='payment.card_first_name']";
        private String campoApellidoTarjeta= "//input[@name='payment.card_last_name']";
        private String campoVencimientoDeLaTarjeta = "//*[@id=\"cc-exp\"]";
        private String campoCVV = "//input[@id='cc-cvc']";

        private String botonAceptarTerminosYC = "//label[normalize-space()='Aceptar términos y condiciones *']";

        private String botonProcederAPagar = "//*[@id=\"__next\"]/div[1]/div/div/div/div/form/div/aside/button";//*[normalize-space()='PROCEDER A PAGAR']";
        //private String campoN = "//input[@class='form-control undefined']";
        private String campoCupon = "//input[@placeholder='Ingresar código']";
        
        private String botonAplicarCupon = "//button[normalize-space()='Aplicar']";

        //Seccion mis datos
        private String campoNombresInvitado = "//input[@name='user.first_name']";
        private String campoApellidosInvitado = "//input[@name='user.last_name']";
        private String campoCorreo = "//input[@name='user.email']";
        
        private String desplegableTiposDocumentos = "//select[@name='user.type_document']";
        private String seleccionTipoDocumento = "//option[normalize-space()='%s']";

        private String campoDocumentoInvitado = "//input[@name='user.document']";
        private String campoTelefonoInvitado = "//input[@name='user.phone']";

        public void ingresarDatosComoInvitado (String nombresInvitado ,String apellidosInvitado ,String correoInvitado ,String tipoDocInvitado ,String documentoInvitado,String telefonoInvitado){
            write(campoNombresInvitado, nombresInvitado);
            write(campoApellidosInvitado, telefonoInvitado);
            write(campoCorreo, correoInvitado);

            clickElement(desplegableTiposDocumentos);
            
            String xpathSeccionX = String.format(seleccionTipoDocumento, tipoDocInvitado);
            clickElement(xpathSeccionX);

            write(campoDocumentoInvitado, documentoInvitado);
            write(campoTelefonoInvitado, telefonoInvitado);

        }
        public void ingresamosLaFacturacionConRucXYRazonSocial(String RUC, String razonSocial){
            clickElement(botonDeseaFactura);
            write(campoRUC, RUC);
            write(campoRazonSocial, razonSocial);    
        }
        public void seleccionaElBotonDeSiguientePaso(){
            clickElement(botonSiguientePaso);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        public void seleccionaEnvioATiendaX(String TiendaX){
            try{
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollTo(0, 0);");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            clickElement(envioRecojoEnTienda);
            String xpathSeccionX = String.format(pathTiendaX, TiendaX);
            
            clickElement(xpathSeccionX);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clickElement(siguientepaso2);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void seleccionaDireccionGuardada(){
            clickElement(envioPedidoADomicilio);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clickElement(botonDireccionGuardada);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clickElement(siguientepaso2);
        }

        public void selecionaEnvioANuevaDireccion(String DireccionX){
            clickElement(envioPedidoADomicilio);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clickElement(botonAgregarNuevaDireccion);
        }

        public void seleccionaElMetodoDePagoYDatos(){
            clickElement(botonPagoConTarjeta);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            write(campoNombresTarjeta, "Pruebas");
            write(campoApellidoTarjeta, "Automatizadas");
            
            clickElement(botonAceptarTerminosYC);
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@src='  https://pocpaymentserve.s3.amazonaws.com/server/card/card-number.html']")));
           
            WebElement iframeCard = driver.findElement(By.xpath("//iframe[@src='  https://pocpaymentserve.s3.amazonaws.com/server/card/card-number.html']"));
            driver.switchTo().frame(iframeCard);
            WebElement campoNumeroDeTarjeta = driver.findElement(By.xpath("//*[@id='cc-number']")); // Cambia el XPath según el campo que quieras interactuar
            campoNumeroDeTarjeta.sendKeys("4551708161768059");
            driver.switchTo().defaultContent();

            
            WebElement iframeExp = driver.findElement(By.xpath("//iframe[@src='  https://pocpaymentserve.s3.amazonaws.com/server/card/card-expiry.html']"));
            driver.switchTo().frame(iframeExp);
            writeSlow(campoVencimientoDeLaTarjeta, "0328");
            driver.switchTo().defaultContent();

            WebElement iframeCVV = driver.findElement(By.xpath("//iframe[@src='  https://pocpaymentserve.s3.amazonaws.com/server/card/card-cvc.html']"));
            driver.switchTo().frame(iframeCVV);
            writeSlow(campoCVV, "111");
            driver.switchTo().defaultContent();
        }

    public void ingresoDePagoConTarjetaWYDemasDatos(){
        clickElement(botonPagoConTarjetaW);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            write(campoNombresTarjeta, "Pruebas");
            write(campoApellidoTarjeta, "Automatizadas");
            
            clickElement(botonAceptarTerminosYC);
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@src='  https://pocpaymentserve.s3.amazonaws.com/server/card/card-number.html']")));
           
            WebElement iframeCard = driver.findElement(By.xpath("//iframe[@src='  https://pocpaymentserve.s3.amazonaws.com/server/card/card-number.html']"));
            driver.switchTo().frame(iframeCard);
            WebElement campoNumeroDeTarjeta = driver.findElement(By.xpath("//*[@id='cc-number']")); // Cambia el XPath según el campo que quieras interactuar
            campoNumeroDeTarjeta.sendKeys("4551708161768059");
            driver.switchTo().defaultContent();

            
            WebElement iframeExp = driver.findElement(By.xpath("//iframe[@src='  https://pocpaymentserve.s3.amazonaws.com/server/card/card-expiry.html']"));
            driver.switchTo().frame(iframeExp);
            writeSlow(campoVencimientoDeLaTarjeta, "0328");
            driver.switchTo().defaultContent();

            WebElement iframeCVV = driver.findElement(By.xpath("//iframe[@src='  https://pocpaymentserve.s3.amazonaws.com/server/card/card-cvc.html']"));
            driver.switchTo().frame(iframeCVV);
            writeSlow(campoCVV, "111");
            driver.switchTo().defaultContent();

    }

    public void ingresarElCuponX(String cupon){
        write(campoCupon, cupon);
        clickElement(botonAplicarCupon);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void finalizaLaCompra(){
        clickElement(botonProcederAPagar);
        clickElement(botonProcederAPagar);
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void verificamosElMensajeExitoso(){
        try{
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, 0);");
            } catch (Exception e) {
                e.printStackTrace();
            }
        WebElement mensajeExito = new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[contains(text(), '¡Tu compra ha sido realizada con éxito!')]")
        ));

         System.out.println("Compra realizada con exito:" + mensajeExito.getText());
      
         
    }
    public void ingresarDatosFaltantersDelRegistro(String documentoCheckout, String numeroDocumentoCheckout, String telefonoCheckout){
        clickElement(desplegableTiposDocumentos);
            
        String xpathSeccionX = String.format(seleccionTipoDocumento, documentoCheckout);
        clickElement(xpathSeccionX);

        write(campoDocumentoInvitado, numeroDocumentoCheckout);
        write(campoTelefonoInvitado, telefonoCheckout);

    }
}