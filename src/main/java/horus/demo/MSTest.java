package horus.demo;

import horus.domain.ICompositeNode;
import horus.domain.INode;
import horus.domain.MyStructure;

import java.util.ArrayList;
import java.util.List;

public class MSTest {

    public static void main(String[] args) {
/*

        List<INode> nodesTest = new ArrayList<INode>();
        nodesTest.add(new DemoNode("DemoCode1", "DemoRenderer1"));
        nodesTest.add(new DemoNode("DemoCode2", "DemoRenderer2"));
        nodesTest.add(new DemoNode("DemoCode3", "DemoRenderer3"));
        nodesTest.add(new DemoNode("DemoCode4", "DemoRenderer4"));
        nodesTest.add(new DemoNode("DemoCode5", "DemoRenderer5"));
        nodesTest.add(new DemoNode("DemoCode6", "DemoRenderer6"));
        nodesTest.add(new DemoCompositeNode("DemoCompositeNode1", "DemoCompositeRenderer1", new ArrayList<INode>()));
        nodesTest.add(new DemoNode("DemoCode7", "DemoRenderer7"));
        nodesTest.add(new DemoCompositeNode("DemoCompositeNode2", "DemoCompositeRenderer2", new ArrayList<INode>()));

        MyStructure ms = new MyStructure(nodesTest);

        System.out.println(ms.findByCode("xxx"));
        System.out.println(ms.findByCode("DemoCode2"));
        System.out.println(ms.findByRenderer("yyy"));
        System.out.println(ms.findByRenderer("DemoRenderer1"));
        System.out.println(ms.count());

        if( nodesTest.get(1) instanceof ICompositeNode){
            System.out.println(" element jest typu ICompositeNode");
        }
        if( nodesTest.get(6) instanceof ICompositeNode){
            System.out.println(" element jest typu ICompositeNode");
        }
 */

        DemoNode node1 = new DemoNode("nodeCode1", "nodeRenderer1");
        DemoNode node2 = new DemoNode("nodeCode2", "nodeRenderer2");
        DemoNode node3 = new DemoNode("nodeCode3", "nodeRenderer3");
        DemoNode node4 = new DemoNode("nodeCode4", "nodeRenderer4");
        DemoNode node5 = new DemoNode("nodeCode5", "nodeRenderer5");

        DemoCompositeNode compositeNode1 = new DemoCompositeNode("compositeCode1","compositeRenderer1");
        DemoCompositeNode compositeNode2 = new DemoCompositeNode("compositeCode2","compositeRenderer2");
        DemoCompositeNode compositeNode3 = new DemoCompositeNode("compositeCode3","compositeRenderer3");

        compositeNode1.addNode(node1);
        compositeNode1.addNode(node2);
        compositeNode2.addNode(node3);
        compositeNode2.addNode(node4);
        compositeNode3.addNode(node5);
        compositeNode3.addNode(compositeNode1);
        compositeNode3.addNode(compositeNode2);
        // uwaga tu sie zastanowic
        compositeNode3.addNode(compositeNode3);


        MyStructure ms = new MyStructure();
        ms.addNodeToMyStructure(compositeNode3);
        System.out.println("metoda find by code");
        System.out.println(ms.findByCode("nodeCode1"));
        System.out.println(ms.findByCode("compositeCode2"));
        System.out.println("metoda find by renderer");
        System.out.println(ms.findByRenderer("nodeRenderer3"));
        System.out.println(ms.findByRenderer("compositeRenderer1"));
        System.out.println("liczenie ilosci elementow w tablicy");
        System.out.println(ms.count());




    }
}
