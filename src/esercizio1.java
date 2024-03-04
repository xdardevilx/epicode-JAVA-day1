//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class esercizio1 {
    public static void main(String[] args) {
        int fattore = moltiplicazione(2, 3);
        System.out.println("il risultato della moltiplicazione è:" + fattore);

        String risultato = concatenazione("ciao", 5);
        System.out.println("il risultato della concatenazione è:" + risultato);

        String[] array = {"uno", "due", "tre", "quattro", "cinque"};
        String[] risultatoArray = inserisciArray(array, "sei");
        for (String element : risultatoArray) {
            System.out.println(element);
        }

    }
    public static int moltiplicazione (int num1, int num2){
        return num1 * num2;
    }
    public static String concatenazione (String param1, int param2){
        return param1 + " " +  param2;
    }

    public static String[] inserisciArray(String[] originalArray, String newElement){
        String[] resultArray = new String[6];
        for (int i = 0; i < 2; i++) {
            resultArray[i] = originalArray[i];
        }
        resultArray[2] = newElement;
        for (int i = 3; i < 6; i++) {
            resultArray[i] = originalArray[i-1];
        }
        return resultArray;
    }
}




