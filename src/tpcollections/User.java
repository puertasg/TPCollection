/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcollections;

/**
 *
 * @author diginamic05
 */
public class User {
    private String name;
    private Integer age;
    private boolean isMale;
    
    public User()
    {
        this.name = "";
        this.age = 0;
        this.isMale = false;
    }
    
    public User(String n, Integer a, boolean ism)
    {
        this.age = a;
        this.name = n;
        this.isMale = ism;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @return the isMale
     */
    public boolean isIsMale() {
        return isMale;
    }
    
    public String toString()
    {
        return "Nom : " + this.name + " Age : " + this.age + " est un homme : " + this.isMale;
    }
}
