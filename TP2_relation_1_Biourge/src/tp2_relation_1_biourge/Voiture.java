/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_biourge;

/**
 *
 * @author utilisateur
 */
public class Voiture {
    String Modele1;
    String Marque;
    int PuissanceCV;

    public Voiture(String Modele, String Marque, int PuissanceCV) {
        Modele1 = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
    }

    @Override
    public String toString() {
        return "Voiture{" + "Modele1=" + Modele1 + ", Marque=" + Marque + ", PuissanceCV=" + PuissanceCV + '}';
    }
    
}
