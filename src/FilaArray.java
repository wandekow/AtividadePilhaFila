public class FilaArray {
    private int[] elementos;
    private int inicio;
    private int fim;
    private int quantidade;

    public FilaArray(int tamanho) {
        elementos = new int[tamanho];
        inicio = 0;
        fim = -1;
        quantidade = 0;
    }

    public boolean isEmpty() {
        return quantidade == 0;
    }

    public boolean isFull() {
        return quantidade == elementos.length;
    }

    public void enqueue(int valor) {
        if (isFull()) {
            System.out.println("Fila cheia!");
            return;
        }
        fim++;
        elementos[fim] = valor;
        quantidade++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return -1;
        }
        int valor = elementos[inicio];

        for (int i = 0; i < fim; i++) {
            elementos[i] = elementos[i + 1];
        }

        fim--;
        quantidade--;
        return valor;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return -1;
        }
        return elementos[inicio];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.println("Elementos da fila:");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(elementos[i]);
        }
    }
}