import java.util.Scanner;
public class PiramideNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Imprimir espacios en blanco
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // Imprimir números ascendentes
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Imprimir números descendentes
            for (int l = i-1; l >= 1; l--) {
                System.out.print(l);
            }

            // Imprimir salto de línea
            System.out.println();
        }
    }
}
