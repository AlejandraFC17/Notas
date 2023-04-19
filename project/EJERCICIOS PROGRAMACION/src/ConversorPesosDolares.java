import java.util.Scanner;

public class ConversorPesosDolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pesos que desea convertir: ");
        double cantidadPesos = scanner.nextInt();
        double tipoCambio = 3.895;

        double cantidadDolares = cantidadPesos / tipoCambio;

        System.out.println(cantidadPesos + " pesos equivalen a " + cantidadDolares + " dólares.");
    }
}

