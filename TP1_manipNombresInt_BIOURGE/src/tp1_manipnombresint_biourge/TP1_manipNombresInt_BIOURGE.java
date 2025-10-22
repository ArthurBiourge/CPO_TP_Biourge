/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_biourge;

import java.util.Scanner;

/**
 *
 * @author utilisateur
 */
public class TP1_manipNombresInt_BIOURGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TP1 exercice 1, Arthur Biourge 22/10/2025
        int nb1;
        int nb2;
        int nbsomme;
        double nbdivision;
        int nbreste;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le premier nombre :");
        nb1 = sc.nextInt();
        System.out.println("Entrer le deuxieme nombre");
        nb2 = sc.nextInt();
        System.out.println( "le premier nombre est: "+nb1+", le deuxieme nombre est: "+nb2);
        nbsomme= nb1+nb2;
        System.out.println("la somme du premier et du deuxieme nombre est egal a "+nbsomme);
        nbdivision= nb1*1.0/nb2;
        nbreste= nb1%nb2;
        System.out.println("la division de "+nb1+" sur "+nb2+" est: "+nbdivision+" et son reste  est "+nbreste );
        
        
        
    }
    
}
