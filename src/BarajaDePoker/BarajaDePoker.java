package BarajaDePoker;

import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BarajaDePoker {
    static String[] menuOpt = {"1. Shuffle", "2. Head", "3. Pick", "4. Hand", "5. Exit"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mVal = true;
        Deck.CreateDeck();

        System.out.println("Bienvenido, por favor selecciona una opcion: ");
        printMenu();
        int selectedOpt = sc.nextInt();

        do {
            selectedOpt = sc.nextInt();
            switch (selectedOpt){
                case 1:
                    Deck.shuffle();
                    break;
                case 2:
                    Deck.head();
                    break;
                case 3:
                    Deck.pick();
                    break;
                case 4:
                    Deck.hand();
                    break;
                case 5:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion invalida, selecciona otra opcion");
                    printMenu();
                    break;
            }
        } while (selectedOpt != 5);
    }

    public static void printMenu() {
        for (int i = 0; i <=3; i++) {
            System.out.println(menuOpt[i]);
        }
    }
}