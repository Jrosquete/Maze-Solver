import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PriorityQueue {
    private List<Vertex> queue;

    public PriorityQueue() {
        this.queue = new ArrayList<>();
    }

    public void add(Vertex vertex) {
        queue.add(vertex);
        queue.sort(Comparator.comparingInt(v -> v.displayWeight()));
    }

    public Vertex poll() {
        return queue.isEmpty() ? null : queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
