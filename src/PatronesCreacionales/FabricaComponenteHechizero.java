
package PatronesCreacionales;


public class FabricaComponenteHechizero implements FabricaAbstracta {
     @Override
    public  Arma crearArma(){
        return new ArmaHechizero(15,15,15);
    }
    
     @Override
    public  Curacion crearCuracion(){
        return new CuracionHechizero(15,15);
    }
    
     @Override
    public Armadura crearArmadura(){
       return new ArmaduraHechizero(15,15,15);
    }
}
