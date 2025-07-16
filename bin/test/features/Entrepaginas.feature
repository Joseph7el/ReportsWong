
Feature: REGRESIÓN - Proceso de compra Entrepaginas

Background:
    Given el cliente ingresa a la web de Entrepaginas de: "https://dev-ecommerce-entrepaginas.uc.r.appspot.com/"
    And selecciona el boton de aceptar las cookies

Scenario: CP 1
    When busca un libro con el titulo "El ultimo combate-julio cortazar" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "joseph8el777@gmail.com" y contraseña "contra"
    And regresa a la ventana de inicio
    And selecciona el icono de Carrito de compras
    And selecciona Ver Carrito y procede con el pago
    And ingresa la facturación con ruc "20777888999" y Razón social "Empresa Pr0c{Z° @ut0m@t!zdÓ S@Cé/&%#))"
    And selecciona el siguiente paso
    And ingresa el cupon "QAAutoListaMonto"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - CC. Mall del Sur - Tercer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos
    
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente

Scenario: CP 2
    When selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "joseph8el777@gmail.com" y contraseña "contra"
    And selecciona el producto "Planner Cristian Arens 2025"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And selecciona el siguiente paso
    And ingresa el cupon "QAAuto%"
    And selecciona envio como Pedido a domicilio con dirección principal guardada
    And selecciona el metodo de pago con tarjeta y completa los datos   
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente


 
Scenario: CP 3
    When selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "joseph8el777@gmail.com" y contraseña "contra"
    And selecciona el producto "Algun dia te mostrare el desierto"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And ingresa la facturación con ruc "20777888999" y Razón social "Empresa Pr0c{Z° @ut0m@t!zdÓ S@Cé/&%#))"
    And selecciona el siguiente paso
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas CC.Plaza Norte - Primer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente


Scenario: CP 4
    When selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "joseph8el777@gmail.com" y contraseña "contra"
    
    And busca un libro con el titulo "MANGA GANTZ MAXIMUM 15" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And busca un libro con el titulo "A TALE OF TWO CITIES(ARTISAN EDT)" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And selecciona el siguiente paso
    And selecciona envio como Pedido a domicilio con dirección principal guardada
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente

Scenario: CP 5
    When selecciona el producto "CAMINO DE REGRESO A CASA, EL"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And selecciona inicio de sesion como Seguir como invitado
    And ingresa los datos del cliente: Nombres "Pedro Pruebas", Apellidos "Automatizadas Testing", Correo "jespinoza@csticorp.biz", Tipo de documento "DNI", Documento "10010100", Telefono "911222444"

    And ingresa la facturación con ruc "20777888999" y Razón social "Empresa Pr0c{Z° @ut0m@t!zdÓ S@Cé/&%#))"
    And selecciona el siguiente paso
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas CC.Plaza Norte - Primer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente

Scenario: CP 6
    When selecciona el producto "El amor de tu vida"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago

    And selecciona inicio de sesion como Seguir como invitado
    And ingresa los datos del cliente: Nombres "Juan Pruebas", Apellidos "Automatizadas Test", Correo "jespinoza@csticorp.biz", Tipo de documento "Carné de extranjeria", Documento "1112223334444", Telefono "926111222"

    And selecciona el siguiente paso
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas CC. Mall del Sur - Planta Baja"
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente


Scenario: CP 7
    When busca un libro con el titulo "THE SUBTLE ART OF NOT GIVING A FUCK" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And busca un libro con el titulo "ERASE UNA VEZ UN CORAZON ROTO(ED.LIMITAD" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And busca un libro con el titulo "MANGA BLACK CLOVER 16" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And selecciona inicio de sesion como Seguir como invitado
    And ingresa los datos del cliente: Nombres "cincuneta MONTOqa", Apellidos "Automatizadas Test", Correo "jespinoza@csticorp.biz", Tipo de documento "Carné de extranjeria", Documento "75077885", Telefono "926111222"
    And ingresa la facturación con ruc "10777888999" y Razón social "Empresa Pr0c{Z° @ut0m@t!zdÓ S@Cé/&%#))"
    And selecciona el siguiente paso
    And ingresa el cupon "QAAutoListaMonto"

    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas CC.Plaza Norte - Primer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente


Scenario: CP 8
    When selecciona el producto "La Paciente Silenciosa"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago

    And selecciona inicio de sesion como Seguir como invitado
    And ingresa los datos del cliente: Nombres "Juan Pruebas", Apellidos "Automatizadas Test", Correo "jespinoza@csticorp.biz", Tipo de documento "Carné de extranjeria", Documento "900000000000000", Telefono "926111222"
    And selecciona el siguiente paso    
    And ingresa el cupon "QAAutoLista%"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - Terminal Terrestre - Primer Nivel XD"
    And selecciona el metodo de pago con tarjeta y completa los datos

    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente

Scenario: CP 9
    When selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "joseph8el777@gmail.com" y contraseña "contra"
    And busca un libro con el titulo "INGENIO Y LA SABIDURÍA DE BERTRAND RUSSEL, EL" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio

    And selecciona el producto "La Paciente Silenciosa"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And ingresa la facturación con ruc "20777888999" y Razón social "Empresa Pr0c{Z° @ut0m@t!zdÓ S@Cé/&%#))"
    And selecciona el siguiente paso
    And ingresa el cupon "QAAutoListaMonto"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - CC. Mall del Sur - Tercer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos

    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente


Scenario: CP 10
    When selecciona el producto "Planner Cristian Arens 2025"
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "Niños del pájaro azul"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    
    And selecciona inicio de sesion como Seguir como invitado
    And ingresa los datos del cliente: Nombres "Juan Pruebas", Apellidos "Automatizadas Test", Correo "jespinoza@csticorp.biz", Tipo de documento "Carné de extranjeria", Documento "1112220004444", Telefono "926111222"

    And selecciona el siguiente paso
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - CC. Mall del Sur - Tercer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente


Scenario: CP 11
    When selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "joseph8el777@gmail.com" y contraseña "contra"
    And selecciona el producto "CAMINO DE REGRESO A CASA, EL"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And selecciona el siguiente paso
    And ingresa el cupon "QA10Soles"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas CC.Plaza Norte - Primer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos

    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente

Scenario: CP 12
    When selecciona el producto "La Paciente Silenciosa"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And selecciona inicio de sesion como Seguir como invitado
    And ingresa los datos del cliente: Nombres "Juan PruebasPasaporte", Apellidos "Automatizadas Test", Correo "jespinoza@csticorp.biz", Tipo de documento "Pasaporte", Documento "900000000000000", Telefono "926111222"   
    And ingresa la facturación con ruc "20777888999" y Razón social "Empresa Pr0c{Z° @ut0m@t!zdÓ S@Cé/&%#))"
    And selecciona el siguiente paso    
    And ingresa el cupon "QAAutoLista%"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - Terminal Terrestre - Primer Nivel XD"
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente



Scenario: CP 13
    When selecciona el boton de Iniciar sesión
    And registra un cliente nuevo con datos: Correo "pruebas14@gmail.com", Nombres "Pruebas", Apellidos "Automatizadas", DNI "20000014", Contraseña "CONTRASEÑA"
    
    And selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "pruebas14@gmail.com" y contraseña "contra"

    And selecciona el producto "Poder del ahora, el (db)"
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "La Paciente Silenciosa"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And ingresa datos faltantes del registro: Documento "DNI", Numero de documento "20000014" y Telefono "999888877"
    And ingresa la facturación con ruc "20777888999" y Razón social "Empresa Pr0c{Z° @ut0m@t!zdÓ S@Cé/&%#))"
    And selecciona el siguiente paso
    And ingresa el cupon "QAAutoListaMonto"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - CC. Mall del Sur - Tercer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente


Scenario: CP 14
    When selecciona el boton de Iniciar sesión
    And registra un cliente nuevo con datos: Correo "pruebas20@gmail.com", Nombres "Pruebas", Apellidos "Automatizadas", DNI "99999900002", Contraseña "CONTRASEÑA"
    And selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "pruebas20@gmail.com" y contraseña "contra"

    And selecciona el producto "Poder del ahora, el (db)"
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "La Paciente Silenciosa"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And ingresa datos faltantes del registro: Documento "Carné de extranjeria", Numero de documento "99999900002" y Telefono "999888877"
    And selecciona el siguiente paso
    And ingresa el cupon "QAAuto%"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - CC. Mall del Sur - Tercer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente

Scenario: CP 15
    When selecciona el boton de Iniciar sesión
    And registra un cliente nuevo con datos: Correo "pruebas19@gmail.com", Nombres "Pruebas", Apellidos "Automatizadas", DNI "99999900003", Contraseña "CONTRASEÑA"
    And selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "pruebas19@gmail.com" y contraseña "contra"

    And busca un libro con el titulo "THE SUBTLE ART OF NOT GIVING A FUCK" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "La Paciente Silenciosa"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And ingresa datos faltantes del registro: Documento "Carné de identidad", Numero de documento "99999999002" y Telefono "999888877"

    And selecciona el siguiente paso
    And ingresa el cupon "QAAuto%"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - CC. Mall del Sur - Tercer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente

Scenario: CP 16
    When selecciona el boton de Iniciar sesión
    And registra un cliente nuevo con datos: Correo "pruebas19@gmail.com", Nombres "Pruebas", Apellidos "Automatizadas", DNI "99990000100", Contraseña "CONTRASEÑA"
    And selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "pruebas19@gmail.com" y contraseña "contra"

    And busca un libro con el titulo "THE SUBTLE ART OF NOT GIVING A FUCK" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "La Paciente Silenciosa"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And ingresa datos faltantes del registro: Documento "Pasaporte", Numero de documento "88880000100" y Telefono "964888877"

    And selecciona el siguiente paso
    And ingresa la facturación con ruc "20777888999" y Razón social "Empresa Pr0c{Z° @ut0m@t!zdÓ S@Cé/&%#))"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - CC. Mall del Sur - Tercer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente
    
Scenario: CP 17
    When selecciona el boton de Iniciar sesión
    And registra un cliente nuevo con datos: Correo "pruebas336@gmail.com", Nombres "Pruebas", Apellidos "Automatizadas", DNI "678330000042", Contraseña "CONTRASEÑA"  
    And selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "pruebas336@gmail.com" y contraseña "contra"
    And busca un libro con el titulo "THE SUBTLE ART OF NOT GIVING A FUCK" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And busca un libro con el titulo "LA TRANSFORMACION TOTAL DE SU DINERO" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And busca un libro con el titulo "HISPANOAMERICA (LOPEZ LINARES" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "COMO MANDAR A LA MIERDA DE FORMA EDUCADA"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And ingresa datos faltantes del registro: Documento "DNI", Numero de documento "99200001002" y Telefono "999888877"
    And selecciona el siguiente paso
    And ingresa el cupon "QAAutoMonto"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - CC. Mall del Sur - Tercer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos

    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente

Scenario: CP 18
    When selecciona el boton de Iniciar sesión
    And registra un cliente nuevo con datos: Correo "pruebas422@gmail.com", Nombres "Pruebas", Apellidos "Automatizadas", DNI "99700003", Contraseña "CONTRASEÑA"
    And selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "pruebas422@gmail.com" y contraseña "contra"
    And busca un libro con el titulo "LA TRANSFORMACION TOTAL DE SU DINERO" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And busca un libro con el titulo "HISPANOAMERICA (LOPEZ LINARES" en el buscador
    And selecciona añadir el producto al carrito, en la ficha 
    And regresa a la ventana de inicio
    And busca un libro con el titulo "ERASE UNA VEZ UN CORAZON ROTO(ED.LIMITAD" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And ingresa datos faltantes del registro: Documento "Carné de extranjeria", Numero de documento "9991000003" y Telefono "999888877"

    And selecciona el siguiente paso
    And ingresa el cupon "QAAuto%"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - CC. Mall del Sur - Tercer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente

Scenario: CP 19
    When selecciona el boton de Iniciar sesión
    And registra un cliente nuevo con datos: Correo "pruebas3019@gmail.com", Nombres "Pruebas", Apellidos "Automatizadas", DNI "9000000101", Contraseña "CONTRASEÑA"
    And selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "pruebas3019@gmail.com" y contraseña "contra"

    And busca un libro con el titulo "THE SUBTLE ART OF NOT GIVING A FUCK" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    
    And regresa a la ventana de inicio
    And busca un libro con el titulo "A TALE OF TWO CITIES(ARTISAN EDT)" en el buscador
    And selecciona añadir el producto al carrito, en la ficha 
    And regresa a la ventana de inicio
    And selecciona el producto "La Paciente Silenciosa"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And ingresa datos faltantes del registro: Documento "Carné de identidad", Numero de documento "99999999002" y Telefono "999888877"

    And selecciona el siguiente paso
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas CC. Mall del Sur - Planta Baja"
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente

Scenario: CP 20
    When selecciona el boton de Iniciar sesión
    And registra un cliente nuevo con datos: Correo "pruebas5001@gmail.com", Nombres "Tarjetaw", Apellidos "Automatizadas", DNI "800000103", Contraseña "CONTRASEÑA"
    And selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "pruebas5001@gmail.com" y contraseña "contra"

    And busca un libro con el titulo "THE SUBTLE ART OF NOT GIVING A FUCK" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "La Paciente Silenciosa"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And ingresa datos faltantes del registro: Documento "Pasaporte", Numero de documento "88880000101" y Telefono "964888877"
    And ingresa la facturación con ruc "3000088999" y Razón social "Empresa Pr0c{Z° @ut0m@t!zdÓ S@Cé/&%#))"
    And selecciona el siguiente paso
    And ingresa el cupon "QAAuto%"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - CC. Mall del Sur - Tercer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente
    
Scenario: CP 21
    When selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "joseph8el777@gmail.com" y contraseña "contra"

    And busca un libro con el titulo "THE SUBTLE ART OF NOT GIVING A FUCK" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "Planner Cristian Arens 2025"
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "Quedará el amor"
    And selecciona añadir el producto al carrito, en la ficha

    And selecciona Ver Carrito y procede con el pago
    And ingresa datos faltantes del registro: Documento "Pasaporte", Numero de documento "886680000103" y Telefono "964888877"
    And ingresa la facturación con ruc "20777888999" y Razón social "Empresa Pr0c{Z° @ut0m@t!zdÓ S@Cé/&%#))"
    And selecciona el siguiente paso
    And ingresa el cupon "Auto25%"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - CC. Mall del Sur - Tercer Nivel"
    And selecciona el metodo de pago con Tarjeta W y demás datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente


Scenario: CP 22
    When busca un libro con el titulo "THE SUBTLE ART OF NOT GIVING A FUCK" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "Planner Cristian Arens 2025"
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "Quedará el amor"
    And selecciona añadir el producto al carrito, en la ficha

    And selecciona Ver Carrito y procede con el pago
    And selecciona inicio de sesion como Seguir como invitado
    And ingresa los datos del cliente: Nombres "Pedro Pruebas", Apellidos "Automatizadas Testing", Correo "jespinoza@csticorp.biz", Tipo de documento "Pasaporte", Documento "P32111122233", Telefono "911222444"
    
    And selecciona el siguiente paso
    And ingresa el cupon "Auto25%"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas CC.Plaza Norte - Primer Nivel"
    And selecciona el metodo de pago con Tarjeta W y demás datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente


Scenario: CP 23
    When busca un libro con el titulo "THE SUBTLE ART OF NOT GIVING A FUCK" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "Planner Cristian Arens 2025"
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "Quedará el amor"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And selecciona inicio de sesion como Seguir como invitado
    And ingresa los datos del cliente: Nombres "Pedro Pruebas", Apellidos "Automatizadas Testing", Correo "jespinoza@csticorp.biz", Tipo de documento "Carné de extranjeria", Documento "3217711122233", Telefono "911222444"
    
    And selecciona el siguiente paso
    And ingresa el cupon "Auto30S"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - Terminal Terrestre - Primer Nivel XD"
    And selecciona el metodo de pago con Tarjeta W y demás datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente

Scenario: CP 24
    When busca un libro con el titulo "THE SUBTLE ART OF NOT GIVING A FUCK" en el buscador
    And selecciona añadir el producto al carrito, en la ficha

    And selecciona el boton de Iniciar sesión
    And registra un cliente nuevo con datos: Correo "pruebas6003@gmail.com", Nombres "Pruebas", Apellidos "Automatizadas", DNI "995400004", Contraseña "CONTRASEÑA"
    And selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "pruebas6003@gmail.com" y contraseña "contra"

    And regresa a la ventana de inicio
    And selecciona el producto "Planner Cristian Arens 2025"
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "Quedará el amor"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And ingresa datos faltantes del registro: Documento "Carné de extranjeria", Numero de documento "A99992" y Telefono "999123477"

    And ingresa la facturación con ruc "20777888999" y Razón social "Empresa Pr0c{Z° @ut0m@t!zdÓ S@Cé/&%#))"
    And selecciona el siguiente paso
    
    And ingresa el cupon "Auto30S"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - Terminal Terrestre - Primer Nivel XD"
    And selecciona el metodo de pago con Tarjeta W y demás datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente
    


Scenario: CP 24
    When busca un libro con el titulo "THE SUBTLE ART OF NOT GIVING A FUCK" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "Planner Cristian Arens 2025"
    And selecciona el boton de Iniciar sesión
    And registra un cliente nuevo con datos: Correo "pruebas8001@gmail.com", Nombres "Pruebas", Apellidos "Automatizadas", DNI "929400001", Contraseña "CONTRASEÑA"
    And selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "pruebas8001@gmail.com" y contraseña "contra"

    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio
    And selecciona el producto "Quedará el amor"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And ingresa datos faltantes del registro: Documento "DNI", Numero de documento "78932155" y Telefono "999123477"
    And selecciona el siguiente paso
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - Terminal Terrestre - Primer Nivel XD"
    And selecciona el metodo de pago con Tarjeta W y demás datos
    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente
    
#si es mas de 5 prod no se muestra el carrito


Scenario: CASO DE PRUEBA X
    When busca un libro con el titulo "El ultimo combate-julio cortazar" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And regresa a la ventana de inicio 
    And busca un libro con el titulo "La SUPRACONCIENCIA existe" en el buscador
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona el boton de Iniciar sesión
    And inicio sesion con el correo "pruebas19@gmail.com" y contraseña "contra"
    And regresa a la ventana de inicio 
    And selecciona el producto "La Paciente Silenciosa"
    And selecciona añadir el producto al carrito, en la ficha
    And selecciona Ver Carrito y procede con el pago
    And ingresa datos faltantes del registro: Documento "DNI", Numero de documento "78932555" y Telefono "999123477"
    And ingresa la facturación con ruc "20777883899" y Razón social "ELIMINACION 3"
    And selecciona el siguiente paso
    And ingresa el cupon "Auto30S"
    And selecciona envio como Recojo en Tienda en la tienda "Entre Páginas - CC. Mall del Sur - Tercer Nivel"
    And selecciona el metodo de pago con tarjeta y completa los datos

    And finaliza la compra del producto
    Then verifica que se realice la compra exitosamente


