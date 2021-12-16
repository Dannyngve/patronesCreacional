
package PatronesCreacionales;


public class Orco extends Personaje {
    
    
    private String rango;
    
    public Orco(String rango, int fuerza, int resistencia, int velocidad){
        super(fuerza, resistencia, velocidad);
        this.rango = rango;
    }

    
    
    @Override
    public void atacar(){
        System.out.println("Realizar animación de ataque orco");
    }
    
    @Override
    public String dibujar() {
        return "Dibujo de un Orco";
    }
    
    @Override
    public Personaje clonar(){
        Orco clonOrco = new Orco(this.rango, this.fuerza, this.resistencia, this.velocidad);
        return clonOrco;
    }
    
    
}
