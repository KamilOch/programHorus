import horus.demo.DemoCompositeNode;
import horus.demo.DemoNode;
import horus.domain.MyStructure;
import org.junit.Assert;
import org.junit.Test;


public class FindRendererTest {

    @Test
    public void shouldGiveNullWhenListIsEmpty(){
        // Given
        MyStructure findByRendererTest = new MyStructure();
        // When
        // Then
        Assert.assertNull(findByRendererTest.findByRenderer("a kuku"));
    }
    @Test
    public void shouldGiveNullWhenNoElementMatch(){
        // Given
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        DemoNode node2 = new DemoNode("nodeCode2", "nodeRenderer2");
        MyStructure findByRendererTest = new MyStructure();
        // When
        findByRendererTest.addNodeToMyStructure(node);
        findByRendererTest.addNodeToMyStructure(node2);
        // Then
        Assert.assertNull(findByRendererTest.findByRenderer("a kuku"));
    }
    @Test
    public void shouldFindNode(){
        // Given
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        DemoNode node2 = new DemoNode("nodeCode2", "nodeRenderer2");
        MyStructure findByRendererTest = new MyStructure();
        // When
        findByRendererTest.addNodeToMyStructure(node);
        findByRendererTest.addNodeToMyStructure(node2);
        // Then
        Assert.assertEquals(node, findByRendererTest.findByRenderer("nodeRenderer1"));
    }
    @Test
    public void shouldFindCompositeCompositeNodeInSecondLayer(){
        // Given
        DemoCompositeNode compositeNode = new DemoCompositeNode("nodeCC1", "nodeCR1");
        DemoCompositeNode compositeNode2 = new DemoCompositeNode("nodeCC2", "nodeCR2");
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        MyStructure findByRendererTest = new MyStructure();
        // When
        findByRendererTest.addNodeToMyStructure(compositeNode);
        compositeNode.addNode(compositeNode2);
        compositeNode.addNode(node);
        // Then
        Assert.assertEquals(compositeNode2, findByRendererTest.findByRenderer("nodeCR2"));
    }
}
