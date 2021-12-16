

package PatronesCreacionales;

public class ArmaHumano extends Arma {

    private int calibre;
    
    public ArmaHumano(int calibre, int dagno, int duracion) {
        super(dagno, duracion);
        this.calibre = calibre;
    }

    
    public int getCalibre() {
        return calibre;
    }
    
    @Override
    public void atacar(){
        System.out.println("Dispara el arma");
    }
    
    @Override
    public String dibujar() {
        return "Dibujo de un armaHumanao";
    }

    
    
}
