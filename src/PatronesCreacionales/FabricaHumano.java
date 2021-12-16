
package PatronesCreacionales;


public class FabricaHumano extends FabricaPersonaje{

    @Override
    public Personaje factoryMethod() {
        return new Humano("Nobleza", 10, 10, 5);
    }

    
   
    
    
    
    
    
    
    
}
