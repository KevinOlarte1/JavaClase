package com.kevinolarte.ejercicioios.tema07;
import java.net.JarURLConnection;
import java.util.ArrayList;

import com.kevinolarte.ejercicioios.tema07.Jugador;

public class Equipo {

    private String nombre;

    private ArrayList<Jugador> plantilla;

    private float fondos;


    public Equipo( String Nombre){
        this.plantilla = new ArrayList<>();
        this.nombre  = Nombre;
        this.fondos = 10000.0f;
        this.plantilla.add(new Jugador("Pepe"));
        plantilla.get(0).setEquipo(Nombre);
        
                
    }

    /**
     * Metodo para contratar jugadores, si el precio supera tus fondos salta error o ya esta contratado
     * @param jugador jugador que quieres fichar
     */
    public void contratar(Jugador jugador){
        if (jugador.getPrecio() <= fondos || jugador.getEquipo() == null) {
            fondos -= jugador.getPrecio();
            plantilla.add(jugador);
            jugador.setEquipo(this.nombre);
            // cambiar valor de equipo en jugador
        }
        else
            error();
        
    }

    /**
     * Metodo para vender un jugador de tu propiedad, si sale error es porque no es tuyo.
     * @param jugador
     */
    public void vender(Jugador jugador){
        if (plantilla.contains(jugador)) {
            fondos += jugador.getPrecio();
            plantilla.remove(jugador);
            jugador.setEquipo(null);
        }
        else
            error();
    }


    private void error(){
        System.out.println("Hubo un problema");
    }


    

//#region override
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((plantilla == null) ? 0 : plantilla.hashCode());
        result = prime * result + Float.floatToIntBits(fondos);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Equipo other = (Equipo) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (plantilla == null) {
            if (other.plantilla != null)
                return false;
        } else if (!plantilla.equals(other.plantilla))
            return false;
        if (Float.floatToIntBits(fondos) != Float.floatToIntBits(other.fondos))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Equipo [nombre=" + nombre + ", plantilla=" + plantilla + ", fondos=" + fondos + "]";
    }
    //#endregion override


    //#region getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public float getFondos() {
        return fondos;
    }
    //#endregion

    

    

    
    
}
