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
public class CLOTableModel extends AbstractTableModel
{
    private List<CLO> List = new ArrayList();
    private String[] columnNames = { "CLO#", "Description", "Edit","Delete"};

    public CLOTableModel(List<CLO> list)
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
        CLO clo = List.get(rowIndex);
        switch (columnIndex)
        {
            case 0: 
                return clo.getCloNum();
            case 1:
                return clo.getDesc();
            case 2:
                return "Edit";
            case 3: 
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
        }
        return null;
      }

   @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
      
        return columnIndex == 2 || columnIndex == 3;
    }
   
    
    public void editRow(int row){
     String name = (String)getValueAt(row, 0);
     CLOForm cf = new CLOForm("Edit", name);
     cf.setVisible(true);
                
    }
    
    
      
    public void deleteRow(int row){
     String name = (String)getValueAt(row, 0);
     CLOForm cf = new CLOForm("Delete", name);
     cf.setVisible(true);    

    }
}
