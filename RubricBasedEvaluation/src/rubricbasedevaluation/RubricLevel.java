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
public class RubricLevel {
    private String name;
    private String order;
    private String per;
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setOrder(String order)
    {
        this.order = order;
    }
    
    public void setPer(String per)
    {
        this.per = per;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getOrder()
    {
        return this.order;
    }
    
    public String getPer()
    {
        return this.per;
    }
    
}
