public class Nodo {
    private String signo;
    private Nodo padre;
    private Nodo[] hijos = new Nodo[5];
    private boolean raiz;

    public Nodo(String signo, Nodo padre, boolean raiz) {
        this.signo = signo;
        this.padre = padre;
        this.raiz = raiz;
    }

    public Nodo(String signo, Nodo padre) {
        this.signo = signo;
        this.padre = padre;
        this.raiz = false;
    }

    public Nodo(String signo) {
        this.signo = signo;
        this.padre = null;
        this.raiz = true;
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

    public Nodo[] getHijos() {
        return hijos;
    }

    public void setHijos(Nodo[] hijos) {
        this.hijos = hijos;
    }

    public boolean isRaiz() {
        return raiz;
    }

    public void setRaiz(boolean raiz) {
        this.raiz = raiz;
    }

    
}
