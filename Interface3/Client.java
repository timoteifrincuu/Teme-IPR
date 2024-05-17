import java.util.ArrayList;

public class Client {
    
    private String nume;
    private String adresa;
    private ArrayList<ContBancar> conturi;

    public Client(String nume, String adresa, ArrayList<ContBancar> conturi) {
        this.nume = nume;
        this.adresa = adresa;
        this.conturi = new ArrayList<ContBancar>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ArrayList<ContBancar> getConturi() {
        return conturi;
    }

    public void setConturi(ArrayList<ContBancar> conturi) {
        this.conturi = conturi;
    }

    public void afisare(){
        
    }

    public void add() {
        if (conturi.size() > 5 && conturi.size() <= 0) {
            throw new IllegalArgumentException("no good");
        }
        conturi.add(null);
    }

}
