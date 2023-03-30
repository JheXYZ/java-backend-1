/*
    Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
    Luego, crea un método "calcular_aumento" que calcule el aumento salarial de 
    un empleado en función de su edad y salario actual. El aumento salarial debe
    ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de
    30 años.
*/
package pkg6_extras_empleados.entidades;

public class Empleado {
    private String nombre;
    private int edad;
    private float salario;

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void calcular_aumento() {
        if (edad > 30) {
            salario = (float) (salario * 1.1);
        } else {
            salario = (float) (salario * 1.05);
        }
        System.out.println("El nuevo salario será $" +  salario);
    }
}
