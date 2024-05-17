public class Comercial extends DeadlineProject{

    private long marketingFunds;
    private int noTeams;

    public Comercial(Manager manager, String title, String objective, long funds, int age, String name, String deadline, int noTeams) {
        super(manager, title, objective, funds, age, name, deadline);
        this.marketingFunds = this.getFunds()/2;
        this.noTeams = noTeams;
    }

    public long getMarketingFunds() {
        return marketingFunds;
    }

    public int getNoTeams() {
        return noTeams;
    }
    
    public void setNoTeams(int noTeams) {
        if(noTeams < this.getNoMembers().size())
              this.noTeams = noTeams;
    }

    @Override
    public double getRisk(){
        return noTeams*3/getNoMembers().size()/getFunds()-marketingFunds;
    }
    
}
