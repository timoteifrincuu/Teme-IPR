import java.util.LinkedList;

public class CosCumparaturi {

    //crearea variabilei produse de tip LinkedList<Produs>
    private LinkedList<Produs> produse;

    //daca i dai deja o lista de produse deja create
    public CosCumparaturi(LinkedList<Produs> produse) {
        this.produse = produse;
    }

    //iti creaza o lista de produse daca nu ii dai tu
    public CosCumparaturi() {
        produse = new LinkedList<Produs>();
    }

    public void adaugaProdus(Produs p){
        produse.add(p);
    }

    public double calculeazaTotal(){
        double sum = 0; 
        for(Produs p : produse){
            sum += p.getPret();
        }
        return sum;
    }

}
