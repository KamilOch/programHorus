package horus.demo;

import horus.domain.ICompositeNode;
import horus.domain.INode;

import java.util.List;

public class DemoCompositeNode implements ICompositeNode {
    private String demoCode;
    private String demoRenderer;
    private List<INode> nodes;

    public DemoCompositeNode(String demoCode, String demoRenderer, List<INode> nodes) {
        this.demoCode = demoCode;
        this.demoRenderer = demoRenderer;
        this.nodes = nodes;
    }

    public List<INode> getNodes() {
        return nodes;
    }

    public String getCode() {
        return demoCode;
    }

    public String getRenderer() {
        return demoRenderer;
    }
}
