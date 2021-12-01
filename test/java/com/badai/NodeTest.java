package com.badai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void getValue() {
        Node n = new Node(1);
        assertEquals(1, n.getValue());
    }

    @Test
    void getLeft() {
        Node n = new Node(1);
        assertNull(n.getLeft());
    }

    @Test
    void getRight() {
        Node n = new Node(1);
        assertNull(n.getRight());
    }

    @Test
    void setValue() {
        Node n = new Node(1);
        n.setValue(2);
        assertEquals(n.getValue(), 2);
    }

    @Test
    void setLeft() {
        Node n = new Node(1);
        n.setLeft(new Node(2));
        assertEquals(1, n.getValue());
        assertEquals(2, n.getLeft().getValue());
        assertNull(n.getRight());
    }

    @Test
    void setRight() {
        Node n = new Node(1);
        n.setRight(new Node(2));
        assertEquals(1, n.getValue());
        assertEquals(2, n.getRight().getValue());
        assertNull(n.getLeft());
    }
}