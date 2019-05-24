package horus.demo;

import horus.domain.ICompositeNode;
import horus.domain.INode;

import java.util.List;

public class DemoNode implements ICompositeNode {
    private String demoCode;
    private String demoRenderer;

    public DemoNode(String demoCode, String demoRenderer) {
        super();
        this.demoCode = demoCode;
        this.demoRenderer = demoRenderer;
    }

    @Override
    public String getCode() {
        return demoCode;
    }
    @Override
    public String getRenderer() {
        return demoRenderer;
    }
    @Override
    public List<INode> getNodes() {
        return null;
    }
}
