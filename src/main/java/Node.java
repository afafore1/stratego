import javax.swing.text.Position;
import java.awt.*;

/**
 * Created by Ayomitunde on 1/13/2017.
 */
public class Node {
    private String name;
    private int number;
    private Point point;

    public Node(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    public String getName()
    {
        return this.name;
    }

    public int getNumber()
    {
        return this.number;
    }

    public void setPoint(int x, int y)
    {
        this.point = new Point(x, y);
    }

    public Point getPoint()
    {
        return this.point;
    }

}
