/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
        
        User u = new User("A",0,true);
        users.add(u);
        User u1 = new User("F",0,true);
        users.add(u1);
        User u2 = new User("E",0,true);
        users.add(u2);
        User u3 = new User("C",0,true);
        users.add(u3);
        User u4 = new User("H",0,true);
        users.add(u4);
        User u5 = new User("B",0,true);
        users.add(u5);
        User u6 = new User("I",0,true);
        users.add(u6);
        User u7 = new User("D",0,true);
        users.add(u7);
        User u8 = new User("G",0,true);
        users.add(u8);
        User u9 = new User("J",0,true);
        users.add(u9);
        
        Collections.sort(users);
        users.remove(0);
        
        ArrayList<User> users2 = new ArrayList();
        User monUser = new User("Un", 0, false);
        users2.add(monUser);
        users2.add(monUser);
        users2.add(monUser);
        
        users.addAll(users2);
        
        printUsers(users);
    }
    
    public static void printUsers(ArrayList<User> l)
    {
        Iterator i = l.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
