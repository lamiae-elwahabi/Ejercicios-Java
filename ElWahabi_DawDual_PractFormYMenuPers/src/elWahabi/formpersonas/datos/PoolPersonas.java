/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elWahabi.formpersonas.datos;

import elWahabi.formpersonas.model.Persona;
import elWahabi.formpersonas.model.Sexo;
import java.util.ArrayList;

/**
 *
 * @author Lamiae
 */
public class PoolPersonas {

    //Instanciar el objeto persona de la clase PoolPersonas
    private static final PoolPersonas instanciaPersona = new PoolPersonas();

    public PoolPersonas() {
      if (instanciaPersona!=null) this.listaPersonas = instanciaPersona.getTodos();
    }
    //Crear arrayList de listaPersona
    private ArrayList<Persona> listaPersonas = new ArrayList<>();
    //Me devuelve todo la lista de personas del array list
    public ArrayList<Persona> getTodos() {
        return listaPersonas;
    }

    //Metodo para añadir persona
     public boolean addPersona(Persona persona) {
        if (listaPersonas.size()<10) {
        listaPersonas.add(persona);
        return true;
        }
        return false;
    }
    //Metodo para buscar a la persona por nombre en el arrayList
    public ArrayList<Persona> buscarPorNombre(String nombre) {
        ArrayList<Persona> resultado = new ArrayList<>();
        for (Persona p :getTodos()) {
            if (p.getNombre().contentEquals(nombre)) {
                resultado.add(p);
              }
        }
        return resultado;
    }
    //Metodo para buscar por Edad
    public ArrayList<Persona> buscarPorEdad(int minEdad,int maxEdad) {
        ArrayList<Persona> resultado = new ArrayList<>();
        
        for (Persona p : getTodos()) {
            if (p.getEdad()>=minEdad&&p.getEdad()<=maxEdad) {
                resultado.add(p);
              }
        }
    return resultado;
    }
     
    ///Metodo para buscar por Sexo
    public ArrayList<Persona> buscarPorSexo(Sexo sexo) {
        ArrayList<Persona> resultado = new ArrayList<>();
        
        for (Persona p : getTodos()) {
            if (p.getSexo().equals(sexo)) {
                 resultado.add(p);
               }
        }
        return resultado;
    }

    
}
