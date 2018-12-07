/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Arismendys Marte
 */
public class Estudiante {
    private int matricula;
    private String nombre, apellido, carrera;
    
    Estudiante(int matricula, String nombre, String apellido, String carrera){
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
    }

    Estudiante() {}

    public int getMatricula() {return matricula;}
    public void setMatricula(int matricula) {this.matricula = matricula;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public String getCarrera() {return carrera;}
    public void setCarrera(String carrera) {this.carrera = carrera;}
}
