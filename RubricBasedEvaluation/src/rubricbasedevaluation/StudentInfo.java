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
public class StudentInfo {
    private static StudentInfo SInstance;
     List <Student> studentList;
    
    private StudentInfo()
    {
        studentList = new ArrayList<Student>();
    }
    
    public static StudentInfo getSInstance()
    {
        if(SInstance==null)
        {
            SInstance = new StudentInfo();
        }
        
        return SInstance;
    }    
    
    public void addStudent(Student s)
    {
        studentList.add(s);
    }
    
    private int searchStudent(String name)
    {
        int index = -1;
         for(int i = 0 ; i  < studentList.size(); i++)
         {
             if(studentList.get(i).getName().equals(name))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    
    public Student getStudent(String name)
    {
        int index = searchStudent(name);
        return studentList.get(index);
    }
    
    public boolean updateStudent(String name ,Student s)
    {
        int index = searchStudent(name);
       
        if(index == -1)
        {
           return false;
        }           
        else 
        {
           studentList.set(index, s);
           return true;
        }
    }
    
     
    public boolean deleteStudent(String name)
    {
        int index = searchStudent(name);
       
        if(index == -1)
        {
           return false;
        }
        else 
        {
           studentList.remove(index);
           return true;
        }
    }
    
    public List<Student> getAllStudent()
    {
        return studentList;
    }
}
