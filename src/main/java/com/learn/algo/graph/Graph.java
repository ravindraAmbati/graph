package com.learn.algo.graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Graph {

    private final Comparator<? super Edge> priorityThenDistanceComparator = (e1, e2) -> {
        int priority = Integer.compare(e1.getTargeting().getPriority(), e2.getTargeting().getPriority());
        return (priority == 0) ? Integer.compare(e1.getDistance(), e2.getDistance()) : priority;
    };

    List<Edge> possibleEdges = new ArrayList<>();
    private int totalDistance = 0;

    public void main(List<Edge> edgeList, Node root) {
        System.out.print("(" + root.getName() + ")");
        Node targetNode = visitForward(edgeList, root);
        for (Edge edge : edgeList) {
            edge.getTargeting().setVisited(false);
        }
        visitBackward(edgeList, targetNode);
        print();
    }

    private void print() {
        System.out.println();
        System.out.println(possibleEdges);
    }


    private Node visitForward(List<Edge> edgeList, Node root) {
        List<Edge> neighbours = new ArrayList<>();
        for (Edge edge : edgeList) {
            if (edge.getStarting().equals(root)) {
                if (edge.getTargeting().isNotVisited()) {
                    neighbours.add(edge);
                }
            }
        }
        root.setVisited(true);
        if (neighbours.size() > 1) {
            neighbours.sort(priorityThenDistanceComparator);
        }
        if (neighbours.size() == 0) {
            return root;
        }
        Node targetNode = neighbours.get(0).getTargeting();
        totalDistance = totalDistance + neighbours.get(0).getDistance();
        System.out.print("=={" + totalDistance + "}==>" + "(" + targetNode.getName() + ")");
        possibleEdges.add(new Edge(root, targetNode, totalDistance));
        return visitForward(edgeList, targetNode);
    }

    private void visitBackward(List<Edge> edgeList, Node root) {
        List<Edge> neighbours = new ArrayList<>();
        for (Edge edge : edgeList) {
            if (edge.getTargeting().equals(root)) {
                if (edge.getStarting().isNotVisited()) {
                    neighbours.add(edge);
                }
            }
        }
        root.setVisited(true);
        if (neighbours.size() == 0) {
            visitForward(edgeList, root);
            return;
        } else if (neighbours.size() > 1) {
            neighbours.sort(priorityThenDistanceComparator);
        }
        Node targetNode = neighbours.get(0).getStarting();
        totalDistance = totalDistance + neighbours.get(0).getDistance();
        System.out.print("<=={" + totalDistance + "}==" + "(" + targetNode.getName() + ")");
        possibleEdges.add(new Edge(root, targetNode, totalDistance));
        visitBackward(edgeList, targetNode);
    }

}
