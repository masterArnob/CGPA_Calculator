/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.cgpa_cal_1_1;

/**
 *
 * @author Asus
 */
class User
{
    Integer ID;
   String Subject1, Subject2, Subject3 ,Subject4, Subject5;
   Integer CGPA;

    public User(Integer ID, String Subject1, String Subject2, String Subject3, String Subject4, String Subject5, Integer CGPA) {
        this.ID = ID;
        this.Subject1 = Subject1;
        this.Subject2 = Subject2;
        this.Subject3 = Subject3;
        this.Subject4 = Subject4;
        this.Subject5 = Subject5;
        this.CGPA = CGPA;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getSubject1() {
        return Subject1;
    }

    public void setSubject1(String Subject1) {
        this.Subject1 = Subject1;
    }

    public String getSubject2() {
        return Subject2;
    }

    public void setSubject2(String Subject2) {
        this.Subject2 = Subject2;
    }

    public String getSubject3() {
        return Subject3;
    }

    public void setSubject3(String Subject3) {
        this.Subject3 = Subject3;
    }

    public String getSubject4() {
        return Subject4;
    }

    public void setSubject4(String Subject4) {
        this.Subject4 = Subject4;
    }

    public String getSubject5() {
        return Subject5;
    }

    public void setSubject5(String Subject5) {
        this.Subject5 = Subject5;
    }

    public Integer getCGPA() {
        return CGPA;
    }

    public void setCGPA(Integer CGPA) {
        this.CGPA = CGPA;
    }
   
   
    
    
    
}
