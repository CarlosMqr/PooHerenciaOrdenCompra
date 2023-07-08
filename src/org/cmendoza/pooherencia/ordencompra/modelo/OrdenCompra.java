package org.cmendoza.pooherencia.ordencompra.modelo;

import java.util.Date;

public class OrdenCompra {
    private int idCompra;
    private int idCompraU;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;// un tipo Cliente que viene de la clase Cliente
    private Producto[] productos;//un tipo producto que viene de la clase Producto
    private int indiceProductos;//para inicializar el metodo add
    //////// CONSTRUCTOR /////////////
    /////// GETTER AND SETTER ///////
    ////// METODOS /////////////////
}
