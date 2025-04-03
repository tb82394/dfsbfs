import java.util.ArrayList;

public class Nodo {
    private String signo;
    private Nodo padre;
    private ArrayList<Nodo> hijos = new ArrayList<>();

    public Nodo(String signo, Nodo padre) {
        this.signo = signo;
        this.padre = padre;
       
    }

    public Nodo(String signo) {
        this.signo = signo;
        this.padre = null;
    }

    public void agregarHijo (Nodo nodoHijo) {
        hijos.add(nodoHijo);
    }

    public void imprimirHijos () {
        for (Nodo nodo : hijos) {
            System.out.println("Signo: " + nodo.getSigno());
            System.out.println("Padre: " + nodo.getPadre().getSigno());
        }
    }
    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public ArrayList<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }
    
}
