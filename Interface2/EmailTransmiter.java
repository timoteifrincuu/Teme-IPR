public class EmailTransmiter implements Transmiter{
    
    final static String TYPE = "EMAIL";

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public void store(Message message) {

    }

    @Override
    public void retrieve(Person person) {

    }
   
}
