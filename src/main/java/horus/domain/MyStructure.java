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

    public INode findByCode(String code) {
        for(INode node : nodes){
               return find(node, code);
            }
        return null;
    }

    public INode findByRenderer(String renderer) {
        for (INode node : nodes){
            if (renderer.equals(node.getRenderer())){
                return node;
            }
        }
        return null;
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

    private INode find (INode inputNode, String code) {
        INode childNode = null;
        if (code.equals(inputNode.getCode())) {
            childNode = inputNode;
        } else if (inputNode instanceof ICompositeNode) {
            for (INode node : ((ICompositeNode) inputNode).getNodes()) {
                childNode = find(node, code);
            }
        }
        return childNode;
    }




}
