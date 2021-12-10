package problema01;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Daniel
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //Variables
        String nombrejugador;
        String posicion;
        String cadenaFinal = "";
        String salida = "";
        String cadenaedades = "";
        
        int edad;
        int contadoredad = 0;
        int contadorestatura = 0;
        int sumaedad = 0;
        int acumulador =0;
        
        
        double promedioedad;
        double promedioestatura; 
        double estatura;
        double sumaestatura = 0;
        
        
        
        boolean bandera = true;
        
        do {
            System.out.println("Ingrese nombre completo del jugador: ");
            nombrejugador = entrada.nextLine();
            System.out.println("Ingrese la posición en campo del jugador: ");
            posicion = entrada.nextLine();
            
            System.out.println("Ingrese la edad del jugador: ");
            edad = entrada.nextInt();
            
            System.out.println("Ingrese la estatura del jugador: ");
            estatura = entrada.nextDouble();
            
            contadoredad = contadoredad + 1;
        
            contadorestatura= contadorestatura + 1;
        
            sumaedad = sumaedad + edad;
        
            sumaestatura = sumaestatura + estatura;    
        
            acumulador = acumulador + 1;
        
            cadenaedades = String.format ("%s%d ",cadenaedades,edad);
        
            cadenaFinal = String.format("%s %d) %s -%s-, edad %d, estatura %.2f\n"
                 + "",cadenaFinal,acumulador,nombrejugador,posicion,edad,estatura);
            
            entrada.nextLine(); //Limpieza de bufer
            
            System.out.println("Ingrese si para mostrar reporte: ");
            salida = entrada.nextLine();

                if (salida.equals("s")||salida.equals("si")
                        ||salida.equals("SI")) {
                        bandera = false;
                }

        } while (bandera); // (bandera==true)
        
        promedioedad = sumaedad/contadoredad;
        promedioestatura = sumaestatura/contadorestatura;
        
        System.out.printf("Listado de jugadores\n%s\nListado de Edades %s"
                + "Promedio de edades %s Promedio de estaturas %s\n" 
                , cadenaFinal
                , cadenaedades
                , promedioedad
                , promedioestatura);
        
        
    }
    
}
