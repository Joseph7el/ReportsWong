package steps;

import io.cucumber.java.en.*;
import pages.*;

public class EntrepaginasSteps {
    
    EntrepaginasHome entrepaginas = new EntrepaginasHome();

    @Given("el cliente ingresa a la web de Entrepaginas de: {string}")
    public void elClienteIngresaALaWebDe(String url) {
        entrepaginas.navegarALaWebDe(url);
    }
    @Given("selecciona el boton de aceptar las cookies")
    public void seleccionamosElBotonDeAceptarLasCookies(){
        entrepaginas.seleccionarElBotonAceptarCookies();
    }
    @When("selecciona el boton de Iniciar sesión")
    public void seleccionamosElBotonDeIniciarSesion(){
        entrepaginas.seleccionarElBotonDeIniciarSesion();
    }
    @When("inicio sesion con el correo {string} y contraseña {string}")
    public void incioDeSesionConElCorreoXYContraseñaX(String correo, String contraseña){
        entrepaginas.iniciamosSesionX(correo, contraseña);
    }
    @When("selecciona inicio de sesion como Seguir como invitado")
    public void seleccionaInicioDeSesionComoSeguirComoInvitado(){
        entrepaginas.seleccionarSeguirCompraComoInvitado();
    }
    @When("selecciona el inicio de sesion con Google")
    public void selecionaElInicioDeSesionConGoogle(){
        entrepaginas.seleccionaElIniciosSesionGoogle();
    }
    @When("regresa a la ventana de inicio")
    public void regresaALaVentanaDeInicio(){
        entrepaginas.backHome();
    }
    @When("seleccionamos del menu de perfil el boton Registrarme")
    public void seleccionamosDelMenuDePerfilElBotonRegistrarme(){
        entrepaginas.seleccionarElBotonRegistrarme();
    }
    @When("registra un cliente nuevo con datos: Correo {string}, Nombres {string}, Apellidos {string}, DNI {string}, Contraseña {string}")
    public void registroUnClienteNuevoConXDatos(String correoRegistrar, String nombresRegistrar, String apellidosRegistrar, String dniRegistrar, String contraseñaRegistrar){
        entrepaginas.registrarUnClienteNuevoConDatosX(correoRegistrar, nombresRegistrar, apellidosRegistrar,dniRegistrar, contraseñaRegistrar);
    }

    //Añadir producto

    @When("selecciona el producto {string}")
    public void seleccionaElProductoX(String producto){
        entrepaginas.selectProductX(producto);
    }
    @When("desde el inicio, selecciona el libro {string}")
    public void selecionElProductoDesdeElInicio(String producto){
        entrepaginas.selectProductXdesdeInicio(producto);
    }
    
    @When("busca un libro con el titulo {string} en el buscador")
    public void buscaUnLibroConElTituloXEnElBuscador(String producto){
        entrepaginas.buscarUnLibroPorElTituloX(producto);
    }

    @When("selecciona Ver Carrito y procede con el pago")
    public void seleccionaVerCarritoYProcedeConElPago(){
        entrepaginas.seleccionarVerCarritoYProcederConElPago();
    }

    @When("selecciona el icono de Carrito de compras")
    public void seleccionaElIconoDeCarritoDeCompras(){
        entrepaginas.seleccionaElIconoDeCarritoDeCompras();
    }

    // ENTREPAGINAS SECCION DE FICHA
    EntrepaginasFicha entrepaginasFicha = new EntrepaginasFicha();

    @When ("selecciona añadir el producto al carrito, en la ficha")
    public void seleccionaAñadirElProductoAlCarrito(){
        entrepaginasFicha.seleccionamosElProducto();
    }

    //CHECKOUT

    EntrepaginasCheckout entrepaginasCheckout = new EntrepaginasCheckout();

    @When("ingresa los datos del cliente: Nombres {string}, Apellidos {string}, Correo {string}, Tipo de documento {string}, Documento {string}, Telefono {string}")
    public void ingresaLosDatosComoInvitado(String nombresInvitado ,String apellidosInvitado ,String correoInvitado ,String tipoDocInvitado ,String documentoInvitado,String telefonoInvitado){
        entrepaginasCheckout.ingresarDatosComoInvitado(nombresInvitado,apellidosInvitado,correoInvitado,tipoDocInvitado,documentoInvitado,telefonoInvitado);
    }
    @When("ingresa la facturación con ruc {string} y Razón social {string}")
    public void ingresaLaFacturacionConRUCXYRazonSocialX(String RUC, String razonSocial){
        entrepaginasCheckout.ingresamosLaFacturacionConRucXYRazonSocial(RUC, razonSocial);
    }
    @When("selecciona el siguiente paso")
    public void seleccionaElSiguientePaso(){
        entrepaginasCheckout.seleccionaElBotonDeSiguientePaso();
    }
    //      -Al realizar una 
    @When("ingresa datos faltantes del registro: Documento {string}, Numero de documento {string} y Telefono {string}")
    public void ingresaDatosFaltantesDelRegistro(String documentoCheckout, String numeroDocumentoCheckout, String telefonoCheckout){
        entrepaginasCheckout.ingresarDatosFaltantersDelRegistro(documentoCheckout, numeroDocumentoCheckout, telefonoCheckout);
    }
    //Modalidades de Recojo
    @When("selecciona envio como Recojo en Tienda en la tienda {string}")
    public void seleccionEnvioComoRecojoEnTiendaEnLaTienda(String TiendaX){
        entrepaginasCheckout.seleccionaEnvioATiendaX(TiendaX);
    }
    @When("selecciona envio como Pedido a domicilio con dirección principal guardada")
    public void seleccionEnvioComoPedidoADomicilioConDireccionPrincipalGuardada(){
        entrepaginasCheckout.seleccionaDireccionGuardada();
    }

    //Metodo de pago
    @When("selecciona el metodo de pago con tarjeta y completa los datos")
    public void seleccionaElMetodoDePagoConTarjetaYCompletaLosDatos(){
        entrepaginasCheckout.seleccionaElMetodoDePagoYDatos();
    }
    @When("selecciona el metodo de pago con Tarjeta W y demás datos")
    public void seleccionaElMetodoDePagoConTarjetaWydemasdatos(){
        entrepaginasCheckout.ingresoDePagoConTarjetaWYDemasDatos();
    }
    @When("ingresa el cupon {string}")
    public void ingresaElCuponX(String cupon){
        entrepaginasCheckout.ingresarElCuponX(cupon);
    }

    @When("finaliza la compra del producto")
    public void finalizaLaCompraDelProducto(){
        entrepaginasCheckout.finalizaLaCompra();
    }
    @Then ("verifica que se realice la compra exitosamente")
    public void verificaQueSeRealiceLaCompraExitosamente(){
        entrepaginasCheckout.verificamosElMensajeExitoso();
    }
}