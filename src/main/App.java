package main;

import utils.StudentValidator;
import main.Materia.Models.Node;

import java.util.LinkedList;
import java.util.List;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolRecorridos;



public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        //PRIMER EJERCICIO
        System.out.println("Ejercicio numero 1");

        ArbolRecorridos arbolRecorridos=new ArbolRecorridos();
        int[] numeros = {5, 3, 7, 2, 4, 6, 8};
        InsertBST insertador = new InsertBST();
        Node raiz1 = null;
        for (int num : numeros) {
            raiz1 = insertador.insert(raiz1, num);
        }
        System.out.println("Input: [5, 3, 7, 2, 4, 6, 8]");
        System.out.println("En In-Order: ");
        arbolRecorridos.inOrderTraversal(raiz1);
        System.out.println("");

        //SEGUNDO EJERCICIO
        ;System.out.println("Ejercicio 2");

        Node root2 = new Node(4);
        root2.setLeft(new Node(2));
        root2.setRight(new Node(7));
        root2.getLeft().setLeft(new Node(1));
        root2.getLeft().setRight(new Node(3));
        root2.getRight().setLeft(new Node(6));
        root2.getRight().setRight(new Node(9));
        System.out.println("Input ingresado en In-Order: ");
        arbolRecorridos.inOrderTraversal(root2);
        InvertBinaryTree inverter = new InvertBinaryTree();
        Node invertido = inverter.invertTree(root2);
        System.out.println(" ");
        System.out.println("Output en In-order ");
        arbolRecorridos.inOrderTraversal(invertido);
        System.out.println("");
        //TERCER EJERCICIO
        System.out.println("Ejercicio 3");
        Node root3 = new Node(4);
        root3.setLeft(new Node(2));
        root3.setRight(new Node(7));
        root3.getLeft().setLeft(new Node(1));
        root3.getLeft().setRight(new Node(3));
        root3.getRight().setLeft(new Node(6));
        root3.getRight().setRight(new Node(9));

        ListLevels listar = new ListLevels();
        List<LinkedList<Node>> niveles = listar.obtenerNiveles(root3);

        
        int nivel = 0;
        for (LinkedList<Node> lista : niveles) {
            System.out.print("Nivel " + nivel + ": ");
            for (Node n : lista) {
                System.out.print(n.getValue() + " ");
            }
            System.out.println();
            nivel++;
        }
        //CUARTO EJERCICIO

        System.out.println("Ejercicio 4");

        Node root4 = new Node(4);
        root4.setLeft(new Node(2));
        root4.setRight(new Node(7));
        root4.getLeft().setLeft(new Node(1));
        root4.getLeft().setRight(new Node(3));
        root4.getLeft().getLeft().setLeft(new Node(8));
        Depth calProf = new Depth();
        int profundidad = calProf.maxDepth(root4);
        System.out.println("Profundidad máxima del árbol: " + profundidad);
    
        
    }


    

    

}
