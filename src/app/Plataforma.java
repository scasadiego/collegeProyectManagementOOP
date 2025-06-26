
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
    public void agregarEstudianteProyecto(Estudiante estudiante, Proyecto proyecto){
        proyecto.agregarEstudiante(estudiante);
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
    public void mostrarProyectos(){
        int i=0;
        for(Proyecto proyecto: this.proyectos){
            i++;
            System.out.println(""+i+"."+" "+proyecto.getTitulo());
        }
    }
    public void mostrarEstudiantes(){
        int i=0;
        for(Estudiante estudiante: this.estudiantes){
            i++;
            System.out.println(""+i+"."+" "+estudiante.getName());
        }
    }

    public Estudiante compararNombreE(String nombre){
        for(Estudiante estudiante: this.estudiantes){
            if(nombre.equalsIgnoreCase(estudiante.getName())){
                return estudiante;
            }
        }
        return null;
    }

    public Proyecto compararNombreP(String nombre){
        for(Proyecto proyecto: this.proyectos){
            if(nombre.equalsIgnoreCase(proyecto.getTitulo())){
                return proyecto;
            }
        }
        return null;
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
    public void mostrarEstudianteProyectos(String nombre){
        for(Proyecto proyecto: this.proyectos){
            if(proyecto.buscarEstudiante(nombre)){
                System.out.println("El estudiante hace parte del proyecto: "+proyecto.getTitulo());
            }
        }
    }

    
}
