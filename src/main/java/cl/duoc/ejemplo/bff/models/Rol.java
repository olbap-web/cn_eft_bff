package cl.duoc.ejemplo.bff.models;

public class Rol {
    private int id;
    private String descripcion;
    private String estado;



    // Constructor
    public Rol(int id, String descripcion, String estado ) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;


    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
