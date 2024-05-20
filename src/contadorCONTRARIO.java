import java.util.Scanner;

public class contadorCONTRARIO {
    public contadorCONTRARIO() {
       Scanner s = new Scanner(System.in);

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
           }

       s.close();

    }




    public static void main(String[] args) throws Exception {
        new contadorCONTRARIO();
    }
}
