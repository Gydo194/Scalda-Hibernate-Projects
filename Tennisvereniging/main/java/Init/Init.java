/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Init;

import Misc.HibernateDAOFactory;
import java.util.ArrayList;
import java.util.Collection;
import tennis.Speler;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tennis.Bestuurslid;
import tennis.Boete;
import tennis.Team;
import tennis.Wedstrijd;

/**
 *
 * @author gydo194
 */
public class Init {

    public static void main(String[] args) {
        System.out.println("Started process (init)");
        Session ses = HibernateDAOFactory.getSession();
        Transaction t = ses.beginTransaction();
        //do stuff

        // try {
        /*
        Speler s = new Speler(1, "name", "prefix", "ins", "bdate", 'M', "1970", "street", 1, "0000AA", "city", "phoneno", 1);
        Team te = new Team(1, s, "div0");
        Wedstrijd w = new Wedstrijd(1, te, 0, 0);
        Boete b = new Boete(1, s, "1999-1-1", 10);
        Bestuurslid be = new Bestuurslid(s, "1980-1-1", "", "president");

        ses.save(s);
        ses.save(te);
        ses.save(w);
        ses.save(b);
        ses.save(be);
         */
        
        Speler sp0 = new Speler(0,"speler0","prefix0","insertion0","1970-1-1",'M',"1970","playerstreet",1,"1234FF","player city","000000",0);
        Speler sp1 = new Speler(1,"speler1","prefix1","insertion1","1970-1-2",'M',"1971","playerstreet",2,"1234FF","player city","000000",0);
        Speler sp2 = new Speler(2,"speler2","prefix2","insertion2","1970-1-3",'M',"1972","playerstreet",3,"1234FF","player city","000000",2);
        Speler sp3 = new Speler(3,"speler3","prefix3","insertion3","1970-1-4",'M',"1973","playerstreet",4,"1234FF","player city","000000",1);
        
        ArrayList<Speler> div1players = new ArrayList<>();
        ArrayList<Speler> div2players = new ArrayList<>();
        
        div1players.add(sp0);
        div1players.add(sp1);
        
        div2players.add(sp3);
        div2players.add(sp2);
        
        
        Team t0 = new Team(0, sp3, "div1",div1players);
        Team t1 = new Team(1, sp3, "div2", div2players);
        
        ArrayList<Team> matchTeams = new ArrayList<>();
        
        matchTeams.add(t1);
        matchTeams.add(t0);
        
        Boete b = new Boete(0,sp0,"2000-1-1",100);
        
        Bestuurslid bl = new Bestuurslid(sp1,"1980-1-1","","president");
        
        Wedstrijd w0 = new Wedstrijd(0, matchTeams, 0, 0);
        
        
        
        ses.save(sp0);
        ses.save(sp1);
        ses.save(sp2);
        ses.save(sp3);
        
        ses.save(t0);
        ses.save(t1);
        
        ses.save(b);
        ses.save(bl);
        
        ses.save(w0);
        
        //commit
        try {
            t.commit();
        } catch (Exception e) {
            //System.err.println("Caught Hibernate Exception\nRolling back...");
            System.err.println("Dumping stacktrace...");
            e.printStackTrace();
            //  t.rollback();

        } finally {
            HibernateDAOFactory.shutdown();
        }

    }
}
