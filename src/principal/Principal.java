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
       
        Persona individuo1 = new Persona("Paco","Huerga",3, 0);
        Persona p2 = new Persona("Emilio","Sánchez",5, 0);
        Persona p3 = new Persona("Laura","Benítez",1, 0);
        Persona p4 = new Persona("Rocío","Vázquez",4, 0);
        Persona p5 = new Persona("María","Fernández",2, 0);
        
        List<Persona> personas = new ArrayList<Persona>();
        
        introducirDatos(personas, individuo1, p2, p3, p4, p5);
        
        Collections.sort(personas); 
        
        for(Persona elemento:personas){ 
            System.out.println(elemento);
        }  
    }

    private static void introducirDatos(List<Persona> personas, Persona individuo1, Persona p2, Persona p3, Persona p4, Persona p5) {
        personas.add(individuo1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
    }
}
