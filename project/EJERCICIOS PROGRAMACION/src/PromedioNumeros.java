import java.util.Scanner;
public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int suma = 0;
        int contador = 0;

        System.out.println("Ingrese un conjunto de números positivos (ingrese un número negativo para terminar):");

        do {
            num = scanner.nextInt();
            if (num >= 0) {
                suma += num;
                contador++;
            }
        } while (num >= 0);

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
    }
}

