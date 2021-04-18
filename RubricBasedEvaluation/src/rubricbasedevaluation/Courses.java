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
public class Courses {
    private String name;
    private String code;
    private String teacherName;
    
    public void setName(String Name)
    {
        this.name = Name;
    }
    
    public void setCode(String Code)
    {
        this.code = Code;
    }
    
    public void setTName(String name)
    {
        this.teacherName = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getCode()
    {
        return this.code;
    }
    
    public String getTName()
    {
        return this.teacherName;
    }
}
