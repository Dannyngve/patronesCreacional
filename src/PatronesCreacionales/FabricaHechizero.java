
package PatronesCreacionales;


public class FabricaHechizero extends FabricaPersonaje {
    
    @Override
    public Personaje factoryMethod() {
        return new Hechizero("Magia negra", 5, 15, 6);
    }
}
