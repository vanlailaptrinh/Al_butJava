import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public Node bfsUsingQueue(Node initial, int goal) throws Exception {
        Queue<Node> queue = new LinkedList<>();
        HashSet<Node> set = new HashSet<>();

        queue.add(initial);
        set.add(initial);



            while (!queue.isEmpty()) {
                Node current = queue.poll();

                if (current.getState().size() == goal) {
                    return current;
                } else {
                    for (Node node : current.getNeighbours()) {
                        if (!set.contains(node)) {
                            set.add(node);
                            queue.add(node);
                        }
                    }
                }

            }

        throw new Exception("No find solution") ;
    }

}
