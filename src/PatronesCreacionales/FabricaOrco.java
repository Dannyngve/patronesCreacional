
package PatronesCreacionales;

public class FabricaOrco extends FabricaPersonaje{
    
    
     @Override
    public Personaje factoryMethod() {
        return new Orco("Superior", 12, 8, 2);
    }
    
}
