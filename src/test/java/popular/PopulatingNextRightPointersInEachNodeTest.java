package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PopulatingNextRightPointersInEachNodeTest {

    @Test
    public void testCase1() {
        PopulatingNextRightPointersInEachNode.Node root = new PopulatingNextRightPointersInEachNode.Node(1);
        root.left = new PopulatingNextRightPointersInEachNode.Node(2);
        root.right = new PopulatingNextRightPointersInEachNode.Node(3);
        root.left.left = new PopulatingNextRightPointersInEachNode.Node(4);
        root.left.right = new PopulatingNextRightPointersInEachNode.Node(5);
        root.right.left = new PopulatingNextRightPointersInEachNode.Node(6);
        root.right.right = new PopulatingNextRightPointersInEachNode.Node(7);

        PopulatingNextRightPointersInEachNode.Node result = new PopulatingNextRightPointersInEachNode().connect(root);

        assertNotNull(result.left.next);
        assertEquals(result.left.next, result.right);
        assertNotNull(result.left.left.next);
        assertEquals(result.left.left.next, result.left.right);
    }

    @Test
    public void testCase2() {
        PopulatingNextRightPointersInEachNode.Node root = null;
        PopulatingNextRightPointersInEachNode.Node result = new PopulatingNextRightPointersInEachNode().connect(root);
        assertNull(result);
    }
}
