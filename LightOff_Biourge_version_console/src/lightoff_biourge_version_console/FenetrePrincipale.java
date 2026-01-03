/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_biourge_version_console;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author utilisateur
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName());
    GrilleDeJeu grille;
    int nbCoups;
    int g_tour = 10;
    int nbLignes = 10;
    int nbColonnes = 10;
    int taille = 40;
    int xDepart = 60;
    int yDepart = 60;
    int victoire = 0;

    /**
     * Creates new form FenetrePrincipale
     */
    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(g_tour);

    }

    public FenetrePrincipale() {
        initComponents();
        nb_tentatives.setText("0");
        this.grille = new GrilleDeJeu(this.nbLignes, this.nbColonnes);
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(this.xDepart, this.yDepart, this.nbColonnes * this.taille, this.nbLignes * this.taille));
        initialiserPartie();
        PanneauGrille.setLayout(new GridLayout(this.nbLignes, this.nbColonnes));
        for (int h = 0; h < this.nbLignes; h++) {
            for (int k = 0; k < this.nbColonnes; k++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[h][k], taille, taille);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille }}
            }

        }
        PanneauBoutonsVerticaux.setLayout(new GridLayout(this.nbLignes, 1));
        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, this.nbColonnes));
        PanneauBoutonDiagonaleDescendant.setLayout(new GridLayout(1, 1));
        PanneauBoutonsDiagonaleMontant.setLayout(new GridLayout(1, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(xDepart - taille, yDepart, taille, nbLignes * taille));
        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(xDepart, yDepart - taille, nbColonnes * taille, taille));
        getContentPane().add(PanneauBoutonDiagonaleDescendant, new org.netbeans.lib.awtextra.AbsoluteConstraints(xDepart - taille, yDepart - taille, taille, taille));
        getContentPane().add(PanneauBoutonsDiagonaleMontant, new org.netbeans.lib.awtextra.AbsoluteConstraints(xDepart - taille, yDepart + (nbLignes * taille), taille, taille));

        for (int i = 0; i < this.nbLignes; i++) {//début activer ligne automatique
            JButton bouton_ligne = new JButton();
            bouton_ligne.setText("▶");

            final int j = i;
            ActionListener ecouteurClick;
            ecouteurClick = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    Incrémentation();
                    GrilleInterfaceEteinte();
                    repaint();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);//fin activer ligne automatique
        }
        for (int i = 0; i < this.nbColonnes; i++) {//début activer colonne automatique
            JButton bouton_colonne = new JButton();
            bouton_colonne.setText("▼");
            bouton_colonne.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
            final int j = i;
            ActionListener ecouteurClick;
            ecouteurClick = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    Incrémentation();
                    GrilleInterfaceEteinte();
                    repaint();
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsHorizontaux.add(bouton_colonne);//fin activer colonne automatique
        }
        JButton bouton_diagonale_descendant = new JButton();
        bouton_diagonale_descendant.setText("◢");

        ActionListener ecouteurClick;
        ecouteurClick = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleDescendante();
                Incrémentation();
                GrilleInterfaceEteinte();
                repaint();

            }
        };
        bouton_diagonale_descendant.addActionListener(ecouteurClick);
        PanneauBoutonDiagonaleDescendant.add(bouton_diagonale_descendant);//fin activer ligne automatique
        JButton bouton_diagonale_montant = new JButton();
        bouton_diagonale_montant.setText("◥");

        ecouteurClick = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleMontante();
                Incrémentation();
                GrilleInterfaceEteinte();
                repaint();
            }

        };
        bouton_diagonale_montant.addActionListener(ecouteurClick);
        PanneauBoutonsDiagonaleMontant.add(bouton_diagonale_montant);

        this.pack();
        this.revalidate();
    }

    public void GrilleInterfaceEteinte() {
        boolean etat;
        int nb_etat = 0;
        for (int i = 0; i < this.nbLignes; i++) {
            for (int j = 0; j < this.nbColonnes; j++) {
                etat = this.grille.matriceCellules[i][j].getEtat();
                if (etat == true) {
                    nb_etat += 1;
                }
            }
        }
        if (nb_etat == 0) {
            FenetreVictoire f = new FenetreVictoire();
            f.setVisible(true);
            for (Component c : PanneauBoutonsVerticaux.getComponents()) {//compononent permet de prendre tout les boutons d'u panel d'un coup pour ensuite les désactivé.
                c.setEnabled(false);
            }

            for (Component c : PanneauBoutonsHorizontaux.getComponents()) {
                c.setEnabled(false);
            }

            for (Component c : PanneauBoutonsDiagonaleMontant.getComponents()) {
                c.setEnabled(false);
            }

            for (Component c : PanneauBoutonDiagonaleDescendant.getComponents()) {
                c.setEnabled(false);
            }

        }

    }

    public void Incrémentation() {
        int incrementer = 0;
        incrementer = Integer.parseInt(nb_tentatives.getText());
        incrementer += 1;
        nb_tentatives.setText("" + incrementer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        texte_tentatives = new javax.swing.JLabel();
        nb_tentatives = new javax.swing.JLabel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        PanneauBoutonDiagonaleDescendant = new javax.swing.JPanel();
        PanneauBoutonsDiagonaleMontant = new javax.swing.JPanel();
        btn_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 400, 400));

        texte_tentatives.setText("tentatives:");
        getContentPane().add(texte_tentatives, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, -1));
        getContentPane().add(nb_tentatives, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 30, 20));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 400));

        PanneauBoutonsHorizontaux.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 400, 70));

        PanneauBoutonDiagonaleDescendant.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout PanneauBoutonDiagonaleDescendantLayout = new javax.swing.GroupLayout(PanneauBoutonDiagonaleDescendant);
        PanneauBoutonDiagonaleDescendant.setLayout(PanneauBoutonDiagonaleDescendantLayout);
        PanneauBoutonDiagonaleDescendantLayout.setHorizontalGroup(
            PanneauBoutonDiagonaleDescendantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanneauBoutonDiagonaleDescendantLayout.setVerticalGroup(
            PanneauBoutonDiagonaleDescendantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonDiagonaleDescendant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        PanneauBoutonsDiagonaleMontant.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout PanneauBoutonsDiagonaleMontantLayout = new javax.swing.GroupLayout(PanneauBoutonsDiagonaleMontant);
        PanneauBoutonsDiagonaleMontant.setLayout(PanneauBoutonsDiagonaleMontantLayout);
        PanneauBoutonsDiagonaleMontantLayout.setHorizontalGroup(
            PanneauBoutonsDiagonaleMontantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanneauBoutonsDiagonaleMontantLayout.setVerticalGroup(
            PanneauBoutonsDiagonaleMontantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsDiagonaleMontant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        btn_menu.setText("retour au menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
        for (Component c : PanneauBoutonsVerticaux.getComponents()) {
                c.setEnabled(false);
            }

            for (Component c : PanneauBoutonsHorizontaux.getComponents()) {
                c.setEnabled(false);
            }

            for (Component c : PanneauBoutonsDiagonaleMontant.getComponents()) {
                c.setEnabled(false);
            }

            for (Component c : PanneauBoutonDiagonaleDescendant.getComponents()) {
                c.setEnabled(false);
            }
        FenetreTitre g =new FenetreTitre();
        g.setVisible(true);
        
        
    }//GEN-LAST:event_btn_menuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FenetrePrincipale().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonDiagonaleDescendant;
    private javax.swing.JPanel PanneauBoutonsDiagonaleMontant;
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btn_menu;
    private javax.swing.JLabel nb_tentatives;
    private javax.swing.JLabel texte_tentatives;
    // End of variables declaration//GEN-END:variables
}
