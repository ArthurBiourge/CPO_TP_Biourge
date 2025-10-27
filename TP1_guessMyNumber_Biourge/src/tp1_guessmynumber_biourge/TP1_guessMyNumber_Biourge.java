/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_biourge;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author utilisateur
 */
public class TP1_guessMyNumber_Biourge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TP1 exercice 3, Arthur Biourge, 24/10/2025 
        int n;
        int i = 0;
        int choice;
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        n = generateurAleat.nextInt(100);
        System.out.println("Saissisez un nombre");
        choice = sc.nextInt();
        while (choice != n) {

            if (choice < n) {
                System.out.println("Trop petit");
                System.out.println("Saissisez un nouveau nombre");
                choice = sc.nextInt();
                i = i + 1;
                if (choice == n) {
                    System.out.println("Bravo vous avez trouve");
                    if (i == 0) {
                        System.out.println("Nombre d'essais total: 1");
                    } else {
                        System.out.println("Nombre d'essais total: " + i);
                    }
                }
            } else if (choice > n) {
                System.out.println("Trop grand");
                i = i + 1;
                System.out.println("Saissisez un nouveau nombre");
                choice = sc.nextInt();
                if (choice == n) {
                    System.out.println("Bravo vous avez trouve");
                    if (i == 0) {
                        System.out.println("Nombre d'essais total: 1");
                    } else {
                        System.out.println("Nombre d'essais total: " + i);
                    }
                }

            }

        }
    }

}
