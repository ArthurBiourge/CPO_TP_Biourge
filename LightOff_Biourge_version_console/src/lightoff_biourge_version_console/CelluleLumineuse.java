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
        etat=false;
    }
    public boolean activerCellule(boolean etat_reçu ){
        if (etat_reçu == true){
            etat=false;
        }
        if (etat_reçu== false){
            etat=true;
        }
        return etat;
    }
    
}
