import java.util.*;
public class Main {
    private Map<Integer, Map<Integer,Integer>> map = new HashMap<>();
    public Main(int v){
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }

    public void AddEdge(int v1 ,int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1,cost);
    }
    public boolean ContainsEdge(int v1, int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean ContainsVertex(int v){
        return map.containsKey(v);
    }
    public int noofEdge(){
        int sum=0;
        for(int key : map.keySet()){
            sum+= map.keySet().size();
        }
        return sum/2;
    }
    public void removeEdge(int v1 , int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }
    public void removeVertex(int v1){
        for(int key: map.get(v1).keySet()){
            map.get(key).remove(v1);
        }
        map.remove(v1);
    }
    public void display(){
        for(int key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
    public boolean hasPath(int src, int des , HashSet<Integer>visited){
        if(src==des){
            return true;
        }
        visited.add(src);
        for(int nbrs: map.get(src).keySet()){
            if(!visited.contains(nbrs)){
                boolean ans = hasPath(nbrs,des,visited);
                if(ans)
                    return true;
            }
        }
        visited.remove(src);
        return false;
    }
    public void printpath(int src, int des, String ans,HashSet<Integer> visited){
        if(src==des){
            System.out.println(ans+src);
            return;
        }
        visited.add(src);
        for(int nbrs : map.get(src).keySet()){
            if(!visited.contains(nbrs)){
                printpath(nbrs,des,ans+src,visited);
            }
        }
        visited.remove(src);
    }

    public boolean bfs(){
        return false;
    }
    public static void main(String[] args) {
        Main gp = new Main(7);
        gp.AddEdge(1,2,3);
        gp.AddEdge(1,4,2);
        gp.AddEdge(2,3,4);
        gp.AddEdge(3,4,2);
        gp.AddEdge(4,5,1);
        gp.AddEdge(5,6,3);
        gp.AddEdge(5,7,5);
        gp.AddEdge(6,7,6);
        gp.display();

    }
}