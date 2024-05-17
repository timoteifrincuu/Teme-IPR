public class OpenSource extends Project{

    private String mailingList;

    public OpenSource(Manager manager, String title, String objective, long funds, int age, String name, String mailingList) {
        super(manager, title, objective, funds, age, name);
        this.mailingList = mailingList;
    }

    @Override
    public double getRisk(){
        return this.getNoMembers().size()/this.getFunds();
    }

    @Override
    public boolean addMember(Member m){
        return this.getNoMembers().add(m);
    }

    public String getMailingList() {
        return mailingList;
    }
}
