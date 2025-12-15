
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author utilisateur
 */
public class FenetreQuiz extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FenetreQuiz.class.getName());

    Question[] QC = new Question[50];
    /**
     * Creates new form FenetreQuiz
     */
    private int indexQuestionCourante = 0;

    public FenetreQuiz() {
        initComponents();
        Question QC1 = new Question("le chat de Schrodinger est-il mort", "oui", "non", "peut-être", "le chat sait", 4);
        Question QC2 = new Question("La Terre est-elle ronde", "oui", "non", "plate", "on ne sait pas", 1);
        Question QC3 = new Question("La lumière est-elle une onde", "oui", "non", "particule", "les deux", 4);
        Question QC4 = new Question("L’eau bout-elle à 100 degrés", "oui", "non", "parfois", "jamais", 1);
        Question QC5 = new Question("Le Soleil est-il une étoile", "oui", "non", "planète", "comète", 1);
        Question QC6 = new Question("La Lune influence-t-elle les marées", "oui", "non", "rarement", "jamais", 1);
        Question QC7 = new Question("Un électron a-t-il une charge négative", "oui", "non", "positive", "neutre", 1);
        Question QC8 = new Question("La vitesse de la lumière est-elle constante", "oui", "non", "variable", "inconnue", 1);
        Question QC9 = new Question("Les dinosaures ont-ils disparu", "oui", "non", "encore là", "peut-être", 1);
        Question QC10 = new Question("Le zéro est-il un nombre", "oui", "non", "symbole", "concept", 1);
        Question QC11 = new Question("La gravité attire-t-elle vers le centre", "oui", "non", "repousse", "neutre", 1);
        Question QC12 = new Question("L’eau est-elle composée de H2O", "oui", "non", "CO2", "O2", 1);
        Question QC13 = new Question("La photosynthèse produit-elle de l’oxygène", "oui", "non", "hydrogène", "azote", 1);
        Question QC14 = new Question("La matière noire est-elle visible", "oui", "non", "parfois", "jamais", 2);
        Question QC15 = new Question("Un triangle a-t-il trois côtés", "oui", "non", "quatre", "cinq", 1);
        Question QC16 = new Question("La musique est-elle un art", "oui", "non", "science", "sport", 1);
        Question QC17 = new Question("La mer Méditerranée est-elle salée", "oui", "non", "douce", "variable", 1);
        Question QC18 = new Question("Les volcans rejettent-ils de la lave", "oui", "non", "eau", "glace", 1);
        Question QC19 = new Question("Un mammifère allaite-t-il ses petits", "oui", "non", "parfois", "jamais", 1);
        Question QC20 = new Question("La France est-elle en Europe", "oui", "non", "Asie", "Afrique", 1);
        Question QC21 = new Question("Un carré a-t-il quatre angles droits", "oui", "non", "trois", "cinq", 1);
        Question QC22 = new Question("La vitesse se mesure-t-elle en m/s", "oui", "non", "kg", "litres", 1);
        Question QC23 = new Question("La banane est-elle un fruit", "oui", "non", "légume", "racine", 1);
        Question QC24 = new Question("Le feu a-t-il besoin d’oxygène", "oui", "non", "hydrogène", "azote", 1);
        Question QC25 = new Question("Un ordinateur utilise-t-il des bits", "oui", "non", "octets", "mots", 1);
        Question QC26 = new Question("La mer Morte est-elle très salée", "oui", "non", "douce", "neutre", 1);
        Question QC27 = new Question("Les abeilles produisent-elles du miel", "oui", "non", "cire", "pollen", 1);
        Question QC28 = new Question("La Lune tourne-t-elle autour de la Terre", "oui", "non", "Soleil", "Mars", 1);
        Question QC29 = new Question("Un humain a-t-il 206 os", "oui", "non", "300", "150", 1);
        Question QC30 = new Question("La glace fond-elle à 0 degré", "oui", "non", "100", "-10", 1);
        Question QC31 = new Question("Le sang transporte-t-il de l’oxygène", "oui", "non", "azote", "hydrogène", 1);
        Question QC32 = new Question("La mer Rouge est-elle une mer", "oui", "non", "lac", "océan", 1);
        Question QC33 = new Question("Un cercle a-t-il un centre", "oui", "non", "deux", "aucun", 1);
        Question QC34 = new Question("La vitesse du son est-elle plus lente que la lumière", "oui", "non", "égale", "inconnue", 1);
        Question QC35 = new Question("Les plantes ont-elles besoin de lumière", "oui", "non", "jamais", "rarement", 1);
        Question QC36 = new Question("Un atome est-il composé de protons", "oui", "non", "électrons", "neutrons", 1);
        Question QC37 = new Question("La mer Caspienne est-elle fermée", "oui", "non", "ouverte", "océan", 1);
        Question QC38 = new Question("Un chien est-il un carnivore", "oui", "non", "herbivore", "omnivore", 4);
        Question QC39 = new Question("La Terre tourne-t-elle autour du Soleil", "oui", "non", "Lune", "Mars", 1);
        Question QC40 = new Question("Un rectangle a-t-il deux côtés égaux", "oui", "non", "tous", "aucun", 1);
        Question QC41 = new Question("Le pétrole est-il une énergie fossile", "oui", "non", "renouvelable", "nucléaire", 1);
        Question QC42 = new Question("Un avion vole-t-il grâce à la portance", "oui", "non", "gravité", "moteur seul", 1);
        Question QC43 = new Question("La mer Baltique est-elle en Europe", "oui", "non", "Asie", "Afrique", 1);
        Question QC44 = new Question("Un poisson respire-t-il avec des branchies", "oui", "non", "poumons", "peau", 1);
        Question QC45 = new Question("La vitesse se calcule-t-elle distance/temps", "oui", "non", "masse", "énergie", 1);
        Question QC46 = new Question("Un volcan peut-il être éteint", "oui", "non", "jamais", "toujours", 1);
        Question QC47 = new Question("La mer Noire est-elle une mer", "oui", "non", "lac", "océan", 1);
        Question QC48 = new Question("Un arc-en-ciel contient-il sept couleurs", "oui", "non", "plus", "moins", 1);
        Question QC49 = new Question("La Grande Muraille de Chine est-elle visible depuis l’espace", "oui", "non", "parfois", "jamais", 2);
        Question QC50 = new Question("Un kilogramme équivaut-il à 1000 grammes", "oui", "non", "500", "2000", 1);

        QC[0] = QC1;
        QC[1] = QC2;
        QC[2] = QC3;
        QC[3] = QC4;
        QC[4] = QC5;
        QC[5] = QC6;
        QC[6] = QC7;
        QC[7] = QC8;
        QC[8] = QC9;
        QC[9] = QC10;
        QC[10] = QC11;
        QC[11] = QC12;
        QC[12] = QC13;
        QC[13] = QC14;
        QC[14] = QC15;
        QC[15] = QC16;
        QC[16] = QC17;
        QC[17] = QC18;
        QC[18] = QC19;
        QC[19] = QC20;
        QC[20] = QC21;
        QC[21] = QC22;
        QC[22] = QC23;
        QC[23] = QC24;
        QC[24] = QC25;
        QC[25] = QC26;
        QC[26] = QC27;
        QC[27] = QC28;
        QC[28] = QC29;
        QC[29] = QC30;
        QC[30] = QC31;
        QC[31] = QC32;
        QC[32] = QC33;
        QC[33] = QC34;
        QC[34] = QC35;
        QC[35] = QC36;
        QC[36] = QC37;
        QC[37] = QC38;
        QC[38] = QC39;
        QC[39] = QC40;
        QC[40] = QC41;
        QC[41] = QC42;
        QC[42] = QC43;
        QC[43] = QC44;
        QC[44] = QC45;
        QC[45] = QC46;
        QC[46] = QC47;
        QC[47] = QC48;
        QC[48] = QC49;
        QC[49] = QC50;

        afficherQuestionCourante();
    }

    private void afficherQuestionCourante() {
        Question q = QC[indexQuestionCourante];
        Questions.setText(q.getIntitule());
        Bouton1.setText(q.getProposition1());
        Bouton2.setText(q.getProposition2());
        Bouton3.setText(q.getProposition3());
        Bouton4.setText(q.getProposition4());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Questions = new javax.swing.JLabel();
        Bouton1 = new javax.swing.JButton();
        Bouton2 = new javax.swing.JButton();
        Bouton3 = new javax.swing.JButton();
        Bouton4 = new javax.swing.JButton();
        Suivant = new javax.swing.JButton();
        Score = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Questions.setText("jLabel1");
        getContentPane().add(Questions, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        Bouton1.setText("jButton1");
        Bouton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bouton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        Bouton2.setText("jButton2");
        Bouton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton2ActionPerformed(evt);
            }
        });
        getContentPane().add(Bouton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        Bouton3.setText("jButton3");
        Bouton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton3ActionPerformed(evt);
            }
        });
        getContentPane().add(Bouton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        Bouton4.setText("jButton4");
        Bouton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton4ActionPerformed(evt);
            }
        });
        getContentPane().add(Bouton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        Suivant.setText("jButton1");
        getContentPane().add(Suivant, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        Score.setText("jLabel1");
        getContentPane().add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bouton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton1ActionPerformed
        Question q = QC[indexQuestionCourante];
        if (q.getIndexBonneReponse() == 1) {
            Score.setText("OK");
        } else {
            Score.setText("pas bon");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Bouton1ActionPerformed

    private void Bouton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton2ActionPerformed
        Question q = QC[indexQuestionCourante];
        if (q.getIndexBonneReponse() == 2) {
            Score.setText("OK");
        } else {
            Score.setText("pas bon");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_Bouton2ActionPerformed

    private void Bouton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton3ActionPerformed
        // TODO add your handling code here:
        Question q = QC[indexQuestionCourante];
        if (q.getIndexBonneReponse() == 3) {
            Score.setText("OK");
        } else {
            Score.setText("pas bon");
            
                // TODO add your handling code here:
    }//GEN-LAST:event_Bouton3ActionPerformed
    }
    private void Bouton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bouton4ActionPerformed
                                          
        
    }
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
        java.awt.EventQueue.invokeLater(() -> new FenetreQuiz().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bouton1;
    private javax.swing.JButton Bouton2;
    private javax.swing.JButton Bouton3;
    private javax.swing.JButton Bouton4;
    private javax.swing.JLabel Questions;
    private javax.swing.JLabel Score;
    private javax.swing.JButton Suivant;
    // End of variables declaration//GEN-END:variables
}
