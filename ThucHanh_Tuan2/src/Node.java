import java.util.ArrayList;
import java.util.List;

public class Node {
    int n;
    List<Node> neighbours;
    List<Integer> state;

    public Node(int n) {
        this.n = n;
        this.state = new ArrayList<>();
        this.neighbours = new ArrayList<>();
    }

    public Node(int n, List<Integer> state) {
        this.n = n;
        this.state = new ArrayList<>(state);
        this.neighbours = new ArrayList<>();
    }

    public List<Integer> getState() {
        return state;
    }

    public boolean isValid(List<Integer> state) {
        if (state.size() == 1) {
            return true;
        }
        if (state.size() > 1) {
            int lastIndex = state.size() - 1;
            int secondLastIndex = state.size() - 2;

            int lastQueenCol = state.get(lastIndex);
            int secondLastQueenCol = state.get(secondLastIndex);

            if (Math.abs(lastQueenCol - secondLastQueenCol) == Math.abs(lastIndex - secondLastIndex)) {
                return false;
            }

            for (int i = 0; i < state.size() - 1; i++) {
                if (lastQueenCol == state.get(i)){
                    return false ;
                }
            }
        }

        return true;
    }

    private List<Integer> place(int x) {
        List<Integer> stateCopy = new ArrayList<>(state);
        stateCopy.add(x);
        if (isValid(stateCopy)) {
            return stateCopy;
        }
        return null;
    }

        public List<Node> getNeighbours() {
        if (state.size() == n) {
            return null;
        }
        for (int i = 0; i < n; i++) {
            List<Integer> neighboursCopy = place(i);
            if (neighboursCopy != null) {
                Node newNode = new Node(n, neighboursCopy);
                neighbours.add(newNode);
            }
        }
        return neighbours;
    }
    public static void main(String[] args) throws Exception {
        Queens queens = new Queens(4);
        queens.dfs();
        queens.bfs();
        System.out.println(queens.goal.getState());
    }
}





