package steps;


import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.BasePage;
import pages.MediterraneoCarritoPage;

public class MediterraneoCarritoSteps {
    private MediterraneoCarritoPage mediterraneo;
    
    public MediterraneoCarritoSteps() {
        BasePage.initializeDriver(); // Asegura que el driver esté listo
        this.mediterraneo = new MediterraneoCarritoPage();
    }

    @When ("selecciona de las opciones de perfil la opcion iniciar sesion")
    public void seleccionaDeLasOpcionesDePerfilLaOpcionIniciarSesion(){
        mediterraneo.seleccionamosDeLasOpcionesDePerfilLaOpcionDeIniciarSesion();
    }
    @When ("seleccionamos el enlace de Iniciar Sesion exclusivo del Checkout")
    public void seleccionamosElEnlaceDesdeElCheckout(){
        mediterraneo.seleccionamosDesdeElCheckoutElEnlace();
    }

    @When ("inicia sesion con el usuario {string} y contraseña {string}")
    public void iniciarSesionConElUsuarioXyContraseñaX(String usuario, String password){
        mediterraneo.iniciamosSesionConUsuarioYContraseñaX(usuario, password);
    }

    @When ("selecciona de las opciones de perfil la opcion Registrarme")
    public void seleccionaDeLasOpcionesDePerfilLaOpcionRegistrarme(){
        mediterraneo.seleccionarRegistrarNuevoCliente();
    }

    @When ("ingreso los datos del cliente nuevo a registar con nombre {string}, apellido {string}, correo {string}, telefono {string}, DNI {string} y Contraseña {string}")
    public void ingresoLosDatosClienteNuevo(String nombreRegistro, String apellidoRegistro, String correoRegistro, String telefonoRegistro, String dniRegistro, String contraseñaRegistro){
        mediterraneo.ingresamosLosDatosDelNuevoCliente(nombreRegistro, apellidoRegistro, correoRegistro, telefonoRegistro, dniRegistro, contraseñaRegistro);
    }

    @Given("el cliente ingresa a {string}")
    public void elClienteIngresaEnModoIphone(String url) {

        mediterraneo.navegarA(url);
    }

    @Given("ingresamos a la web de {string} en modo movil Iphone")
    public void elClienteIngresaA(String url) {

        mediterraneo.navegarEnModoMovil(url);
    }
    @When("selecciona la seccion de Carta")
    public void seleccionaEnLaBarraDeHeader() {
        mediterraneo.selectCarta();
    }
    @When ("selecciona de la carta la opcion {string}")
    public void seleccionaDeLaCartaLaOpcionX(String seccion){
        mediterraneo.seleccionamosLaSeccionXDeLaCarta(seccion);
    }


    @When("clickea en un producto")
    public void clickeaEnUnProducto() {
        mediterraneo.seleccionarProducto();
    }

    @When("ingresa al carrito y continuar al checkout")
    public void ingresaAlCarrito() {
        mediterraneo.irAlCarrito();
    }

    @When ("ingresar los nombres {string}")
    public void ingresaNombre(String nombre){
        mediterraneo.ingresaLosNombres(nombre);
    }
    @When ("ingresar los apellidos {string}")
    public void ingresarApellidos(String apellido){
        mediterraneo.ingresoLosApellidos(apellido);
    }
    @When ("ingresar el correo {string}")
    public void ingresarCorreo(String correo){
        mediterraneo.ingresoElCorreo(correo);
    }
    @When ("ingresar el telefono {string}")
    public void ingresoElTelefono(String telefono){
        mediterraneo.ingresoElTelefono(telefono);
    }
    @When ("ingresar el dni {string}")
    public void ingresoElDNI(String dni){
        mediterraneo.ingresoElDNI(dni);
    }

    @Then("la compra se realiza con éxito")
    public void laCompraSeRealizaConExito() {
        Assert.assertTrue(mediterraneo.verificarCompraExitosa());
    }

    //Dirección
    @When ("ingresa la direccion de {string} y continua")
    public void ingresaLaDireccion(String direccion){
        mediterraneo.ingresoDireccion(direccion); 
    }

    //NEWWWWWWWWW
    @When ("NEW ingresa la direccion de {string} y continua")
    public void newIngresaLaDireccion(String direccion){
         mediterraneo.NEWingresoDireccion(direccion); 
    }

    @When ("registra la direccion {string} como principal y termina el registro")
    public void registraLaDireccionPrincipalYTerminaElRegistro(String direccionRegistro){
        mediterraneo.registroLaDireccionPrincipal(direccionRegistro);
    }
    
    @When ("NEW registra la direccion {string} como principal y termina el registro")
    public void newRegistraLaDireccionPrincipalYTerminaElRegistro(String direccionRegistro){
        mediterraneo.NEWRegistroLaDireccionPrincipal(direccionRegistro);
    }

    @When ("ingresa el recojo en tienda, local {string}")
    public void ingresoElRecojoEnTiendax(String nombreLocal){
        mediterraneo.ingresamosElRecojoEnTiendaX(nombreLocal);
    }

    @When("selecciona el campo de direccion a enviar")
    public void seleccionElCampoDeDireccionAEnviar(){
        mediterraneo.seleccionamosDelCampoDirecionParaCambio();
    }


    //Complementos
    @When ("selecciona los complementos")
    public void seleccionLosComplementoYAcepta(){
        mediterraneo.seleccionamosLosComplementosYAceptamos();
    }

    
    @When ("finaliza de añadir los productos desde la ficha del producto")
    public void finalizamosDeAñadirDesdeLaFichaDelProducto(){
        mediterraneo.finalizamosDeAñadirElProductoDesDeLaFicha();
    }
    
    //CHECKOUT DATOS ADICIONALES
    @When ("selecciona el pedido programado")
     public void seleccionaElPedidoProgramadoParaMañana(){
        mediterraneo.pedidoProgramado();
     }

    @When ("selecciona el pedido para hoy")
    public void seleccionaElPedidoParaHoy(){
        mediterraneo.pedidoParaHoy();
    }

    @When("selecciona como Facturado con Ruc {string} y {string}")
    public void seleccionaLaFacturacionConRuc20(String RUC, String razonSocial ){
        mediterraneo.facturandoConRuc20(RUC, razonSocial);
    }

    @When("selecciona como facturado con boleta")
    public void seleccionaComoFacturadoConBoleta(){
        mediterraneo.faturaConBoleta();
    }
    @When("ingresa un cupon {string}")
    public void ingresaUnCupon(String cupon){
        mediterraneo.ingresamosUnCupon(cupon);
    }
    @When("selecciona pago con tarjeta de credito o debito")
    public void seleccionaPagoConTarjetaDeCreditoODebito(){
        mediterraneo.seleccionamosPagoConTarjeta();
    }

    @When("selecciona pago contra entrega efectivo con {string}")
    public void seleccionaPagoContrentregaEfectivo(String monto){
        mediterraneo.seleccionamosPagoContraentregaEfectivo(monto);
    }

    @When ("seleccionar pago con Contraentrega")
    public void seleccionaPagoContraentrega(){
        mediterraneo.seleccionarPagoContraentrega();
    }
    
    @When("ingresa comentarios")
    public void ingresaComentarios(){
        mediterraneo.ingresamosComentarios();
    }
    
    @When("acepta terminos y condiciones y finaliza")
    public void aceptaTerminosYCondicionesYFinaliza(){
        mediterraneo.aceptamosTerminosYFinalizamos();
    }

    //Tarjetas de niubiz

    @When("ingresa los datos de la tarjeta valida")
    public void ingresaDatosDeTarjeta(){
        mediterraneo.ingresamosLosDatosDeLaTarjetaValida();
    }

    @When("ingresa los datos de la tarjeta valida sin cuotas")
    public void ingresaDatosDeTarjetaSinCuotas(){
        mediterraneo.ingresamosLosDatosDeLaTarjetaValidaSinCuotas();
    }
    @When("ingresa los datos de la tarjeta valida con cuotas Mastercard")
    public void ingresaDatosDeTarjetaConCuotasMastercard(){
        mediterraneo.ingresamosLosDatosDeLaTarjetaValidaConCuotasMastercard();
    }

    @When("ingresa los datos de la tarjeta sin fondos suficientes")
    public void ingresaDatosDeTarjetaFondosInsuficientes(){
        mediterraneo.ingresamosLosDatosDeLaTarjetaFondoInsuficientes();
    }

    @When ("selecciona el producto {string} de los mas pedidos")
    public void seleccionaElProductoX(String producto){
        mediterraneo.seleccionaProductoMasPedidos(producto);
    }

    @When ("selecciona de la carta el producto {string}")
    public void seleccionaDeLaCartaElProducto(String productoCarta){
        mediterraneo.seleccionaUnProductoDeLaCarta(productoCarta);
    }

    @When ("selecciona los detalles del producto {string}")
    public void seleccionaDetallesDelProductoX(String producto){
        if (producto.equals("EL CLÁSICO")) {
            mediterraneo.seleccionaLosDetallesDePolloClasico();
        }

        if (producto.equals("1/2 POLLO CLÁSICO")) {
            mediterraneo.seleccionaLosDetallesMedioPolloClasico();
        }   
        if (producto.equals("SALCHIPAPA A LA BRASA")){
            mediterraneo.seleccionaLosDetallesDeLaSalchipapa();

        }
        if (producto.equals("LOMO FINO A LA PARRILLA")){
            mediterraneo.seleccionaLosDetallesDeLomoFinoALaParrilla();
        }
        else{
        }
    }

    @When ("selecciona del home la seccion Nuestra carta, la categoria {string}")
    public void seleccionarDelHomeNuestraCartaLaCategoriaX(String NuestraCartaSeccionX){
        mediterraneo.seleccionamosHomeNuestraCartaCategoriaX(NuestraCartaSeccionX);
    }

    @When ("selecciona detalles de la salchipapa y continuar")
    public void seleccionarDetallesSalchipapa(){
        mediterraneo.seleccionaLosDetallesDeLaSalchipapa();
    }

    @When ("pauser fin")
    public void pauserFinn(){
        mediterraneo.pauser();
    }

    @Then ("validamos el mensaje final de compra exitosa")
    public void validamosElMensajeFinalDeCompraExitosa(){
        mediterraneo.validacionFinalExitosa();
    }
}