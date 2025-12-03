/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_biourge;

/**
 *
 * @author utilisateur
 */
public class TP2_manip_Biourge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        // TP2 Exercice 3, Arthur Biourge
        Tartiflette assiette1 = new Tartiflette(500) ; 
        Tartiflette assiette2 = new Tartiflette(600) ; 
        Tartiflette assiette3 = assiette2 ;
         
        assiette2=assiette1;
        assiette1=assiette3;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ; 
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        Moussaka [] tabMoussaka = new Moussaka [10];
        Moussaka mousse1=new Moussaka(100);
        Moussaka mousse2=new Moussaka(101);
        Moussaka mousse3=new Moussaka(102);
        Moussaka mousse4=new Moussaka(103);
        Moussaka mousse5=new Moussaka(104);
        Moussaka mousse6=new Moussaka(105);
        Moussaka mousse7=new Moussaka(106);
        Moussaka mousse8=new Moussaka(107);
        Moussaka mousse9=new Moussaka(108);
        Moussaka mousse10=new Moussaka(109);
        mousse1=tabMoussaka[0];
        mousse2=tabMoussaka[1];
        mousse3=tabMoussaka[2];
        mousse4=tabMoussaka[3];
        mousse5=tabMoussaka[4];
        mousse6=tabMoussaka[5];
        mousse7=tabMoussaka[6];
        mousse8=tabMoussaka[7];
        mousse9=tabMoussaka[8];
        mousse10=tabMoussaka[9];
        
        
        
    }
    
}
