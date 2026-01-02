/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_biourge_version_console;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author utilisateur
 */
public class CelluleGraphique extends JButton {

    CelluleLumineuse celluleLumineuseAssociee;
    int largeur;
    int longueur;

    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur, int longueur) {
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        this.largeur = largeur;
        this.longueur = longueur;
        this.setPreferredSize(new java.awt.Dimension(36, 36));
    }

    @Override

    protected void paintComponent(Graphics g) {
        Image imageADessiner = null;
        if (celluleLumineuseAssociee.estEteint() == true) {
            var url = getClass().getResource("imgEteint.jpg");
        if (url != null) imageADessiner = new ImageIcon(url).getImage();
        } else {
            var url = getClass().getResource("imgAllume.jpg");
        if (url != null) imageADessiner = new ImageIcon(url).getImage();
        }
// Dessin de l'image dans le composant 
        if (imageADessiner != null) {
            g.drawImage(imageADessiner, 0, 0, this);

        }
    }
}
