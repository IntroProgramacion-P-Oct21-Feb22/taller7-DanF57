package problema03;

/**
 *
 * @author Daniel
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int num = 2;
        int aumento = 1;
        int limite = 37;
        
        do {
            System.out.printf("%d ", num);
            aumento = aumento + 2;
            num = aumento + num;
        
        } while (num<=limite);
    }
    
}
