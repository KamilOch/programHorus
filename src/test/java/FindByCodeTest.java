import horus.demo.DemoCompositeNode;
import horus.demo.DemoNode;
import horus.domain.MyStructure;
import org.junit.Assert;
import org.junit.Test;


public class FindByCodeTest {

    @Test
    public void shouldGiveNullWhenListIsEmpty(){
        // Given
        MyStructure findByCodeTest = new MyStructure();
        // When
        // Then
        Assert.assertNull(findByCodeTest.findByCode("a kuku"));
    }
    @Test
    public void shouldGiveNull(){
        // Given
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        MyStructure findByCodeTest = new MyStructure();
        // When
        findByCodeTest.addNodeToMyStructure(node);
        // Then
        // Assert.assertEquals(Null, findByCodeTest.findByCode("a kuku"));
        Assert.assertNull(findByCodeTest.findByCode("a kuku"));
    }
    @Test
    public void shouldFindNode(){
        // Given
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        DemoNode node1 = new DemoNode("nodeCode1", "nodeRenderer1");
        MyStructure findByCodeTest = new MyStructure();
        // When
        findByCodeTest.addNodeToMyStructure(node);
        // Then
        Assert.assertEquals(node, findByCodeTest.findByCode("nodeCode1"));
    }
    @Test
    public void shouldFindCompositeNodeInFirstLayer(){
        // Given
        DemoCompositeNode compositeNode = new DemoCompositeNode("nodeCC1", "nodeCR1");
        MyStructure findByCodeTest = new MyStructure();
        // When
        findByCodeTest.addNodeToMyStructure(compositeNode);
        // Then
        Assert.assertEquals(compositeNode, findByCodeTest.findByCode("nodeCC1"));
    }

    //UWAGA TO DZIALA
    @Test
    public void shouldFindCompositeNodeInSecondLayer(){
        // Given
        DemoCompositeNode compositeNode = new DemoCompositeNode("nodeCC1", "nodeCR1");
        DemoCompositeNode compositeNode2 = new DemoCompositeNode("nodeCC2", "nodeCR2");
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        MyStructure findByCodeTest = new MyStructure();
        // When
        findByCodeTest.addNodeToMyStructure(compositeNode);
        compositeNode.addNode(compositeNode2);
        compositeNode.addNode(node);
        // Then
        Assert.assertEquals(node, findByCodeTest.findByCode("nodeCode1"));
    }

    //UWAGA TO NIE!!!! DZIALA
    @Test
    public void shouldFindCompositeCompositeNodeInSecondLayer(){
        // Given
        DemoCompositeNode compositeNode = new DemoCompositeNode("nodeCC1", "nodeCR1");
        DemoCompositeNode compositeNode2 = new DemoCompositeNode("nodeCC2", "nodeCR2");
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        MyStructure findByCodeTest = new MyStructure();
        // When
        findByCodeTest.addNodeToMyStructure(compositeNode);
        compositeNode.addNode(compositeNode2);
        compositeNode.addNode(node);
        // Then
        Assert.assertEquals(compositeNode2, findByCodeTest.findByCode("nodeCC2"));
    }

    //Test NOWY!!!
    @Test
    public void shouldFindNodeInTwoElementsList(){
        // Given
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        DemoNode node1 = new DemoNode("nodeCode2", "nodeRenderer2");
        MyStructure findByCodeTest = new MyStructure();
        // When
        findByCodeTest.addNodeToMyStructure(node);
        findByCodeTest.addNodeToMyStructure(node1);
        // Then
        Assert.assertEquals(node, findByCodeTest.findByCode("nodeCode1"));
    }









}
