package com.learn.algo.graph;

import java.util.Objects;

public class Node {

    private final int priority;
    private final String name;
    private boolean isVisited;

    public Node(String name, int priority) {
        this.priority = priority;
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    public boolean isNotVisited() {
        return !isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (priority != node.priority) return false;
        if (isVisited != node.isVisited) return false;
        return Objects.equals(name, node.name);
    }

    @Override
    public int hashCode() {
        int result = priority;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isVisited ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Node{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                ", isVisited=" + isVisited +
                '}';
    }
}
