package main;

import app.Estudiante;
import app.Plataforma;
import app.Profesor;


public class Main {
    

   
    public static void main(String[] args) {
     
        UI ui = new UI();
        
        
        int option = ui.main();
        
        switch(option){
            case 1:
                ui.crearEstudiante();
                break;
            case 2:
                ui.crearProfesor(); 
        }
        
        
    }
    
}
