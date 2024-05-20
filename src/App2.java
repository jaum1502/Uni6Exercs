import java.util.Scanner;

public class App2 {
    public App2() {
        Scanner s = new Scanner(System.in);
        float[] vet = new float[12];
        for (int i = 0; i < 12; i++) {
            System.out.println("Valor " + (i + 1) + ": ");
            vet[i] = s.nextFloat();
        }
        System.out.println("V - Informa os valores;");
        System.out.println("M - Informa a média;");
        System.out.println("T - Informa os valores maiores que a média ");
        char pergunta = s.next().toLowerCase().charAt(0);
        float media = 0;
        if (pergunta == 'v') {
            for (int i = 0; i < 12; i++) {
                System.out.println("VETOR " + i + ": " + vet[i]);
            }
        }
        
        else if(pergunta=='m'){
            float numero = 0;
            for (int i = 0; i < 12; i++) {
            numero = numero+vet[i];
            }
            media = numero/vet.length;
            System.out.println("MÉDIA: "+media);
        }
else if (pergunta=='t') {
    for (int i = 0; i < 12; i++){
        if(vet[i]>media){
            System.out.println(vet[i]);
        }else{System.out.println("no");}




    }



}

    }

    public static void main(String[] args) {
        new App2();
    }
}
