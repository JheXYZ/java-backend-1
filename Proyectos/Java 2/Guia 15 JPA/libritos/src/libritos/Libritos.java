/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libritos;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Service.ServiceLibro;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JheX
 */

public class Libritos {
    public static void main(String[] args) {
        ServiceLibro SL = new ServiceLibro();
        Libro libro = new Libro();
        
        //SL.crearLibro(libro);
        
        List<Autor> autores = new ArrayList();
        List<Editorial> editoriales = new ArrayList();
        //SL.crearLibro(autores, editoriales);
        //SL.eliminarLibro(25508755995l);
        SL.mostrar();
    }
}
