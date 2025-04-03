import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class Arbol {

    // TODO: validacion de los signos en el set

    private ArrayList<Nodo> nodos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Arbol() {}

    public void mapear() {
        Queue<Nodo> cola = new LinkedList<>();
        TreeSet<String> nodosVisitados = new TreeSet<>();

        System.out.println("Ingresa el simbolo del nodo raiz: ");
        String simboloNodoRaiz = scanner.next();
        var nodoRaiz = new Nodo(simboloNodoRaiz);
        cola.offer(nodoRaiz);
        nodos.add(nodoRaiz);
        cola.remove(nodoRaiz);

        System.out.println("Ingresa los nodos conectados a: " + nodoRaiz.getSigno() + " FORMATO: a,b,c,d,... o 'cero'");
        String[] hijos = scanner.next().split(",");
        for (String simboloHijo : hijos) {
            var nodoHijo = new Nodo(simboloHijo, nodoRaiz);
            nodoRaiz.agregarHijo(nodoHijo);
            cola.add(nodoHijo);
            nodos.add(nodoHijo);
        }

        while (cola.peek() != null) {
            var nodoPadre = cola.peek();
            cola.remove();
            System.out.println("Ingresa los nodos conectados a: " + nodoPadre.getSigno() + " FORMATO: a,b,c,d,... o 'cero'");
            String nodosHijosString = scanner.next();
            if (nodosHijosString.equals("cero")) {
                continue;
            }
            String[] nodosHijos = nodosHijosString.split(",");
            for (String simboloHijo : nodosHijos) {
                if (nodosVisitados.contains(simboloHijo)) {
                    System.out.println("Simbolo Duplicado ? DEBUG");
                }
                var nodoHijo = new Nodo(simboloHijo, nodoRaiz);
                nodoRaiz.agregarHijo(nodoHijo);
                cola.add(nodoHijo);
                nodos.add(nodoHijo);
            }
        }
        for (Nodo nodo : nodos) {
            System.out.print(nodo.getSigno() + ", ");
        }
    }
    
    public void dfs() {
        if (nodos.isEmpty()) {
            System.out.println("Arbol esta vacio!!");
        } 
    }
    public void bfs() {
        if (nodos.isEmpty()) {
            System.out.println("Arbol esta vacio!!");
        } 
    }

    public ArrayList<Nodo> getNodos() {
        return nodos;
    }

}
