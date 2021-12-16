
package PatronesCreacionales;


public class FabricaComponenteOrco implements FabricaAbstracta {
    @Override
    public  Arma crearArma(){
        return new ArmaOrco(15,15,15);
    }
    
     @Override
    public  Curacion crearCuracion(){
        return new CuracionOrco(15,15);
    }
    
     @Override
    public Armadura crearArmadura(){
        return new ArmaduraOrco(15,15,15);
    }
}
