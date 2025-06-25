
package app;

import java.util.ArrayList;


public class Proyecto {
    
    private String titulo;
    private Profesor tutor;
    private ArrayList<Estudiante> integrantes;

    public Proyecto(String titulo, Profesor tutor) {
        this.titulo = titulo;
        this.tutor = tutor;
        this.integrantes = new ArrayList();
    }
    public Proyecto(){}
    
    public void agregarEstudiante(Estudiante estudiante){
        this.integrantes.add(estudiante);
    }
    public void agregarProfesor(Profesor profesor){
        this.tutor=profesor;
    }
    
    
     
    
    
}
