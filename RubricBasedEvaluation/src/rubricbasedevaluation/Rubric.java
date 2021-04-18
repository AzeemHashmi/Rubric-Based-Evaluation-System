/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricbasedevaluation;

/**
 *
 * @author Azeem Hashmi
 */
public class Rubric {
    private String name;
    private String num;
    private String poor;
    private String good;
    private String better;
    private String best;
    
    public void setName(String Name)
    {
        this.name = Name;
    }
    
    public void setNum(String Num)
    {
        this.num = Num;
    }
    
    public void setPoor(String Poor)
    {
        this.poor = Poor;
    }
    
    public void setGood(String Good)
    {
        this.good = Good;
    }
    
    public void setBetter(String Better)
    {
        this.better = Better;
    }
    
    public void setBest(String Best)
    {
        this.best = Best;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getNum()
    {
        return this.num;
    }

    public String getPoor()
    {
        return this.poor;
    }
    
    public String getGood()
    {
        return this.good;
    }
    
    public String getBetter()
    {
        return this.better;
    }
    
    public String getBest()
    {
        return this.best;
    }
}
