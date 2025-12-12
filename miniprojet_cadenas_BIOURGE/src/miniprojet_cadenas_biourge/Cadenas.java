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

    private int[] tabCombinaison = new int[4];
    int Valeur;
    int i;
    int j;
    int Valeur_exacte;
    int Valeur_inférieur;
    int Valeur_supérieur;
    int Valeur_vérifier;
    int exact;
    

    public void Combinaison() {
        Random rand = new Random();
        for (i = 0; i < 4; i++) {
            tabCombinaison[i] = rand.nextInt(10);// commande me permettant d'obtenir un nombre  aléatoire entre 0 et 9
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

    public int[] Tester(int[] tab_proposé) {
        int[] tab_retour= new int[4];
        Valeur_exacte = 0;
        Valeur_inférieur = 0;
        Valeur_supérieur = 0;
        
        for (j = 0; j < 4; j++) {
            if (tab_proposé[j] == tabCombinaison[j]) {
                Valeur_exacte += 1;
            }
            else if (tab_proposé[j] < tabCombinaison[j]) {
                Valeur_inférieur +=1;
            }
            else if(tab_proposé[j]>tabCombinaison[j]){
                Valeur_supérieur +=1;
            } 
        }
        if (Valeur_vérifier != 4){
        exact=0;
        }
        else {
            exact=1;
        }
        tab_retour[0]= Valeur_exacte;
        tab_retour[1]= Valeur_inférieur;
        tab_retour[2]= Valeur_supérieur;
        tab_retour[3]= exact;
        
        return tab_retour;
        }

    }
