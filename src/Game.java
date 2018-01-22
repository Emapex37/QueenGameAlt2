/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EvMcQ5970
 */
public class Game {
    
    int prog;
    int c, p, a, m;
    
    
    
    public Game(int progress, int chur, int pop, int army, int mon){
        
        prog = progress;
        c = chur;
        p = pop;
        a = army;
        m = mon;
        
    }
    
    //Get churStats (and army, pop, and mon...)
    
    //Get cardNum (progress)
    
    //Changing the church value
    public int assignChur(int church, int change){
        
        int newChur = (church += change);
        
        return newChur;
    }
    
    //Changing the popularity value
    public int assignPop(int popularity, int change){
        
        int newPop = (popularity += change);
        
        return newPop;
    }
    
    //Changing the army value
    public int assignArmy(int strength, int change){
        
        int newArmy = (strength += change);
        
        return newArmy;
    }
    
    //Changing the wealth value
    public int assignMon(int wealth, int change){
        
        int newMon = (wealth += change);
        
        return newMon;
    }
    
    
}
