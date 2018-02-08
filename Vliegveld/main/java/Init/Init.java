/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Init;

import Misc.HibernateDAOFactory;
import main.Employee;
import main.Hangaar;
import main.Onderhoudsbeurt;
import main.Piloot;
import main.Vliegtuig;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
//import javax.persistence.*;

/**
 *
 * @author gydo194
 */
public class Init {

    public static void main(String[] args) {
        System.out.println("Started (init)");
        Session ses = HibernateDAOFactory.getSession();
        Transaction t = ses.beginTransaction();
        //do whatever needs to be done

         
        
        Vliegtuig v0 = new Vliegtuig(1, 1212, "cessna", 120, 900);
        Vliegtuig v1 = new Vliegtuig(2, 1213, "boing", 7000, 12000);
        Vliegtuig v2 = new Vliegtuig(4, 1389, "concorde", 0, 1300);
        Vliegtuig v3 = new Vliegtuig(3, 1190, "spitfire", 120, 100);
        
        ses.save(v0);
        ses.save(v1);
        ses.save(v2);
        ses.save(v3);
        
        
        
        Hangaar h0 = new Hangaar();
        h0.setId(0);
        h0.setSurface(400);
        h0.addPlane(v0);
        h0.addPlane(v3);
        
        
        Hangaar h1 = new Hangaar();
        h1.setId(1);
        h1.setSurface(900);
        h1.addPlane(v1);
        h1.addPlane(v2);
        
        
        ses.save(h0);
        ses.save(h1);
        
        Piloot p0 = new Piloot(392803219, 2423, "pilotOne", "pilots", "pilot Street", "Pilot City", 1, "1234PC", "060000", "");
        Piloot p1 = new Piloot(392802433, 2224, "pilotOne", "pilots", "pilot Street", "Pilot City", 2, "1234PC", "060000", "");
        Piloot p2 = new Piloot(324908889, 3553, "pilotOne", "pilots", "pilot Street", "Pilot City", 3, "1234PC", "060000", "");
        Piloot p3 = new Piloot(983489372, 1388, "pilotOne", "pilots", "pilot Street", "Pilot City", 4, "1234PC", "060000", "");
        
        ses.save(p0);
        ses.save(p1);
        ses.save(p2);
        ses.save(p3);
        
        
        Employee e0 = new Employee("982374892", "emp0", "empLastName", "Employee Street", "1234ES", "Employee City", 1, 99.9, "day", "06-2342443");
        Employee e1 = new Employee("039849023", "emp1", "empLastName", "Employee Street", "1234ES", "Employee City", 2, 99.9, "day", "06-2342443");
        Employee e2 = new Employee("398274892", "emp2", "empLastName", "Employee Street", "1234ES", "Employee City", 3, 99.9, "day", "06-2342443");
        Employee e3 = new Employee("239847532", "emp3", "empLastName", "Employee Street", "1234ES", "Employee City", 4, 99.9, "day", "06-2342443");
        
        
        ses.save(e0);
        ses.save(e1);
        ses.save(e2);
        ses.save(e3);
        
        Onderhoudsbeurt o0 = new Onderhoudsbeurt(0, e3, 5, "rewired electronics, dunno if its ok, if plane crashes, wasnt me.");
        Onderhoudsbeurt o1 = new Onderhoudsbeurt(1, e0, 5, "replaced worn tire");
        Onderhoudsbeurt o2 = new Onderhoudsbeurt(2, e1, 5, "engine check");
        Onderhoudsbeurt o3 = new Onderhoudsbeurt(3, e2, 5, "damn birds");
        
        ses.save(o0);
        ses.save(o1);
        ses.save(o2);
        ses.save(o3);
        
        
        
        
        
        //try to commit the transaction, if fails print the exception. this should be extended to t.rollback().
        try {
            t.commit();
        } catch (HibernateException ex) {
            System.out.println("caught hibernate exception :(\nprinting stacktrace...");
            ex.printStackTrace();
        } finally {
            System.out.println("Finished, shutting down..");
            HibernateDAOFactory.shutdown();
        }

    }
}
