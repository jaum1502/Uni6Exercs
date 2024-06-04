import java.util.Scanner;

public class App5 {
    public App5() {
        Scanner entrada = new Scanner(System.in);
        int indice = 0;
        int tamanho = 3;
        char vetH[] = new char[tamanho];
        char vetM[] = new char[tamanho];
        perguntasResp(entrada, vetH, vetM, tamanho, indice);
        contaIndices(vetH, vetM, tamanho, indice);
        imprimirTexto(indice);


    }

public void imprimirTexto(int indice){
    if (indice==-10) {
        System.out.println("Vocês se odeiam!");
    } else if (indice<=-9) {
        System.out.println("Melhor não perder tempo!");
    }else if (indice>=0) {
        System.out.println("Talvez naõ dê certo");
    }else if (indice>=5) {
        System.out.println("Vale um encontro.");
    }else if (indice>=10) {
        System.out.println("Vocês têm muita coisa em comum!");
    }else if (indice>=15) {
        
    }
}


    public int contaIndices(char vetH[], char vetM[], int tamanho, int indice) {
        for (int i = 0; i < 3;) {
            if (vetH[i] == 's' || vetM[i] == 's') {
                indice += 3;
                i++;
            } else if ((vetH[i] == 's' && vetM[i] == 'i') && (vetH[i] == 'i' && vetM[i] == 's')
                    && (vetH[i] == 'n' && vetM[i] == 'i') && (vetH[i] == 'n' && vetM[i] == 'i')) {
                indice += 1;
                i++;
            } else if ((vetH[i] == 's' && vetM[i] == 'n') && (vetH[i] == 'n' && vetM[i] == 's')) {
                indice -= 2;
                i++;
            }
        }

        return indice;
    }

    public void perguntasResp(Scanner entrada, char vetH[], char vetM[], int tamanho, int indice) {
        for (int i = 0; i < 5;) {
            System.out.println("Gosta de música sertaneja?");
            vetH[i] = entrada.next().toLowerCase().charAt(0);
            i++;
            System.out.println("Gosta de futebol?");
            vetH[i] = entrada.next().toLowerCase().charAt(0);
            i++;
            System.out.println("Gosta de seriados?");
            vetH[i] = entrada.next().toLowerCase().charAt(0);
            i++;
            System.out.println("Gosta de redes sociais?");
            vetH[i] = entrada.next().toLowerCase().charAt(0);
            i++;
            System.out.println("Gosta da Oktoberfest?");
            vetH[i] = entrada.next().toLowerCase().charAt(0);
        }

        for (int i = 0; i < 5;) {
            System.out.println("Gosta de música sertaneja?");
            vetM[i] = entrada.next().toLowerCase().charAt(0);
            i++;
            System.out.println("Gosta de futebol?");
            vetM[i] = entrada.next().toLowerCase().charAt(0);
            i++;
            System.out.println("Gosta de seriados?");
            vetM[i] = entrada.next().toLowerCase().charAt(0);
            i++;
            System.out.println("Gosta de redes sociais?");
            vetM[i] = entrada.next().toLowerCase().charAt(0);
            i++;
            System.out.println("Gosta da Oktoberfest?");
            vetM[i] = entrada.next().toLowerCase().charAt(0);
        }
    }

    public static void main(String[] args) {
        new App5();
    }
}
