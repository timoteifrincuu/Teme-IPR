import java.util.ArrayList;

public class Ron  extends ContBancar implements SumaTotala{


    public Ron(String nrCont, float suma) {
        super(nrCont, suma);
    }

    public void transfer(ContBancar contDestinatie, float suma){
        
    }

    @Override
    public float getSumaTotala() {
        return suma;
    }

    
}
