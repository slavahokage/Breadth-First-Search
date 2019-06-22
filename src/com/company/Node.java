package com.company;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;

    private List<Node> neighbors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
    }

    public void addNeighbour(Node node) {
        if (neighbors == null){
            neighbors = new ArrayList<>();
        }

        this.neighbors.add(node);
    }

    @Override
    public String toString() {
        return name;
    }
}
