package horus.domain;

/*
Poniżej przekazujemy zadanie z prośbą o analizę poniższego kodu
i zaimplementowanie metod findByCode, findByRenderer, count
w klasie MyStructure - najchętniej unikając powielania kodu
i umieszczając całą logikę w klasie MyStructure.
Z uwzględnieniem w analizie i implementacji interfejs ICompositeNode!
 */

import java.util.List;

public class MyStructure implements IMyStructure {
    private List<INode> nodes;

    public MyStructure(List<INode> nodes) {
        this.nodes = nodes;
    }

    public INode findByCode(String code) {
        for (INode node : nodes){
            if (code.equals(node.getCode())){
                return node;
            }
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

    public int count() {
        return nodes.size();
    }
}
