import java.util.Scanner;
//qual a nota média recebida pelo cinema;       
//qual a nota média atribuída pelos homens;
//qual a nota atribuída pela mulher mais jovem;
//quantas das mulheres com mais de 50 anos deram nota superior a média recebida
// pelo cinema.

public class App9 {
    public App9() {
        Scanner entrada = new Scanner(System.in);
        int[] notaHomens = new int[3];
        int[] notaMulheres = new int[3];
        int[] idadeMulheres = new int[3];
        int sexoPessoa = entrada.nextInt();
        escreverValores(notaHomens, notaMulheres, entrada, sexoPessoa, notaHomens, idadeMulheres);
    }

    public void escreverValores(int notaHomens[], int notaMulheres[], Scanner entrada, int sexoPessoa,
            int idadeHomens[], int idadeMulheres[]) {
        for (int i = 0; i < notaHomens.length; i++) {
            System.out.print("Sexo (1-F ou 2-M):");
            switch (sexoPessoa) {
                case 1:
                    System.out.print("NOTA: ");
                    notaHomens[i] = entrada.nextInt();
                    System.out.print("IDADE: ");
                    idadeHomens[i] = entrada.nextInt();
                    break;
                case 2:
                System.out.print("NOTA");
                    notaMulheres[i] = entrada.nextInt();
                    System.out.print("IDADE");
                    idadeMulheres[i] = entrada.nextInt();
                default:
                    break;
            }
        }

    }

    public float valorMediaH(int notaHomens[]) {
        int soma = 0;
        for (int i = 0; i < notaHomens.length; i++) {
            soma = +notaHomens[i];
        }
        float media = soma / notaHomens.length;
        return media;

    }

    public static void main(String[] args) {
        new App9();
    }
}