import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class Arbol {

    // TODO: validacion de los signos en el set
    
    private ArrayList<Nodo> nodos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Arbol() {
        
    }

    public void mapear() {
        Queue<Nodo> cola = new LinkedList<>();
        TreeSet<String> nodosVisitados = new TreeSet<>();

        System.out.println("Ingresa el simbolo del nodo raiz: ");
        String simboloNodoRaiz = scanner.next();
        var nodoRaiz = new Nodo(simboloNodoRaiz);
        cola.offer(nodoRaiz);
        nodosVisitados.add(nodoRaiz.getSigno());
        cola.remove(nodoRaiz);

        System.out.println("Ingresa los nodos conectados a: " + nodoRaiz.getSigno() + " FORMATO: a,b,c,d,... o 'cero'");
        String[] hijos = scanner.next().split(",");
        for (String simboloHijo : hijos) {
            var nodoHijo = new Nodo(simboloHijo, nodoRaiz);
            nodoRaiz.agregarHijo(nodoHijo);
            cola.add(nodoHijo);
            nodosVisitados.add(nodoHijo.getSigno());
        }
        while (cola.peek() != null) {
            var nodoPadre = cola.peek();
        }
    }


    public void mapear2 () {
        System.out.println("Signo del nodo");      
        var nodoPadre = new Nodo(scanner.next(), null);
        nodos.add(nodoPadre);
        System.out.println("Numero de hijos del nodo: " + nodoPadre.getSigno());
        var numHijos = Integer.parseInt(scanner.next());
        for (int i = 1; i <+ numHijos; i++) {
            System.out.println("Ingrese signo del hijo numero #" + i);
                var signoHijo = scanner.next();
                Nodo nodoHijo = new Nodo(signoHijo, nodoPadre);
                nodoPadre.agregarHijo(nodoHijo);
        }
        for (int i = 0; i < nodoPadre.getHijos().size(); i++) {
            
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

    public void setNodos(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }
}
