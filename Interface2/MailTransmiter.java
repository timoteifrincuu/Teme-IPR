import java.util.ArrayList;

public class MailTransmiter implements Transmiter{
    
    private ArrayList<Message> buffer;
    private int dim;
    final static String TYPE = "MAIL";

    public MailTransmiter(int dim) {
        this.buffer = new ArrayList<Message>(dim);
        this.dim = dim;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public void store(Message message) {
        while(buffer.size() != dim){
            buffer.add(message);
            if(buffer.size() == dim){
                retrieve();
            }
        }
        buffer.clear();
    }

    @Override
    public void retrieve(Person person) {
        
    }

}
