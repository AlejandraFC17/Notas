import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese la cantidad de números a promediar (n)
        System.out.print("Ingrese la cantidad de números a promediar: ");
        int n = sc.nextInt();

        double suma = 0;
        for (int i = 1; i <= n; i++) {
            // Solicitar al usuario que ingrese cada número
            System.out.print("Ingrese el número " + i + ": ");
            double numero = sc.nextDouble();

            // Sumar el número a la variable "suma"
            suma += numero;
        }

        // Calcular el promedio
        double promedio = suma / n;

        // Imprimir el resultado
        System.out.println("El promedio de los " + n + " números ingresados es: " + promedio);

        sc.close();
    }
}
