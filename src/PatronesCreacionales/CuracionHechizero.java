
package PatronesCreacionales;


public  class CuracionHechizero extends Curacion{
    
   public CuracionHechizero(int tiempoAplicacion, int vidaRecuperada){
        super(tiempoAplicacion, vidaRecuperada);
    }
    
    @Override 
    public void aplicacionCura(){
        System.out.println("Realiza animación aplicación cura hechizero");
    }
    
    @Override
    public String dibujar() {
        return "Dibujo de un curacionHechizero";
    }
        
}
