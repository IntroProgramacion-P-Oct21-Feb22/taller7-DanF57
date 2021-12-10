package problema05;

/**
 *
 * @author Daniel
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite = 15;
        int numerador = 1;
        int denominador = 3;
        
        String signo;
        String cadena = "";
        
        do {
            if (denominador == 3 || (denominador == 7)||(denominador == 11)
                    ||(denominador == 15)) {
                signo = "- ";
            } else {
                signo = "+ ";
            }
            
            cadena = String.format("%s%s%d/%d "
                    ,cadena
                    ,signo
                    ,numerador
                    ,denominador);
           
            denominador = denominador + 2;
        }while(denominador < limite);
        
          System.out.printf("1 %s",cadena);
    }
    
}