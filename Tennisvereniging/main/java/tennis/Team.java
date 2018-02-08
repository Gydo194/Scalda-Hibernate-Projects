/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennis;

/**
 *
 * @author gydo194
 */
import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name="teams")
public class Team {
    
    @Id
    @Column
    private int teamno;
    
    @OneToOne
    private Speler leader;
    
    @ManyToMany
    private Collection<Speler> players;
    
    @Column
    private String division;
    
    public Team() {}
    public Team(int no, Speler teamLeader, String teamDivision,Collection<Speler> nplayers)  {
        teamno = no;
        leader = teamLeader;
        division = teamDivision;
        players = nplayers;
        
        
    }
    
    

    /**
     * @return the teamno
     */
    public int getTeamno() {
        return teamno;
    }

    /**
     * @param teamno the teamno to set
     */
    public void setTeamno(int teamno) {
        this.teamno = teamno;
    }

    /**
     * @return the leader
     */
    public Speler getLeader() {
        return leader;
    }

    /**
     * @param leader the leader to set
     */
    public void setLeader(Speler leader) {
        this.leader = leader;
    }

    /**
     * @return the division
     */
    public String getDivision() {
        return division;
    }

    /**
     * @param division the division to set
     */
    public void setDivision(String division) {
        this.division = division;
    }

    /**
     * @return the players
     */
    public Collection<Speler> getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(Collection<Speler> players) {
        this.players = players;
    }
    
    
}
