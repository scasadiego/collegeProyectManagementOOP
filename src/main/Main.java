package main;

public class Main {
    

   
    public static void main(String[] args) {
     
        UI ui = new UI();
        
        int option=0;
         while(option!=7){
            option = ui.main();
            switch(option){
                case 1:
                    ui.crearEstudiante();
                    break;
                case 2:
                    ui.crearProfesor(); 
                    break;
                case 3:
                    ui.crearProyecto();
                    break;
                case 4:
                    ui.asignarTutor();
                    break;
                case 5:
                    ui.mostrarProyectosEstudiante();
                    break;
                case 6:
                    ui.asignarEstudiantesProyecto();
                    break;
            }
        }
        System.out.println("Hasta luego");
        
        
    }
    
}
