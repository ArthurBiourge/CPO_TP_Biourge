/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author utilisateur
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Arthur Biourge, exercice 3 TP0, 20/10/2025
        int operateur;
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");
        operateur = sc.nextInt();

        if (operateur == 1 || operateur == 2 || operateur == 3 || operateur == 4 || operateur == 5) {
            double operande1;
            System.out.println("Entrer le nombre 1 au dixieme pres");
            operande1 = sc.nextFloat();

            double operande2;
            System.out.println("Entrer le nombre 2 au dixieme pres");
            operande2 = sc.nextFloat();

            if (operateur == 1) {
                double resultat_add = 0.0;
                resultat_add = operande1 + operande2;
                System.out.println("Le resultat est: " + resultat_add);

            } else if (operateur == 2) {
                double resultat_substract = 0.0;
                int choice_substract;
                System.out.println("Voulez vous 1-2 ou 2-1");
                System.out.println("1): 1-2;");
                System.out.println("2): 2-1;");
                choice_substract = sc.nextInt();
                if (choice_substract == 1) {
                    resultat_substract = operande1 - operande2;
                    System.out.println("Le resultat est: " + resultat_substract);
                } else if (choice_substract == 2) {
                    resultat_substract = operande2 - operande1;
                    System.out.println("Le resultat est: " + resultat_substract);
                }

                // rajouter le choix de soustraction 1-2 ou 2-1
            } else if (operateur == 3) {
                double resultat_multiply = 0.0;
                resultat_multiply = operande1 * operande2;
                System.out.println("Le resultat est: " + resultat_multiply);
            } else if (operateur == 4) {
                double resultat_divide = 0.0;
                int choice_divide;
                System.out.println("Voulez vous 1/2 ou 2/1");
                System.out.println("1): 1/2;");
                System.out.println("2): 2/1;");
                choice_divide = sc.nextInt();
                if (choice_divide == 1) {
                    if (operande2 == 0) {
                        System.out.println("Mais vous etes fou !!!");
                        System.exit(0);
                    }
                    resultat_divide = operande1 / operande2;
                    System.out.println("le resultat est: " + resultat_divide);
                } else if (choice_divide == 2) {
                    if (operande1 == 0) {
                        System.out.println("Mais vous etes fou !!!");
                        System.exit(0);
                    }
                    resultat_divide = operande2 / operande1;
                    System.out.println("Le resultat est: " + resultat_divide);
                }
            } else if (operateur == 5) {
                double resultat_modulo = 0.0;
                int choice_modulo;
                System.out.println("Voulez vous 1%2 ou 2%1");
                System.out.println("1): 1%2;");
                System.out.println("2): 2%1;");
                choice_modulo = sc.nextInt();
                if (choice_modulo == 1) {
                    resultat_modulo = operande1 % operande2;
                    System.out.println("Le resultat est: " + resultat_modulo);
                } else if (choice_modulo == 2) {
                    resultat_modulo = operande2 % operande1;
                    System.out.println("Le resultat est: " + resultat_modulo);
                }
            }

        } else {
            System.out.println("Avez vous fait la mise a jour ?");
        }
    }
}
