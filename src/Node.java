import java.util.ArrayList;
import java.util.List;

public class Node {
   int state ;
   boolean visited;
   List<Node> neighbours;
   Node parent;
   public Node(int state) {
       this.state = state;
       this.neighbours = new ArrayList<>();
       this.parent = null;
   }
   public void addNeighbours(Node n) {
       this.neighbours.add(n);
   }
   public List<Node> getNeighbours() {
       return this.neighbours;
   }
   public int getState() {
       return this.state;
   }

    @Override
    public String toString() {
        return this.getState()+"";
    }
}




