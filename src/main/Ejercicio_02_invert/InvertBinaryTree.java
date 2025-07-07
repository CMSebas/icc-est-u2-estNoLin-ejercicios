package main.Ejercicio_02_invert;

import java.util.Stack;

import main.Materia.Models.Node;


public class InvertBinaryTree {
    public Node invertTree(Node root) {
    if (root == null) {
        return null;
    }

    Stack<Node> pila = new Stack<>();
    pila.push(root);

    while (!pila.isEmpty()) {
        Node actual = pila.pop();
        Node temp = actual.getLeft();
        actual.setLeft(actual.getRight());
        actual.setRight(temp);

            if (actual.getLeft() != null) {
            pila.push(actual.getLeft());
        }
        if (actual.getRight() != null) {
            pila.push(actual.getRight());
        }
    }

    return root;
}
    
}
