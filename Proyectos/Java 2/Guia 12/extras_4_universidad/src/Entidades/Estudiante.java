/*
    • En cuanto a los estudiantes, se requiere almacenar el curso en el que están
        matriculados.
    • Matriculación de un estudiante en un nuevo curso.
 */
package Entidades;

import java.util.TreeSet;

/**
 * @author JheX
*/
public class Estudiante extends Persona{
    protected TreeSet<String> cursos = new TreeSet();

    public Estudiante() {
    }

    public Estudiante(String curso, String nombres, String apellidos, String estadoCivil, int numIdentificacion) {
        super(nombres, apellidos, estadoCivil, numIdentificacion);
        this.cursos.add(curso);
    }

    public TreeSet<String> getCurso() {
        return cursos;
    }

    public void setCurso(TreeSet<String> curso) {
        this.cursos = curso;
    }
    
    public void nuevoCurso(){
        System.out.println("Curso: ");
        this.cursos.add(leer.next());
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.print("Curso: ");
        cursos.add(leer.next());
    }
    
    @Override
    public String toString() {
        return "Estudiante{" + super.toString() + ", Cursos=" + cursos + '}';
    }
    
}
