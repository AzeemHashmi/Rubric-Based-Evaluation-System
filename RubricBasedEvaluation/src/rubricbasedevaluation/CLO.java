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
public class CLO {
    private String cloNum;
    private String desc;
    
    public void setcloNum(String num)
    {
        this.cloNum = num;
    }
    
    public void setDesc(String des)
    {
        this.desc = des;
    }
    
    public String getCloNum()
    {
        return this.cloNum;
    }
    
    public String getDesc()
    {
        return this.desc;
    }
}
