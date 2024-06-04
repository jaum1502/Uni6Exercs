import java.util.Scanner;

public class App3 {
    public App3() {
        Scanner entrada = new Scanner(System.in);
        int tamanho = 5;
        double[] vet = new double[tamanho];
        vet = escreverValores(entrada, vet, tamanho);
        metodoPorcentagem(vet, tamanho);
        imprimirValores(vet, tamanho);
    }

    public void imprimirValores(double vet[], int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vet[i]);
        }
    }

    public double[] escreverValores(Scanner entrada, double vet[], int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor " + (i + 1) + ": ");
            vet[i] = entrada.nextFloat();
        }
        return vet;
    }

    public double[] metodoPorcentagem(double vet[], int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            if (vet[i] % 2 == 0) {
                vet[i] = vet[i] + (vet[i] * 0.02);
            } else {
                vet[i] = vet[i] + (vet[i] * 0.05);
            }
        }
        return vet;
    }

    public static void main(String[] args) {
        new App3();
    }
}
