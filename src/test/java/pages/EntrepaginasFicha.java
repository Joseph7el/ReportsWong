package pages;

public class EntrepaginasFicha extends BasePage{
    public EntrepaginasFicha(){   
        super();
    }
    private String botonAñadirAlCarrito = "//*[normalize-space()='Añadir al carrito']";
    public void seleccionamosElProducto(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(botonAñadirAlCarrito);
    }
}