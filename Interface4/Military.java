public class Military extends DeadlineProject{

    private String password;

    public Military(Manager manager, String title, String objective, long funds, int age, String name, String deadline, String password) {
        super(manager, title, objective, funds, age, name, deadline);
        this.password = password;
    }

    public double getRisk(){
        return this.getNoMembers().size()/password.length() / this.getFunds();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
