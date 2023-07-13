/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Producto;
import Persistencia.ProductoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @author JheX
*/

public class ProductoService {
    private ProductoDAO dao;
    
    public ProductoService(){
        this.dao = new ProductoDAO();
    }

    public void crearProducto(String nombre, double precio, int codigo_fabricante) {
        try {
            //Validamos
            if (nombre == null || nombre.isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            if (precio < 0) {
                throw new Exception("El precio no es valido");
            }

            if (codigo_fabricante < 0) {
                throw new Exception("El codigo de frabricante no es valido");
            }

            //Creamos el mascota
            Producto prod = new Producto();
            dao.ingresarProducto(prod);

        } catch (Exception e) {
            System.out.println("Eeepa, algo hiciste mal");
            System.out.println(e.getMessage());
        }
    }
}
