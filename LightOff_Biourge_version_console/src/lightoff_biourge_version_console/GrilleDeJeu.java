/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_biourge_version_console;

import java.util.Random;

/**
 *
 * @author utilisateur
 */
public class GrilleDeJeu {

    CelluleLumineuse[][] grille;
    int nbLignes;
    int nbColonnes;

    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        for (int i = 0; i < nbLignes; i++) {
            grille[i] = new CelluleLumineuse[nbColonnes];
            for (int j = 0; j < nbColonnes; j++) {
                grille[i][j] = new CelluleLumineuse();
            }

        }
    }

    public void eteindreToutesLesCellules() {// on travail sur cette grille là et elle sera modifier dans la grille donc pas besoin de crée une nouvelle grille.
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                grille[i][j].eteindreCellule();
            }
        }
    }

    public void activerLigneColonneOuDiagonaleAleatoire() {
        int ligne_colone_diagonale;
        int num_ligne_colone;
        Random rand = new Random();
        ligne_colone_diagonale = rand.nextInt(3);
        num_ligne_colone = rand.nextInt(10);
        if (ligne_colone_diagonale == 0) { //s'occupe d'allumé ou éteindre(si déja allumé) chaque case sur une ligne 
            for (int j = 0; j < grille[nbColonnes].length; j++) {
                grille[num_ligne_colone][j].activerCellule();
            }
        } else if (ligne_colone_diagonale == 1) {// colone
            for (int i = 0; i < grille[nbLignes].length; i++) {
                grille[i][num_ligne_colone].activerCellule();
            }
        } else if (ligne_colone_diagonale == 2) {//s'occupe d'allumé ou éteindre(si déja allumé) chaque case sur une
            for (int h = 0; h < grille[nbLignes].length; h++) {
                grille[h][h].activerCellule();
            }
        }
    }

    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        for (int k = 0; k < nbTours; k++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < grille[nbColonnes].length; j++) {
            grille[idLigne][j].activerCellule();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < grille[nbLignes].length; i++) {
            grille[i][idColonne].activerCellule();
        }
    }

    public void activerDiagonaleDescendante() {
        for (int h = 0; h < grille[nbLignes].length; h++) {
            grille[h][h].activerCellule();

        }
    }

    public void activerDiagonaleMontante() {
        for (int h = 0; h < grille[nbLignes].length; h++) {
            grille[grille[nbLignes].length - h][grille[nbLignes].length - h].activerCellule();

        }
    }

    public boolean cellulesToutesEteintes() {
        boolean etat;
        int nb_etat = 0;
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                etat = grille[i][j].getEtat();
                if (etat == true) {
                    nb_etat += 1;
                }

            }
        }
        if (nb_etat > 0) {
            etat = false;
        } else {
            etat = true;
        }
        return etat;
    }

    @Override
    public String toString() {
        return "GrilleDeJeu{" + "grille=" + grille + '}';
    }


    
}
