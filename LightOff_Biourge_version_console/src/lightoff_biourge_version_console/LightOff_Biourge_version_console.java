/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_biourge_version_console;

/**
 *
 * @author utilisateur
 */
public class LightOff_Biourge_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean test_matrice_eteintes;
        CelluleLumineuse Cellule = new CelluleLumineuse();
        System.out.println(Cellule);
        Cellule.activerCellule();
        System.out.println(Cellule);
        Cellule.eteindreCellule();
        System.out.println(Cellule);
        Cellule.getEtat();
        System.out.println(Cellule);
        GrilleDeJeu grille1 = new GrilleDeJeu(7, 7);
        System.out.println(grille1);
        grille1.activerDiagonaleMontante();
        grille1.activerDiagonaleDescendante();
        System.out.println(grille1);
        grille1.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println(grille1);
        grille1.melangerMatriceAleatoirement(50);
        System.out.println(grille1);
        grille1.eteindreToutesLesCellules();
        System.out.println(grille1);
        grille1.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println(grille1);
        test_matrice_eteintes = grille1.cellulesToutesEteintes();
        System.out.println(test_matrice_eteintes);
        grille1.activerColonneDeCellules(6);
        grille1.activerLigneDeCellules(0);
        System.out.println(grille1);
        

    }

}
