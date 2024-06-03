import java.util.Scanner;

public class App2 {
public App2(){
Scanner entrada = new Scanner(System.in);
int tamanho=10;
float[] vet = new float[tamanho];
vet=escreverValores(entrada, vet, tamanho);
calculoMedia(vet, tamanho);
maiorMedia(vet, tamanho, tamanho);
}

public float[] escreverValores(Scanner entrada,float vet[], float tamanho){
for(int i=0; i<tamanho;i++){
    System.out.print("Vetor [" + (i) + "] - ");
    vet[i]=entrada.nextFloat();
}
    return vet;
}


public void calculoMedia(float vet[],float tamanho){
float soma=0;
for(int i=0; i<tamanho;i++){
    soma+=vet[i];
}
 float media=soma/tamanho;
 System.out.println("----------------------");
 System.out.println("MÉDIA: "+media);
 System.out.println("----------------------");
}

public void maiorMedia(float vet[], float media, int tamanho){
    System.out.println("MAIORES QUE A MÉDIA:");
for(int i=0; i<tamanho;i++ ){
    if (vet[i]>media) {
    System.out.println("VETOR " + i + " - "+vet[i]);
    }
    
}
System.out.println("----------------------");
}





    public static void main(String[] args) {
        new App2();
    }
}