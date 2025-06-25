package main;


public class Main {
    

   
    public static void main(String[] args) {
     
        UI ui = new UI();
        
        int option=0;
         while(option!=6){
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

            }
        }
        
        
    }
    
}
