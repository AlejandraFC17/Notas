import java.util.Scanner;
public class PrimerCifra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero de hasta 5 cifras: ");
        int num = sc.nextInt();

        // determinar la primera cifra del número
        int primerCifra;
        if (num >= 10000) {
            primerCifra = num / 10000;
        } else if (num >= 1000) {
            primerCifra = num / 1000;
        } else if (num >= 100) {
            primerCifra = num / 100;
        } else if (num >= 10) {
            primerCifra = num / 10;
        } else {
            primerCifra = num;
        }

        System.out.println("La primera cifra del número es: " + primerCifra);
    }
}
