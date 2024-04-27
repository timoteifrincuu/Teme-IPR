import java.util.ArrayList;

public class Train{

    ArrayList<Wagon> wagons;

    public Train(ArrayList<Wagon> wagons){
        this.wagons = wagons;
    }

    public Train() {
		this.wagons = new ArrayList<Wagon>();
	}

    public boolean addWagon(Wagon w){
        if(wagons.size() <=15)
            return wagons.add(w);
        else
            System.out.println("Maximum wagon capacity reached.");
            return false;
    }

    

}