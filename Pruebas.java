public class Pruebas {
    //#region Ejercicio de prueba args
    /**
     * Ejercicio de prueba que coje los parametros añadidos con la ejecición de archivo
     * @param args parametros tipo String de un array.
     */
    public static void args(String[] args){
        if (args.length < 2) {
            System.out.println("ERROR: El ingreso debe tener al menos 2 numeros");
            System.exit(1);
        }
        for (String string : args) {
            if (!contieneCaracteres(string)){
                System.out.println("ERROR: El ingreso debe ser tipo numerico");
                System.exit(1); 
            } 
                
        }

        int [] numeros = new int[args.length - 1];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }
        for (int i : numeros) {
            if (i > Integer.parseInt(args[args.length - 1])) {
                System.out.println(i);
            }
        }
    }

    /**
     * Metodo para comprobar si tiene algun caracter que no sea un numero.
     * @param palabra palabra a comprobar si tiene caracter
     * @return devuelve un booleano comprobando si tiene algun caracter.
     */
    public static boolean contieneCaracteres(String palabra){
        boolean verdad = palabra.matches("\\d+");
        return verdad;
    }

    //#endregion
}
