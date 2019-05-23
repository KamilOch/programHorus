package horus.demo;

import horus.domain.INode;
import horus.domain.MyStructure;

import java.util.ArrayList;
import java.util.List;

public class MSTest {

    public static void main(String[] args) {

        List<INode> nodesTest = new ArrayList<INode>();
        nodesTest.add(new DemoNode("DemoCode1", "DemoRenderer1"));
        nodesTest.add(new DemoNode("DemoCode2", "DemoRenderer2"));
        nodesTest.add(new DemoNode("DemoCode3", "DemoRenderer3"));
        nodesTest.add(new DemoNode("DemoCode4", "DemoRenderer4"));
        nodesTest.add(new DemoNode("DemoCode5", "DemoRenderer5"));
        nodesTest.add(new DemoNode("DemoCode6", "DemoRenderer6"));

        MyStructure ms = new MyStructure(nodesTest);

        System.out.println(ms.findByCode("xxx"));
        System.out.println(ms.findByCode("DemoCode2"));
        System.out.println(ms.findByRenderer("yyy"));
        System.out.println(ms.findByRenderer("DemoRenderer1"));
        System.out.println(ms.count());

    }
}
