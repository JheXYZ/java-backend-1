/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cliente;
import Entidades.Libro;
import Entidades.Prestamo;
import Persistence.PrestamoJpaController;
import Persistence.exceptions.NonexistentEntityException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author JheX
*/

public class PrestamoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ClienteService CS = new ClienteService();
    private LibroService LS = new LibroService();
    private PrestamoJpaController PJC = new PrestamoJpaController();

    public void nuevoPrestamo() {
        List<Libro> libros = LS.getLibros();
        List<Cliente> clientes = CS.getClientes();
        Prestamo prestamo = new Prestamo();

        for (Libro libro : libros) {
            if (libro.getEjemplaresRestantes() > 0 && libro.isAlta()) {
                System.out.println("ISBN: " + libro.getIsbn() + " | Titulo: " + libro.getTitulo() + " | Autor: " + libro.getAutor().getNombre());
            }
        }
        if (!libros.isEmpty()) {
            System.out.print("ISBN del libro: ");
            long isbn = leer.nextLong();
            boolean cancelar = false;
            while (prestamo.getLibro() == null && !cancelar) {
                for (Libro libro : libros) {
                    if (libro.getIsbn() == isbn && libro.getEjemplaresRestantes() > 0 && libro.isAlta()) {
                        System.out.println("ISBN: " + libro.getIsbn() + " | Titulo: " + libro.getTitulo());
                        System.out.print("Cuantos libros desea pedir: ");
                        int cantidad = leer.nextInt();
                        while (!LS.checkDisponibilidad(libro, cantidad)) {
                            System.out.println("No hay suficientes libros para prestar. Hay: " + libro.getEjemplaresRestantes());
                            System.out.print("Cuantos libros desea pedir (0 cancelar): ");
                            cantidad = leer.nextInt();
                        }
                        if (cantidad != 0) {
                            prestamo.setLibro(LS.prestarLibro(libro, cantidad));
                            System.out.println("Se presto el libro correctamente");
                        } else {
                            cancelar = true;
                        }
                        break;
                    }
                }
                if (prestamo.getLibro() == null && !cancelar) {
                    System.out.print("Intente de nuevo con otro libro (ISBN): ");
                    isbn = leer.nextLong();
                }
            }
        } else {
            prestamo.setLibro(null);
        }
        if (!clientes.isEmpty() && prestamo.getLibro() != null) {
            for (Cliente cliente : clientes) {
                System.out.println("ID: " + cliente.getId() + " | Nombres: " + cliente.getNombre() + " | Apellidos: " + cliente.getApellido());
            }
            System.out.print("ID cliente: ");
            int id = leer.nextInt();
            while (prestamo.getCliente() == null) {
                for (Cliente cliente : clientes) {
                    if (cliente.getId() == id) {
                        prestamo.setCliente(cliente);
                        break;
                    }
                }
                if (prestamo.getCliente() == null) {
                    System.out.print("No se encontro tal cliente, intente de nuevo: ");
                    id = leer.nextInt();
                }

            }

            DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechas;
            Date fecha;
            while (prestamo.getFechaPrestamo() == null) {
                System.out.println("Fecha de prestamo (dd/mm/aaaa): ");
                fechas = leer.next();
                try {
                    fecha = formato.parse(fechas);
                    prestamo.setFechaPrestamo(fecha);
                } catch (ParseException ex) {
                    System.out.println("No se puede convertir la fecha");
                }
            }
            while (prestamo.getFechaDevolucion() == null) {
                System.out.println("Fecha de devolucion (dd/mm/aaaa): ");
                fechas = leer.next();
                try {
                    fecha = formato.parse(fechas);
                    if (fecha.after(prestamo.getFechaPrestamo())) {
                        prestamo.setFechaDevolucion(fecha);
                    } else {
                        System.out.println("La fecha debe ser posterior de la fecha de prestamo");
                    }
                } catch (ParseException ex) {
                    System.out.println("No se puede convertir la fecha");
                }
            }
            PJC.create(prestamo);
        } else {
            if (prestamo.getLibro() == null) {
                System.out.println("No se puede continuar por que no hay ningún libro, y/o no hay clientes");
            } else {
                System.out.println("No se puede continuar por que no hay clientes ");
            }
        }
    }

    public void modificarPrestamos() {
        mostrarPrestamos();
        System.out.print("ID del prestamo: ");
        int id = leer.nextInt();
        try {
            while (PJC.findPrestamo(id) == null) {
                System.out.print("No se encontro tal prestamo, intente de nuevo: ");
                id = leer.nextInt();
            }
            Prestamo prestamo = PJC.findPrestamo(id);
            System.out.println(prestamo);
            System.out.println("Que desea modificar | 1) Libro | 2) Cliente | 3) Fecha Prestamo | 4) Fecha Devolucion | Any Key) Cancelar");
            int opcion;
            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                opcion = 5;
            }
            switch (opcion) {
                case 1 -> {
                    LS.mostrarLibros();
                    System.out.print("Nuevo libro ISBN: ");
                    long isbn = leer.nextLong();
                    while (LS.buscarPorID(isbn) == null) {
                        System.out.print("No se encontro tal ISBN, intente de nuevo: ");
                        isbn = leer.nextLong();
                    }
                    prestamo.setLibro(LS.buscarPorID(isbn));
                    PJC.edit(prestamo);
                }
                case 2 -> {
                    CS.mostrarClientes();
                    System.out.print("Nuevo Cliente ID: ");
                    id = leer.nextInt();
                    while (CS.buscarPorID(id) == null) {
                        System.out.print("No se encontro a tal cliente, intente de nuevo: ");
                        id = leer.nextInt();
                    }
                    prestamo.setCliente(CS.buscarPorID(id));
                    PJC.edit(prestamo);
                }
                case 3 -> {
                    System.out.print("Nueva fecha de Prestamo (dd/mm/aaaa): ");
                    DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        String fecha = leer.next();
                        Date fechaPrestamo = formato.parse(fecha);
                        prestamo.setFechaPrestamo(fechaPrestamo);
                        PJC.edit(prestamo);
                    } catch (ParseException ex) {
                        System.out.println("No se puede convertir la fecha");
                    }
                }
                case 4 -> {
                    System.out.print("Nueva fecha de Devolucion (dd/mm/aaaa): ");
                    DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        String fecha = leer.next();
                        Date fechaDevolucion = formato.parse(fecha);
                        while (fechaDevolucion.before(prestamo.getFechaPrestamo())) {
                            System.out.println("La fecha debe ser posterior a la fecha de prestamo");
                            System.out.print("Nueva fecha de Devolucion (dd/mm/aaaa): ");
                            fecha = leer.next();
                            fechaDevolucion = formato.parse(fecha);
                        }
                        prestamo.setFechaDevolucion(fechaDevolucion);
                        PJC.edit(prestamo);
                    } catch (ParseException ex) {
                        System.out.println("No se puede convertir la fecha");
                    }
                }
                default -> {
                    System.out.println("Terminando...");
                }
            }
        } catch (Exception e) {
            System.out.println("Algo paso al modificar el prestamo D:");
        }

    }

    public void mostrarPrestamos() {
        System.out.println("==== Prestamos ====");
        for (Prestamo prestamo : PJC.findPrestamoEntities()) {
            System.out.println(prestamo);
        }
        System.out.println("===================\n");
    }

    public void eliminarPrestamo(int id) {
        try {
            PJC.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.out.println("Algo paso al eliminar un prestamo D:");
        }
    }

    public void devolverLibro() {
        System.out.print("Ingrese el ID del cliente: ");
        int idCliente = leer.nextInt();
        Cliente cliente = CS.buscarPorID(idCliente);
        List<Prestamo> prestamosCliente = new ArrayList();
        for (Prestamo prestamo : PJC.findPrestamoEntities()) {
            if (prestamo.getCliente().getId() == cliente.getId()) {
                prestamosCliente.add(prestamo);
                System.out.println(prestamo);
            }
        }
        if (!prestamosCliente.isEmpty()) {
            System.out.print("Cual desea eliminar (ID prestamo): ");
            int id = leer.nextInt();
            Prestamo prestamo = PJC.findPrestamo(id);
            while (prestamo == null || prestamo.getCliente().getId() != cliente.getId()) {
                System.out.print("El prestamo no le pertece, intente otra vez: ");
                id = leer.nextInt();
                prestamo = PJC.findPrestamo(id);
            }

            if (LS.checkDevolver(prestamo.getLibro(), 1)) {
                LS.devolverLibro(prestamo.getLibro(), 1);
                try {
                    PJC.destroy(id);
                    System.out.println("Libro devuelto");
                } catch (NonexistentEntityException ex) {
                    System.out.println("Algo paso al devolver el libro D:");
                }
            } else {
                System.out.println("No se puede devolver esa cantidad de libros");
            }

        } else {
            System.out.println("El cliente no posee libros prestados");
        }
    }
    
    public List<Prestamo> getPrestamos(){
        return PJC.findPrestamoEntities();
    }
    
    public void menuPrestamos(){
        System.out.println("==== Administrar Prestamos ==== \n1) Mostrar Prestamos | 2) Nuevo Prestamo | 3) Modificar un Prestamo | 4) Salir");
        switch(leer.nextInt()){
            case 1 -> {
                mostrarPrestamos();
            }
            case 2 -> {
                nuevoPrestamo();
            }
            case 3 -> {
                modificarPrestamos();
            }
            default -> {
                System.out.println("Saliendo...");
            }
        }
    }

}
