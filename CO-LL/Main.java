public class Main {
    public static void main(String[] args) {
        Produs p1= new Produs("mere",5);
        Produs p2= new Produs("pere", 3.4);
        Produs p3= new Produs("prune", 4.3);

        CosCumparaturi cc = new CosCumparaturi();
        
        cc.adaugaProdus(p1);
        cc.adaugaProdus(p2);
        cc.adaugaProdus(p3);

        System.out.println(cc.calculeazaTotal());
	}
}
