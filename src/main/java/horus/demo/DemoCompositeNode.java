package horus.demo;

import horus.domain.ICompositeNode;
import horus.domain.INode;

import java.util.ArrayList;
import java.util.List;

public class DemoCompositeNode implements ICompositeNode {

    private String demoCompositeNodeCode;
    private String demoCompositeNodeRenderer;
    private List<INode> nodes = new ArrayList<INode>();

    public DemoCompositeNode(String demoCompositeNodeCode, String demoCompositeNodeRenderer) {
        super();
        this.demoCompositeNodeCode = demoCompositeNodeCode;
        this.demoCompositeNodeRenderer = demoCompositeNodeRenderer;
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
        return demoCompositeNodeCode;
    }
    @Override
    public String getRenderer() {
        return demoCompositeNodeRenderer;
    }
}
