/*
   Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
   la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
   tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
   información debe gestionar esta aplicación:
    • Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
        identificación y su estado civil.
    • Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
        incorporación a la facultad y qué número de despacho tienen asignado.
    • En cuanto a los estudiantes, se requiere almacenar el curso en el que están
        matriculados.
    • Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
        pertenecen (lenguajes, matemáticas, arquitectura, ...).
    • Sobre el personal de servicio, hay que conocer a qué sección están asignados
        (biblioteca, decanato, secretaría, ...).
   El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
   continuación, debe programar las clases definidas en las que, además de los constructores,
   hay que desarrollar los métodos correspondientes a las siguientes operaciones:
    • Cambio del estado civil de una persona.
    • Reasignación de despacho a un empleado.
    • Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
        que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 */
package extras_4_universidad;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalDeServicio;
import Entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JheX
 */
public class Extras_4_universidad {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> Personas = new ArrayList();
        boolean fin = false;

        while (!fin) {
            System.out.println("===Menu de Universidad===\n1)Ingresar una nueva persona \n2)Mostrar todas las personas \n3)Modificar Personas \n4)Fin");
            switch (leer.nextInt()) {
                case 1 -> {
                    System.out.println("===Ingresar nueva Persona=== \n1)Estudiante \n2)Profesor \n3)Empleado de Servicio \n4)Ninguno");
                    int opcion;
                    do {
                        System.out.print("Opcion: ");
                        opcion = leer.nextInt();
                    } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);
                    switch (opcion) {
                        case 1 -> {
                            Estudiante estudiante = new Estudiante();
                            System.out.println("===Nuevo Estudiante===");
                            estudiante.crearPersona();
                            Personas.add(estudiante);
                        }
                        case 2 -> {
                            Profesor profesor = new Profesor();
                            System.out.println("===Nuevo Profesor===");
                            profesor.crearPersona();
                            Personas.add(profesor);
                        }
                        case 3 -> {
                            PersonalDeServicio perServicio = new PersonalDeServicio();
                            System.out.println("===Nuevo Personal de Servicio===");
                            perServicio.crearPersona();
                            Personas.add(perServicio);
                        }

                    }
                }
                case 2 -> {
                    System.out.println("===Personas===");
                    for (Persona persona : Personas) {
                        System.out.println(persona);
                    }
                }
                case 3 -> {
                    System.out.println("===Modificar Personas===");
                    for (Persona persona : Personas) {
                        System.out.println("ID: " + persona.getNumIdentificacion() + (" | Persona: ") + persona.getNombres() + ", " + persona.getApellidos());
                    }
                    System.out.print("Elija la Persona a Modificar: (ID) ");
                    boolean encontrado = false;
                    int id = leer.nextInt();
                    for (Persona persona : Personas) {
                        if (persona.getNumIdentificacion() == id) {
                            if (persona instanceof PersonalDeServicio) {
                                System.out.println("1)Cambiar Estado Civil \n2)Reasignar despacho \n3)Cambiar de Sección");
                                switch (leer.nextInt()) {
                                    case 1 ->
                                        persona.cambioEstadoCivil();
                                    case 2 ->
                                        ((Empleado) persona).cambioDesacho();
                                    case 3 ->
                                        ((PersonalDeServicio) persona).cambiarSeccion();
                                }
                                encontrado = true;
                                break;
                            }
                            if (persona instanceof Profesor) {
                                System.out.println("1)Cambiar Estado Civil \n2)Reasignar despacho \n3)Cambiar de Departamento");
                                switch (leer.nextInt()) {
                                    case 1 ->
                                        persona.cambioEstadoCivil();
                                    case 2 ->
                                        ((Empleado) persona).cambioDesacho();
                                    case 3 ->
                                        ((Profesor) persona).cambioDepartamento();
                                }
                                encontrado = true;
                                break;
                            }
                            if (persona instanceof Estudiante) {
                                System.out.println("1)Cambiar Estado Civil \n2)Nuevo Curso");
                                switch (leer.nextInt()) {
                                    case 1 ->
                                        persona.cambioEstadoCivil();
                                    case 2 ->
                                        ((Estudiante) persona).nuevoCurso();
                                }
                                encontrado = true;
                                break;
                            }
                        }
                    }
                    if (!encontrado){
                        System.out.println("No se encuentra tal persona");
                    }
                }
                case 4 -> fin = true;
            }
        }

    }
}
