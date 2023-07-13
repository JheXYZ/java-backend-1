/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Producto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JheX
 */
public class ProductoDAO extends DAO{
    public void ingresarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("El producto no es valido");
            }
            
            String sql = "INSERT INTO producto"
                    + "VALUES (12, '" + producto.getNombre() + "' , " + producto.getPrecio() + ", " + producto.getCodigoFabricante() + ")";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    //Lista el nombre de todos los productos que hay en la tabla producto.
    public void obtenerNombre(){
        try{
            String sql = "SELECT nombre FROM producto";
            
            consultarBase(sql);
            Producto prod = null;
            ArrayList<Producto> productos = new ArrayList();
            
            while(resultado.next()){
                prod = new Producto();
                prod.setNombre(resultado.getNString("nombre"));
                productos.add(prod);
            }
            desconectarBase();
            
            for (var pro : productos) {
                System.out.println("Nombre: "+ pro.getNombre());
            }
        } catch(Exception e){
            System.out.println("Uy, algo hiciste mal");
            System.out.println(e.getMessage());
        }
    }
    
    //Lista los nombres y los precios de todos los productos de la tabla producto.
    public void obtenerPrecio(){
        try{
            String sql = "SELECT nombre, precio FROM producto";
            
            consultarBase(sql);
            Producto prod = null;
            ArrayList<Producto> productos = new ArrayList();
            
            while(resultado.next()){
                prod = new Producto();
                prod.setNombre(resultado.getNString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                productos.add(prod);
            }
            desconectarBase();
            
            for (var pro : productos) {
                System.out.println("Precio: " + pro.getPrecio() + " | " + pro.getNombre());
            }
        } catch(Exception e){
            System.out.println("Uy, algo hiciste mal");
            System.out.println(e.getMessage());
        }
    }
    //Listar aquellos productos que su precio esté entre 120 y 202.
    public void obtenerPrecioEntre(){
        try{
            String sql = "SELECT nombre, precio FROM producto WHERE precio BETWEEN 120 and 202";
            
            consultarBase(sql);
            Producto prod = null;
            ArrayList<Producto> productos = new ArrayList();
            
            while(resultado.next()){
                prod = new Producto();
                prod.setNombre(resultado.getNString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                productos.add(prod);
            }
            desconectarBase();
            
            for (var pro : productos) {
                System.out.println("Precio: " + pro.getPrecio() + " | " + pro.getNombre());
            }
        } catch(Exception e){
            System.out.println("Uy, algo hiciste mal");
            System.out.println(e.getMessage());
        }
    }
    //Buscar y listar todos los Portátiles de la tabla producto.
    public void obtenerPortatiles(){
        try{
            String sql = "SELECT nombre FROM producto WHERE nombre LIKE '%portatil%'";
            
            consultarBase(sql);
            Producto prod = null;
            ArrayList<Producto> productos = new ArrayList();
            
            while(resultado.next()){
                prod = new Producto();
                prod.setNombre(resultado.getNString("nombre"));
                productos.add(prod);
            }
            desconectarBase();
            
            for (var pro : productos) {
                System.out.println("Nombre: " + pro.getNombre());
            }
        } catch(Exception e){
            System.out.println("Uy, algo hiciste mal");
            System.out.println(e.getMessage());
        }
    }
    
    //Listar el nombre y el precio del producto más barato.
    public void obtenerProdMasBarato(){
        try{
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio LIMIT 1";
            Producto prod = null;
            consultarBase(sql);
            ArrayList<Producto> productos = new ArrayList();
            while(resultado.next()){
                prod = new Producto();
                prod.setNombre(resultado.getNString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                productos.add(prod);
            }
            desconectarBase();
            for (var pro : productos) {
                System.out.println("Precio: " + prod.getPrecio() + " | " + prod.getNombre());
            }
        } catch(Exception e){
            System.out.println("Uy, algo hiciste mal");
            System.out.println(e.getMessage());
        }
    }
    
    //Ingresar un producto a la base de datos.
    
}
