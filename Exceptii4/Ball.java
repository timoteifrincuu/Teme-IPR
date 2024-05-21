public class Ball{

    private int X, Y;

    public Ball(int X, int Y) {
        X = X;
        Y = Y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void shoot() throws OutException, GoalException, CornerException{

        if(X==0 || X==100){
            if(Y>=0 && Y<=30)
                throw new GoalException("Goal!!!");
        else
            throw new CornerException("Corner!!!");
        }
        else if(Y == 0 || Y == 50)
            throw new OutException("Out!!!");
    }
}
