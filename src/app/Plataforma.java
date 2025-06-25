
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
            System.out.println(profesor.getNombre());
            System.out.println(""+i+"."+" "+profesor.getNombre());
        }
    }
    public Profesor compararNombre(String nombre){
        for(Profesor profesor: this.profesores){
            if(nombre.equalsIgnoreCase(profesor.getNombre())){
                return profesor;
            }
        }
        return null;

    }
    public void addProyecto(String titulo, Profesor profesor){
        Proyecto proyecto= new Proyecto(titulo,profesor);
        this.proyectos.add(proyecto);
    }

    
}
