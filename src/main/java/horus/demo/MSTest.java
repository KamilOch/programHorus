package horus.demo;

import horus.domain.ICompositeNode;
import horus.domain.INode;
import horus.domain.MyStructure;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MSTest {

    public static void main(String[] args) {

        DemoNode node1 = new DemoNode("nodeCode1", "nodeRenderer1");
        MyStructure ms1 = new MyStructure();
        ms1.addNodeToMyStructure(node1);


        System.out.println("wynik z metody counter");
        System.out.println(ms1.count());

        System.out.println("Szukanie po code ma zwrócić null!  Wynik metody :" +ms1.findByCode("Akka"));
        System.out.println("Szukanie po code ma zwrócić node1!  Wynik metody :" +ms1.findByCode("nodeCode1"));
        System.out.println();
        System.out.println("Szukanie po renderer ma zwrócić null!  Wynik metody :" +ms1.findByRenderer("Akka"));
        System.out.println("Szukanie po renderer ma zwrócić node1!  Wynik metody :" +ms1.findByRenderer("nodeRenderer1"));
        System.out.println();
        DemoCompositeNode compositeNode1 = new DemoCompositeNode("nodeCC1", "nodeCR1");
        MyStructure ms2 = new MyStructure();
        ms2.addNodeToMyStructure(compositeNode1);


        System.out.println("wynik z metody counter");
        System.out.println(ms2.count());

        System.out.println("Szukanie po code ma zwrócić null!  Wynik metody :" +ms2.findByCode("Akka"));
        System.out.println("Szukanie po code ma zwrócić composite node1!  Wynik metody :" +ms2.findByCode("nodeCC1"));
        System.out.println();
        System.out.println("Szukanie po renderer ma zwrócić null!  Wynik metody :" +ms2.findByRenderer("Akka"));
        System.out.println("Szukanie po renderer ma zwrócić composite node1!  Wynik metody :" +ms2.findByRenderer("nodeCR1"));
        System.out.println();

        DemoNode node2 = new DemoNode("nodeCode2", "nodeRenderer2");
        DemoNode node3 = new DemoNode("nodeCode3", "nodeRenderer3");
        DemoCompositeNode compositeNode2 = new DemoCompositeNode("nodeCC2", "nodeCR2");
        compositeNode2.addNode(node2);
        compositeNode2.addNode(node3);
        MyStructure ms3 = new MyStructure();
        ms3.addNodeToMyStructure(compositeNode2);


        System.out.println("wynik z metody counter");
        System.out.println(ms3.count());

        System.out.println("Szukanie po code ma zwrócić null!  Wynik metody :" +ms3.findByCode("Akka"));
        System.out.println("Szukanie po code ma zwrócić node3!  Wynik metody :" +ms3.findByCode("nodeCode2"));
        System.out.println("Szukanie po code ma zwrócić composite node2!  Wynik metody :" +ms3.findByCode("nodeCC2"));
        System.out.println();
        System.out.println("Szukanie po renderer ma zwrócić null!  Wynik metody :" +ms3.findByRenderer("Akka"));
        System.out.println("Szukanie po renderer ma zwrócić node3!  Wynik metody :" +ms3.findByRenderer("nodeRenderer2"));
        System.out.println("Szukanie po renderer ma zwrócić composite node2!  Wynik metody :" +ms3.findByRenderer("nodeCR2"));
        System.out.println();

        DemoNode node4 = new DemoNode("nodeCode4", "nodeRenderer4");
        DemoNode node5 = new DemoNode("nodeCode5", "nodeRenderer5");
        DemoCompositeNode compositeNode3 = new DemoCompositeNode("nodeCC3", "nodeCR3");
        DemoCompositeNode compositeNode4 = new DemoCompositeNode("nodeCC4", "nodeCR4");
        DemoCompositeNode compositeNode5 = new DemoCompositeNode("nodeCC5", "nodeCR5");
        compositeNode4.addNode(node4);
        compositeNode5.addNode(node5);
        compositeNode3.addNode(compositeNode4);
        compositeNode3.addNode(compositeNode5);
        MyStructure ms4 = new MyStructure();
        ms4.addNodeToMyStructure(compositeNode3);


        System.out.println("wynik z metody counter");
        System.out.println(ms4.count());

        System.out.println("Szukanie po code ma zwrócić null!  Wynik metody :" +ms4.findByCode("Akka"));
        System.out.println("Szukanie po code ma zwrócić node5!  Wynik metody :" +ms4.findByCode("nodeCode5"));
        System.out.println("Szukanie po code ma zwrócić composite node3!  Wynik metody :" +ms4.findByCode("nodeCC3"));
        System.out.println("Szukanie po code ma zwrócić composite node2!  Wynik metody :" +ms4.findByCode("nodeCC5"));
        System.out.println();
        System.out.println("Szukanie po renderer ma zwrócić null!  Wynik metody :" +ms4.findByRenderer("Akka"));
        System.out.println("Szukanie po renderer ma zwrócić node5!  Wynik metody :" +ms4.findByRenderer("nodeRenderer5"));
        System.out.println("Szukanie po renderer ma zwrócić composite node3!  Wynik metody :" +ms4.findByRenderer("nodeCR3"));
        System.out.println("Szukanie po renderer ma zwrócić composite node2!  Wynik metody :" +ms4.findByRenderer("nodeCR5"));
        System.out.println();
    }
}
