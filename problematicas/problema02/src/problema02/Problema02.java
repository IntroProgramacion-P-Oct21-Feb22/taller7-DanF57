package problema02;

/**
 *
 * @author Daniel
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int num = 2;
        int aumento = 2;
        int limite = 110;
        
        while (num<=limite){
            System.out.printf("%d ", num);
            aumento = aumento + 2;
            num = aumento + num;
        }
    }
    
}
