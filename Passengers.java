public abstract class Passengers extends Wagon {
    
    private int passengersCapacity;

    public Passengers(int postalPackage, int passengersCapacity) {
        super(postalPackage);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void openDoor(){
        System.out.println("Door opened");
    }

    public void closeDoor(){
        System.out.println("Door closed");
    }
}
