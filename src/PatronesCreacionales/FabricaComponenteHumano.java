
package PatronesCreacionales;


public class FabricaComponenteHumano implements FabricaAbstracta {
    @Override
    public  Arma crearArma(){
        return new ArmaHumano(15,15,15);
    }
    
     @Override
    public  Curacion crearCuracion(){
        return new CuracionHumano(15,15);
    }
    
     @Override
    public Armadura crearArmadura(){
        return new ArmaduraHumano(15,15,15);
    }

}
