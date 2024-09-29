import java.util.HashSet;
import java.util.Stack;

public class DFS {
  public Node dfsUsingStack(Node initial, int goal) throws Exception {
      Stack<Node> stack = new Stack<>();
      HashSet<Node> visited = new HashSet<>();
      stack.push(initial);
      visited.add(initial);
      while (!stack.isEmpty()) {
          Node current = stack.pop();
          if (current.getState().size() == goal){
              return current;
          }
          else {
              for(Node node : current.getNeighbours()){
                  if (!visited.contains(node)) {
                      stack.push(node);
                      visited.add(node);
                  }
              }
          }
      }
      throw new Exception("No find solution");
  }
}
