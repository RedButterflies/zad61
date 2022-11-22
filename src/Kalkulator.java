//Napisz prosty program konsolowy realizujący funkcjonalności kalkulatora:
// Wykonywanie podstawowych działań (dodawanie, odejmowanie, mnożenie, dzielenie,
//pierwiastkowanie, potęgowanie) i wyświetlanie wyniku.
//Zadbaj o odpowiednią obsługę wyjątków. Załóż, że użytkownik może wprowadzić
//dowolny znak (w przypadku wprowadzenia błędnych danych wyświetl komunikat i ponów
//prośbę o podanie danych).
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Kalkulator {
    static void kalkulator() {
        System.out.println("Wprowadz liczbe1: ");
        Scanner sc = new Scanner(System.in);
        float liczba1 = sc.nextFloat();
        try {
            System.out.println("Wprowadz liczbe2: ");
            Scanner sx = new Scanner(System.in);

            float liczba2 = sx.nextFloat();

            if (liczba2 == 0) {
                throw new ArithmeticException("Nie mozna dzielic przez 0, podaj inna liczbe");
            }


            int i;

            char wybor;
            while (1 == 1) {
                System.out.println("Jesli chcesz zakonczyc, wybierz 0, w przeciwnym przypadku wybierz dowolny znak");
                Scanner znak = new Scanner(System.in);
                wybor = znak.next().charAt(0);
                if (wybor == '0') break;
                System.out.println("Co chcesz zrobic: ");
                System.out.println("Dodawanie - wprowadz + ");
                System.out.println("Odejmowanie - wprowadz - ");
                System.out.println("Mnozenie - wprowadz *");
                System.out.println("Dzielenie - wprowadz : ");
                System.out.println("Potegowanie - wprowadz ^ ");
                System.out.println("Pierwiastkowanie - wprowadz &");
                Scanner nowei = new Scanner(System.in);
                i = nowei.next().charAt(0);

                switch (i) {
                    case ('+') -> System.out.println("Wynik dodawania " + (liczba1 + liczba2));
                    case ('-') -> System.out.println("Wynik odejmowania " + (liczba1 - liczba2));
                    case ('*') -> System.out.println("Wynik mnozenia " + (liczba1 * liczba2));
                    case (':') -> System.out.println("Wynik dzielenia " + (liczba1 / liczba2));
                    case ('^') -> System.out.println("Wynik potegowania " + (pow(liczba1, liczba2)));
                    case ('&') -> System.out.println("Wynik pierwiastkowania" + pow(liczba1, (1 / liczba2)));
                    default -> System.out.println("Wprowadzono nieprzypisany znak, sprobuj ponownie");
                }

            }
        } catch (InputMismatchException e) {
            System.err.println("Wprowadzony znak nie jest liczba, wprowadz liczbe i sprobuj ponownie");
        }
    }
}
