public class Queens
{
    int n ;
    Node goal ;
    public Queens(int n){
        this.n = n;
    }
    public void bfs() throws Exception {
        BFS bfs = new BFS();
        this.goal = bfs.bfsUsingQueue(new Node(n) ,n) ;

    }
    public void dfs() throws Exception {
        DFS dfs = new DFS();
        this.goal = dfs.dfsUsingStack(new Node(n) ,n) ;
    }


}
