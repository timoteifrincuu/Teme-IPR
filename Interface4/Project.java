import java.util.HashSet;

public abstract class Project implements Risky{
    
    private Manager manager;
    private String title;
    private String objective;
    private long funds;
    private HashSet<Member> noMembers;

    public Project(Manager manager, String title, String objective, long funds, int age, String name) {
        this.manager = new Manager(age, name);
        this.title = title;
        this.objective = objective;
        this.funds = funds;
        this.noMembers = new HashSet<Member>();
    }

    public Manager getManager() {
        return manager;
    }

    public String getTitle() {
        return title;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public long getFunds() {
        return funds;
    }

    public void setFunds(long funds) {
        this.funds = funds;
    }

    public HashSet<Member> getNoMembers(){
        return noMembers;
    }

    public abstract boolean addMember(Member m);
    public abstract double getRisk();

}
