/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_biourge;

import java.util.Scanner;

/**
 *
 * @author utilisateur
 */
public class TP1_convertisseur_BIOURGE {

    public static double CelciusVersKelvin(double tCelcius) {
        tCelcius = tCelcius + 273.15;
        return tCelcius;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        tKelvin = tKelvin - 273.15;
        return tKelvin;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        tFarenheit = (tFarenheit - 32) / 1.8;
        return tFarenheit;
    }

    public static double CelciusVersFarenheit(double tCelsius) {
        tCelsius = (tCelsius * 1.8) + 32;
        return tCelsius;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        double t1;
        t1 = CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
        return t1;

    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        double t2;
        t2 = CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
        return t2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercice 2 TP1 Arthur Biourge 22/10/2025

        double nb = 0.0;
        double resultat;
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

        if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {
            if (choice == 1) {
                resultat = CelciusVersKelvin(nb);
                System.out.println(nb + " degre Celcius est egal a " + resultat + " degres Kelvin");
            }
            if (choice == 2) {
                resultat = KelvinVersCelcius(nb);
                System.out.println(nb + " degre Kelvin est egal a " + resultat + " degres Celsius");
            }
            if (choice == 3) {
                resultat = FarenheitVersCelcius(nb);
                System.out.println(nb + " degre Farenheit est egal a " + resultat + " degres Celsius");
            }
            if (choice == 4) {
                resultat = CelciusVersFarenheit(nb);
                System.out.println(nb + " degre Celsius est egal a " + resultat + " degres Farenheit");
            }
            if (choice == 5) {
                resultat = KelvinVersFarenheit(nb);
                System.out.println(nb + " degre Kelvin est egal a " + resultat + " degres Farenheit");
            }
            if (choice == 6) {
                resultat = FarenheitVersKelvin(nb);
                System.out.println(nb + " degre Farenheit est egal a " + resultat + " degres Kelvin");
            }
        } else {
            System.out.println("Avez vous fait la mise a jour");
        }
    }

}
