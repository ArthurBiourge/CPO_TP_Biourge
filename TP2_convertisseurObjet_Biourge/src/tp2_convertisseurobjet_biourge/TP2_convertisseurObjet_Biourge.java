/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_biourge;

import java.util.Scanner;

/**
 *
 * @author utilisateur
 */
public class TP2_convertisseurObjet_Biourge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TP2 exercice 2, Arthur Biourge, 04/11/2025
        double nb;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une valeur reelle");
        nb = sc.nextDouble();
        System.out.println("Saississez la conversion que vous voulez: ");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celsius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        choice = sc.nextInt();
        Convertisseur UnConvertisseur = new Convertisseur();

        if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {
            if (choice == 1) {

                System.out.println(nb + " degre Celcius est egal a " + UnConvertisseur.CelciusVersKelvin(nb) + " degres Kelvin");
                System.out.println(UnConvertisseur);
            }
            if (choice == 2) {

                System.out.println(nb + " degre Kelvin est egal a " + UnConvertisseur.KelvinVersCelcius(nb) + " degres Celsius");
                System.out.println(UnConvertisseur);
            }
            if (choice == 3) {

                System.out.println(nb + " degre Farenheit est egal a " + UnConvertisseur.FarenheitVersCelcius(nb) + " degres Celsius");
                System.out.println(UnConvertisseur);
            }
            if (choice == 4) {

                System.out.println(nb + " degre Celsius est egal a " + UnConvertisseur.CelciusVersFarenheit(nb) + " degres Farenheit");
                System.out.println(UnConvertisseur);
            }
            if (choice == 5) {

                System.out.println(nb + " degre Kelvin est egal a " + UnConvertisseur.KelvinVersFarenheit(nb) + " degres Farenheit");
                System.out.println(UnConvertisseur);
            }
            if (choice == 6) {

                System.out.println(nb + " degre Farenheit est egal a " + UnConvertisseur.FarenheitVersKelvin(nb) + " degres Kelvin");
                System.out.println(UnConvertisseur);
            }
        }

    }
}
