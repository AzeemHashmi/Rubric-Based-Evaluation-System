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
public class CLOInfo {
    private static CLOInfo CLOInstance;
     List <CLO> cloList;
    
    private CLOInfo()
    {
        cloList = new ArrayList<CLO>();
    }
    
    public static CLOInfo getCLOInstance()
    {
        if(CLOInstance==null)
        {
            CLOInstance = new CLOInfo();
        }
        
        return CLOInstance;
    }    
    
    public void addCLO(CLO clo)
    {
        cloList.add(clo);
    }
    
    private int searchCLO(String num)
    {
        int index = -1;
         for(int i = 0 ; i  < cloList.size(); i++)
         {
             if(cloList.get(i).getCloNum().equals(num))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    
    public CLO getCLO(String num)
    {
        int index = searchCLO(num);
        return cloList.get(index);
    }
    
    public boolean updateCLO(String num ,CLO clo)
    {
        int index = searchCLO(num);
       
        if(index == -1)
        {
           return false;
        }           
        else 
        {
           cloList.set(index, clo);
           return true;
        }
    }
    
     
    public boolean deleteCLO(String num)
    {
        int index = searchCLO(num);
       
        if(index == -1)
        {
           return false;
        }
        else 
        {
           cloList.remove(index);
           return true;
        }
    }
    
    public List<CLO> getAllCLO()
    {
        return cloList;
    }
    
}
