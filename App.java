
//import com.kevinolarte.ejercicioios.tema06.*;
import com.kevinolarte.ejercicioios.tema07.*;


public class App {

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Pepe");
        Jugador jugador2 = new Jugador("Albaro", 5,10,7,1,2,9);
        Equipo eq1 = new Equipo("Br");
        jugador1.entrenar();
        System.out.println(" ");
        System.out.println(jugador1.toString());
        System.out.println("--------------");
        System.out.println(jugador2.toString());

        System.out.println(eq1.toString());

        eq1.contratar(jugador1);
        System.out.println("-------------");
        System.out.println(eq1.toString());

        
       

        


    }

    
}