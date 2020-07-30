package com.learn.algo.graph;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class GraphTest {

    Graph testClass;

    @BeforeEach
    void setUp() {
        testClass = new Graph();
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    @Test
    void main() {
        Node node0 = new Node("0", -1);
        Node node1 = new Node("1", 2);
        Node node2 = new Node("2", 2);
        Node node3 = new Node("3", 5);
        Node node4 = new Node("4", 2);
        Node node5 = new Node("5", 6);
        Node node6 = new Node("6", 4);

        Edge edge1 = new Edge(node0, node1, 7);
        Edge edge2 = new Edge(node0, node2, 5);
        Edge edge5 = new Edge(node2, node6, 6);
        Edge edge6 = new Edge(node2, node3, 5);
        Edge edge7 = new Edge(node3, node4, 6);
        Edge edge8 = new Edge(node6, node3, 3);
        Edge edge4 = new Edge(node1, node6, 2);
        Edge edge3 = new Edge(node1, node5, 6);
        List<Edge> edgeList = new ArrayList<>(8);
        edgeList.add(edge1);
        edgeList.add(edge2);
        edgeList.add(edge3);
        edgeList.add(edge4);
        edgeList.add(edge5);
        edgeList.add(edge6);
        edgeList.add(edge7);
        edgeList.add(edge8);

        testClass.main(edgeList, node0);
    }
}