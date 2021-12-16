
package PatronesCreacionales;


public abstract class Personaje {
    
    protected int fuerza;
    protected int resistencia;
    protected int velocidad;
    
    public Personaje(int fuerza, int resistencia, int velocidad){
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
    }
    
    public String  caminar(){
        return "Camina hacia adelante";
    }
    
    public abstract void atacar();
    public abstract String dibujar();
    public abstract Personaje clonar();
     
}
