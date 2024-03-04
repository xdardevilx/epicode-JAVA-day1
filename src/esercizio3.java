import java.util.Scanner;


public class esercizio3 {

    public static void main(String[] args) {
        int calcoloPerimetroRettangolo = perimetroRettangolo();
        System.out.println("Il perimetro del rettangolo è: " + calcoloPerimetroRettangolo);
        int calcoloPariDispari = pariDispari();
        System.out.println("Il numero inserito è pari? " + calcoloPariDispari);
    }
    public static int perimetroRettangolo (){
        Scanner sc=new Scanner(System.in);
        System.out.println("Inserisci l'altezza del rettangolo");
        int altezza=sc.nextInt();
        System.out.println("Inserisci la larghezza del rettangolo");
        int larghezza=sc.nextInt();
        sc.close();
        return (2*altezza)+(2*larghezza);
    }
    public static int pariDispari(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numero = sc.nextInt();

        if (sc.hasNextInt()) {
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                return 0;
            } else {
                return 1;
            }
        } else


    }
public static int perimetroTriangolo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Inserisci la base del triangolo");
        int base = sc.nextInt();
        System.out.println("Inserisci la lunghezza del triangolo");
        int lunghezza = sc.nextInt();
         sc.close();
         return base + lunghezza + base;
}
}



