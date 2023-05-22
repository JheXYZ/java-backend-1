/*
    • La clase Simulador debe tener un método que genere un listado de alumnos manera
        aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
        manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
    • Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
        rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
        debe retornar la lista de dnis.
    • Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
        objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
        listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
        mismo nombre.
    • Se debe imprimir por pantalla el listado de alumnos.

    • Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
        para cada alumno genera tres votos de manera aleatoria. En este método debemos
        guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
        votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
        Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
        mismo alumno. Utilizar un hashset para resolver esto.
    • Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
        fueron sus 3 votos.
    • Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
        comienza a hacer el recuento de votos.
    • Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
        facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
        los 5 facilitadores y los 5 facilitadores suplentes.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * @author JheX
 */
public class Simulador {

    Scanner leer = new Scanner(System.in);

    public String[] crearNombresApellidos() {
        //180 nombres y 180 apellidos
        String nombres[] = {"Ana Maria", "Laura", "Maria Pilar", "Maria Dolores", "Isabel", "Josefa", "Maria Teresa", "Ana", "Marta", "Cristina", "Maria Angeles", "Lucia", "Maria Isabel", "Maria Jose", "Francisca", "Antonia", "Dolores", "Paula", "Sara", "Elena", "Maria Luisa", "Raquel", "Rosa Maria", "Manuela", "Maria Jesus", "Pilar", "Concepcion", "Mercedes", "Julia", "Beatriz", "Alba Silvia", "Nuria", "Irene", "Patricia", "Rosario", "Juana", "Rocio", "Andrea", "Teresa", "Encarnacion", "Montserrat", "Monica Alicia", "Maria Mar", "Sandra", "Sonia", "Marina", "Susana", "Angela", "Natalia", "Rosa", "Yolanda", "Sofia", "Claudia", "Margarita", "Maria Josefa", "Carla", "Eva", "Inmaculada", "Maria Rosario", "Maria Mercedes", "Ana Isabel", "Noelia", "Esther", "Veronica", "Daniela", "Nerea", "Carolina", "Ines", "Miriam", "Eva Maria", "Martina", "Maria Victoria", "Lorena", "Angeles", "Ana Belen", "Maria Elena", "Maria Rosa", "Victoria", "Maria Concepcion", "Alejandra", "Amparo", "Maria Antonia", "Lidia", "Celia", "Catalina", "Fatima", "Maria Nieves", "Ainhoa", "Olga", "Clara", "Consuelo", "Maria Cristina", "Adriana", "Gloria", "Maria Soledad", "Jose Manuel", "Miguel Angel", "Rafael", "Pablo", "Pedro", "Angel", "Sergio", "Fernando", "Jose Maria", "Jorge", "Luis", "Alberto", "Alvaro", "Juan Carlos", "Adrian", "Diego", "Juan Jose", "Raul", "Ivan", "Ruben", "Juan Antonio", "Oscar", "Enrique", "Ramon", "Andres", "Juan Manuel", "Santiago", "Vicente", "Mario", "Victor", "Joaquin", "Eduardo", "Roberto", "Marcos", "Jaime", "Francisco Jose", "Hugo", "Ignacio", "Jordi", "Alfonso", "Ricardo", "Salvador", "Marc", "Guillermo", "Mohamed", "Gabriel", "Martin", "Gonzalo", "Emilio", "Jose Miguel", "Julio", "Julian", "Tomas", "Nicolas", "Agustin", "Lucas", "Samuel", "Jose Ramon", "Ismael", "Cristian", "Joan", "Aitor", "Felix", "Hector", "Alex", "Iker", "Juan Francisco", "Jose Carlos", "Mateo", "Sebastian", "Cesar", "Josep", "Alfredo", "Mariano", "Rodrigo", "Jose Angel", "Domingo", "Victor Manuel", "Jose Ignacio", "Felipe", "Luis Miguel", "Jose Francisco", "Xavier", "Albert", "Juan Luis"};
        String apellidos[] = {"Rodríguez", "Vargas", "Herrera", "Aguilar", "Vega", "Castillo", "Delgado", "Rojas", "Molina", "Campos", "Vargas", "Soto", "Guzmán", "Pardo", "Reyes", "Barrera", "Peña", "Cabrera", "Montoya", "Ayala", "Santos", "León", "Quintero", "Ríos", "Miranda", "Valencia", "Orozco", "Navarro", "Solís", "Padilla", "Ochoa", "Lara", "Mora", "Cortés", "Pacheco", "Castañeda", "Villarreal", "Zamora", "Serrano", "Fuentes", "Andrade", "Valenzuela", "Escobar", "Olivares", "Esparza", "Landa", "Vargas", "Galindo", "Bustos", "Munguía", "Tovar", "Llamas", "Carranza", "Monroy", "Casas", "Paredes", "Calderón", "Benítez", "Mata", "Salas", "Gallardo", "Rangel", "Beltrán", "Amaya", "Delgadillo", "Villegas", "Ibarra", "De la Cruz", "Patiño", "Alvarado", "Carmona", "Meneses", "Laguna", "Leyva", "Merino", "Becerra", "Zepeda", "Zúñiga", "Valadez", "Báez", "Olvera", "Amador", "Cordova", "Ávila", "Zaragoza", "Ocampo", "Contreras", "Tejeda", "Arce", "Moya", "Lizárraga", "Cota", "Borja", "Granados", "Galván", "Acevedo", "Pérez", "Segovia", "Márquez", "Aragón", "Salinas", "Luevano", "Cárdenas", "Ojeda", "Noriega", "Brito", "Juárez", "Barajas", "Corona", "Valadez", "Berumen", "Burgos", "Figueroa", "Montes", "Elizondo", "Esquivel", "Esparza", "Otero", "Uribe", "Paz", "Ceja", "Padilla", "Haro", "Avendaño", "Galindo", "Delgado", "Jasso", "Macías", "Serna", "Quiróz", "Murguía", "Hurtado", "Segura", "Oliva", "Olivares", "Rosales", "Marín", "Pineda", "Baez", "Bustos", "Saldivar", "Rea", "Aguilera", "Montiel", "Rivas", "Tapia", "Salgado", "Romo", "Luevano", "Jurado", "Corral", "Carbajal", "Belmonte", "Yáñez", "Salmerón", "Chávez", "Ortega", "Ortiz", "Bueno", "Carreón", "Meraz", "Zarate", "Amador", "Gámez", "Montenegro", "Mora", "Guillen", "Solano", "Duarte", "Vilchis", "Castañeda", "Fierro", "Cazares", "Cornejo", "Chávez", "Rico", "Ávalos", "Valenzuela", "Herrera", "Leal"};
        Collections.shuffle(Arrays.asList(nombres));
        Collections.shuffle(Arrays.asList(apellidos));

        String nombresCompletos[] = new String[180];
        for (int i = 0; i < 180; i++) {
            nombresCompletos[i] = nombres[i] + " " + apellidos[i];
        }
        return nombresCompletos;
    }

    public int[] crearDNIs() {
        int DNIs[] = new int[180];
        for (int i = 0; i < 180; i++) {
            DNIs[i] = (int) (Math.random() * 100000000 + 1000000);
        }
        return DNIs;
    }

    public ArrayList<Alumno> crearAlumnos(int[] DNIs, String[] nombres) {
        ArrayList<Alumno> Alumnos = new ArrayList();
        System.out.println("===Elegir alumnos===");
        int i = 0;
        while (true) {
            System.out.println("Nombre y Apellido: " + nombres[i] + ", DNI: " + DNIs[i]);
            System.out.println("¿Elegir? (S/N o F terminar)");
            char opcion = leer.next().toUpperCase().charAt(0);
            if (opcion == 'S') {
                Alumnos.add(new Alumno(nombres[i], DNIs[i]));
            } else if (opcion == 'F') {
                return Alumnos;
            }
            i++;
            System.out.println("Alumnos elegidos: " + Alumnos.size());
        }
    }

    public void mostrarAlumnos(ArrayList<Alumno> Alumnos) {
        System.out.println("Alumnos elegidos: " + Alumnos.size());
        for (var Alumno : Alumnos) {
            System.out.println("-" + Alumno.getNombreCompleto());
        }
        System.out.println("");
    }

    public ArrayList<Voto> votacion(ArrayList<Alumno> Alumnos) {
        ArrayList<Voto> Votos = new ArrayList();
        Random rand = new Random();
        for (Alumno Alumno : Alumnos) {
            Voto voto = new Voto(Alumno);
            for (int i = 0; i < 3; i++) {
                Alumno al;
                do {
                    al = Alumnos.get(rand.nextInt(Alumnos.size()));
                } while (voto.getVotados().contains(al) || al.equals(Alumno));
                al.setVotos(al.getVotos() + 1);
                voto.addVoto(al);
            }
            Votos.add(voto);
        }
        return Votos;
    }
    
    public void mostrarVotos(ArrayList<Voto> Votos){
        System.out.println("===Mostrar Votos===");
        for (Voto voto : Votos) {
            System.out.println(voto.getAlumno().getNombreCompleto() + " ha recibido " + voto.getAlumno().getVotos() + " votos");
            System.out.println("Y ha votado a sus compañeros: " + "\n-" + voto.getVotados().get(0).getNombreCompleto() + "\n-" 
                    + voto.getVotados().get(1).getNombreCompleto() + "\n-" + voto.getVotados().get(2).getNombreCompleto());
            System.out.println("");
        }
    }
    
    public void crearFacilitadores(ArrayList<Alumno> Alumnos){
        Collections.sort(Alumnos, (alumno1, alumno2) -> Integer.compare(alumno2.getVotos(), alumno1.getVotos()));
        System.out.println("Los facilitadores de hoy serán:");
        for (int i = 0; i < 5; i++) {
            System.out.println(" Votos: " + Alumnos.get(i).getVotos() + " | " + Alumnos.get(i).getNombreCompleto());
        }
        System.out.println("Los facilitadores suplentes serán:");
        for (int i = 5; i < 10; i++) {
            System.out.println(" Votos: " + Alumnos.get(i).getVotos() + " | " + Alumnos.get(i).getNombreCompleto());
        }
    }

}
