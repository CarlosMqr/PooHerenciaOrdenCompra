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
    public OrdenCompra(String descripcion){
        this.descripcion = descripcion;
        idCompra += idCompraU;// se asigna id a cada compra y se autoincrementa cuando se crea otra ordenCompra
        this.productos = new Producto[4];
    }
    /////// GETTER AND SETTER ///////
    public int getIdCompra(){
        return this.idCompra;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public Date getFecha(){
        return this.fecha;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Producto[] getProductos(){
        return this.productos;
    }
    ////// METODOS /////////////////
    public void addProducto(Producto producto){
        if (indiceProductos < this.productos.length){
            this.productos[indiceProductos++] = producto;
            //this.productos = new Producto[4];
        }
    }
}
