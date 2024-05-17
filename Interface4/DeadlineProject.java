public abstract class DeadlineProject extends Project {

    private String deadline;
    public static final int MAXMEMBERS = 15;
   
    public DeadlineProject(Manager manager, String title, String objective, long funds, int age, String name, String deadline) {
        super(manager, title, objective, funds, age, name);
        this.deadline = deadline;
    }

    public String getDeadline() {
        return deadline;
    }

    public static int getMaxmembers() {
        return MAXMEMBERS;
    }

    public boolean addMember(Member m){
        if(this.getNoMembers().size() < MAXMEMBERS){
            this.getNoMembers().add(m);
            return true;
        }
        return false;
    }

    public abstract double getRisk();

}
