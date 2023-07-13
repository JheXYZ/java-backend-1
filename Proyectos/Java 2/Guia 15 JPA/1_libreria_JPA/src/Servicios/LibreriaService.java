/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.Scanner;

/**
 *
 * @author JheX
 */
public class LibreriaService {
    private final EditorialService ES = new EditorialService();
    private final LibroService LS = new LibroService();
    private final AutorService AS = new AutorService();
    private final PrestamoService PS = new PrestamoService();
    private final ClienteService CS = new ClienteService();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void menuLibreria(){
        boolean fin = false;
        System.out.println("                ===== ¡Bienvenido de nuevo! =====");
        while(!fin){
            System.out.println("                      ===== Libreria =====");
            System.out.println("Libros: " + LS.getLibros().size() + " | Clientes: " + CS.getClientes().size() + " | Prestamos: " + PS.getPrestamos().size() + " | Autores: " + AS.getAutores().size() + " |Editoriales: " + ES.getEditoriales().size());
            System.out.println("                   ===== Menu de Opciones =====");
            System.out.println("1) Libros | 2) Clientes | 3) Prestamos | 4) Autores | 5) Editoriales 6) Salir");
            switch(leer.nextInt()){
                case 1 -> {
                    LS.menuLibros();
                }
                case 2 -> {
                    CS.menuClientes();
                }
                case 3 -> {
                    PS.menuPrestamos();
                }
                case 4 -> {
                    AS.menuAutores();
                }
                case 5 -> {
                    ES.menuEditoriales();
                }
                case 6 -> {
                    System.out.println("¡Que tenga lindo día!");
                    fin = true;
                }
            }
        }
    }
}
