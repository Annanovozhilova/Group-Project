package Battle;

public class Square {
    private int x;
    private int y;
    private SquareStatus squareStatus;

    public Square(int x, int y, SquareStatus squareStatus) {
        this.x = x;
        this.y = y;
        this.squareStatus = squareStatus;
    }

    public void setSquareStatus(SquareStatus squareStatus) {
        this.squareStatus = squareStatus;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public SquareStatus getSquareStatus() {
        return squareStatus;
    }

    public <result> char getCharacter() {
        char result = ' ';
        switch (squareStatus) {
            case EMPTY:
                result = 'E';
            case HIT:
                result = 'H';
            case SHIP:
                result = 'S';
            case OCEAN:
                result = 'M';
            case MISSED:
                result = 'M';

        }

        return result;


    }
}
