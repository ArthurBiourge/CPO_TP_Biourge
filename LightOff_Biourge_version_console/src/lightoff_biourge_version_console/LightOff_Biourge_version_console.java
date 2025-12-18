/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_biourge_version_console;

/**
 *
 * @author utilisateur
 */
public class LightOff_Biourge_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         CelluleLumineuse Cellule =new  CelluleLumineuse();
         System.out.println(Cellule);
         Cellule.activerCellule();
         System.out.println(Cellule);
         Cellule.eteindreCellule();
         System.out.println(Cellule);
         Cellule.getEtat();
         System.out.println(Cellule);
        
    }
    
}
