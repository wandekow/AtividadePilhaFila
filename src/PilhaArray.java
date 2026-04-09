public class PilhaArray {
    private int[] elementos;
    private int topo;

    public PilhaArray(int tamanho) {
        elementos = new int[tamanho];
        topo = -1;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == elementos.length - 1;
    }

    public void push(int valor) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
            return;
        }
        elementos[++topo] = valor;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return elementos[topo--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return elementos[topo];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.println("Elementos da pilha:");
        for (int i = topo; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }
}