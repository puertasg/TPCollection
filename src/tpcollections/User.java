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
        String genre;
        if(this.isMale == true)
        {
            genre = "masculin";
        }
        else
        {
            genre = "féminin";
        }
        
        return "Nom : " + this.name + " Age : " + this.age + " Genre : " + genre;
    }
    
    /**
     * 
     * @param u, Objet de type User
     * @return Résultat de la comparaison
     * compareTo retourne un nombre négatif entier, 0 ou un entier positif si 
     * l'objet actuel est plus plus petit, égal ou supérieur à celui passé en 
     * paramètre.
     * La comparaison s'effectue sur la valeur lexicographique de l'attribut 
     * name des objets (ordre alphabétique)
     */
    @Override
    public int compareTo(User u)
    {
        return this.name.compareTo(u.getName());
    }
}
