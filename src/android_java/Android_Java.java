/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android_java;

import java.util.Arrays;

/**
 *
 * @author hai
 */
public class Android_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comparable_Comparator[] arrOb = new Comparable_Comparator[3];
        Comparable_Comparator o1 = new Comparable_Comparator("ba",23);
        Comparable_Comparator o2 = new Comparable_Comparator("arer",28);
        Comparable_Comparator o3 = new Comparable_Comparator("zer",12);
        
        arrOb[0] = o1;
        arrOb[1] = o2;
        arrOb[2] = o3;
        
//        Arrays.sort(arrOb);
//        for(int i=0;i<arrOb.length;i++){
//             System.out.println(arrOb[i].name);
//        }
        
        Arrays.sort(arrOb,Comparable_Comparator.compareQuantity);
        for(int i=0;i<arrOb.length;i++){
             System.out.println(arrOb[i].quatity);
        }
    }
    
}
