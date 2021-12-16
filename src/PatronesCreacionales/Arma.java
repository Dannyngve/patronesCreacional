
package PatronesCreacionales;


public abstract class Arma {
    
    protected int dagno;
    protected int duracion;
    
    public Arma(int daño, int duracion){
        this.dagno = daño;
        this.duracion = duracion;
    }

    public int getDaño() {
        return dagno;
    }

    public int getDuracion() {
        return duracion;
    }

    public abstract void atacar();
    public abstract String dibujar();
    
    
       
}
