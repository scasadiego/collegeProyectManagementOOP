
package app;

import java.util.ArrayList;


public class Plataforma {
    
    private ArrayList<Estudiante> estudiantes = new ArrayList();
    private ArrayList<Profesor> profesores = new ArrayList();
    private ArrayList<Proyecto> proyectos = new ArrayList();
       
    public Plataforma (){
    
    }
    
    public void agregarEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }
    
    public void agregarProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }
    
     public void agregarProyecto(Proyecto proyecto){
        this.proyectos.add(proyecto);
    }
    public void mostrarProfesores(){
        int i=0;
        for(Profesor profesor: this.profesores){
            i++;
            System.out.println(""+i+"."+" "+profesor.getNombre());
        }
    }
    
}
