package com.badai;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int _value) {
        this.setValue(_value);
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setValue(int value) {
        if (value < 0)
            throw new IllegalArgumentException("BinaryTree only accepts positive value");

        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
