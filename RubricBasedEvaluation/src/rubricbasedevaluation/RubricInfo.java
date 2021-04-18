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
public class RubricInfo {
     private static RubricInfo RInstance;
     List <Rubric> rubricList;
    
    private RubricInfo()
    {
        rubricList = new ArrayList<Rubric>();
    }
    
    public static RubricInfo getRInstance()
    {
        if(RInstance==null)
        {
            RInstance = new RubricInfo();
        }
        
        return RInstance;
    }    
    
    public void addRubric(Rubric r)
    {
        rubricList.add(r);
    }
    
    private int searchRubric(String name)
    {
        int index = -1;
         for(int i = 0 ; i  < rubricList.size(); i++)
         {
             if(rubricList.get(i).getName().equals(name))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    
    public Rubric getRubric(String name)
    {
        int index = searchRubric(name);
        return rubricList.get(index);
    }
    
    public boolean updateRubric(String name ,Rubric r)
    {
        int index = searchRubric(name);
       
        if(index == -1)
        {
           return false;
        }           
        else 
        {
           rubricList.set(index, r);
           return true;
        }
    }
    
     
    public boolean deleteRubric(String name)
    {
        int index = searchRubric(name);
       
        if(index == -1)
        {
           return false;
        }
        else 
        {
           rubricList.remove(index);
           return true;
        }
    }
    
    public List<Rubric> getAllRubric()
    {
        return rubricList;
    }    
}
