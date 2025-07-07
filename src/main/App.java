package main;

import utils.StudentValidator;
import main.Materia.Models.Node;
import main.Ejercicio_01_insert.InsertBST;
import main.Materia.Controllers.ArbolRecorridos;



public class App {
    public static void main(String[] args) throws Exception {
        ArbolRecorridos arbolRecorridos=new ArbolRecorridos();
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ


        System.out.println("Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)");
        int[] valoresEj1 = {5, 3, 7, 2, 4, 6, 8};
        InsertBST insertador = new InsertBST();
        Node raizEj1 = null;
        for (int v : valoresEj1) {
            raizEj1 = insertador.insert(raizEj1, v);
        }
        System.out.println("Input: [5, 3, 7, 2, 4, 6, 8]");
        System.out.print("(In-Order): ");
        arbolRecorridos.inOrderTraversal(raizEj1);
        
    }

}
