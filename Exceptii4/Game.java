public class Game {
    
    private String teamOneName, teamTwoName;
    private int noGoals1, noGoals2;
    private int totalOuts, totalCorners;

    public Game(String teamOneName, String teamTwoName) {
        this.teamOneName = teamOneName;
        this.teamTwoName = teamTwoName;
        this.noGoals1 = 0;
        this.noGoals2 = 0;
        this.totalOuts = 0;
        this.totalCorners = 0;
    }


    
    public String getTeamOneName() {
        return teamOneName;
    }



    public String getTeamTwoName() {
        return teamTwoName;
    }



    public int getNoGoals1() {
        return noGoals1;
    }



    public int getNoGoals2() {
        return noGoals2;
    }



    public int getTotalOuts() {
        return totalOuts;
    }



    public int getTotalCorners() {
        return totalCorners;
    }



    public String toString(){
        return  "Teams: " + this.teamOneName + " vs " + this.teamTwoName + "\n" +
         " Goals: " + this.noGoals1 + " - " + this.noGoals2 + "\n" + 
         "Total outs: " + this.totalOuts + "\n" +
         "Total corners: " + this.totalCorners;
    }


    public void simulate(){
        Ball b = new Ball(50, 25);
        for(int i=0; i<1000;i++){

        }

    }
}
