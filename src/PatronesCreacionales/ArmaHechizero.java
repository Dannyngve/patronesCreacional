
package PatronesCreacionales;

public class ArmaHechizero extends Arma{
    
    private int nivel;
    
    public ArmaHechizero(int nivel, int dagno, int duracion) {
        super(dagno, duracion);
        this.nivel = nivel;
    }

    public int getnivel() {
        return nivel;
    }
    
    @Override
    public void atacar(){
        System.out.println("Lanza el hacha");
    }
    
    @Override
    public String dibujar() {
        return "Dibujo de un armaHechizero";
    }
}
