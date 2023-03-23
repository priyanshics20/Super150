package Graph_Implementation;

import java.util.*;

//undirected graph
public class graph {
    private HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
    public graph(int v){
        for (int i=1;i<=v;i++) {
            map.put(i, new HashMap<>());
        }
    }
    public void AddEdge(int v1 , int v2 , int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean ContainsEdge(int v1, int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean ContainsVertex(int v1){
        return map.containsKey(v1);
    }
    public int noofEdge(){
        int sum=0;
        for(int key : map.keySet()){
            sum=sum+map.get(key).size();
        }
        return sum/2;
    }
    public void removeEdge(int v1, int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }
    public void removeVertex(int v1){
        for(int key : map.get(v1).keySet()){
            map.get(key).remove(v1);
        }
        map.remove(v1);
    }
    public void display(){
        for(int key: map.keySet()){
            System.out.println(key+" "+ map.get(key));
        }
    }
    public boolean hasPath(int src , int des, HashSet<Integer> visisted){
        if(src == des){
            return true;
        }
        visisted.add(src);
        for(int nbrs: map.get(src).keySet()){
            if(!visisted.contains(nbrs)) {
                boolean ans = hasPath(nbrs, des, visisted);
                if (ans) {
                    return ans;
                }
            }
        }
        visisted.remove(src);
        return false;
    }
    public void printAllPath(int src , int des, HashSet<Integer> visisted, String ans){
        if(src == des){
            System.out.println(ans+src);
            return;
        }
        visisted.add(src);
        for(int nbrs: map.get(src).keySet()){
            if(!visisted.contains(nbrs)) {
                printAllPath(nbrs, des, visisted, ans+src);
            }
        }
        visisted.remove(src);
    }
    //Breadth first search - level order
    public boolean BFS(int src , int des){
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            //1.remove
            int rv = q.poll();
            //2.if visited then ignore
            if(visited.contains(rv)) {
                continue;
            }//3. visited mark
            visited.add(rv);
            //4. self work
            if(rv == des){
                return true;
            }
            //5. add neighbours
            for(int nbrs: map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }
    //Depth first Search
    public boolean DFS(int src , int des){
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        st.push(src);
        while(!st.isEmpty()){
            //1.remove
            int rv = st.pop();
            //2.if visited then ignore
            if(visited.contains(rv)) {
                continue;
            }//3. visited mark
            visited.add(rv);
            //4. self work
            if(rv == des){
                return true;
            }
            //5. add neighbours
            for(int nbrs: map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    st.push(nbrs);
                }
            }
        }
        return false;
    }
    //breadth first traversal
    public void BFT(){
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        for(int src : map.keySet()) {
            if(visited.contains(src))
                continue;
            q.add(src);
            while (!q.isEmpty()) {
                //1.remove
                int rv = q.poll();
                //2.if visited then ignore
                if (visited.contains(rv)) {
                    continue;
                }//3. visited mark
                visited.add(rv);
                //4. self work
                System.out.println(rv + " ");
                //5. add neighbours
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
    }
    //Depth first traversal
    public void DFT(){
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        for(int src: map.keySet()) {
            if(visited.contains(src))
                continue;
            st.push(src);
            while (!st.isEmpty()) {
                //1.remove
                int rv = st.pop();
                //2.if visited then ignore
                if (visited.contains(rv)) {
                    continue;
                }//3. visited mark
                visited.add(rv);
                //4. self work
                System.out.println(rv+" ");
                //5. add neighbours
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        st.push(nbrs);
                    }
                }
            }
        }
    }
}
