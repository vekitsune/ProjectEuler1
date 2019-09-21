/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplesof3and5;

import javax.swing.JOptionPane;

/**
 *
 * @author Verosffy
 */
public class MultiplesOf3and5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        int hatar=(Integer.parseInt(JOptionPane.showInputDialog(null, "Add meg az értéket, ami alattkiváncsi vagy 3 és 5 többszöröseinek összeglre")));
     for(int i=0;i<hatar;i++){
         if((i%3==0)||(i%5==0)){
             sum+=i;
         }
     }
        JOptionPane.showMessageDialog(null, "Az összeg: "+sum);
    }
    
}
