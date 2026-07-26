package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class PopulatingNextRightPointersInEachNodeTest {

    @Test
    public void shouldConnectNextPointersAcrossLevels() {
        var root = new PopulatingNextRightPointersInEachNode.Node(1);
        root.left = new PopulatingNextRightPointersInEachNode.Node(2);
        root.right = new PopulatingNextRightPointersInEachNode.Node(3);
        root.left.left = new PopulatingNextRightPointersInEachNode.Node(4);
        root.left.right = new PopulatingNextRightPointersInEachNode.Node(5);
        root.right.left = new PopulatingNextRightPointersInEachNode.Node(6);
        root.right.right = new PopulatingNextRightPointersInEachNode.Node(7);

        PopulatingNextRightPointersInEachNode.Node result = new PopulatingNextRightPointersInEachNode().connect(root);

        assertThat(result.left.next).isNotNull();
        assertThat(result.right).isEqualTo(result.left.next);
        assertThat(result.left.left.next).isNotNull();
        assertThat(result.left.right).isEqualTo(result.left.left.next);
    }

    @Test
    public void shouldReturnNullForEmptyTree() {
        PopulatingNextRightPointersInEachNode.Node root = null;
        PopulatingNextRightPointersInEachNode.Node result = new PopulatingNextRightPointersInEachNode().connect(root);
        assertThat(result).isNull();
    }
}
