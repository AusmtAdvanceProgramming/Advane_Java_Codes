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
public class course {
    private String lessonName ;
    private String masterName ;
    private String holdingRoom ;
    private int numberOfUnit ;
    private int numberOfStudent ;
  

    public String getLessonName (String a) {
        lessonName=a ;
        return lessonName ;
    } 
    public String getMasterName (String b) {
        masterName=b ;
        return masterName ;
    } 
    public String getHoldingRoom (String c) {
        holdingRoom=c ;
        return holdingRoom ;
    } 
    public int getNumberOfUnit (int d) {
        numberOfUnit=d ;
        return numberOfUnit ;
    }
    public int getNumberOfStudent (int e) {
        numberOfStudent=e ;
        return numberOfStudent ;
    }
    public void getStarted () {
    }
}
