/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cliente;
import Persistence.ClienteJpaController;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Scanner;

/**
 * @author JheX
*/

public class ClienteService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ClienteJpaController CJC = new ClienteJpaController();

    public void crearCliente() {
        //Cliente(long documento, String nombre, String apellido, String telefono)
        Cliente cliente = new Cliente();
        cliente.setId((CJC.findClienteEntities().get(CJC.getClienteCount() - 1).getId()) + 1);
        cliente.setDocumento((long)(Math.random() * 100000000));
        System.out.println("DNI: " + cliente.getDocumento());
        System.out.print("Nombre: ");
        cliente.setNombre(leer.next());
        System.out.print("Apellido: ");
        cliente.setApellido(leer.next());
        cliente.setTelefono("" + (int)(Math.random() * 1000000000));
        System.out.println("Telefono: " + cliente.getTelefono());
        
        CJC.create(cliente);
    }

    public void crearCliente(Cliente cliente) {
        if (CJC.findCliente(cliente.getId()) == null) {
            CJC.create(cliente);
        } else {
            System.out.println("Ya existe tal cliente");
        }
    }

    public void modificarCliente() {
        mostrarClientes();
        try {
            System.out.print("Modificar Cliente | ID: ");
            int id = leer.nextInt();
            while (CJC.findCliente(id) == null) {
                System.out.print("No se encotro tal ID, intente de nuevo: ");
                id = leer.nextInt();
            }
            System.out.println("Que desea modificar | 1) ID | 2) Nombres | 3) Apellidos | 4) Telefono | Any Key) Cancelar");
            int opcion;
            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                opcion = 5;
            }
            Cliente cliente = CJC.findCliente(id);
            switch (opcion) {
                case 1 -> {
                    int newID = id;
                    System.out.print("Nuevo ID: ");
                    do {
                        newID = leer.nextInt();
                        if (CJC.findCliente(newID) != null) {
                            System.out.print("ID ya existente, intente de nuevo: ");
                        }
                    } while (CJC.findCliente(newID) != null);
                    cliente.setId(newID);
                    CJC.create(cliente);
                    CJC.destroy(id);
                }
                case 2 -> {
                    System.out.print("Nuevos Nombres: ");
                    cliente.setNombre(leer.next());
                    CJC.edit(cliente);
                }
                case 3 -> {
                    System.out.print("Nuevos Apellidos: ");
                    cliente.setApellido(leer.next());
                    CJC.edit(cliente);
                }
                case 4 -> {
                    System.out.print("Nuevo Telefono: ");
                    cliente.setTelefono(leer.next());
                    CJC.edit(cliente);
                }
                default -> {
                    System.out.println("Terminando...");
                }
            }
            System.out.println("Operacion Exitosa!");
        } catch (Exception e) {
            System.out.println("Algo paso al modificar el cliente D:");
        }
    }
    
    public void eliminarCliente(){
        try {
            System.out.print("Eliminar Cliente | ID: ");
            CJC.destroy(leer.nextInt());
        } catch (NonexistentEntityException e){
            System.out.println("Algo paso al eliminar el cliente D:");
        }
    }
    
    public void eliminarCliente(int id){
        try {
            CJC.destroy(id);
        } catch (NonexistentEntityException e){
            System.out.println("Algo paso al eliminar el cliente D:");
        }
    }
    
    
    public void mostrarClientes(){
        System.out.println("==== Clientes ====");
        for (Cliente cliente : CJC.findClienteEntities()) {
            System.out.println("ID: " + cliente.getId() + " | Nombre: " + cliente.getNombre() + " | Apellido: " + cliente.getApellido() + " | Telefono: " + cliente.getTelefono());
        }
        System.out.println("==================\n");
    }
    
    public List<Cliente> getClientes(){
        return CJC.findClienteEntities();
    }
    
    public void reorganizarIDs(){
        List<Cliente> clientes = CJC.findClienteEntities();
        int c = 1;
        for (Cliente cliente : clientes) {
            if (cliente.getId() != c){
                int id = cliente.getId();
                cliente.setId(c);
                CJC.create(cliente);
                try {
                    CJC.destroy(id);
                } catch (NonexistentEntityException ex) {
                    System.out.println("No se pudo borrar el cliente D:");
                }
            }
            c++;
        }
    }
    
    public Cliente buscarPorID(int id){
        return CJC.findCliente(id);
    }
    
    public void menuClientes(){
        System.out.println("==== Administrar Clientes ==== \n1) Mostrar Clientes | 2) Nuevo Cliente | 3) Modificar un Cliente | 4) Salir");
        switch(leer.nextInt()){
            case 1 -> {
                mostrarClientes();
            }
            case 2 -> {
                crearCliente();
            }
            case 3 -> {
                modificarCliente();
            }
            default -> {
                System.out.println("Saliendo...");
            }
        }
    }
}
