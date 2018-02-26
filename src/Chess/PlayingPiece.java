package Chess;

public class PlayingPiece {
    private int x;
    private int y;
    boolean isAlive;

    public PlayingPiece(int x, int y){
        this.x = x;
        this.y=y;
        this.isAlive = true;
    }

    public void move (int newX, int newY ){
        moveIsLeagle(newX,newY);
    }
    public boolean moveIsLeagle(int newX, int newY){
        if ((newX < 8 && newY<8) && (newX>=0 && newY>=0)){
            setX(newX);
            setY(newY);
        }
        return true;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
