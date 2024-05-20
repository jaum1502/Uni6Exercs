import java.util.Scanner;

public class contadorZEROUM {
    public contadorZEROUM() {
       Scanner s = new Scanner(System.in);
       int contador = s.nextInt();
        System.out.println("Deseja adicionar o zero no contador?");
        char letra = s.next().toLowerCase().charAt(0);
switch (letra) {
    case 's':
       int ind=0;
        for (int i = ind; i <= contador; i++) {
            System.out.println(i);
           }
        break;
        case 'n':
        ind=1;
        for (int i = ind; i <= contador; i++) {
            System.out.println(i);
           }
    default:
    System.out.println("VALOR INVÁLIDO");
        break;
}
       s.close();

    }




    public static void main(String[] args) throws Exception {
        new contadorZEROUM();
    }
}
