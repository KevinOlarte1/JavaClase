package com.kevinolarte.ejercicioios.tema06;

import com.kevinolarte.lib.Randoms;

public class Jugador {

    private static  int DEFAULT = 50;

    private  String nombre;

    private  int portero;

    private  int defensa;
    
    private  int pase;
    // regate tiro estadoForma
    private  int regate;

    private  int tiro;

    private  int estadoForma;

    public Jugador(String nombre, int portero, int defensa, int pase, int regate, int tiro, int estadoForma) {
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
                this.portero += Randoms.rnd.nextInt(0, 11);
                break;
            case 1:
                this.defensa += Randoms.rnd.nextInt(0, 11);
                break;
            case 2:
                this.pase += Randoms.rnd.nextInt(0, 11);
                break;
            case 3:
                this.regate += Randoms.rnd.nextInt(0, 11);
                break;
            case 4:
                this.tiro += Randoms.rnd.nextInt(0, 11);
                break;
            case 5:
                this.estadoForma += Randoms.rnd.nextInt(0, 11);
                break;
            default:
                break;
        }
        
    }

    public static int getDefault() {
        return DEFAULT;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPortero() {
        return portero;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getPase() {
        return pase;
    }

    public int getRegate() {
        return regate;
    }

    public int getTiro() {
        return tiro;
    }

    public int getEstadoForma() {
        return estadoForma;
    }
    
    


    
}