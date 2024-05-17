import java.util.HashSet;

public class Banca {
    
    private HashSet<Client> clienti;
    private String codBanca;

    public Banca(HashSet<Client> clienti, String codBanca) {
        this.clienti = new HashSet<Client>();
        this.codBanca = codBanca;
    }

    public HashSet<Client> getClienti() {
        return clienti;
    }

    public void setClienti(HashSet<Client> clienti) {
        this.clienti = clienti;
    }

    public String getCodBanca() {
        return codBanca;
    }

    public void setCodBanca(String codBanca) {
        this.codBanca = codBanca;
    }

    public void add(Client c){
        clienti.add(c);
    }

    public String afisareClient(String nume){
        return Client.getAdresa() +"\n"+ SumaTotala.getSumaTotala();
    }   
}
