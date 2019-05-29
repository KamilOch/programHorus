import horus.demo.DemoCompositeNode;
import horus.demo.DemoNode;
import horus.domain.MyStructure;
import org.junit.Assert;
import org.junit.Test;

public class CountMethodTest {

    @Test
    public void shouldFindZeroNode (){
        // Given
        MyStructure counterTest = new MyStructure();
        // When
        // Then
        Assert.assertEquals(0, counterTest.count());
    }
    @Test
    public void shouldFindOneNode1N (){
        // Given
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        MyStructure counterTest = new MyStructure();
        // When
        counterTest.addNodeToMyStructure(node);
        // Then
        Assert.assertEquals(1, counterTest.count());
    }
    @Test
    public void shouldFindOneNode1C (){
        // Given
        DemoCompositeNode compositeNode = new DemoCompositeNode("nodeCC1", "nodeCR1");
        MyStructure counterTest = new MyStructure();
        // When
        counterTest.addNodeToMyStructure(compositeNode);
        // Then
        Assert.assertEquals(1, counterTest.count());
    }
    @Test
    public void shouldFindTwoNode1N1N (){
        // Given
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        DemoNode node2 = new DemoNode("nodeCode2", "nodeRenderer2");
        MyStructure counterTest = new MyStructure();
        // When
        counterTest.addNodeToMyStructure(node);
        counterTest.addNodeToMyStructure(node2);
        // Then
        Assert.assertEquals(2, counterTest.count());
    }
    @Test
    public void shouldFindTwoNode1C1N (){
        // Given
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        DemoCompositeNode compositeNode = new DemoCompositeNode("nodeCC1", "nodeCR1");
        MyStructure counterTest = new MyStructure();
        // When
        counterTest.addNodeToMyStructure(node);
        counterTest.addNodeToMyStructure(compositeNode);
        // Then
        Assert.assertEquals(2, counterTest.count());
    }
    @Test
    public void shouldFindTwoNode1C1C (){
        // Given
        DemoCompositeNode compositeNode = new DemoCompositeNode("nodeCC1", "nodeCR1");
        DemoCompositeNode compositeNode2 = new DemoCompositeNode("nodeCC2", "nodeCR2");
        MyStructure counterTest = new MyStructure();
        // When
        counterTest.addNodeToMyStructure(compositeNode);
        counterTest.addNodeToMyStructure(compositeNode2);
        // Then
        Assert.assertEquals(2, counterTest.count());
    }
    @Test
    public void shouldFindThreeNode1N1N1N (){
        // Given
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        DemoNode node2 = new DemoNode("nodeCode2", "nodeRenderer2");
        DemoNode node3 = new DemoNode("nodeCode3", "nodeRenderer3");
        MyStructure counterTest = new MyStructure();
        // When
        counterTest.addNodeToMyStructure(node);
        counterTest.addNodeToMyStructure(node2);
        counterTest.addNodeToMyStructure(node3);
        // Then
        Assert.assertEquals(3, counterTest.count());
    }
    @Test
    public void shouldFindThreeNode1C1C1C (){
        // Given
        DemoCompositeNode compositeNode = new DemoCompositeNode("nodeCC1", "nodeCR1");
        DemoCompositeNode compositeNode2 = new DemoCompositeNode("nodeCC2", "nodeCR2");
        DemoCompositeNode compositeNode3 = new DemoCompositeNode("nodeCC3", "nodeCR3");
        MyStructure counterTest = new MyStructure();
        // When
        counterTest.addNodeToMyStructure(compositeNode);
        counterTest.addNodeToMyStructure(compositeNode2);
        counterTest.addNodeToMyStructure(compositeNode3);
        // Then
        Assert.assertEquals(3, counterTest.count());
    }
    @Test
    public void shouldFindThreeNode1C1C1N (){
        // Given
        DemoCompositeNode compositeNode = new DemoCompositeNode("nodeCC1", "nodeCR1");
        DemoCompositeNode compositeNode2 = new DemoCompositeNode("nodeCC2", "nodeCR2");
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        MyStructure counterTest = new MyStructure();
        // When
        counterTest.addNodeToMyStructure(compositeNode);
        counterTest.addNodeToMyStructure(compositeNode2);
        counterTest.addNodeToMyStructure(node);
        // Then
        Assert.assertEquals(3, counterTest.count());
    }
    @Test
    public void shouldFindThreeNode1CIN1CIN1N (){
        // Given
        DemoCompositeNode compositeNode = new DemoCompositeNode("nodeCC1", "nodeCR1");
        DemoCompositeNode compositeNode2 = new DemoCompositeNode("nodeCC2", "nodeCR2");
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        MyStructure counterTest = new MyStructure();
        // When
        counterTest.addNodeToMyStructure(compositeNode);
        compositeNode.addNode(compositeNode2);
        compositeNode2.addNode(node);
        // Then
        Assert.assertEquals(3, counterTest.count());
    }
    @Test
    public void shouldFindFourNode1CIN1CIN1N1N (){
        // Given
        DemoCompositeNode compositeNode = new DemoCompositeNode("nodeCC1", "nodeCR1");
        DemoCompositeNode compositeNode2 = new DemoCompositeNode("nodeCC2", "nodeCR2");
        DemoNode node = new DemoNode("nodeCode1", "nodeRenderer1");
        DemoNode node2 = new DemoNode("nodeCode2", "nodeRenderer2");
        MyStructure counterTest = new MyStructure();
        // When
        counterTest.addNodeToMyStructure(compositeNode);
        compositeNode.addNode(compositeNode2);
        compositeNode2.addNode(node);
        compositeNode2.addNode(node2);
        // Then
        Assert.assertEquals(4, counterTest.count());
    }















}
