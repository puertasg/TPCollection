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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList();
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
            System.out.println("Nom : " + l.get(i).getName() + " Age : " + l.get(i).getName() + " est un homme : " + l.get(i).isIsMale());
        }
    }
}
