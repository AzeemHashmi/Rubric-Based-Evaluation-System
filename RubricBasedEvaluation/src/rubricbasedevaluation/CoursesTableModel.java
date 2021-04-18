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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class CoursesTableModel extends AbstractTableModel
{
    private List<Courses> List = new ArrayList();
    private String[] columnNames = { "Course Name", "Course Code", "Instructor Name", "Edit","Delete"};

    public CoursesTableModel(List<Courses> list)
    {
         this.List = list;
    }  
   
    @Override
    public String getColumnName(int columnIndex)
    {
         return columnNames[columnIndex];
    }
    
  
    @Override
    public int getRowCount() {
        return List.size();
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length; 
    }

    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Courses c = List.get(rowIndex);
        switch (columnIndex)
        {
            case 0: 
                return c.getName();
            case 1:
                return c.getCode();
            case 2:
                return c.getTName();
            case 3:
                return "Edit";
            case 4: 
                return "Delete";
        }
        return null;
   }

    @Override
   public Class<?> getColumnClass(int columnIndex)
   {
        System.out.println("column index = " + columnIndex);
        switch (columnIndex)
        {
            case 0:
               return String.class;
            case 1:
               return String.class;
            case 2:
               return String.class;
            case 3:
               return String.class;
            case 4: 
               return String.class;
        }
        return null;
      }

   @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
      
        return columnIndex == 3 || columnIndex == 4;
    }
   
    
    public void editRow(int row){
     String name = (String)getValueAt(row, 0);
     CourseForm cf = new CourseForm("Edit", name);
     cf.setVisible(true);
                
    }
    
    
      
    public void deleteRow(int row){
     String name = (String)getValueAt(row, 0);
     CourseForm cf = new CourseForm("Delete", name);
     cf.setVisible(true);
                
    }
}
