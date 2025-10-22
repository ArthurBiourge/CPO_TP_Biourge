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
public static double CelciusVersKelvin (double tCelcius){
    tCelcius=tCelcius+273.15;
    return tCelcius;  
}
public static double KelvinVersCelcius ( double tKelvin){
    tKelvin=tKelvin-273.15;
    return tKelvin;
}

public static double FarenheitVersCelcius ( double tFarenheit){
    tFarenheit= tFarenheit-17.7777778;
    return tFarenheit;
}

public static double CelciusVersFarenheit (double tCelsius){
    tCelsius=tCelsius+17.7777778;
    return tCelsius;
}

//public static double KelvinVersFarenheit(double tKelvin){
  //  tKelvin= tKelvin-459.67;
  //  return tKelvin
    // chercher la formule pour passez de farenheit en Kelvin
}



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercice 2 TP1 Arthur Biourge 22/10/2025
        
        double nb=0.0;
        double nb_Kelvin=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une valeur reelle");
        nb=sc.nextDouble();
        nb_Kelvin= nb+273.15;
        System.out.println("Votre Température en cesius donne "+ nb_Kelvin+ " K" );
        
      
        
        
        
    }
    
}
