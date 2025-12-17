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

    private boolean etat;

    public CelluleLumineuse(boolean etat_reçu) {
        this.etat = etat_reçu;
        etat = false;
    }

    public void activerCellule(boolean etat_reçu_2) {
        if (etat_reçu_2 == true) {
            etat = false;
        }
        if (etat_reçu_2 == false) {
            etat = true;
        }

    }

    public boolean eteindreCellule(boolean etat_reçu_3) {
        if (etat_reçu_3 == true) {
            etat = false;
        } else {
            etat = false;
        }
        return etat;
    }

    public boolean estEteint(boolean etat_reçu_4) {
        if (etat_reçu_4 == false) {
            etat = true;
        }
        if (etat_reçu_4 == true) {
            etat = false;
        }
        return etat;
    }

    public boolean getEtat(boolean etat_reçu_4) {
        if (etat_reçu_4 == true) {
            etat = true;
        }
        if (etat_reçu_4 == false) {
            etat = false;
        }
        return etat;
    }

    @Override
    public String toString() {
        if (etat == true) {
            return "O";
        } else if (etat == false) {
            return "X";
        }
    }

}
