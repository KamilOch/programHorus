package horus.demo;

import horus.domain.INode;

public class DemoNode implements INode {
    private String demoCode;
    private String demoRenderer;

    public DemoNode(String demoCode, String demoRenderer) {
        this.demoCode = demoCode;
        this.demoRenderer = demoRenderer;
    }

    public String getCode() {
        return demoCode;
    }

    public String getRenderer() {
        return demoRenderer;
    }
}
