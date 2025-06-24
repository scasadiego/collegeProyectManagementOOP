
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
    
    public void agregarEstudiante(Estudiante estudiante){
        this.integrantes.add(estudiante);
    }
    
    
     
    
    
}
