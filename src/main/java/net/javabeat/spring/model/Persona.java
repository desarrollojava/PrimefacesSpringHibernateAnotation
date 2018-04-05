package net.javabeat.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {

    private int idPersona;
    private String nombres;
    private String apellidos;
    private String direccionDomicilio;

    /**
     * Get Customer Id
     *
     * @return int - Customer Id
     */
    @Id
    @Column(name = "idPersona", unique = true, nullable = false)
      public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    
    @Column(name = "nombres", unique = true, nullable = false)
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    
    @Column(name = "apellidos", unique = true, nullable = false)
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    @Column(name = "direccionDomicilio", unique = true, nullable = false)
    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

   

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccionDomicilio=" + direccionDomicilio + '}';
    }

  
}
