/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utilisateur
 */

public class Question {
    private String intitule; 
    private String proposition1;
    private String proposition2; 
    private String proposition3; 
    private String proposition4; 
    private int indexBonneReponse; 
    
    public Question(String intitule, String p1, String p2, String p3, String p4, int indexBonneReponse) {
        this.intitule = intitule;
        proposition1 = p1;
        proposition2 = p2;
        proposition3 = p3;
        proposition4 = p4;
        this.indexBonneReponse = indexBonneReponse;
        
        
    }

    public String getIntitule() {
        return intitule;
    }
    
    public String getProposition1() {
        return proposition1;
    }

    public String getProposition2() {
        return proposition2;
    }

    public String getProposition3() {
        return proposition3;
    }

    public String getProposition4() {
        return proposition4;
    }

    public int getIndexBonneReponse() {
        return indexBonneReponse;
    }
    
    
}
