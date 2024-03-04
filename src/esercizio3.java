import java.util.Scanner;

public class esercizio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci l'altezza del rettangolo");
        int altezza = sc.nextInt();
        System.out.println("Inserisci la larghezza del rettangolo");
        int larghezza = sc.nextInt();
        int calcoloPerimetroRettangolo = perimetroRettangolo(altezza, larghezza);
        System.out.println("Il perimetro del rettangolo è: " + calcoloPerimetroRettangolo);

        System.out.println("Inserisci un numero");
        int numero = sc.nextInt();

        int calcoloPariDispari = pariDispari(numero);
        System.out.println("Il numero inserito è pari? " + calcoloPariDispari);

        System.out.println("Inserisci la base del triangolo");
        int base = sc.nextInt();
        System.out.println("Inserisci l'altezza del triangolo");
        int altezza2 = sc.nextInt();
        int calcoloPerimetroTriangolo = perimetroTriangolo(base, altezza2);
        System.out.println("l'area del triangolo è: " + calcoloPerimetroTriangolo);

        sc.close();


    }

    public static int perimetroRettangolo(int a, int l ) {
        return (2 * a) + (2 * l);
    }

    public static int pariDispari(int n) {
        if (n % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int perimetroTriangolo(int base, int altezza) {
        return  (base * altezza)/ 2;
    }
}
