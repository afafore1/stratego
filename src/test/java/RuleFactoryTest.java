import junit.framework.TestCase;

/**
 * Created by Ayomitunde on 1/13/2017.
 */
public class RuleFactoryTest extends TestCase {
    public void testIsGameWon() throws Exception {
        Node a = new Node("FLAG", -1);
        Node b = new Node("SPY", -1);
        Node c = new Node("1", 1);
        RuleFactory factory = new RuleFactory();
        assertTrue(factory.isGameWon(b,a));
        assertFalse(factory.isGameWon(a,b));
        assertTrue(factory.isGameWon(c,a));
    }

    public void testGetNodeToRemove() throws Exception {
        Node a = new Node("FLAG", -1);
        Node b = new Node("SPY", -1);
        Node c = new Node("BOMB", -1);
        Node d = new Node("9", -1);
        Node e = new Node("8", -1);

        RuleFactory factory = new RuleFactory();
        for(int i = 0; i < 10; i++)
        {
            int random = (int)(Math.random() * 9 + 1);
            Node node = new Node(String.valueOf(random), random);
            assertTrue(factory.getNodeToRemove(node, a).equals(a));
            assertTrue(factory.getNodeToRemove(node, b).equals(b));
        }
        assertTrue(factory.getNodeToRemove(d, c).equals(d));
        assertTrue(factory.getNodeToRemove(e, c).equals(c));
        assertTrue(factory.getNodeToRemove(b, c).equals(b));

    }

}