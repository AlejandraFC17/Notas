import java.util.Scanner;
public class NumerosParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];

        // Leer los números por consola
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Mostrar los números junto con "par" o "impar"
        System.out.println("Los números ingresados son:");
        for (int i = 0; i < 8; i++) {
            System.out.print(numeros[i] + " ");
            if (numeros[i] % 2 == 0) {
                System.out.println("par");
            } else {
                System.out.println("impar");
            }
        }
    }

}
