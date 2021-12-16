
package PatronesCreacionales;


public abstract class Armadura {
    
    protected int duracion;
    protected int peso;
    protected int puntosProteccion;
    
    public Armadura(int duracion, int peso, int puntosProteccion){
        this.duracion = duracion;
        this.peso = peso;
        this.puntosProteccion = puntosProteccion;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getPeso() {
        return peso;
    }

    public int getPuntosProteccion() {
        return puntosProteccion;
    }
    
    public void equipar(){
        System.out.println("Se pone la armadura");
    }
    
    public abstract void proteccionEspecial();
    public abstract String dibujar();
    
}
