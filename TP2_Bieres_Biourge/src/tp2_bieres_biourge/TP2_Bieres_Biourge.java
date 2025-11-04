/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_biourge;

/**
 *
 * @author utilisateur
 */
public class TP2_Bieres_Biourge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercice 1 TP2, Arthur Biourge,03/11/2025

    BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0 ,"Dubuisson") ;
    uneBiere.lireEtiquette();
    uneBiere.Decapsuler();
    System.out.println(uneBiere);
    
    BouteilleBiere uneSecondeBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
    uneSecondeBiere.lireEtiquette();
    
    BouteilleBiere uneTroisiemeBiere = new BouteilleBiere("Heineken", 8.6 ,"Abbaye de Heineken") ;
    uneTroisiemeBiere.lireEtiquette();
    System.out.println(uneTroisiemeBiere);
    BouteilleBiere uneQuatriemeBiere = new BouteilleBiere("chouffe", 9.6 ,"chouf") ;
    uneQuatriemeBiere.lireEtiquette();
    
    BouteilleBiere uneCinquimeBiere = new BouteilleBiere("86", 10.8 ,"Abbaye 86") ;
    uneCinquimeBiere.lireEtiquette();
    
    
    }
}
