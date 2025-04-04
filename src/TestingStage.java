public class TestingStage {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        Nodo nodoRaiz = new Nodo("A");
        Nodo nodoBHijoA = new Nodo("B", nodoRaiz);        
        Nodo nodoCHijoB = new Nodo("C", nodoBHijoA);
        Nodo nodoDHijoB = new Nodo("D", nodoBHijoA);
        Nodo nodoEHijoA = new Nodo("E", nodoRaiz);
        Nodo nodoFHijoE = new Nodo("F", nodoEHijoA);
        Nodo nodoGHijoE = new Nodo("G", nodoEHijoA);
        
        arbol.nodos.add(nodoRaiz);
        arbol.nodos.add(nodoBHijoA);
        arbol.nodos.add(nodoCHijoB);
        arbol.nodos.add(nodoDHijoB);
        arbol.nodos.add(nodoEHijoA);
        arbol.nodos.add(nodoFHijoE);
        arbol.nodos.add(nodoGHijoE);

        nodoRaiz.agregarHijo(nodoBHijoA);
        nodoRaiz.agregarHijo(nodoEHijoA);
        nodoBHijoA.agregarHijo(nodoCHijoB);
        nodoBHijoA.agregarHijo(nodoDHijoB);
        nodoEHijoA.agregarHijo(nodoFHijoE);
        nodoEHijoA.agregarHijo(nodoFHijoE);
        
        arbol.bfs_v();
    }
    
}
