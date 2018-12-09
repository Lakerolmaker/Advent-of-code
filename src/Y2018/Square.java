package Y2018;

import java.awt.Rectangle;

public class Square {
    private int id = 0;
    private Rectangle rect;
    private int intersectCount = 0;

    public Square(int id, int x, int y, int width, int height) {
        this.id = id;
        this.rect = new Rectangle(x, y, width, height);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rectangle getRect() {
        return rect;
    }

    public void setRect(Rectangle rect) {
        this.rect = rect;
    }

    public int increaseIntersectCount() {
        this.intersectCount++;
        return this.intersectCount;
    }

    public int getIntersectCount() {
        return intersectCount;
    }

    public int intersects(Square claim2) {
        Rectangle intersection = this.getRect().intersection(claim2.getRect());
        if(intersection.height > 0 && intersection.width > 0) {
            return intersection.height * intersection.width;
        }
        else {
            return 0;
        }
    }
}