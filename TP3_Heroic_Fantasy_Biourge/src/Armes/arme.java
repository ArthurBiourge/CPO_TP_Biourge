/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author utilisateur
 */
public abstract class  arme {

    String nom;
    int NA;

    public arme (String p_nom, int p_NA) {
        nom = p_nom;
        if (p_NA <= 100) {
            NA = p_NA;
        } else {
            NA = 100;
        }

    }

    public String getNom() {
        return nom;
    }

    public int getNA() {
        return NA;
    }

    @Override
    public String toString() {
        return nom + " niveau " + NA ;
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String NA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String nom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

}
