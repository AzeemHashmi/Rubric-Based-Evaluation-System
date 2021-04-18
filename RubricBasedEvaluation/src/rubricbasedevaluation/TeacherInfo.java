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
public class TeacherInfo
{
    private static TeacherInfo TInstance;
     List <Teacher> teacherList;
    
    private TeacherInfo()
    {
        teacherList = new ArrayList<Teacher>();
    }
    
    public static TeacherInfo getTInstance()
    {
        if(TInstance==null)
        {
            TInstance = new TeacherInfo();
        }
        
        return TInstance;
    }    
    
    public void addTeacher(Teacher t)
    {
        teacherList.add(t);
    }
    
    private int searchTeacher(String name)
    {
        int index = -1;
         for(int i = 0 ; i  < teacherList.size(); i++)
         {
             if(teacherList.get(i).getName().equals(name))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    
    public Teacher getTeacher(String name)
    {
        int index = searchTeacher(name);
        return teacherList.get(index);
    }
    
    public boolean updateTeacher(String name ,Teacher t)
    {
        int index = searchTeacher(name);
       
        if(index == -1)
        {
           return false;
        }           
        else 
        {
           teacherList.set(index, t);
           return true;
        }
    }
    
     
    public boolean deleteTeacher(String name)
    {
        int index = searchTeacher(name);
       
        if(index == -1)
        {
           return false;
        }
        else 
        {
           teacherList.remove(index);
           return true;
        }
    }
    
    public List<Teacher> getAllTeacher()
    {
        return teacherList;
    }
}
