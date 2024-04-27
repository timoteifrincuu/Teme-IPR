public class Main {
    public static void main(String[] args) {
        
        Train train1 = new Train();
        Train train2 = new Train();

        Wagon wagon1 = new PassengersA();
        Wagon wagon2 = new PassengersB();
        Wagon wagon3 = new Cargo();

        train1.addWagon(wagon1);
        train1.addWagon(wagon3);
        train2.addWagon(wagon2);
        train2.addWagon(wagon3);

        train1.equals(train2);
    }
}
