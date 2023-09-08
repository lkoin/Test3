import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int liczba;
        System.out.println("Podaj liczbe: ");
        liczba = scan.nextInt();
        int liczba2 = 1;
        for (int i = 1; i <= liczba; i++) {
            liczba2 = liczba2*i;


        }
        System.out.println("Silnia z liczby "+ liczba + " 3wynosi " + liczba2);
    }
}