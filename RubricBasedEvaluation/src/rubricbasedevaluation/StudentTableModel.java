/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricbasedevaluation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Azeem Hashmi
 */
public class StudentTableModel extends AbstractTableModel 
{
    private List<Student> List = new ArrayList();
    private String[] columnNames = { "Name", "Email", "Department", "Username","Password", "Edit","Delete"};

    public StudentTableModel(List<Student> list)
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
        Student std = List.get(rowIndex);
        switch (columnIndex)
        {
            case 0: 
                return std.getName();
            case 1:
                return std.getEmail();
            case 2:
                return std.getDept();
            case 3:
                return std.getUsername();
            case 4:
                return std.getPassword();
            case 5:
                return "Edit";
            case 6: 
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
            case 5: 
               return String.class;
            case 6:
               return String.class;
        }
        return null;
      }

   @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
      
        return columnIndex == 5 || columnIndex == 6;
    }
   
    
    public void editRow(int row){
     String name = (String)getValueAt(row, 0);
     StudentForm sf = new StudentForm("Edit", name);
     sf.setVisible(true);
                
    }
    
    
      
    public void deleteRow(int row){
     String name = (String)getValueAt(row, 0);
     StudentForm sf = new StudentForm("Delete", name);
     sf.setVisible(true);
                
    }
}
