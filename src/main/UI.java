package main;

import app.Estudiante;
import app.Plataforma;
import app.Profesor;
import java.util.Scanner;

public class UI {
    
    private Scanner scan;
    private Plataforma plataforma;
    
    public UI(){
        this.scan = new Scanner(System.in);
        this.plataforma = new Plataforma();
    }
    
    
    public int main(){
        System.out.println("Menu principal");
        System.out.println("1. Crear Estudiante");
        System.out.println("2. Crear profesor");
        System.out.println("3. Crear proyecto");
        System.out.println("4. Asignar tutor");
        System.out.println("5. Mostrar proyectos por estudiante");
        System.out.println("6. Salir");
        int option = scan.nextInt();
        
        return option;
    }
    
    
    public void crearEstudiante(){
        scan.nextLine();
        System.out.println("Menú de registro de estudiantes");
        System.out.println("Por favor ingrese el nombre: ");
        String nombre = this.scan.nextLine();
        System.out.println("Por favor ingrese el documento de identidad");
        String id = this.scan.nextLine();
        
        this.plataforma.agregarEstudiante(new Estudiante(nombre, id));
    }
    
    public void crearProfesor(){
        scan.nextLine();
        System.out.println("Menú de registro de profesores");
        System.out.println("Por favor ingrese el nombre: ");
        String nombre = this.scan.nextLine();
        System.out.println("Por favor ingrese el departamento");
        String departamento = this.scan.nextLine();
        Profesor profesor=new Profesor(nombre, departamento);
        this.plataforma.agregarProfesor(profesor);
    }

    public void crearProyecto(){
        scan.nextLine();       
        System.out.println("Menú de registro de proyectos: ");
        System.out.println("Por favor ingrese el titulo del proyecto: ");
        String titulo=this.scan.nextLine();
        System.out.println("Desea ver los profesores disponibles?(0:Si/1:No): ");
        byte opcion=this.scan.nextByte();
        if(opcion==0){
            this.plataforma.mostrarProfesores();
        }
        scan.nextLine();
        System.out.println("Por favor ingrese el nombre del docente del proyecto: ");
        String nombreP= this.scan.nextLine();
        Profesor profesor= plataforma.compararNombre(nombreP);
        if(profesor!=null){
            plataforma.addProyecto(titulo, profesor);
            System.out.println("Se creo exitosamente el proyecto "+titulo+" con el profesor: "+nombreP);
        }
        

    }
    
    public void asignarTutor(){
        
    }
    
    public void mostrarProyectosEstudiante(){

    }
}
