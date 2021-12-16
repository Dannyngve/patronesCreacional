
package PatronesCreacionales;
 
public class ArmaOrco extends Arma{
   
    private int filo;
    
    public ArmaOrco(int filo, int dagno, int duracion) {
        super(dagno, duracion);
        this.filo = filo;
    }

    public int getfilo() {
        return filo;
    }
    
    @Override
    public void atacar(){
        System.out.println("Lanza el hacha");
    }
    
    @Override
    public String dibujar() {
        return "Dibujo de un armaOrco";
    }
}
