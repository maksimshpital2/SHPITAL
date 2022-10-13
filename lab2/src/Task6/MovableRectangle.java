package Task6;

public class MovableRectangle {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft.x = x1;
        this.topLeft.y = y1;
        this.bottomRight.x = x2;
        this.bottomRight.y = y2;
        this.topLeft.ySpeed = ySpeed;
        this.bottomRight.ySpeed = ySpeed;
        this.topLeft.xSpeed = xSpeed;
        this.bottomRight.xSpeed = xSpeed;
    }
}
