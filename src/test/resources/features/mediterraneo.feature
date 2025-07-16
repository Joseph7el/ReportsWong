

  Feature: REGRESION - Proceso de compra en línea en Mediterráneo Ecommerce
  Background:
    Given el cliente ingresa a "https://mediterraneo-ecommerce-qa.uc.r.appspot.com/"
  
#CASO NUMERO 1

  Scenario: CASO 1 - Comprar de un producto solo, como invitado, para el dia de hoy, con factura, uso de cupon, pago con tarjeta de credito, entrega en direccion y dispotivo Desktop.

    When selecciona el producto "EL CLÁSICO" de los mas pedidos
    #And ingresa la direccion de "Jiron Jose Francisco de Zela 2101, Lince 15073" y continua
    And NEW ingresa la direccion de "Jr Maria Parado de Bellido 183 Magdalena del Mar" y continua
    And pauser fin
    And selecciona el producto "EL CLÁSICO" de los mas pedidos
    And selecciona los detalles del producto "EL CLÁSICO"
    And finaliza de añadir los productos desde la ficha del producto 
    And ingresa al carrito y continuar al checkout
    And ingresar los nombres "Juan"
    And ingresar los apellidos "Pruebazzz"
    And ingresar el correo "JOSEPH8EL777@GMAIL.COM"
    And ingresar el telefono "999888777"
    And ingresar el dni "77766655"

    And selecciona el pedido programado

    And selecciona como Facturado con Ruc "20888856671" y "Empresa Testing @ut0m@t&zac¡()N"
    #And ingresa un cupon "S75PH62IX5"    
    And selecciona pago contra entrega efectivo con "300"
    #And selecciona pago con tarjeta de credito o debito
    And ingresa comentarios
    And acepta terminos y condiciones y finaliza
    
    #And ingresa los datos de la tarjeta valida
    Then validamos el mensaje final de compra exitosa

#CASO NUMERO 2

  Scenario: CASO 2 - Comprar de un producto solo, como invitado, para el dia de hoy, con factura, uso de cupon, pago con tarjeta de credito, entrega en direccion y dispotivo Desktop.

    When selecciona el producto "EL CLÁSICO" de los mas pedidos
    And NEW ingresa la direccion de "Av Gral Juan Antonio Álvarez de Arenales 1256 Jesus Maria" y continua
    And selecciona el producto "EL CLÁSICO" de los mas pedidos
    And selecciona los detalles del producto "EL CLÁSICO"
    And finaliza de añadir los productos desde la ficha del producto 
    And ingresa al carrito y continuar al checkout
    
    And ingresar los nombres "Juan"
    And ingresar los apellidos "Pruebazzz"
    And ingresar el correo "pruebas@gmail.com"
    And ingresar el telefono "999888777"
    And ingresar el dni "77766655"

    And selecciona el pedido programado
    And selecciona como Facturado con Ruc "20888856671" y "Empresa Testing @ut0m@t&zac¡()N"
    #And ingresa un cupon "S75PH62IX5"
    And selecciona pago con tarjeta de credito o debito

    And ingresa comentarios
    And acepta terminos y condiciones y finaliza
    
    And ingresa los datos de la tarjeta valida
    And pauser fin
    Then validamos el mensaje final de compra exitosa

#CASO NUMERO 3


  Scenario: CASO 3 - Comprar de un producto solo, como invitado, entrega en direccion, programado para dos dias, con boleta, sin uso de cupon, pago efectivo y dispositivo Desktop.

    When selecciona del home la seccion Nuestra carta, la categoria "Parrillas"
    And NEW ingresa la direccion de "C. Mariano Melgar 350, Miraflores 15074, Perú" y continua
    And selecciona de la carta el producto "LOMO FINO A LA PARRILLA"
    And selecciona los detalles del producto "LOMO FINO A LA PARRILLA"
    And finaliza de añadir los productos desde la ficha del producto 
    And ingresa al carrito y continuar al checkout
    And ingresar los nombres "Juan"
    And ingresar los apellidos "Pruebazzz"
    And ingresar el correo "pruebas@gmail.com"
    And ingresar el telefono "999888777"
    And ingresar el dni "77766655"

    And selecciona el pedido para hoy
    And selecciona como facturado con boleta
    And selecciona pago contra entrega efectivo con "300"

    And acepta terminos y condiciones y finaliza
    
    Then validamos el mensaje final de compra exitosa

#CASO NUMERO 4
@Ejecutar
  Scenario: CASO 4 - Comprar de un producto solo, como cliente ya registrado, programado para hoy, con boleta, con uso de cupon, pago Efectivo, recojo en tienda y dispositivo Desktop

    When selecciona de las opciones de perfil la opcion iniciar sesion
    And inicia sesion con el usuario "joseph8el777@gmail.com" y contraseña "CONTRA"
    And selecciona el producto "1/2 POLLO CLÁSICO" de los mas pedidos
    And selecciona los detalles del producto "1/2 POLLO CLÁSICO"
    And ingresa al carrito y continuar al checkout
    And selecciona el pedido para hoy
    And selecciona como Facturado con Ruc "20888856671" y "Empresa Testing @ut0m@t&zac¡()N"
    #And ingresa un cupon "V32AL15BS4"
    And seleccionar pago con Contraentrega
    And acepta terminos y condiciones y finaliza
    
    Then validamos el mensaje final de compra exitosa


#CASO NUMERO 5
  Scenario: CASO 5 - Comprar de un producto con adicionales, como cliente ya registrado, programado, con facturacion, sin uso de cupon, pago Contraentrega y recojo en una direccion
    
    When selecciona la seccion de Carta
    And NEW ingresa la direccion de "Av. Alfredo Mendiola 1400, Independencia 15311, Perú" y continua 
    And selecciona de las opciones de perfil la opcion iniciar sesion
    And inicia sesion con el usuario "ONCE@GMAIL.COM" y contraseña "ONCE"
    And selecciona la seccion de Carta
    And selecciona de la carta la opcion "Entradas y piqueos"
    And selecciona de la carta el producto "SALCHIPAPA A LA BRASA"   
    And finaliza de añadir los productos desde la ficha del producto 
    And ingresa al carrito y continuar al checkout
    And selecciona el pedido programado
    And selecciona como facturado con boleta 
    And seleccionar pago con Contraentrega
    And acepta terminos y condiciones y finaliza
    
    Then validamos el mensaje final de compra exitosa

#CASO NUMERO 6


  Scenario: CASO 6 - Comprar de un producto solo, como cliente ya registrado, programado para un mes, con factura, con uso de cupon, pago con Tarjeta de credito y Recojo en tienda 

    When selecciona del home la seccion Nuestra carta, la categoria "Parrillas"
    And ingresa el recojo en tienda, local "Plaza Norte"
    And selecciona de la carta el producto "LOMO FINO A LA PARRILLA"
    And selecciona los detalles del producto "LOMO FINO A LA PARRILLA"
    #And selecciona los complementos   
    And finaliza de añadir los productos desde la ficha del producto 
    And ingresa al carrito y continuar al checkout
    
    And seleccionamos el enlace de Iniciar Sesion exclusivo del Checkout
    And inicia sesion con el usuario "ONCE@GMAIL.COM" y contraseña "ONCE"
    And selecciona el pedido programado
    And selecciona como Facturado con Ruc "20888856671" y "Empresa Testing @ut0m@t&zac¡()N"
    #And ingresa un cupon "D26NR96JY6"
    And selecciona pago con tarjeta de credito o debito

    And acepta terminos y condiciones y finaliza
    And ingresa los datos de la tarjeta valida con cuotas Mastercard
    Then validamos el mensaje final de compra exitosa


#CASO NUMERO 7
  Scenario: CASO 7 - Comprar de un producto solo, registrando un cliente nuevo, para el dia de hoy, con factura, uso de cupon, pago con tarjeta de credito, entrega en direccion y dispotivo Desktop.

    When selecciona de las opciones de perfil la opcion Registrarme
    And ingreso los datos del cliente nuevo a registar con nombre "Juantest", apellido "QualityAssr", correo "testing55@testauto.com", telefono "911222335", DNI "83806350" y Contraseña "Contra123"
    And registra la direccion "Av. Alfredo Mendiola 1400, Independencia 15311, Perú" como principal y termina el registro
    And selecciona el producto "EL CLÁSICO" de los mas pedidos
    And selecciona los detalles del producto "EL CLÁSICO"
    And finaliza de añadir los productos desde la ficha del producto 
    And ingresa al carrito y continuar al checkout

    And selecciona el pedido para hoy
    And selecciona como Facturado con Ruc "20888856671" y "Empresa Testing @ut0m@t&zac¡()N"
    #And ingresa un cupon "D26NR96JY6"
    And selecciona pago con tarjeta de credito o debito
    And ingresa comentarios
    And acepta terminos y condiciones y finaliza
    And ingresa los datos de la tarjeta valida con cuotas Mastercard
    
    Then validamos el mensaje final de compra exitosa



#CASO NUMERO 8

  Scenario: CASO 8 - Comprar de un producto solo, registrando un cliente nuevo, entrega en direccion, programado para dos dias, con boleta, sin uso de cupon, pago efectivo y dispositivo Desktop.

    When selecciona la seccion de Carta
    And NEW ingresa la direccion de "Av. Alfredo Mendiola 1400, Independencia 15311, Perú" y continua
    And selecciona de las opciones de perfil la opcion Registrarme
    And ingreso los datos del cliente nuevo a registar con nombre "Juantest", apellido "QualityAssr", correo "tst140@gmailtest.com", telefono "911202334", DNI "91276007" y Contraseña "Contra123"
    And registra la direccion "Av. Prolongación General Jose de San Martin 143, Barranco 15063, Perú" como principal y termina el registro
    And selecciona de la carta la opcion "Parrillas"
    And selecciona de la carta el producto "LOMO FINO A LA PARRILLA"
    And selecciona los detalles del producto "LOMO FINO A LA PARRILLA"
    And selecciona los complementos  
    And finaliza de añadir los productos desde la ficha del producto 
    And ingresa al carrito y continuar al checkout
    And selecciona el campo de direccion a enviar
    And ingresa el recojo en tienda, local "Plaza Norte"
    And selecciona el pedido programado
    And selecciona como facturado con boleta   
    And seleccionar pago con Contraentrega
    And acepta terminos y condiciones y finaliza
    #And pauser fin

    Then validamos el mensaje final de compra exitosa

#CASO NUMERO 9

Scenario: CASO 9 - Comprar de un producto solo, registrando un cliente nuevo, entrega en direccion, programado para dos dias, con boleta, sin uso de cupon, pago efectivo y dispositivo Desktop.

    When selecciona del home la seccion Nuestra carta, la categoria "Entradas y piqueos"
    And NEW ingresa la direccion de "Av. Almte. Miguel Grau 1511 Barr" y continua
    And selecciona de la carta el producto "SALCHIPAPA A LA BRASA"

    And selecciona de las opciones de perfil la opcion Registrarme
    And ingreso los datos del cliente nuevo a registar con nombre "Juantest", apellido "QualityAssr", correo "test236@testing.com", telefono "910222334", DNI "61000311" y Contraseña "Contra123"
    And registra la direccion "Av. San Martín 127, Lima 15063, Perú" como principal y termina el registro

    And finaliza de añadir los productos desde la ficha del producto 
    And ingresa al carrito y continuar al checkout
    And selecciona el pedido programado
    And selecciona como facturado con boleta
    #And ingresa un cupon "S20LD33OU4"
    And selecciona pago contra entrega efectivo con "500"
    And acepta terminos y condiciones y finaliza
    
    And pauser fin

#CASO NUMERO 10

  # Scenario: Realizar la compra con una tarjeta no valida

  #   When selecciona la seccion de Carta
  #   And ingresa la direccion de "Av. Alfredo Mendiola 1400, Independencia 15311, Perú" y continua 
  #   And selecciona de las opciones de perfil la opcion iniciar sesion
  #   And inicia sesion con el usuario "ONCE@GMAIL.COM" y contraseña "ONCE"
  #   And selecciona la seccion de Carta
  #   And selecciona de la carta la opcion "Entradas y piqueos"
  #   And selecciona de la carta el producto "SALCHIPAPA A LA BRASA"
  #   And selecciona los detalles del producto "SALCHIPAPA A LA BRASA"
  #   And finaliza de añadir los productos desde la ficha del producto 
  #   And ingresa al carrito y continuar al checkout

  #   And selecciona el pedido programado
  #   And selecciona como Facturado con Ruc "20888856671" y "Empresa Testing @ut0m@t&zac¡()N"
  #   And seleccionar pago con Contraentrega

  #   And acepta terminos y condiciones y finaliza 
  #   And pauser fin

#    /////////////////
#    And seleccionar pago con Contraentrega

#    And ingresar los datos del checkout
#    Then la compra se realiza con éxito

 #   And buscar un <Producto>
 #   And navegar a la ficha
 #   Then el usuario lo añade al carrito

#    Examples:
#        | Producto | 
#        | Clue 1  |
#        | Value 1  |

# And selecciona detalles de la salchipapa y continuar
# And selecciona pago con tarjeta de credito o debito
 