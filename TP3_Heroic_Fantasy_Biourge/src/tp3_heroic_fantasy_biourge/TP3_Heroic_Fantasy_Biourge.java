/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_biourge;

import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import Armes.Baton;
import Armes.Epee;
import Armes.arme;
import java.util.ArrayList;

/**
 *
 * @author utilisateur
 */
public class TP3_Heroic_Fantasy_Biourge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TP3 exercice 1 ; 12/11/2025; Arthur Biourge
        Epee Epee1 = new Epee("Excalibur", 7, 5);
        Epee Epee2 = new Epee("Durandal", 4, 7);
        Baton Baton1 = new Baton("Chene", 4, 5);
        Baton Baton2 = new Baton("Charme", 5, 6);

        ArrayList<arme> inventaire = new ArrayList<arme>();
        inventaire.add(Epee1);
        inventaire.add(Epee2);
        inventaire.add(Baton1);
        inventaire.add(Baton2);
        
        for (int i=0 ; i<inventaire.size();i++ ){
        System.out.println(inventaire.get(i));
        }
        Magicien Magicien1 = new Magicien("Gandalf",65,true );
        Magicien Magicien2 = new Magicien("Garcimore",44,false );
        Guerrier Guerrier1 = new Guerrier("Conan", 78, false );
        Guerrier Guerrier2 = new Guerrier( "Lannister", 45,true );
        
        ArrayList<Personnage> combattants = new ArrayList<Personnage>();
        combattants.add(Magicien1);
        combattants.add(Magicien2);
        combattants.add(Guerrier1);
        combattants.add(Guerrier2);
        
        for (int i=0 ; i<combattants.size();i++ ){
        System.out.println(combattants.get(i));
        }
    }
    
}
