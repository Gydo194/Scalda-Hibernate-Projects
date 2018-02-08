/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package init;

/**
 *
 * @author gydo194
 */

import datalayer.HibernateDAOFactory;
import domain.Project;
import domain.Werknemer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Starter {
    public static void main(String[] args) {
        System.out.println("started (Starter)");
        System.out.printf("Current Class path: '%s'.\n",System.getProperty("java.class.path"));
        Session ses = HibernateDAOFactory.getSession();
        
        Transaction ts = ses.beginTransaction();
        
       
        
        Werknemer w0 = new Werknemer("wr0","name","wprefix","insertion","address","postalCode","city","applicationDate",1.0,'A',null);
        Werknemer w1 = new Werknemer("wr1","name1","wprefix1","insertion1","address1","postalcode1","city1","applicationDate1",1.0,'A',null);
        
        Project pr = new Project("pro0","Project 0","location0",new Date(),1.0,w0);
        Project p2 = new Project("pro1","project1","location1",new Date(),1.0,w1);
        
        Collection<Project> p = new ArrayList<>(); //the  collection of projects an employee will work on
        p.add(pr);
        p.add(p2);
        
        w0.setProjects(p); //dump the array into the employee, this will be thrown into the join table Werknemer_Project
        w1.setProjects(p);
        
        
        
       
        
        
        ses.save(pr);
        ses.save(p2);
        
        ses.save(w0);
        ses.save(w1);
        
        try {
        ts.commit();
        } catch(HibernateException e) {
            //error
            System.out.println("Caught HibernateException... rolling back");
            e.printStackTrace();
            ts.rollback();
        } finally {
            System.out.println("Done");
        }
        
        HibernateDAOFactory.shutdown();
        
    }
}
