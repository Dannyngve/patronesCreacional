
package PatronesCreacionales;

public class ArmaduraOrco extends Armadura{
    
    public ArmaduraOrco(int duracion, int peso, int puntosProteccion){
        super(duracion, peso, puntosProteccion);
    }
    
    @Override
    public void proteccionEspecial(){
        System.out.println("Aumenta la protección a daños recibidos por proyectiles");
    }
    
    @Override
    public String dibujar() {
        return "Dibujo de un armaduraOrco";
    }
}
