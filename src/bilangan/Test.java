/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bilangan;

/**
 *
 * @author choirulhuda
 */
public class Test {
    public static void main(String[] args) {
        int a = 5, b = 2;
        double hasil = Math.pow(a, b);
        double result = 0;
        
        
        System.out.println("Hasil: "+hasil);
        
        for (int i = 0; i < 5; i++) {
            result += Math.pow(2, i);
        }        
        System.out.println("Result: "+result);
        
        /*Konversi Biner ke Desimal*/
        String biner = "1110"; //14
        String[] binerReverse = new String[biner.length()];
        double resultDecimal = 0;
        
        //reverse
        int n = 0;
        for (int i = biner.length()-1 ; i >= 0 ; i--) {
            binerReverse[n] = String.valueOf(biner.charAt(i));
            n++;
        }
        
        System.out.println("Biner: "+biner);
        for (int i = 0; i < binerReverse.length; i++) {
            if (Integer.parseInt(binerReverse[i]) == 1) {
                resultDecimal += Math.pow(2, i);
            }            
        }
        
        System.out.println("\n== Konversi Biner ke Desimal ==");
        System.out.println("Biner: "+biner);
        System.out.println("Desimal: "+resultDecimal);
    }
}
