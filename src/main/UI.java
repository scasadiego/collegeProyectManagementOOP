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
        
        int option = scan.nextInt();
        
        return option;
    }
    
    
    public void crearEstudiante(){
        System.out.println("Menú de registro de estudiantes");
        System.out.println("Por favor ingrese el nombre: ");
        String nombre = this.scan.nextLine();
        
        scan.nextLine();
        
        System.out.println("Por favor ingrese el documento de identidad");
        String id = this.scan.nextLine();
        
        this.plataforma.agregarEstudiante(new Estudiante(nombre, id));
        
    }
    
    public void crearProfesor(){
        System.out.println("Menú de registro de profesores");
        System.out.println("Por favor ingrese el nombre: ");
        String nombre = this.scan.nextLine();
        
        scan.nextLine();
        
        System.out.println("Por favor ingrese el departamento");
        String departamento = this.scan.nextLine();
        
        this.plataforma.agregarProfesor(new Profesor(nombre, departamento));
    }

    public void mostrarProfesores(){
        for(Profesor profesor: this.plataforma.profesores)
    }

    public void crearProyecto(){
        System.out.println("Menú de registro de proyectos: ");
        System.out.println("Por favor ingrese el titulo del proyecto: ");
        String titulo=this.scan.nextLine();

        scan.nextLine();
        System.out.println("Desea ver los profesores disponibles?() ");
        System.out.println("Por favor ingrese el nombre del docente del proyecto: ");
        int ID=this.scan.nextInt();

    }
    
    public void asignarTutor(){
        
    }
    
    public void mostrarProyectosEstudiante(){
        
    }
}
