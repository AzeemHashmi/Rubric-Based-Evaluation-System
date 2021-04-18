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
public class CoursesInfo {
     private static CoursesInfo CInstance;
     List <Courses> coursesList;
    
    private CoursesInfo()
    {
        coursesList = new ArrayList<Courses>();
    }
    
    public static CoursesInfo getCInstance()
    {
        if(CInstance==null)
        {
            CInstance = new CoursesInfo();
        }
        
        return CInstance;
    }   
    
    public void addCourse(Courses c)
    {
        coursesList.add(c);
    }
    
    private int searchCourse(String name)
    {
        int index = -1;
         for(int i = 0 ; i  < coursesList.size(); i++)
         {
             if(coursesList.get(i).getName().equals(name))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    
    public Courses getCourse(String name)
    {
        int index = searchCourse(name);
        return coursesList.get(index);
    }
    
    public boolean updateCourse(String name ,Courses c)
    {
        int index = searchCourse(name);
       
        if(index == -1)
        {
           return false;
        }           
        else 
        {
           coursesList.set(index, c);
           return true;
        }
    }
    
     
    public boolean deleteCourse(String name)
    {
        int index = searchCourse(name);
       
        if(index == -1)
        {
           return false;
        }
        else 
        {
           coursesList.remove(index);
           return true;
        }
    }
    
    public List<Courses> getAllCourses()
    {
        return coursesList;
    }
}
