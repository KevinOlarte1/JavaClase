package com.kevinolarte.ejercicioios.tema07;

import com.kevinolarte.lib.Randoms;

public class Jugador {

    private static int contadorIds = 0;
    
    private static  float DEFAULT = 1;

    private int id;

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
        this.id = ++contadorIds;
        this.nombre = nombre;
        this.portero = portero;
        this.defensa = defensa;
        this.pase = pase;
        this.regate = regate;
        this.tiro = tiro;
        this.estadoForma = estadoForma;
        this.precio = 2000.0f;
        calcularPrecio();
    }

    public Jugador(String nombre){
        this(nombre, DEFAULT, DEFAULT, DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }

    public String getStats(){
        StringBuilder stb = new StringBuilder();
        stb.append(getNombre());
        stb.append("\n");
        
        stb.append("id:");
        stb.append(id);
        stb.append("\n");

        stb.append("portero: ");
        stb.append(portero);
        stb.append("\n");
        
        stb.append("Defensa: ");
        stb.append(defensa);
        stb.append("\n");
        
        stb.append("Pase: ");
        stb.append(pase);
        stb.append("\n");
        
        stb.append("Regate: ");
        stb.append(regate);
        stb.append("\n");
        
        stb.append("Tiro: ");
        stb.append(tiro);
        stb.append("\n");
        
        stb.append("EstadoForma: ");
        stb.append(estadoForma);
        stb.append("\n");

        stb.append("precio: ");
        stb.append(precio);
        
        return stb.toString();
        

    }

    
    
    private void calcularPrecio(){
        float puntosTotal = this.portero + this.defensa + this.pase + this.regate + this.tiro + this.estadoForma;
        if (puntosTotal <= 10) {
            this.precio += 6000;
        }
        else if (puntosTotal <= 20) {
            this.precio += 8000;
        }
        else if (puntosTotal <= 30) {
            this.precio += 10000;
        }
        else if (puntosTotal <= 40) {
            this.precio += 12000;
        }
        else if (puntosTotal <= 50) {
            this.precio += 14000;
        }
        else if (puntosTotal <= 60) {
            this.precio += 16000;
        }
        else if (puntosTotal <= 70) {
            this.precio += 20000;
        }
        else if (puntosTotal <= 80) {
            this.precio += 240000;
        }
        else if (puntosTotal <= 90) {
            this.precio += 28000;
        }
        else if (puntosTotal <= 100) {
            this.precio += 40000;
        }
        

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

    

    

    
    
 //#region Override

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
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
        if (id != other.id)
            return false;
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

    @Override
    public String toString() {
        return "Jugador [id=" + id + ", nombre=" + nombre + ", portero=" + portero + ", defensa=" + defensa + ", pase="
                + pase + ", regate=" + regate + ", tiro=" + tiro + ", estadoForma=" + estadoForma + ", precio=" + precio
                + "]";
    }

    //#endregion Override

    

    //#region getters
    public static int getContadorIds(){
        return getContadorIds();
    }

    public static float getDefault() {
        return DEFAULT;
    }
    
    public int id(){
        return id;
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

    public float getPrecio(){
        return precio;
    }
    //#endregion

    

    
}