package Task1to3;

public class MovableRectangle extends MovablePoint {
    private MovablePoint topleft;
    private MovablePoint bottomright;

    MovableRectangle(int x, int y, int xspeed, int yspeed, MovablePoint topleft, MovablePoint bottomright) {
        super(x, y, xspeed, yspeed);
        this.bottomright = bottomright;
        this.topleft = topleft;
    }

    @Override
    public String toString() {
        return "MovableRectangle: {topLeft" + topleft.toString() + "bottomRight" + bottomright.toString() + "}";
    }

    public void check() {
        this.topleft.xspeed = this.bottomright.xspeed;
        this.topleft.yspeed = this.bottomright.yspeed;
    }
}
