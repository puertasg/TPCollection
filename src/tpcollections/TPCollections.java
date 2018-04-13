/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcollections;

import java.util.ArrayList;

/**
 *
 * @author diginamic05
 */
public class TPCollections {

    /**
     * 
     * @param args 
     * TP sur les collections d'objets, instancier un objet et l'ajouter à une collection
     */
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList();
        
        //Génère 10 user et les insère dans users
        for(int i = 0; i < 10; i++)
        {
            User u = new User();
            users.add(u);
        }
        
        printUsers(users);
    }
    
    public static void printUsers(ArrayList<User> l)
    {
        for(int i = 0; i < l.size(); i++)
        {
            System.out.println(l.get(i));
        }
    }
}
