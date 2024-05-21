import java.util.Scanner;

public class App3 {
    public App3() {
        Scanner entrada = new Scanner(System.in);

        double[] vet = new double[12];
        for (int i = 0; i < 12; i++) {
            System.out.println("Digite o valor " + (i + 1) + ": ");
            vet[i] = entrada.nextFloat();
        }

        for (int i = 0; i < 12; i++) {
            if (vet[i] % 2 == 0) {
                vet[i] = vet[i] + (vet[i] * 0.02);
                System.out.println(vet[i]);
            } else {
                vet[i] = vet[i] + (vet[i] * 0.05);
                System.out.println(vet[i]);
            }
        }
        entrada.close();
    }

    public static void main(String[] args) {
        new App3();
    }
}
