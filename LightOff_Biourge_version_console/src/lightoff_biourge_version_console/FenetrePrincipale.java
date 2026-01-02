/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_biourge_version_console;

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
    int taille =40;
    int xDepart = 60;       
    int yDepart = 60;

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
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(this.xDepart,this.yDepart,this.nbColonnes * this.taille, this.nbLignes * this.taille));
        initialiserPartie();
        PanneauGrille.setLayout(new GridLayout(this.nbLignes, this.nbColonnes));
        for (int h = 0; h < this.nbLignes; h++) {
            for (int k = 0; k < this.nbColonnes; k++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[h][k], taille, taille);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille }}
            }

        }
        PanneauBoutonsVerticaux.setLayout(new GridLayout(this.nbLignes, 1));
        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1,this.nbColonnes));
        PanneauBoutonDiagonaleDescendant.setLayout(new GridLayout(1,1));
        PanneauBoutonsDiagonaleMontant.setLayout(new GridLayout(1,1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(xDepart - taille, yDepart, taille, nbLignes * taille));
        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(xDepart, yDepart - taille, nbColonnes * taille, taille));
        getContentPane().add(PanneauBoutonDiagonaleDescendant, new org.netbeans.lib.awtextra.AbsoluteConstraints(xDepart - taille, yDepart - taille, taille, taille));
        getContentPane().add(PanneauBoutonsDiagonaleMontant,new org.netbeans.lib.awtextra.AbsoluteConstraints (xDepart - taille,  yDepart + (nbLignes * taille), taille,  taille));
        
        for (int i= 0; i < this.nbLignes; i++) {//début activer ligne automatique
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
        for (int i= 0; i < this.nbColonnes; i++) {//début activer colonne automatique
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
            bouton_diagonale_montant.setText("◣");
            
            
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
            FenetreVictoire f = new FenetreVictoire() ; 
            f.setVisible(true) ;
            System.out.println("-");

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

        btnLigne0 = new javax.swing.JButton();
        btnLigne1 = new javax.swing.JButton();
        btnLigne2 = new javax.swing.JButton();
        btnLigne3 = new javax.swing.JButton();
        btnLigne4 = new javax.swing.JButton();
        btnLigne5 = new javax.swing.JButton();
        btnLigne6 = new javax.swing.JButton();
        btnLigne7 = new javax.swing.JButton();
        btnLigne8 = new javax.swing.JButton();
        btnLigne9 = new javax.swing.JButton();
        btnColonne0 = new javax.swing.JButton();
        btnColonne1 = new javax.swing.JButton();
        btnColonne2 = new javax.swing.JButton();
        btnColonne3 = new javax.swing.JButton();
        btnColonne4 = new javax.swing.JButton();
        btnColonne5 = new javax.swing.JButton();
        btnColonne6 = new javax.swing.JButton();
        btnColonne7 = new javax.swing.JButton();
        btnColonne8 = new javax.swing.JButton();
        btnColonne9 = new javax.swing.JButton();
        PanneauGrille = new javax.swing.JPanel();
        texte_tentatives = new javax.swing.JLabel();
        nb_tentatives = new javax.swing.JLabel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        PanneauBoutonDiagonaleDescendant = new javax.swing.JPanel();
        PanneauBoutonsDiagonaleMontant = new javax.swing.JPanel();

        btnLigne0.setText(">");
        btnLigne0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne0ActionPerformed(evt);
            }
        });

        btnLigne1.setText(">");
        btnLigne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne1ActionPerformed(evt);
            }
        });

        btnLigne2.setText(">");
        btnLigne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne2ActionPerformed(evt);
            }
        });

        btnLigne3.setText(">");
        btnLigne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne3ActionPerformed(evt);
            }
        });

        btnLigne4.setText(">");
        btnLigne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne4ActionPerformed(evt);
            }
        });

        btnLigne5.setText(">");
        btnLigne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne5ActionPerformed(evt);
            }
        });

        btnLigne6.setText(">");
        btnLigne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne6ActionPerformed(evt);
            }
        });

        btnLigne7.setText(">");
        btnLigne7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne7ActionPerformed(evt);
            }
        });

        btnLigne8.setText(">");
        btnLigne8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne8ActionPerformed(evt);
            }
        });

        btnLigne9.setText(">");
        btnLigne9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne9ActionPerformed(evt);
            }
        });

        btnColonne0.setText("V");
        btnColonne0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne0ActionPerformed(evt);
            }
        });

        btnColonne1.setText("V");
        btnColonne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne1ActionPerformed(evt);
            }
        });

        btnColonne2.setText("V");
        btnColonne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne2ActionPerformed(evt);
            }
        });

        btnColonne3.setText("V");
        btnColonne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne3ActionPerformed(evt);
            }
        });

        btnColonne4.setText("V");
        btnColonne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne4ActionPerformed(evt);
            }
        });

        btnColonne5.setText("V");
        btnColonne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne5ActionPerformed(evt);
            }
        });

        btnColonne6.setText("V");
        btnColonne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne6ActionPerformed(evt);
            }
        });

        btnColonne7.setText("V");
        btnColonne7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne7ActionPerformed(evt);
            }
        });

        btnColonne8.setText("V");
        btnColonne8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne8ActionPerformed(evt);
            }
        });

        btnColonne9.setText("V");
        btnColonne9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne9ActionPerformed(evt);
            }
        });

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLigne0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne0ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(0);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnLigne0ActionPerformed

    private void btnColonne0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne0ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(0);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnColonne0ActionPerformed

    private void btnColonne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne1ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(1);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnColonne1ActionPerformed

    private void btnColonne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne2ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(2);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnColonne2ActionPerformed

    private void btnColonne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne3ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(3);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnColonne3ActionPerformed

    private void btnColonne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne4ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(4);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnColonne4ActionPerformed

    private void btnColonne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne5ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(5);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnColonne5ActionPerformed

    private void btnColonne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne6ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(6);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnColonne6ActionPerformed

    private void btnColonne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne7ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(7);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnColonne7ActionPerformed

    private void btnColonne8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne8ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(8);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnColonne8ActionPerformed

    private void btnColonne9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne9ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(9);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnColonne9ActionPerformed

    private void btnLigne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne2ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(2);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnLigne2ActionPerformed

    private void btnLigne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne1ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(1);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnLigne1ActionPerformed

    private void btnLigne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne3ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(3);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnLigne3ActionPerformed

    private void btnLigne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne4ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(4);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnLigne4ActionPerformed

    private void btnLigne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne5ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(5);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnLigne5ActionPerformed

    private void btnLigne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne6ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(6);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnLigne6ActionPerformed

    private void btnLigne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne7ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(7);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnLigne7ActionPerformed

    private void btnLigne8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne8ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(8);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnLigne8ActionPerformed

    private void btnLigne9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne9ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(9);
        GrilleInterfaceEteinte();
        Incrémentation();
        repaint();
    }//GEN-LAST:event_btnLigne9ActionPerformed

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
    private javax.swing.JButton btnColonne0;
    private javax.swing.JButton btnColonne1;
    private javax.swing.JButton btnColonne2;
    private javax.swing.JButton btnColonne3;
    private javax.swing.JButton btnColonne4;
    private javax.swing.JButton btnColonne5;
    private javax.swing.JButton btnColonne6;
    private javax.swing.JButton btnColonne7;
    private javax.swing.JButton btnColonne8;
    private javax.swing.JButton btnColonne9;
    private javax.swing.JButton btnLigne0;
    private javax.swing.JButton btnLigne1;
    private javax.swing.JButton btnLigne2;
    private javax.swing.JButton btnLigne3;
    private javax.swing.JButton btnLigne4;
    private javax.swing.JButton btnLigne5;
    private javax.swing.JButton btnLigne6;
    private javax.swing.JButton btnLigne7;
    private javax.swing.JButton btnLigne8;
    private javax.swing.JButton btnLigne9;
    private javax.swing.JLabel nb_tentatives;
    private javax.swing.JLabel texte_tentatives;
    // End of variables declaration//GEN-END:variables
}
