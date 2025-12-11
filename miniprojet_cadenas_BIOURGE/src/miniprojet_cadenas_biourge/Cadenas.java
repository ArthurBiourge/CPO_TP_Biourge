/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_cadenas_biourge;

/**
 *
 * @author utilisateur
 */
public class Cadenas {

    private int[] tabPropose = new int[4];
    private int[] tabChercher = new int[4];
    int Valeur;

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
