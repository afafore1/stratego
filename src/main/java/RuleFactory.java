import java.awt.*;

/**
 * Created by Ayomitunde on 1/13/2017.
 */

/*
Rules
If Node with smaller number attacks or is attacked by a smaller number, Node with larger number is removed
If Node of same number attack each other, the node attacked is removed
If any Node besides 8 attacks a bomb, node attacking is removed.

 */
public class RuleFactory {

    public boolean isGameWon(Node a, Node b)
    {
        if(b.getName().equals("FLAG"))
        {
            return true;
        }
        return false;
    }

    public Node getNodeToRemove(Node a, Node b)
    {
        if(a.getNumber() == -1 || b.getNumber() == -1)
        {
            // attack bomb
            if(b.getName().equals("BOMB"))
            {
                if(a.getName().equals("8"))
                    return b;
                return a;
            }

            if(b.getName().equals("SPY"))
            {
                return b; // everyone can kill spy
            }

            if(a.getName().equals("SPY"))
            {
                if(b.getNumber() == 1) return b;
                return a;
            }

            if(b.getName().equals("FLAG")) return b;
        }

        if(a.getNumber() <= b.getNumber())
        {
            return b;
        }else
        {
            return a;
        }
    }

//    public boolean canMoveToSpot(Node node, Point point)
//    {
//
//    }
}
