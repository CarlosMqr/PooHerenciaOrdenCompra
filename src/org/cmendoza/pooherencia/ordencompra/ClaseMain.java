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



    }
}
