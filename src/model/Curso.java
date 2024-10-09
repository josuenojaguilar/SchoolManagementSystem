package model;

public class Curso {
    private Long id;
    private String nombre;
    private String descripcion;
    private Integer numeroCreditos;
    private Integer version;
    
    public Curso() {
    }

    public Curso(Long id, String nombre, String descripcion, Integer numeroCreditos, Integer version) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroCreditos = numeroCreditos;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripción) {
        this.descripcion = descripción;
    }

    public Integer getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(Integer numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", nombre=" + nombre + ", descripción=" + descripcion + ", numeroCreditos="
                + numeroCreditos + ", version=" + version + "]";
    }

    

}
