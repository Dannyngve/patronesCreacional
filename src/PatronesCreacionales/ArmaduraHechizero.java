/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronesCreacionales;


public class ArmaduraHechizero extends Armadura {
    
    public ArmaduraHechizero(int duracion, int peso, int puntosProteccion){
        super(duracion, peso, puntosProteccion);
    }
    
    @Override
    public void proteccionEspecial(){
        System.out.println("Aumenta la protección a daños recibidos por conjuros");
    }
    
    @Override
    public String dibujar() {
        return "Dibujo de un armaduraHechizero";
    }
}
