package horus.domain;

/*
Poniżej przekazujemy zadanie z prośbą o analizę poniższego kodu
i zaimplementowanie metod findByCode, findByRenderer, count
w klasie MyStructure - najchętniej unikając powielania kodu
i umieszczając całą logikę w klasie MyStructure.
Z uwzględnieniem w analizie i implementacji interfejs ICompositeNode!
 */

import java.util.ArrayList;
import java.util.List;

public class MyStructure implements IMyStructure {
    private List<INode> nodes;

    public void addNodeToMyStructure (INode in){
        nodes.add(in);
    }

    public MyStructure() {
        nodes = new ArrayList<INode>();
    }
    @Override
    public INode findByCode(String code) {
        INode myNode = null;
        for (INode node : nodes){
            myNode= findCode(node, code);
            }
        return myNode;
    }
    @Override
    public INode findByRenderer(String renderer) {
        INode myNode = null;
        for (INode node : nodes){
            myNode = findRenderer(node, renderer);
            }
        return myNode;
    }


    @Override
    public int count() {
        int counter=0;
        for(INode node : nodes){
            if (!(node instanceof ICompositeNode)){
                counter++;
            } else {
                counter += totalCounter(node);
            }
        }
        return counter;
    }

    private int totalCounter(INode inputNode) {
        int counter=1;

        if (inputNode instanceof ICompositeNode) {
            for (INode node :((ICompositeNode) inputNode).getNodes()){
                counter +=totalCounter(node);
            }
        }
        return counter;
    }

    private INode findCode(INode inputNode, String code) {
        INode myNode = null;
        if (code.equals(inputNode.getCode())) {
            myNode =  inputNode;
        } else if (inputNode instanceof ICompositeNode) {
            for (INode node : ((ICompositeNode) inputNode).getNodes()) {
                myNode =  findCode(node, code);
            }
        }
        return myNode;
    }
    private INode findRenderer(INode inputNode, String code) {
        INode myNode = null;
        if (code.equals(inputNode.getRenderer())) {
            myNode =  inputNode;
        } else if (inputNode instanceof ICompositeNode) {
            for (INode node : ((ICompositeNode) inputNode).getNodes()) {
                myNode = findRenderer(node, code);
            }
        }
        return myNode;
    }
}
