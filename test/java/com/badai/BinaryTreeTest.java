package com.badai;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.IllegalArgumentException;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        BinaryTree bt = new BinaryTree();
        assertThrows(IllegalArgumentException.class, () -> bt.add(-1));
        assertNull(bt.getRoot());
        assertDoesNotThrow(() -> bt.add(10));
        assertEquals(bt.getRoot().getValue(), 10);
        bt.add(11);
        bt.add(9);
        assertEquals(bt.getRoot().getRight().getValue(), 11);
        assertEquals(bt.getRoot().getLeft().getValue(), 9);
    }

    @Test
    void searchSmallest() {
        BinaryTree bt = new BinaryTree();
        bt.add(10);
        bt.add(20);
        bt.add(5);
        bt.add(7);
        bt.add(15);
        bt.add(25);
        assertEquals(bt.searchSmallest(2), 7);
        assertEquals(bt.searchSmallest(5), 20);
    }

    @Test
    void testToString() {
        BinaryTree bt = new BinaryTree();
        bt.add(10);
        assertEquals(bt.toString(), "[10]");
        bt.add(12);
        assertEquals(bt.toString(), "[10[12]]");
        bt.add(8);
        assertEquals(bt.toString(), "[10[8][12]]");
        bt.add(7);
        bt.add(9);
        assertEquals(bt.toString(), "[10[8[7][9]][12]]");
        bt.add(13);
        bt.add(14);
        assertEquals(bt.toString(), "[10[8[7][9]][12[13[14]]]]");
    }
}