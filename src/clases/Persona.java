/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Daniel
 */
public class Persona implements Comparable<Persona>{ 
    
    private String nombre;
    private String apellido;
    private Integer id;
    
    /**
     *
     * @param nombre
     * @param apellido
     * @param id
     * @param estatura
     */
    public Persona(String nombre, String apellido, Integer id, Float estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }
    
    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", id=" + getId() + '}'+"\n";
    }

    /**
     *
     * @param t
     * @return
     */
    @Override
    public int compareTo(Persona t) {
        
        return getNombre().compareTo(t.getNombre());
        
    }
    
}
