package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BreadthFirstSearchService {

    Deque<Node> deque = new ArrayDeque<>();
    List<String> searched = new ArrayList<>();

    public boolean search(Node from, String name) {

        deque.addFirst(from);

        while (!deque.isEmpty()) {
            Node node = deque.removeFirst();
            if (!searched.contains(node.getName())) {
                if (node.getName().equals(name)) {
                    return true;
                } else {
                    if (node.getNeighbors() != null) {
                        for (Node neighbour : node.getNeighbors()) {
                            deque.addLast(neighbour);
                        }
                    }
                    searched.add(node.getName());
                }
            }
        }

        return false;
    }
}
