import java.util.HashSet;
import java.util.Stack;

public class DFS {
    public void dfsUsingStack(Node initial, int goal ) {
        Stack<Node> stack = new Stack<>();
        HashSet<Node> visited = new HashSet<>();
        stack.push(initial);
        visited.add(initial);
        while(!stack.isEmpty()) {
            Node current = stack.pop();
            if(current.getState() == goal) {
                String s = "" ;
                while (current != initial) {
                    s = " " + current.getState() + " " + s;
                    current = current.parent;
                }
                System.out.println(current.getState() + " " + s);
                return;
            }
            else{
                for(Node node : current.getNeighbours()){
                    if(!visited.contains(node)) {
                        stack.push(node);
                        visited.add(node);
                        node.parent = current;
                    }
                }
            }
        }


    }
}
