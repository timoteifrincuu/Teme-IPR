public class Message {
    
    private Person sender;
    private Person receiver;
    private String message;

    public Message(Person sender, Person receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

}
