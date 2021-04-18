/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricbasedevaluation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Azeem Hashmi
 */
public class AssessmentInfo 
{
    private static AssessmentInfo AInstance;
     List <Assessment> aList;
    
    private AssessmentInfo()
    {
        aList = new ArrayList<Assessment>();
    }
    
    public static AssessmentInfo getAInstance()
    {
        if(AInstance==null)
        {
            AInstance = new AssessmentInfo();
        }
        
        return AInstance;
    }    
    
    public void addAssessment(Assessment a)
    {
        aList.add(a);
    }
    
    private int searchAssessment(String name)
    {
        int index = -1;
         for(int i = 0 ; i  < aList.size(); i++)
         {
             if(aList.get(i).getName().equals(name))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    
    public Assessment getAssessment(String name)
    {
        int index = searchAssessment(name);
        return aList.get(index);
    }
    
    public boolean updateAssessment(String name ,Assessment a)
    {
        int index = searchAssessment(name);
       
        if(index == -1)
        {
           return false;
        }           
        else 
        {
           aList.set(index, a);
           return true;
        }
    }
    
     
    public boolean deleteAssessment(String name)
    {
        int index = searchAssessment(name);
       
        if(index == -1)
        {
           return false;
        }
        else 
        {
           aList.remove(index);
           return true;
        }
    }
    
    public List<Assessment> getAllAssessments()
    {
        return aList;
    }
}
