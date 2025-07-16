package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MediterraneoCarritoPage extends BasePage{

    //Declaración de los path

    //VENTANA PRINCIPAL - CARTA
    private String cartaHeader ="//*[@id=\"dashboard__toolbar\"]/ul/li[1]/button";

    private String PathHomeSeccionX = "//div[img[@alt='%s']]";

    private String cookiesAceptar = "//span[normalize-space()='Aceptar']";

    //Iniciar Sesión
    private String botonMiCuentaHeader="//button[@aria-label='icono abrir menu']";
    private String botonIniciarSesionHeader= "//*[@id=\"mat-menu-panel-0\"]/div/button[1]/span/span";

    //Iniciar Sesión desde el Checkout
    private String EnlaceIniciarSesionCheckout = "//span[normalize-space()='clic aquí']";

    private String campoCorreoEscribir= "//*[@placeholder='Correo']";

    private String campoContraseña= "//*[contains(text(),'Contraseña')]";
    private String campoContraseñaEscribir= "//*[@placeholder='Contraseña']";

    private String botonIngresarIniciasSesion= "//button[@type='submit']//span[contains(text(),'Ingresar')]";

    //Registrar un nuevo cliente

    private String botonRegistrarHeader = "//button[span[span[normalize-space()='Registrarme']]]";

    private String campoNombreRegistro = "//mat-label[normalize-space()='Nombre']/ancestor::mat-form-field//input";//*[contains(text(),'Nombre')]";
    private String campoApellidoRegistro = "//mat-label[normalize-space()='Apellido']/ancestor::mat-form-field//input";
    private String campoCorreoRegistro = "//mat-label[normalize-space()='Correo']/ancestor::mat-form-field//input";
    private String campoTelefonoRegistro = "//mat-label[normalize-space()='Teléfono']/ancestor::mat-form-field//input";
    private String campoDniRegistro = "//mat-label[normalize-space()='DNI']/ancestor::mat-form-field//input";
    private String campoContraseñaRegistro = "//mat-label[normalize-space()='Contraseña']/ancestor::mat-form-field//input";
    private String campoRepetirContraseñaRegistro = "//mat-label[normalize-space()='Repetir Contraseña']/ancestor::mat-form-field//input";

    private String botonRegistrarme = "//button[@type='submit']//span[contains(text(),'Registrarme')]";

    //Direccion del registro
    private String direccionRegistroCampo = "//input[@placeholder=\"Ingrese una ubicación\"]";//*[@id='mat-input-7']  //input[@id='mat-input-20']  

    private String seleccionarPrimeraDireccionSugerida = "//div[@class='autocomplete__map']//li[1]";


    private String botonContinuarRegistrarDireccion = "//span[contains(text(),'Continuar')]";

    private String botonAceptarFinalizarRegistro = "//span[normalize-space()='Aceptar']";

    //Campo direccion ya ingresada
    private String campoDireccionYaIngresada ="//div[@class='dashboard__order-online-text adress-selected']";

    //POLLO X

    private String selectPollo = "//div[normalize-space()='MEDITERRÁNEO ESTELAR CON CHICHA']"; 
    private String botonCarrito = "//*[@id=\"dashboard__toolbar\"]/div/div/button[2]";

    private String seccionMasPedidos = "//div[normalize-space()='%s']";

    private String ventanaCartaProductoX = "//div[normalize-space()='%s']";

    //Carta
    private String campoSeccionXDeLaCarta = "//span[normalize-space()='%s']";
    //span[@class='black-pluto-small-text category-text selected-category']
    private String campoProductoXDeLaCarta = "//*[normalize-space()='%s']";

    //POP-UP DE DIRECCION O RECOJO EN TIENDA
    //Recojo en tienda
    private String botonRecojoEnTienda= "//button[span[normalize-space()='Recojo en tienda']]";
    private String iniciarDesplegableDeTiendas = "//div[div[div[label[mat-label[normalize-space()='Seleccione su local de recojo']]]]]";
    
    private String desplegableTiendasDeRecojo="//mat-option[span[normalize-space()='%s']]";

    private String botonTiendaConfirmar = "//*[@id=\"btnContinuar\"]";
    //Pedido a domicilio

    private String campoDireccion = "//input[@id='mat-input-0']";
    private String campoDireccionSuggest = "//*[@id=\"modalAddressManagementComponent\"]/div/div/app-modal-ingresar-invitado/div/div[2]/add-address/div/div/div[1]/div[2]/div/li";

    private String pavoBox ="//img[contains(@src, 'FOTOPROMONAVIDENA89.90.png')]";

    private String botonDireccionContinuar = "//*[@id=\"btnContinuar\"]";

    private String botonDireccionGuardar = "//*[normalize-space()='Guardar']";
    
    //FICHA DEL PRODUCTO 

    //Pollo a la brasa
    private String selectGuarnicion = "//*[@id='containerguarniciones']/div[1]/div[3]/button[2]";
    private String saladSelect = "/html[1]/body[1]/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-detalle-producto[1]/div[1]/div[1]/div[2]/div[3]/div[5]/div[4]/div[1]/div[1]/div[3]/button[2]/span[2]/div[1]/img[1]";
    
    private String bebida = "//*[@id='containerbebidas']/div[1]/div[2]/button[2]";
    private String bebidaAguaAndina= "//*[@id=\"containerbebidas\"]/div[1]/div[2]/button[2]";
    private String bebidaAguaDeLoco= "//*[@id=\"containerbebidas\"]/div[2]/div[2]/button[2]";
    private String bebidaAguaMagica= "//*[@id=\"containerbebidas\"]/div[3]/div[2]/button[2]";
    private String bebidaChicha= "//*[@id=\"containerbebidas\"]/div[4]/div[2]/button[2]";
    private String bebidaCocaCola= "//*[@id=\"containerbebidas\"]/div[5]/div[2]/button[2]";
    private String bebidaCocaColaZero= "//*[@id=\"containerbebidas\"]/div[6]/div[2]/button[2]";
    private String bebidaDeLaSelvaSuAgua= "//*[@id=\"containerbebidas\"]/div[7]/div[2]/button[2]";
    private String bebidaEmoliente= "//*[@id=\"containerbebidas\"]/div[8]/div[2]/button[2]";
    private String bebidaFantaNaranja= "//*[@id=\"containerbebidas\"]/div[9]/div[2]/button[2]";
    private String bebidaIncaKola= "//*[@id='containerbebidas']/div[10]/div[2]/button[2]";
    private String bebidaIncaKolaZero= "//*[@id='containerbebidas']/div[11]/div[2]/button[2]";
    private String bebidaSanLuisConGas= "//*[@id='containerbebidas']/div[12]/div[2]/button[2]";
    private String bebidaSanLuisSinGas= "//*[@id='containerbebidas']/div[13]/div[2]/button[2]";
    private String bebidaSprite= "//*[@id='containerbebidas']/div[14]/div[2]/button[2]";
    
    
    private String bebidaTemperature1 = "//*[@id='mat-radio-5']/div/div"; 
    private String bebidaTemperature2 = "//*[normalize-space()='Helada']/div";//*[normalize-space()='Helada']"; //usado en 1/2 pollo para el monto 1
    
    private String salsas ="//*[@id=\"containersalsas\"]/div[1]/div[2]/button[2]";
    private String addProduct = "//span[normalize-space()='Añadir S/131.90']";

    //Salchipapa

    private String salchipapaBrasa = "//*[@id=\\\"containerguarniciones\\\"]/div[1]/div[3]/button[2]";

    private String aceptarPostAgregarProducto ="//span[normalize-space()='Aceptar']";

    //Pollo clasico
    private String guarnicionPapasDoradas = "//*[@id=\"containerguarniciones\"]/div[1]/div[2]/button[2]";
    private String ensaladaFritos = "//*[@id='containerensaladas']/div[1]/div[2]/button[2]";


    private String botonAñadir = "//span[contains(normalize-space(), 'Añadir S/')]";
    //*[normalize-space()='Comprar']
    private String botonAgregar = "/html/body/app-root/div/mat-drawer-container/mat-drawer-content/app-detalle-producto/div/div/div[2]/div[3]/form/div/div[4]/button";

    private String botonMasVinagreMediterraneo = "/html/body/app-root/div/mat-drawer-container/mat-drawer-content/app-detalle-producto/div/div/div[2]/div[3]/form/div/div[2]/owl-carousel-o/div/div[1]/owl-stage/div/div/div[3]/div[2]/div[4]/button[2]";
    private String botonMasAjiPolleroMediterraneo ="/html[1]/body[1]/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-detalle-producto[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/owl-carousel-o[1]/div[1]/div[1]/owl-stage[1]/div[1]/div[1]/div[1]/div[2]/div[4]/button[2]/span[2]/div[1]/img[1]";
    
    //CARRITO DE COMPRAS

    private String botonComprarEnELCarrito = "//button[contains(@class, 'mat-stepper-next') and contains(@class, 'shop-button') and @type='submit']//span[contains(@class, 'mdc-button__label') and text()=' Comprar ']";
 
    //CHECKOUT

    //Datos clientes
    private String datosNombres = "/html[1]/body[1]/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-checkout[1]/div[1]/mat-horizontal-stepper[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[2]/div[1]/input[1]";
    private String datosApellidos= "/html[1]/body[1]/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-checkout[1]/div[1]/mat-horizontal-stepper[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/mat-form-field[1]/div[1]/div[2]/div[1]/input[1]";
    private String datosCorreo= "/html[1]/body[1]/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-checkout[1]/div[1]/mat-horizontal-stepper[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/mat-form-field[1]/div[1]/div[2]/div[1]/input[1]";
    private String datosTelefono= "/html[1]/body[1]/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-checkout[1]/div[1]/mat-horizontal-stepper[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/mat-form-field[1]/div[1]/div[2]/div[1]/input[1]";
    private String datosDNI= "/html[1]/body[1]/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-checkout[1]/div[1]/mat-horizontal-stepper[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[5]/mat-form-field[1]/div[1]/div[2]/div[1]/input[1]";

    //Programacion de pedido
    //Pedido para hoy 
    private String datosProgramacionHoy = "//div[contains(text(),'Pedido para hoy')]";

    private String horaRecojo= "//div[div[label[mat-label[normalize-space()='Hora del pedido']]]]";
    private String horaRecojoSeleccion = "//span[normalize-space()='09:30 pm - 10:00 pm']";
    
    //*[@id="mat-radio-3"]/div/label/div/div
    
    //Pedido programado
    private String datosProgramacionProgramado = "//div[contains(text(),'Pedido Programado')]";
 
    private String seleccionarElIconoCalendario ="//button[@aria-label='Open calendar']//span[@class='mat-mdc-button-touch-target']";
    private String seleccionarFecha28 ="//span[normalize-space()='31']";
    private String selecionarHoraDePedido = "//*[name()='path' and contains(@class,'ng-tns-c17')]";
    private String seleccionarFecha0930pm = "//span[normalize-space()='09:30 pm - 10:00 pm']";

    //Datos de facturacion FACTURADO
    private String checkFactura = "//div[normalize-space()='Factura']";
    private String campoRUC = "//mat-label[normalize-space()='RUC']/ancestor::mat-form-field//input";
    private String campoRazonSocial = "//mat-label[normalize-space()='Razón Social']/ancestor::mat-form-field//input";

    //Boleta
    private String datosFacturacionBoleta = "//label[div[normalize-space()='Boleta']]";

    //Cupon
    private String campoCupon = "//mat-label[normalize-space()='Código de cupón']/ancestor::mat-form-field//input";

    private String botonValidarCupon = "//span[normalize-space()='Validar']";

    //Metodo de pago
    private String botonPagoTarjeta = "//img[@alt='1']";
    private String pagoContraentrega = "//img[@alt='3']";

    private String pagoContraentregaEfectivo = "//img[@alt='5']";
    private String pagoContraentregaEfectivoCampo = "//mat-label[contains(text(),'Monto (S/)')]";

    private String pagoContraentregaEfectivoCampoEscribir = "//*[@formcontrolname=\"totalCash\"]";

    //Campo comentarios
    private String campoComentariosBorde ="/html[1]/body[1]/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-checkout[1]/div[1]/mat-horizontal-stepper[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[19]/mat-form-field[1]/div[1]/div[1]/div[1]/div[2]/label[1]/mat-label[1]"; 
    private String campoComentarios = "/html[1]/body[1]/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-checkout[1]/div[1]/mat-horizontal-stepper[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[19]/mat-form-field[1]/div[1]/div[1]/div[2]/textarea[1]";

    //Casi fin checkout
    private String declaracionTyC = "//label[contains(text(),'Declaro que he leído y aceptado los')]"; 
    private String finalizarBotonCheckout = "//button[normalize-space()='Finalizar Compra']";

    //CONFIRMACI{ON CHECKOUT
    private String botonEntendido = "//button[normalize-space()='Entendido']";
    //    private String
    //DATOS DE TARJETA
    
    private String botonMedioDePagoTarjetaCreditoODebito = "//span[@id='pm001']";
    private String botonMedioDePagoContinuar = "//button[@id='payment-continue']";

    private String numeroTarjeta = "//input[@placeholder='Número de Tarjeta']";
    private String fechaVencimientoTarjeta = "//*[@id=\"expiry\"]";
    private String numeroCVVTarjeta = "//input[@id='cvc']";
    private String tarjetaNombre = "//*[@id=\"name\"]";
    private String tarjetaApellido = "//*[@id=\"lastname\"]";
    private String tarjetaCorreo = "//*[@id=\"email\"]";
    private String tarjetaBotonFinalizar = "//button[@type='submit']";


    //////////////////////////////
    public MediterraneoCarritoPage() {
        super(); // Asegura que wait se inicialice
    }

    //////////////////////////////

    //INICIO URL
    public void navegarA(String url) {
            driver.manage().window().maximize();
            driver.get(url);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clickElement(cookiesAceptar);

    }

    //INICIAR SESION
    //Desde la cabecera, la opción Mi perfil
    public void seleccionamosDeLasOpcionesDePerfilLaOpcionDeIniciarSesion(){
        
        clickElement(botonMiCuentaHeader);
        clickElement(botonIniciarSesionHeader);
    }

    //Desde el checkout, la opcion : Si ya tiene cuenta en Mediterráneo haga clic aquí.
    public void seleccionamosDesdeElCheckoutElEnlace(){
        
        clickElement(EnlaceIniciarSesionCheckout);
    }
    public void iniciamosSesionConUsuarioYContraseñaX(String usuario, String password){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //clickElement(campoCorreo);
        write(campoCorreoEscribir, usuario);
        clickElement(campoContraseña);
        write(campoContraseñaEscribir, password);

        clickElement(botonIngresarIniciasSesion);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Registrar Cliente
    public void seleccionarRegistrarNuevoCliente(){
        clickElement(botonMiCuentaHeader);
        clickElement(botonRegistrarHeader);
    }
    public void ingresamosLosDatosDelNuevoCliente(String nombreRegistro, String apellidoRegistro, String correoRegistro, String telefonoRegistro, String dniRegistro, String contraseñaRegistro){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        write(campoNombreRegistro, nombreRegistro);
        write(campoApellidoRegistro, apellidoRegistro);
        write(campoCorreoRegistro, correoRegistro);
        write(campoTelefonoRegistro, telefonoRegistro);
        write(campoDniRegistro, dniRegistro);
        write(campoContraseñaRegistro, contraseñaRegistro);
        write(campoRepetirContraseñaRegistro, contraseñaRegistro);

        clickElement(botonRegistrarme);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void selectCarta(){
        
        clickElement(cartaHeader);
    }

    public void seleccionamosLaSeccionXDeLaCarta(String seccionXCarta){

        String xpathSeccionX = String.format(campoSeccionXDeLaCarta, seccionXCarta);
        clickElement(xpathSeccionX);
    }

    public void seleccionamosDeLaCartaElProductoX(String productoXCarta){
        String xpathSeccionX = String.format(campoProductoXDeLaCarta, productoXCarta);
        clickElement(xpathSeccionX);
    }

    public void clickPavo(){
        clickElement(pavoBox);
    }

    
    public void seleccionarPolloYDetalles(){
        clickElement(selectPollo);
        clickElement(selectGuarnicion);
        clickElement(saladSelect);
        clickElement(bebida);
        
        clickElement(bebidaTemperature1);

        clickElement(salsas);
        clickElement(addProduct);
    }


    public void ingresamosElRecojoEnTiendaX(String nombreLocal){
        clickElement(botonRecojoEnTienda);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(iniciarDesplegableDeTiendas);
        String xpathTiendaX = String.format(desplegableTiendasDeRecojo, nombreLocal);
        clickElement(xpathTiendaX);
        clickElement(botonTiendaConfirmar);

    }

    public void seleccionarDetallesYAceptar() {
        driver.findElement(By.id("/html/body/app-root/div/mat-drawer-container/mat-drawer-content/app-carta/div/div/div[3]/div[2]/div[1]/div/div[1]")).click();
        driver.findElement(By.id("btn-aceptar")).click();
    }

    public void irAlCarrito() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(aceptarPostAgregarProducto);
    
        clickElement(botonCarrito);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(botonComprarEnELCarrito);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void ingresaLosNombres(String nombre){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        write(datosNombres, nombre);
    }
    public void ingresoLosApellidos(String apellido){
        write(datosApellidos, apellido);
    }
    public void ingresoElCorreo(String correo){
        write(datosCorreo, correo);
    }
    public void ingresoElTelefono(String telefono){
        write(datosTelefono, telefono);
    }
    public void ingresoElDNI(String dni){
        write(datosDNI, dni);
    }


    //CHECKOUT DATOS ADICIONALES

    public void pedidoProgramado(){
        clickElement(datosProgramacionProgramado);
        clickElement(seleccionarElIconoCalendario);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(seleccionarFecha28);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(selecionarHoraDePedido);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(seleccionarFecha0930pm);
    }
    
    public void pedidoParaHoy(){

        clickElement(datosProgramacionHoy);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(horaRecojo);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(horaRecojoSeleccion);
    }

    public void facturandoConRuc20(String RUC, String razonSocial){
        clickElement(checkFactura);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        write(campoRUC, RUC);
        write(campoRazonSocial, razonSocial);
        
    }

    public void faturaConBoleta(){

        clickElement(datosFacturacionBoleta);
    }
    public void ingresamosUnCupon(String cupon){
        write(campoCupon, cupon);
        clickElement(botonValidarCupon);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void seleccionamosPagoConTarjeta(){
        clickElement(botonPagoTarjeta);

    }
    public void seleccionarPagoContraentrega(){
        clickElement(pagoContraentrega);
    }
    public void seleccionamosPagoContraentregaEfectivo(String monto){
        clickElement(pagoContraentregaEfectivo);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(pagoContraentregaEfectivoCampo);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        write(pagoContraentregaEfectivoCampoEscribir, monto);

    }

    public void ingresamosComentarios(){
        clickElement(campoComentariosBorde);   
        write(campoComentarios, "PRUEBAS AUTOMATIZADAS");

    }
    public void aceptamosTerminosYFinalizamos(){
        clickElement(declaracionTyC);
        clickElement(finalizarBotonCheckout);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    public void ingresamosLosDatosDeLaTarjetaValida(){
        
        try {
            Thread.sleep(11000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='visaNetJS']")); // Ajusta el XPath según tu caso
        driver.switchTo().frame(iframe);

        clickElement(botonMedioDePagoTarjetaCreditoODebito);
        clickElement(botonMedioDePagoContinuar);

        writeSlow(numeroTarjeta, "4551708161768059");
        
        writeSlow(fechaVencimientoTarjeta, "03/28");
        write(numeroCVVTarjeta, "111");
        write(tarjetaNombre, "Nombtest");
        write(tarjetaApellido, "Apelltest");
        write(tarjetaCorreo, "Automatizacion@gmail.com");
        clickElement(tarjetaBotonFinalizar);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ingresamosLosDatosDeLaTarjetaValidaSinCuotas(){
        
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='visaNetJS']")); // Ajusta el XPath según tu caso
        driver.switchTo().frame(iframe);
        
        clickElement(botonMedioDePagoTarjetaCreditoODebito);
        clickElement(botonMedioDePagoContinuar);

        writeSlow(numeroTarjeta, "4474118355632240");
        
        writeSlow(fechaVencimientoTarjeta, "03/28");
        write(numeroCVVTarjeta, "111");
        write(tarjetaNombre, "Nombtest");
        write(tarjetaApellido, "Apelltest");
        write(tarjetaCorreo, "Automatizacion@gmail.com");
        clickElement(tarjetaBotonFinalizar);
        try {
            Thread.sleep(11000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void ingresamosLosDatosDeLaTarjetaValidaConCuotasMastercard(){
        
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='visaNetJS']")); // Ajusta el XPath según tu caso
        driver.switchTo().frame(iframe);

        
        clickElement(botonMedioDePagoTarjetaCreditoODebito);
        clickElement(botonMedioDePagoContinuar);
        writeSlow(numeroTarjeta, "5160030000000317");
        
        writeSlow(fechaVencimientoTarjeta, "03/28");
        write(numeroCVVTarjeta, "111");
        write(tarjetaNombre, "Nombtest");
        write(tarjetaApellido, "Apelltest");
        write(tarjetaCorreo, "Automatizacion@gmail.com");
        clickElement(tarjetaBotonFinalizar);

        try {
            Thread.sleep(11000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void ingresamosLosDatosDeLaTarjetaFondoInsuficientes(){
        
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='visaNetJS']")); // Ajusta el XPath según tu caso
        driver.switchTo().frame(iframe);

        writeSlow(numeroTarjeta, "4041650444437904");
        
        writeSlow(fechaVencimientoTarjeta, "03/28");
        write(numeroCVVTarjeta, "111");
        write(tarjetaNombre, "Nombtest");
        write(tarjetaApellido, "Apelltest");
        write(tarjetaCorreo, "Automatizacion@gmail.com");
        clickElement(tarjetaBotonFinalizar);

        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean verificarCompraExitosa() {
        return driver.findElement(By.xpath(botonEntendido)).isDisplayed();
    }

    public void seleccionaProductoMasPedidos(String producto){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpathProducto = String.format(seccionMasPedidos, producto);
        clickElement(xpathProducto);

    }
    
    public void seleccionaLosDetallesDePolloClasico(){
        clickElement(guarnicionPapasDoradas);
        clickElement(ensaladaFritos);
        clickElement(bebida);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(bebidaTemperature2);

        clickElement(salsas);
    }
    
    public void seleccionaLosDetallesMedioPolloClasico(){
        clickElement(guarnicionPapasDoradas);
        clickElement(ensaladaFritos);

        clickElement(bebida);
        clickElement(bebidaSprite);
        
        clickElement(bebidaTemperature1);
        clickElement(bebidaTemperature2);

        clickElement(salsas);
        
        clickElement(botonAñadir);
    }

    public void seleccionamosHomeNuestraCartaCategoriaX(String NuestraCartaSeccionX){ 
        String xpathSeccionX = String.format(PathHomeSeccionX, NuestraCartaSeccionX);
        clickElement(xpathSeccionX);
    }


    public void ingresoDireccion (String direccion){
        write(campoDireccion,direccion);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(campoDireccionSuggest);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(botonDireccionContinuar);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void NEWingresoDireccion(String direccion){
        write(campoDireccion,direccion);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(campoDireccionSuggest);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(botonDireccionContinuar);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(botonDireccionGuardar);
    }

    public void registroLaDireccionPrincipal(String direccionRegistro){
        write(direccionRegistroCampo, direccionRegistro);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(seleccionarPrimeraDireccionSugerida);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(botonContinuarRegistrarDireccion);
        clickElement(botonAceptarFinalizarRegistro);
    }
    
    public void NEWRegistroLaDireccionPrincipal(String direccionRegistro){
        write(direccionRegistroCampo, direccionRegistro);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(seleccionarPrimeraDireccionSugerida);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(botonContinuarRegistrarDireccion);
        clickElement(botonAceptarFinalizarRegistro);
    }

    public void seleccionamosDelCampoDirecionParaCambio(){
        clickElement(campoDireccionYaIngresada);
    }
    public void seleccionaUnProductoDeLaCarta(String productoCarta){
        
        String xpathProducto = String.format(ventanaCartaProductoX, productoCarta);
        clickElement(xpathProducto);
        
    }
    public void seleccionaLosDetallesDeLaSalchipapa(){
        clickElement(salchipapaBrasa);
        clickElement(bebida);
        
        clickElement(bebidaTemperature1);
        clickElement(botonAgregar);
    }
    public void seleccionaLosDetallesDeLomoFinoALaParrilla(){

        clickElement(guarnicionPapasDoradas);
        clickElement(salsas);
    }
    public void seleccionamosLosDetallesDelProducto(){
        clickElement(salchipapaBrasa);
        clickElement(bebida);
        
        clickElement(bebidaTemperature1);
        clickElement(botonAgregar);
    }
    public void pauser(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void validacionFinalExitosa(){
        
        try{
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, 0);");
            } catch (Exception e) {
                e.printStackTrace();
            }
        WebElement mensajeExito = new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[contains(text(), 'Pedido realizado con éxito')]")
        ));

         System.out.println("Compra realizada con exito:" + mensajeExito.getText());
      
    }

    public void seleccionamosLosComplementosYAceptamos(){
        clickElement(botonMasVinagreMediterraneo);
        clickElement(botonMasAjiPolleroMediterraneo);

    }
    public void finalizamosDeAñadirElProductoDesDeLaFicha(){
        clickElement(botonAñadir);
    }
}
