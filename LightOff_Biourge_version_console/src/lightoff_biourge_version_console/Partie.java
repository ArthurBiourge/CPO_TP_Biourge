/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_biourge_version_console;

import java.util.Scanner;

/**
 *
 * @author utilisateur
 */
public class Partie {

    int j_nbCoups = 0;
    int g_nbCoups;
    GrilleDeJeu grille;
    Scanner sc = new Scanner(System.in);
    int j_choix;
    int j_LC_choix;
    int nb_lignes;

    public Partie(int p_nbLignes, int p_nbColonnes, int pg_nbCoups) {
        grille = new GrilleDeJeu(p_nbLignes, p_nbColonnes);//on met le new ici pour pouvoir choisir les tailles de grille
        g_nbCoups = pg_nbCoups;
        grille.eteindreToutesLesCellules();
        nb_lignes = p_nbLignes;// cette ligne permet de vérifier que le joueur ne sort pas de la grille
    }

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(g_nbCoups);//nb de fois qu'il faut melanger la Grille
    }

    public void lancerPartie() {
        while (grille.cellulesToutesEteintes() != true) {
            System.out.println(grille);
            System.out.println("choisissez: ");
            System.out.println("1) une ligne ");
            System.out.println("2) une colonne ");
            System.out.println("3) la diagonale montante ");
            System.out.println("4) la diagonale descendante ");

            j_choix = sc.nextInt();

            switch (j_choix) {
                case 1:
                    System.out.println("Quel ligne/colone");
                    j_LC_choix = sc.nextInt();
                    if (j_LC_choix > nb_lignes) {
                        System.out.println("vous avez selectionner une valeur hors de la grille");
                    } else {
                        grille.activerLigneDeCellules(j_LC_choix);
                        j_nbCoups += 1;
                    }
                    break;

                case 2:
                    System.out.println("Quel ligne/colone");
                    j_LC_choix = sc.nextInt();
                    if (j_LC_choix > nb_lignes) {
                        System.out.println("vous avez selectionner une valeur hors de la grille");
                    } else {
                        grille.activerColonneDeCellules(j_LC_choix);
                        j_nbCoups += 1;
                    }
                    break;
                case 3:
                    grille.activerDiagonaleMontante();
                    j_nbCoups += 1;
                    break;
                case 4:
                    grille.activerDiagonaleDescendante();
                    j_nbCoups += 1;
                    break;
                default:
                    System.out.println("ça n'existe pas");
                    break;
            }

        }
        System.out.println ("vous avez gagner en " + j_nbCoups + " coups");
    }

    

    }


