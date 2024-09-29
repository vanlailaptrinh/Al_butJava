import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public void bfsUsingQueue(Node initial, int goal) {
        Queue<Node> queue = new LinkedList<>();
        HashSet<Node> set = new HashSet<>() ;

        queue.add(initial);
        set.add(initial);

        while (!queue.isEmpty()){
            Node current = queue.poll();
            if (current.getState() == goal){
                String s = "" ;
                while(current != initial ){
                    s = current.getState() + " " + s ;
                    current = current.parent ;


                }
                System.out.println(initial.getState() + " " + s);
                return ;
            }
            else{
                for (Node node : current.getNeighbours()){
                    if(!set.contains(node)){
                        set.add(node);
                        queue.add(node);
                        node.parent = current;
                    }
                }
            }

        }

    }
}
