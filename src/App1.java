import java.util.Scanner;

public class App1 {
    public App1() {
        Scanner entrada = new Scanner(System.in);
        int tamanho = 3;
        int vet[] = new int[tamanho];
        vet = escreverValores(entrada, vet, tamanho);
        imprimirValores(vet);
        entrada.close();
    }

    public int[] escreverValores(Scanner entrada, int vet[], int tamanho) {

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Vetor [" + (i) + "] - ");
            vet[i] = entrada.nextInt();
        }

        return vet;
    }

    public void imprimirValores(int vet[]) {
        for (int i = vet.length - 1; i >= 0; i--) {
            System.out.println(vet[i]);
        }
    }

    public static void main(String[] args) {
        new App1();
    }
}