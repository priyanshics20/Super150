package Graph_Implementation;
import java.util.*;

public class DSU {
    class Node{
        int vtx;
        Node parent;
        int rank;
    }
    Map<Integer,Node> map=new HashMap<>();
    public void createSet(int v){
        Node node =new Node();
        node.vtx=v;
        node.rank=0;
        node.parent=node;
        map.put(v,node);
    }
    public int find(int v){
        Node nn=map.get(v);
        return find(nn).vtx;
    }
    private Node find(Node nn){
        if(nn.parent==nn)
            return nn;
        return find(nn.parent);
    }
    public void union(int v1, int v2){
        Node n1=map.get(v1);
        Node re1=find(n1););
        Node n2=map.get(v2);
        Node re2=find(n2);
        if(re1.rank==re2.rank){
            re1.parent=re2;
            re2.rank++;
        }
        else if(re1.rank<re2.rank){
            re1.parent=re2;
        }
        else if(re1.rank>re2.rank){
            re2.parent=re1;
        }
    }
}
