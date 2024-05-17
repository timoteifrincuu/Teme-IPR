public class Person {
    
    private String name;
    private Transmiter transmiter;
 
    public Person(String name) {
        name = name;
        this.transmiter = null;
    }

    //set the initial null transmiter using setTransmiter() method
    public void setTransmiter(Transmiter transmiter){
        this.transmiter = transmiter;
    }
    
    public String send(Person person, Message message){
        return this.name + " said to " + person.getName() + "(" + this.transmiter + "):" + message;
    }

    public String getName(){
        return name;
    }
}