import java.util.Scanner;
public class esercizio2 {
    public static void main(String[] args) {
        String stampaLeStringhe = inserimento();
        System.out.println(stampaLeStringhe);
    }
    public static String  inserimento(){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Inserisci la prima stringa: ");
        String s1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa: ");
        String s2 = scanner.nextLine();
        System.out.println("Inserisci la terza stringa: ");
        String s3 = scanner.nextLine();
        scanner.close();
        return (s1 +" " + " " + s2 + " " + " "+ s3) + " " + (s3 +" " + " " + s2 + " " + " "+ s1);
    }
}
