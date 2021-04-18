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
public class Student extends BasicInfo
{
    private String RegNo;
    
    public void setRegNo(String regNo)
    {
        this.RegNo = regNo;
    }
    
    public String getRegNo()
    {
        return this.RegNo;
    }
}
