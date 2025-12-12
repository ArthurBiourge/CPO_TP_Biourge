/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_cadenas_biourge;

import java.util.Random;

/**
 *
 * @author utilisateur
 */
public class Cadenas {

    private int[] tabPropose = new int[4];
    private int[] tabCombinaison = new int[4];
    int Valeur;
    int i;
    
    public void Combinaison(){
        Random rand = new Random();
        for(i=0; i<4;i++){
        tabCombinaison[i]= rand.nextInt(10);// commande me permettant d'obtenir un nombre  aléatoire entre 0 et 9
        }
    }


    public int mise_a_jour(int Valeur_case, boolean up) {
        if (up == true) {
            Valeur = Valeur_case + 1;
            if (Valeur > 9) {
                Valeur = 0;
            }
        } else {
            Valeur = Valeur_case - 1;
        }
        if (Valeur < 0) {
            Valeur = 9;
        }

        return Valeur;
    }
    
}
