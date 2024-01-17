package com.kevinolarte.ejercicioios.tema07;

import com.kevinolarte.lib.Randoms;

public class Jugador {

    private static  float DEFAULT = 50;

    private  String nombre;

    private  float portero;

    private  float defensa;
    
    private  float pase;
    // regate tiro estadoForma
    private  float regate;

    private  float tiro;

    private  float estadoForma;

    private float precio;

    public Jugador(String nombre, float portero, float defensa, float pase, float regate, float tiro, float estadoForma) {
        this.nombre = nombre;
        this.portero = portero;
        this.defensa = defensa;
        this.pase = pase;
        this.regate = regate;
        this.tiro = tiro;
        this.estadoForma = estadoForma;
    }

    public String getStats(){
        StringBuilder stb = new StringBuilder();
        stb.append(getNombre());
        stb.append("\n");

        stb.append("portero: ");
        stb.append(getPortero());
        stb.append("\n");
        
        stb.append("Defensa: ");
        stb.append(getDefensa());
        stb.append("\n");
        
        stb.append("Pase: ");
        stb.append(getPase());
        stb.append("\n");
        
        stb.append("Regate: ");
        stb.append(getRegate());
        stb.append("\n");
        
        stb.append("Tiro: ");
        stb.append(getTiro());
        stb.append("\n");
        
        stb.append("EstadoForma: ");
        stb.append(getEstadoForma());
        
        return stb.toString();
        

    }

    public Jugador(String nombre){
        this(nombre, DEFAULT, DEFAULT, DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }

    public void entrenar(){
        int alt = Randoms.rnd.nextInt(0, 6);
        switch (alt) {
            case 0:
                this.portero += Randoms.rnd.nextFloat(0, 1);
                break;
            case 1:
                this.defensa += Randoms.rnd.nextFloat(0, 11);
                break;
            case 2:
                this.pase += Randoms.rnd.nextFloat(0, 11);
                break;
            case 3:
                this.regate += Randoms.rnd.nextFloat(0, 11);
                break;
            case 4:
                this.tiro += Randoms.rnd.nextFloat(0, 11);
                break;
            case 5:
                this.estadoForma += Randoms.rnd.nextFloat(0, 11);
                break;
            default:
                break;
        }
        
    }

    

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", portero=" + portero + ", defensa=" + defensa + ", pase=" + pase
                + ", regate=" + regate + ", tiro=" + tiro + ", estadoForma=" + estadoForma + "]";
    }

    

    

    
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + Float.floatToIntBits(portero);
        result = prime * result + Float.floatToIntBits(defensa);
        result = prime * result + Float.floatToIntBits(pase);
        result = prime * result + Float.floatToIntBits(regate);
        result = prime * result + Float.floatToIntBits(tiro);
        result = prime * result + Float.floatToIntBits(estadoForma);
        result = prime * result + Float.floatToIntBits(precio);
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
        Jugador other = (Jugador) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Float.floatToIntBits(portero) != Float.floatToIntBits(other.portero))
            return false;
        if (Float.floatToIntBits(defensa) != Float.floatToIntBits(other.defensa))
            return false;
        if (Float.floatToIntBits(pase) != Float.floatToIntBits(other.pase))
            return false;
        if (Float.floatToIntBits(regate) != Float.floatToIntBits(other.regate))
            return false;
        if (Float.floatToIntBits(tiro) != Float.floatToIntBits(other.tiro))
            return false;
        if (Float.floatToIntBits(estadoForma) != Float.floatToIntBits(other.estadoForma))
            return false;
        if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
            return false;
        return true;
    }

        getClass() != obj.getClass())
            return false;

        Jugador other = (Jugador) obj;
        
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (portero != other.portero)
            return false;
        if (defensa != other.defensa)
            return false;
        if (pase != other.pase)
            return false;
        if (regate != other.regate)
            return false;
        if (tiro != other.tiro)
            return false;
        if (estadoForma != other.estadoForma)
            return false;
        return true;
    }

    //#region getters
    public static float getDefault() {
        return DEFAULT;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPortero() {
        return portero;
    }

    public float getDefensa() {
        return defensa;
    }

    public float getPase() {
        return pase;
    }

    public float getRegate() {
        return regate;
    }

    public float getTiro() {
        return tiro;
    }

    public float getEstadoForma() {
        return estadoForma;
    }
    //#endregion

    //#region setters
    public static void setDEFAULT(float dEFAULT) {
        DEFAULT = dEFAULT;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPortero(float portero) {
        this.portero = portero;
    }

    public void setDefensa(float defensa) {
        this.defensa = defensa;
    }

    public void setPase(float pase) {
        this.pase = pase;
    }

    public void setRegate(float regate) {
        this.regate = regate;
    }

    public void setTiro(float tiro) {
        this.tiro = tiro;
    }

    public void setEstadoForma(float estadoForma) {
        this.estadoForma = estadoForma;
    }
    //#endregion
    


    
}