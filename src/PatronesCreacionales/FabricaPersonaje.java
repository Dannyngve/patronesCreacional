
package PatronesCreacionales;

public abstract class FabricaPersonaje {
    
    public Personaje crearPersonaje(){
        return factoryMethod();
    }   
    
    public abstract Personaje factoryMethod();
}
