import java.util.Scanner;

public class App3 {
    public App3() {
        Scanner entrada = new Scanner(System.in);

        double[] vet = new double[12];
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o valor " + (i + 1) + ": ");
            vet[i] = entrada.nextFloat();
        }

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                vet[i] = vet[i] + (vet[i] * 0.02);
                System.out.println(vet[i]+" PAR");
            } else {
                vet[i] = vet[i] + (vet[i] * 0.05);
                System.out.println(vet[i]+" IMPAR");
            }
        }
        entrada.close();
        
    }

    public static void main(String[] args) {
        new App3();
    }
}
