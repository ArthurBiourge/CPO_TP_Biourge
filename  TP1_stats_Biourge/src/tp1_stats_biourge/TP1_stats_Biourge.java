/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_biourge;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author utilisateur
 */
public class TP1_stats_Biourge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Arthur Biourge 28/10/2025 TP1 exercice 4
        int m;
        double[] tabDe = new double[6];
        int nbalea;
        String ecrit = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("saisisez un nombre entier");
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            Random generateurAleat = new Random();
            nbalea = generateurAleat.nextInt(6);
            tabDe[nbalea] = tabDe[nbalea] + 1.0;
        }
        for (int i = 0; i < tabDe.length; i++) {
            if (i == 0) {
                ecrit = "[" + (tabDe[i] / m) * 100 + "%" + " ";
            } else if (i == tabDe.length - 1) {
                ecrit = ecrit + "; " + (tabDe[i] / m) * 100 + "%" + "]";
            } else if (i != 0 && i != tabDe.length) {
                ecrit = ecrit + "; " + (tabDe[i] / m) * 100 + "%" + " ";
            }
        }
        System.out.println(ecrit);

    }

}
