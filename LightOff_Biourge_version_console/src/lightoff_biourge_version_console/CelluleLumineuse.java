/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_biourge_version_console;

/**
 *
 * @author utilisateur
 */
public class CelluleLumineuse {

    private boolean etat; // la cellule possède l'etat elle ne l'as pas, c'est lui l'état

    public CelluleLumineuse() {
        etat = false;
    }

    public void activerCellule() {
        if (etat == true) {
            etat = false;
        }
        if (etat == false) {
            etat = true;
        }

    }

    public boolean eteindreCellule() {
        if (etat == true) {
            etat = false;
        } else {
            etat = false;
        }
        return etat;
    }

    public boolean estEteint(boolean etat_reçu_4) {
        if (etat == false) {
            etat = true;
        }
        if (etat_reçu_4 == true) {
            etat = false;
        }
        return etat;
    }

    public boolean getEtat() {
        if (etat == true) {
            etat = true;
        }
        if (etat == false) {
            etat = false;
        }
        return etat;
    }

    @Override
    public String toString() {
        if (etat == true) {
            return "O";
        } else {
            return "X";
        }
    }

}
