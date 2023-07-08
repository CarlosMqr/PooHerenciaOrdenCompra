package org.cmendoza.pooherencia.ordencompra.modelo;

public class Cliente {
    private String nombre;
    private String apellido;

    //////// CONSTRUCTOR /////////////
    public Cliente(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    /////// GETTER AND SETTER ///////
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    ////// METODOS /////////////////
}
