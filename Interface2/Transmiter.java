public interface Transmiter {
    public String getType();
    public void store(Message message);
    public void retrieve(Person person);
} 