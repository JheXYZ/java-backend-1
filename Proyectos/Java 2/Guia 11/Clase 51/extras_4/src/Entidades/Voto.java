/*
    Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
    un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó. 
*/
package Entidades;

import java.util.ArrayList;

/**
 * @author JheX
*/
public class Voto {
    private Alumno alumno;
    private ArrayList<Alumno> votados = new ArrayList();

    public Voto() {
    }

    public Voto(Alumno alumno) {
        this.alumno = alumno;
    }

    public Voto(Alumno alumno, ArrayList<Alumno> votados) {
        this.alumno = alumno;
        this.votados = votados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(ArrayList<Alumno> votados) {
        this.votados = votados;
    }
    
    public void addVoto(Alumno alumno){
        this.votados.add(alumno);
    }
    
}
