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
public class RubricTableModel extends AbstractTableModel
{
     private List<Rubric> List = new ArrayList();
    private String[] columnNames = { "Rubric Name", "CLO #","Poor","Good","Better","Best", "Edit","Delete"};

    public RubricTableModel(List<Rubric> list)
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
        Rubric r = List.get(rowIndex);
        switch (columnIndex)
        {
            case 0: 
                return r.getName();
            case 1:
                return r.getNum();
            case 2: 
                return r.getPoor();
            case 3:
                return r.getGood();
            case 4:
                return r.getBetter();
            case 5: 
                return r.getBest();
            case 6:
                return "Edit";
            case 7: 
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
            case 7:
               return String.class;
        }
        return null;
      }

   @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
      
        return columnIndex == 6 || columnIndex == 7;
    }
   
    
    public void editRow(int row){
     String name = (String)getValueAt(row, 0);
     RubricForm rf = new RubricForm("Edit", name);
     rf.setVisible(true);
                
    }
    
    
      
    public void deleteRow(int row){
     String name = (String)getValueAt(row, 0);
     RubricForm rf = new RubricForm("Delete", name);
     rf.setVisible(true);    

    }
}
