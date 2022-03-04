package code.queue;

import code.Node;
import code.SearchProblem;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Gr1Queue implements GenericQueue<Node> {

    private final PriorityQueue<Node> queue;

    public Gr1Queue(SearchProblem problem) {
        queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.pathCost + problem.heuristic_1(node)));
    }

    @Override
    public void add(Node node) {
        queue.add(node);
    }

    @Override
    public Node poll() {
        return queue.poll();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}