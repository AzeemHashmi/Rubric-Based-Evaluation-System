/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricbasedevaluation;

import java.util.ArrayList;

/**
 *
 * @author Azeem Hashmi
 */
public class Assessment {
    private String name;
    private String weight;
    private String marks;
    private String cloNum;
    ArrayList<Questions> list;
    
    public void setName(String Name)
    {
        this.name = Name;
    }
    
    public void setWeight(String weight)
    {
        this.weight = weight;
    }
    
    public void setMarks(String marks)
    {
        this.marks = marks;
    }
    
    public void setCloNum(String num)
    {
        this.cloNum = num;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getWeight()
    {
        return this.weight;
    }
    
    public String getMarks()
    {
        return this.marks;
    }
    
    public String getCloNum()
    {
        return this.cloNum;
    }
}
