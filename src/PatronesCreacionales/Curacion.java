/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronesCreacionales;

public abstract class Curacion {
    
    protected int vidaRecuperada;
    protected int tiempoAplicacion;
    
    public Curacion(int tiempoAplicacion, int vidaRecuperada){
        this.tiempoAplicacion = tiempoAplicacion;
        this.vidaRecuperada = vidaRecuperada;
    }

    public int getVidaRecuperada() {
        return vidaRecuperada;
    }

    public int getTiempoAplicacion() {
        return tiempoAplicacion;
    } 
    
    public abstract void aplicacionCura();
    public abstract String dibujar();
}
