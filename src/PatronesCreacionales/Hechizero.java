/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronesCreacionales;

class Hechizero extends Personaje{
    
    private String especialidad;
    
    public Hechizero(String especialidad, int fuerza, int resistencia, int velocidad){
        super(fuerza, resistencia, velocidad);
        this.especialidad = especialidad;
    }
    
    @Override
    public void atacar(){
        System.out.println("Realizar animación de ataque hechizero");
    }
    
    @Override
    public String dibujar() {
        return "Dibujo de un Hechizero";
    }
    
    @Override
    public Personaje clonar(){
        Hechizero clonHechizero = new Hechizero(this.especialidad, this.fuerza, this.resistencia, this.velocidad);
        return clonHechizero;
    }
    
    
    
}
