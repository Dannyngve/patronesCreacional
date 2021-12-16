
package PatronesCreacionales;


public class Humano extends Personaje {
    
    private String claseSocial;
    
    public Humano(String claseSocial, int fuerza, int resistencia, int velocidad){
        super(fuerza, resistencia, velocidad);
        this.claseSocial = claseSocial;
    }

    public String getClaseSocial() {
        return claseSocial;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
      

    @Override
    public void atacar(){
        System.out.println("Realizar animación de ataque Humano");
    }
    
    @Override
    public String dibujar() {
        return "Dibujo de un Humano";
    }
    
    @Override
    public Personaje clonar(){
        Humano clonHumano = new Humano(this.claseSocial, this.fuerza, this.resistencia, this.velocidad);
        return clonHumano;
    }
    
}
