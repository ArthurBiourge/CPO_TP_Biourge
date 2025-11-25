/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_biourge;

/**
 *
 * @author utilisateur
 */
public class Magicien extends Personnage {
     boolean confirmer;
    public Magicien(String pe_nom, int pe_vie, boolean pe_confirme ) {
        super(pe_nom, pe_vie);
        confirmer = pe_confirme;
        
        }

    public void setConfirmer(boolean confirmer) {
        this.confirmer = confirmer;
    }
    
    }
     

