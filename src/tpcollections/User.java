/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcollections;

import java.util.Comparator;

/**
 *
 * @author diginamic05
 */
public class User implements Comparable<User>{
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
    
    @Override
    public String toString()
    {
        return "Nom : " + this.name + " Age : " + this.age + " est un homme : " + this.isMale;
    }
    
    @Override
    public int compareTo(User u)
    {
        int returnCode = 0;
        int asciinom = (int) this.name.toLowerCase().charAt(0);
        int asciiu = (int) u.getName().toLowerCase().charAt(0);
        
        if(asciinom > asciiu)
        {
            returnCode = 1;
        }
        
        if(asciinom < asciiu)
        {
            returnCode = -1;
        }
        
        if(asciinom == asciiu)
        {
            returnCode = 0;
        }
        
        return returnCode;
    }
}
