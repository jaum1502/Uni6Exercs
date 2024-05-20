import java.util.Scanner;

public class App1 {
    public App1() {
        Scanner s = new Scanner(System.in);
        int[] vet = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor " + (i + 1) + ": ");
            vet[i] = s.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(vet[i]);
        }
        s.close();
    }

    public static void main(String[] args) {
        new App1();
    }
}
