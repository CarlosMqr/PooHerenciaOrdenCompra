package org.cmendoza.pooherencia.ordencompra;

import org.cmendoza.pooherencia.ordencompra.modelo.Cliente;
import org.cmendoza.pooherencia.ordencompra.modelo.OrdenCompra;
import org.cmendoza.pooherencia.ordencompra.modelo.Producto;

import java.util.Date;

public class ClaseMain {
    public static void main(String[] args) {

        Cliente carlos = new Cliente("Carlos","Mendoza");
        OrdenCompra ordenCarlos = new OrdenCompra("Hamburguesas");
        ordenCarlos.setCliente(carlos);
        ordenCarlos.setFecha(new Date());
        ordenCarlos.addProducto(new Producto("Bimbo","Bollos",34));
        ordenCarlos.addProducto(new Producto("La costeña","Chiles",25));
        ordenCarlos.addProducto(new Producto("mccormick","Mayonesa",40));
        ordenCarlos.addProducto(new Producto("Phillips","pantalla",3000));

        Cliente jazmin = new Cliente("Jazmin","Diaz");
        OrdenCompra ordenJazmin = new OrdenCompra("Hot dog");
        ordenJazmin.setCliente(jazmin);
        ordenJazmin.setFecha(new Date());
        ordenJazmin.addProducto(new Producto("Bimbo","Medias noches",25));
        ordenJazmin.addProducto(new Producto("Fut","Salchichas",80));
        ordenJazmin.addProducto(new Producto("La costeña","Chiles",35));
        ordenJazmin.addProducto(new Producto("La costeña","Kapsu",25));

        OrdenCompra[] ordenes = {ordenCarlos,ordenJazmin};
        for (OrdenCompra oc: ordenes) {
            System.out.println("    Abarrotes Jazmin   ");
            System.out.println("=========================");
            System.out.println("ID compra: " + oc.getIdCompra());
            System.out.println("Fecha: " + oc.getFecha());
            System.out.println("Cliente: " + oc.getCliente());
            System.out.println("Descripcion de compra: " + oc.getDescripcion());
            //System.out.println("Total de compra: " + oc.TotalCompra());

            int i=1;// es el contador
            for (Producto p: oc.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("Total de la compra: " + oc.TotalCompra());
            System.out.println("==================================");
        }



    }
}
