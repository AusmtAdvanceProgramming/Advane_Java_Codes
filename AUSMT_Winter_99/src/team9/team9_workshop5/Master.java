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
public class Master {
    private String MasterfirstName ;
    private String MasterlastName ;
    private String subject ;
    private char gender ;
    private int age ;
 
    public Master () {
    }
    public String getMasterfirstName (String a) {
        MasterfirstName=a ;
        return MasterfirstName ;
    }
    public String getMasterlastName (String b) {
        MasterlastName=b ;
        return MasterlastName ;
    }
    public String getsubject (String c) {
        subject=c ;
        return subject ;
    }
    public char getGender (char d) {
        gender=d ;
        return gender ;
    }
    public int getAge (int e) {
        age=e ;
        return age ;
    }
    public void training () {
    }
}