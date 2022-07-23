import java.util.Scanner;

public class TextFromUser {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz imie uzytkownika");
        String imie = scanner.nextLine();
        System.out.println("Wprowadz nazwisko uzytkownika");
        String nazwisko = scanner.nextLine();
        System.out.println("Wprowadz wiek uzytkownika");
        int wiek = scanner.nextInt();
        System.out.println("Witaj " + imie + " "  + nazwisko + ". Masz " + wiek + " lat.");

    }
}
