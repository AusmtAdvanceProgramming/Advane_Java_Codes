/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team9_workshop5;

/**
 *
 * @author Aliasqar ranjbar & zeynab karimizad
 */
public class student {
    
    private String studentfirstName ;
    private String studentlastName ;
    private boolean righthand ;
    private double stature ;
    private int eyecolor ;
 
    public String getstudentfirstName (String a) {
        studentfirstName=a ;
        return studentfirstName ;
    }
    public String getstudentlastName (String b) {
        studentlastName=b ;
        return studentlastName ;
    }
    public boolean getrighthand (boolean c) {
        righthand=c ;
        return righthand ;
    }
    public double getstature (double d) {
        stature=d ;
        return stature ;
    }
    public int geteyecolor (int e) {
        eyecolor=e ;
        return eyecolor ;
    }
    public void study () {
    }
}