package app;


public class Estudiante {
    private String name;
    private String id;

    public Estudiante(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }
    
}
