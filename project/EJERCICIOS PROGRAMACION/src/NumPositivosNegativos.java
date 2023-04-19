import java.util.Scanner;
public class NumPositivosNegativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        System.out.println("Ingrese diez números:");

        for (int i = 1; i <= 10; i++) {
            int num = input.nextInt();
            if (num >= 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        System.out.println("Se ingresaron " + positivos + " números positivos y " + negativos + " números negativos.");
    }
}

