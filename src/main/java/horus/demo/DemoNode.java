package horus.demo;

import horus.domain.ICompositeNode;
import horus.domain.INode;

import java.util.List;

public class DemoNode implements INode {
    private String demoCode;
    private String demoRenderer;

    public DemoNode(String demoCode, String demoRenderer) {
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

}
