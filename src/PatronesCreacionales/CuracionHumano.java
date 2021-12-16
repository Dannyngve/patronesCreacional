
package PatronesCreacionales;


public class CuracionHumano extends Curacion{
    
    public CuracionHumano(int tiempoAplicacion, int vidaRecuperada){
        super(tiempoAplicacion, vidaRecuperada);
    }
    
    @Override 
    public void aplicacionCura(){
        System.out.println("Realiza animación aplicación cura humano");
    }
    
    @Override
    public String dibujar() {
        return "Dibujo de un curacionHumano";
    }
    
}
