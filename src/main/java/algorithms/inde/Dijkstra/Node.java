package algorithms.inde.Dijkstra;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Erfan Akhavan Rad
 * @created 01/19/2024
 */
@Getter
@Setter
@RequiredArgsConstructor
public class Node<T> implements Comparable<Node<T>> {

    private final T name;
    private Integer distance = Integer.MAX_VALUE;
    private List<Node<T>> shortestPath = new LinkedList<>();
    private Map<Node<T>, Integer> adjacentNodes = new HashMap<>();

    public void addAdjacentNode(Node<T> node, int weight) {
        adjacentNodes.put(node, weight);
    }

    @Override
    public int compareTo(Node<T> o) {
        return 0;
    }


}
