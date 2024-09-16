package model;

public class Curso {
    private Long id;
    private String nombre;
    private String descripción;
    private Integer numeroCreditos;
    private Integer version;
    
    public Curso() {
    }

    public Curso(Long id, String nombre, String descripción, Integer numeroCreditos, Integer version) {
        this.id = id;
        this.nombre = nombre;
        this.descripción = descripción;
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

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
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
        return "Curso [id=" + id + ", nombre=" + nombre + ", descripción=" + descripción + ", numeroCreditos="
                + numeroCreditos + ", version=" + version + "]";
    }

    

}
