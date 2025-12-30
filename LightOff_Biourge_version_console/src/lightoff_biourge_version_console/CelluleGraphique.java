/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_biourge_version_console;

import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author utilisateur
 */
public class CelluleGraphique extends JButton {
    CelluleLumineuse celluleLumineuseAssociee;
    int largeur;
    int hauteur;

    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur, int longueur) {
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        this.largeur = largeur;
        this.hauteur = longueur;
    }
@Override 
protected void paintComponent(Graphics g) { 
    super.paintComponent(g);  
    this.setText(celluleLumineuseAssociee.toString());}
}