package com.badai;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void add(int _value) {
        if (root == null) {
            root = new Node(_value);
            return;
        }

        if (root.getValue() == _value)
            return;

        add(root, _value);
    }

    private void add(Node node, int _value) {
        if (_value < node.getValue()) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(_value));
            } else {
                add(node.getLeft(), _value);
            }
        } else if (_value > node.getValue()) {
            if (node.getRight() == null) {
                node.setRight(new Node(_value));
            } else {
                add(node.getRight(), _value);
            }
        }
    }

    public int searchSmallest(int nth) {
        List<Integer> list = new ArrayList<>();

        return dfs(root, list, nth);
    }

    private int dfs(Node node, List<Integer> list, int nth) {
        if (node == null)
            return -1;

        if (node.getLeft() != null)
            dfs(node.getLeft(), list, nth);
        list.add(node.getValue());
        if (node.getRight() != null)
            dfs(node.getRight(), list, nth);

        if (list.size() >= nth) {
            return list.get(nth - 1);
        } else {
            return -1;
        }
    }

    public String toString() {
        return stringfiy(root, 0);
    }

    private String stringfiy(Node node, int indent) {
        StringBuilder sb = new StringBuilder();

        //sb.append(" ".repeat(indent));
        sb.append("[");
        sb.append(node.getValue());
        //sb.append(",");
        if (node.getLeft() != null)
            sb.append(stringfiy(node.getLeft(), indent + 2));
        //System.out.println("1 - " + sb.toString());
        if (node.getRight() != null)
            sb.append(stringfiy(node.getRight(),indent + 2));
        //System.out.println("2 - " + sb.toString());
        sb.append("]");

        return sb.toString();
    }

}
