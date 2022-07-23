import java.awt.*;
import java.util.Objects;
import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        /**
         * 1. Chcę aby program pytał o imię nazwisko wiek
         * 2. Chcę żeby po zapytaniu o wiek była pętla sprawdzająca czy osoba jest pełnoletnia czy nie - (jak osoba pełnoletnia będzie zapraszam do klubu, jak nie to napis "wypad"
         */
        String [] listaWygranych = new String [] {"Ania", "Zosia", "Mateusz", "Piotrek"};
       Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = scanner.next();
        System.out.println("Podaj nazwisko");
        String nazwisko = scanner.next();
        System.out.println("Podaj wiek");
        int wiek = scanner.nextInt();
            if (wiek>= 18){
        System.out.println("zapraszam do klubu");
            for (String wygrany: listaWygranych){
                if(Objects.equals(imie, wygrany)) {
                    System.out.println("Free shoot for you!");
                }
            }
        }
        if (wiek<18) {
        System.out.println("Wypad!");
    }
    }
}
