
package PatronesCreacionales;
import java.util.Scanner;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args){
        FabricaAbstracta fabrica = null;
        FabricaPersonaje creador = null;
        Personaje personaje;
        Arma arma;
        Curacion curacion;
        Armadura armadura;
        Scanner escaner;
        int opcion = 0, cantidad = 0;
 
    
        entrada = new Scanner(System.in);

        do {
            System.out.println("Ingrese 1 para Humanos o 2 para Orcos o 3 para Hechizeros");
            opcion = entrada.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3);

        switch (opcion) {
            case 1:
                fabrica = new FabricaComponenteHumano();
                creador = new FabricaHumano();
                break;
            case 2:
                fabrica = new FabricaComponenteOrco();
                creador = new FabricaOrco();
                break;
            case 3:
                fabrica = new FabricaComponenteHechizero();
                creador = new FabricaHechizero();
                break;
        }
        
        System.out.println("Ingrese el número de entidades que desea (1-10)");
        cantidad = entrada.nextInt();
        
        System.out.println("Los personajes son: ");
        for(int i=0; i<cantidad; i++){
            personaje =  creador.crearPersonaje();
            System.out.println("Número: "+i+" : "+personaje.dibujar());
            
        }

        arma = fabrica.crearArma();
        curacion = fabrica.crearCuracion();
        armadura = fabrica.crearArmadura();
        
           
        System.out.println(arma.dibujar());      
        System.out.println(curacion.dibujar());
        System.out.println(armadura.dibujar());

        
    }
   
   
   
    
}
