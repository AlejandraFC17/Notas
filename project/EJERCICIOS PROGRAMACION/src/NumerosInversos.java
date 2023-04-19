import java.util.Scanner;
public class NumerosInversos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leer los números por consola
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Mostrar los números en orden inverso
        System.out.print("Los números en orden inverso son: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }

}
