/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android_java;

import java.util.Comparator;

/**
 *
 * @author hai
 */
public class Comparable_Comparator implements Comparable<Comparable_Comparator> {
    String name;
    int quatity;
    public Comparable_Comparator(String name,int quatity){
        this.name = name;
        this.quatity = quatity;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getQuantity(){
        return this.quatity;
    }
    
    @Override
    public int compareTo(Comparable_Comparator t) {
        //ascending
        return this.name.compareTo(t.getName());
        //descending
        //return t.getName().compareTo(this.name);
    }
    
    public static Comparator<Comparable_Comparator> compareQuantity = new Comparator<Comparable_Comparator>() {
        @Override
        public int compare(Comparable_Comparator t, Comparable_Comparator t1) {
            //ascending
           return t.getQuantity() - t1.getQuantity();
           //descending
           //return t1.getQuantity() - t.getQuantity();
        }
    };
    
}
