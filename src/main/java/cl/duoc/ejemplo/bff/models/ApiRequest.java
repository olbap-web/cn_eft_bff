package cl.duoc.ejemplo.bff.models;



public class ApiRequest {
    private String id;
    private String nombre;


    // Constructor
    public ApiRequest(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;

    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
  
}

