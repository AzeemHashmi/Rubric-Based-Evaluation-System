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
public class Teacher extends BasicInfo
{
    private String Designation;
    
    public void setDesignation(String designation)
    {
        this.Designation = designation;
    }
    
    public String getDesignation()
    {
        return this.Designation;
    }
}
