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
public class RLInfo {
    private static RLInfo RLInstance;
     List <RubricLevel> rlList;
    
    private RLInfo()
    {
        rlList = new ArrayList<RubricLevel>();
    }
    
    public static RLInfo getRInstance()
    {
        if(RLInstance==null)
        {
            RLInstance = new RLInfo();
        }
        
        return RLInstance;
    }    
    
    public void addRL(RubricLevel r)
    {
        rlList.add(r);
    }
    
    private int searchRL(String name)
    {
        int index = -1;
         for(int i = 0 ; i  < rlList.size(); i++)
         {
             if(rlList.get(i).getName().equals(name))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    
    public RubricLevel getRubric(String name)
    {
        int index = searchRL(name);
        return rlList.get(index);
    }
}
