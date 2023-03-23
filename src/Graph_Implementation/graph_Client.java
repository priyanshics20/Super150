package Graph_Implementation;

import java.util.HashSet;

public class graph_Client {
    public static void main(String[] args) {
        graph g = new graph(7);
        g.AddEdge(1,4,6);
        g.AddEdge(1,2,10);
        g.AddEdge(2,3,7);
        g.AddEdge(3,4,5);
        g.AddEdge(4,5,1);
        g.AddEdge(5,6,4);
        g.AddEdge(7,5,2);
        g.AddEdge(6,7,3);
//        g.display();
//        g.removeVertex(4);
//        g.display();
//        System.out.println(g.hasPath(1,6,new HashSet<>()));
//        g.printAllPath(1,6,new HashSet<>(),"");
        System.out.println(g.BFS(1,6));
        System.out.println(g.DFS(1,6));
    }

}
