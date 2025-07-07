package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import main.Materia.Models.Node;

public class ListLevels {
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> response = new ArrayList<>();

        if (root == null) {
            return response;
        }

        Queue<Node> cola = new LinkedList<>();
        cola.offer(root);

        while (!cola.isEmpty()) {
            int tamañoNivel = cola.size();
            List<Node> nivel = new ArrayList<>();

            for (int i = 0; i < tamañoNivel; i++) {
                Node actual = cola.poll();
                nivel.add(actual);

                if (actual.getLeft() != null) {
                    cola.offer(actual.getLeft());
                }
                if (actual.getRight() != null) {
                    cola.offer(actual.getRight());
                }
            }

            response.add(nivel);
        }

        return response;
    }
}
