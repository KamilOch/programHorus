package horus.demo;

import horus.domain.ICompositeNode;
import horus.domain.INode;

import java.util.ArrayList;
import java.util.List;

public class DemoCompositeNode implements ICompositeNode {

    private String demoCompositeCode;
    private String demoCompositeRenderer;
    private List<INode> nodes;

    public DemoCompositeNode(String demoCompositeCode, String demoCompositeRenderer) {
        this.demoCompositeCode = demoCompositeCode;
        this.demoCompositeRenderer = demoCompositeRenderer;
        nodes = new ArrayList<INode>();
    }


    public void addNode(INode in){
        nodes.add(in);
    }

    @Override
    public List<INode> getNodes() {
        return nodes;
    }

    @Override
    public String getCode() {
        return demoCompositeCode;
    }

    @Override
    public String getRenderer() {
        return demoCompositeRenderer;
    }
}
