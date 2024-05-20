import java.util.Scanner;

public class exemploVETOR {
    public exemploVETOR() {
        Scanner s = new Scanner(System.in);
        int[] dia = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("dia " + (i + 1));
            dia[i] = s.nextInt();
        }

        System.out.println("Digite o dia que você deseja saber o número:");
        int diaFinal = s.nextInt();
        System.out.println(dia[diaFinal - 1]);
        s.close();
    }

    public static void main(String[] args) throws Exception {
        new exemploVETOR();
    }
}
