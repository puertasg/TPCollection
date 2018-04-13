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
    
    /**
     * 
     * @param u, Objet de type User
     * @return returnCode, 
     * compareTo retourne un nombre négatif entier, 0 ou un entier positif si 
     * l'objet actuel est plus plus petit, égal ou supérieur à celui passé en 
     * paramètre.
     * La comparaison s'effectue sur la valeur name des objets
     */
    @Override
    public int compareTo(User u)
    {
        int returnCode = 0;
        
        if(this.name.compareTo(u.getName()) > 0)
        {
            returnCode = 1;
        }
        
        if(this.name.compareTo(u.getName()) < 0)
        {
            returnCode = -1;
        }
        
        if(this.name.compareTo(u.getName()) == 0)
        {
            returnCode = 0;
        }
        
        return returnCode;
    }
}
