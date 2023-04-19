import java.util.Scanner;
public class OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        System.out.println("Números sin ordenar: " + numero1 + ", " + numero2 + ", " + numero3);

        // Ordenar los números utilizando el algoritmo de la burbuja
        int[] numeros = {numero1, numero2, numero3};
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }

        System.out.println("Números ordenados: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}
