//Uni6Exe04.java - Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos.
// Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. 
//Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela. Faça três métodos: 
//um método para ler valores dos vetores, outro para somar e outro para escrever os vetores.

import java.util.Scanner;

public class App4 {
    public App4() {
        Scanner entrada = new Scanner(System.in);
        int joao=2;
        int tamanho = 3;
        int vet1[] = new int[tamanho];
        int vet2[] = new int[tamanho];
        int vet3[] = new int[tamanho];
        escreverValores(entrada, vet1, vet2, joao);
        somaVetores(vet1, vet2, vet3, tamanho);
        imprimirValores(vet3, tamanho);
        entrada.close();
    }

public void imprimirValores(int vet3[],int tamanho){
    System.out.print("SOMA DOS VETORES = [");
    for (int i = 0; i < tamanho; i++) {
        System.out.print("  "+vet3[i]+"  ");
    }
    System.out.print("]");
}



public void escreverValores(Scanner entrada, int vet1[], int vet2[],int tamanho){
    for (int i = 0; i < tamanho; i++) {
        System.out.println("Digite o valor " + (i + 1) + ": ");
        vet1[i] = entrada.nextInt();
    }
    for (int i = 0; i < tamanho; i++) {
        System.out.println("Digite o valor " + (i + 1) + ": ");
        vet2[i] = entrada.nextInt();
    }
}


    public int[] somaVetores(int vet1[], int vet2[], int vet3[],int tamanho) {
        for (int i = 0; i < tamanho; i++) {
           vet3[i]=vet1[i]+vet2[i];}
           return vet3;
    }

    public static void main(String[] args) {
new App4();
    }
}