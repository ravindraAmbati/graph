package com.learn.algo.graph;

import java.util.Objects;

public class Edge {

    private final Node starting;
    private final Node targeting;
    private final int distance;

    public Edge(Node starting, Node targeting, int distance) {
        this.starting = starting;
        this.targeting = targeting;
        this.distance = distance;
    }

    public Node getStarting() {
        return starting;
    }

    public Node getTargeting() {
        return targeting;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Edge edge = (Edge) o;

        if (distance != edge.distance) return false;
        if (!Objects.equals(starting, edge.starting)) return false;
        return Objects.equals(targeting, edge.targeting);
    }

    @Override
    public int hashCode() {
        int result = starting != null ? starting.hashCode() : 0;
        result = 31 * result + (targeting != null ? targeting.hashCode() : 0);
        result = 31 * result + distance;
        return result;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "starting=" + starting +
                ", targeting=" + targeting +
                ", distance=" + distance +
                '}';
    }
}
