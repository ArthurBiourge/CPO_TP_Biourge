/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_biourge_version_console;

/**
 *
 * @author utilisateur
 */
public class GrilleDeJeu {

    CelluleLumineuse[][] grille;
    int nbLignes;
    int nbColonnes;

    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        p_nbLignes = nbLignes;
        p_nbColonnes = nbColonnes;
        for (int i = 0; i < nbLignes; i++) {
            grille[i] = new CelluleLumineuse[nbColonnes];
            for (int j = 0; j < nbColonnes; j++) {
                grille[i][j] = new CelluleLumineuse();
            }

        }
    }
    public void eteindreToutesLesCellules(){// on travail sur cette grille là et elle sera modifier dans la grille donc pas besoin de crée une nouvelle grille.
    
    }
}
