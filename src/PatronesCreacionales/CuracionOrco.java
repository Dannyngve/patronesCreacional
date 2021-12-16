/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronesCreacionales;


public class CuracionOrco extends Curacion {
    
    public CuracionOrco(int tiempoAplicacion, int vidaRecuperada){
        super(tiempoAplicacion, vidaRecuperada);
    }
    
    @Override 
    public void aplicacionCura(){
        System.out.println("Realiza animación aplicación cura orco");
    }
    
    @Override
    public String dibujar() {
        return "Dibujo de un curacionOrco";
    }
    
}
