
public class Euro extends ContBancar implements SumaTotala{
    
    private float dobanda;

    public Euro(String nrCont, float suma) {
        super(nrCont, suma);
        this.dobanda = (float) 0.3;
    }

    public float getDobanda(){

        if(suma > 500 || suma < 0){
            return suma * dobanda;
        }
        return suma;
    }

    @Override
    public float getSumaTotala() {
        return suma * 36000;
    }
    
}
