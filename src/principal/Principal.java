/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Principal {
    public static void main(String[] args) {
       
        Persona p1 = new Persona("Paco","Huerga",3);
        Persona p2 = new Persona("Emilio","Sánchez",5);
        Persona p3 = new Persona("Laura","Benítez",1);
        Persona p4 = new Persona("Rocío","Vázquez",4);
        Persona p5 = new Persona("María","Fernández",2);
        
        List<Persona> personas = new ArrayList<Persona>();
        
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        
        Collections.sort(personas); 
        
        for(Persona elemento:personas){ 
            System.out.println(elemento);
        }  
    }
}
