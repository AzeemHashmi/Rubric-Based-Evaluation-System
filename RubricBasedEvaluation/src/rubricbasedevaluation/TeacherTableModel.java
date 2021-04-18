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
public class TeacherTableModel extends AbstractTableModel
{
    private List<Teacher> List = new ArrayList();
    private String[] columnNames = { "Name", "Email", "Department", "Username","Password", "Edit","Delete"};

    public TeacherTableModel(List<Teacher> list)
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
        Teacher t = List.get(rowIndex);
        switch (columnIndex)
        {
            case 0: 
                return t.getName();
            case 1:
                return t.getEmail();
            case 2:
                return t.getDept();
            case 3:
                return t.getUsername();
            case 4:
                return t.getPassword();
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
     TeacherForm tf = new TeacherForm("Edit", name);
     tf.setVisible(true);
                
    }
    
    
      
    public void deleteRow(int row){
     String name = (String)getValueAt(row, 0);
     TeacherForm tf = new TeacherForm("Delete", name);
     tf.setVisible(true);
                
    }
}
