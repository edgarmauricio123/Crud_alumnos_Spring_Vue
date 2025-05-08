package Equipo.DMME.alumnos.model;

import jakarta.persistence.Entity;

@Entity
public class AlumnoModel {

    private Long id;
    private  String NumeroControl;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String carrera;
    private String imagenURL;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroControl() {
        return NumeroControl;
    }

    public void setNumeroControl(String NumeroControl) {
        this.NumeroControl = NumeroControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getImagenURL() {
        return imagenURL;
    }

    public void setImagenURL(String imagenURL) {
        this.imagenURL = imagenURL;
    }

}
