package com.kevinolarte.ejercicioios.tema07;
import java.net.JarURLConnection;
import java.util.ArrayList;

import com.kevinolarte.ejercicioios.tema07.Jugador;

public class Equipo {
    
    private int post;

    private String nombre;

    private Jugador[] plantilla;

    private float fondos;


    public Equipo( String Nombre){
        Jugador j1 = new Jugador("Pedro");
        this.nombre  = Nombre;
        this.fondos = 10000.0f;
        this.post = 1;
        
    }

    /**
     * Metodo para contratar jugadores, si el precio supera tus fondos salta error
     * @param jugador jugador que quieres fichar
     */
    public void contratar(Jugador jugador){
        if (jugador.getPrecio() <= fondos) {
            fondos -= jugador.getPrecio();
            plantilla[post] = jugador;
            post++;
        }
        else
            error();
        
    }

    /**
     * Metodo para vender un jugador de tu propiedad, si sale error es porque no es tuyo.
     * @param jugador
     */
    public void vender(Jugador jugador){
        if (encontrar(jugador)) {
            post--;
            fondos += jugador.getPrecio();
            plantilla[post] = null;
            
        }
        else
            error();
    }

    private boolean encontrar(Jugador j){
        for (int i = 0; i < plantilla.length; i++) {
            if (plantilla[i] == j) 
                return true;
        }
        return false;
    }

    private void error(){
        System.out.println("Hubo un problema");
    }


    @Override
    public String toString() {
        return "Equipo [nombre=" + nombre + ", plantilla=" + plantilla + ", fondos=" + fondos + "]";
    }

     //#region getters
    public String getNombre() {
        return nombre;
    }

    public Jugador[] getPlantilla() {
        return plantilla;
    }

    public float getFondos() {
        return fondos;
    }
    //#endregion

    

    
    
}
