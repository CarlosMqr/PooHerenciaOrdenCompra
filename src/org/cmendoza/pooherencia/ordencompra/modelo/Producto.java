package org.cmendoza.pooherencia.ordencompra.modelo;

public class Producto {
    private String nombre;
    private int precio;
    private String fabricante;
    //////// CONSTRUCTOR /////////////
    public Producto (String fabricante, String nombre, int precio){
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;

    }
    /////// GETTER AND SETTER ///////
    public String getNombre(){
        return this.nombre;
    }
    public String getFabricante(){
        return this.fabricante;
    }
    public int getPrecio(){
        return this.precio;
    }
    ////// METODOS /////////////////
}
