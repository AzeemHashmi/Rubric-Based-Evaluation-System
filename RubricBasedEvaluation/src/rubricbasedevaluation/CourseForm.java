/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricbasedevaluation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

/**
 *
 * @author Azeem Hashmi
 */
public class CourseForm extends javax.swing.JFrame {

    String action;
    String name;
    Courses c;
    /**
     * Creates new form CourseForm
     */
    public CourseForm() {
        initComponents();
    }
    
    public CourseForm(String Action, String Name) 
    {
        initComponents();
        
        DefaultComboBoxModel cb= new DefaultComboBoxModel();
        for (int i = 0; i < TeacherInfo.getTInstance().getAllTeacher().size(); i++)
        {
            cb.addElement(TeacherInfo.getTInstance().getAllTeacher().get(i).getName());
        }

        combo.setModel(cb);    
        
        CoursesTableModel table = new CoursesTableModel(CoursesInfo.getCInstance().getAllCourses());
         
        jTable1.setModel(table);
        
         Action increase = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JTable table = (JTable) e.getSource();
                int row = Integer.valueOf(e.getActionCommand());
                StudentTableModel model = (StudentTableModel) table.getModel();
                model.editRow(row);     
            }
        };
        ButtonColumn inc = new ButtonColumn(jTable1, increase, 3);
        
       
         Action deleteAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JTable table = (JTable) e.getSource();
                int row = Integer.valueOf(e.getActionCommand());
                StudentTableModel model = (StudentTableModel) table.getModel();
                model.deleteRow(row);     
            }
        };
        ButtonColumn deleteButton = new ButtonColumn(jTable1, deleteAction, 4);
       
        
        this.action = Action;
        this.name = Name;
        
        if (action.equals("Add"))
        {
           c = new Courses(); 
        }
        
        else if (action.equals("Edit"))
        {
            jLabel1.setText("Update Course Info");
            regBtn.setText("Update");
            
            c = CoursesInfo.getCInstance().getCourse(name);
            nameField.setText(c.getName());
            codeField.setText(c.getCode());
        }
        
        else if (action.equals("Delete"))
        {
            jLabel1.setText("Delete Course Info");
            regBtn.setText("Delete");
            
            c = CoursesInfo.getCInstance().getCourse(name);
            nameField.setText(c.getName());
            codeField.setText(c.getCode());
            
            nameField.setEditable(false);
            codeField.setEditable(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        codeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        regBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 61, 89));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_close_window_40px.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(229, 229, 220));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Course Registration");

        jLabel2.setText("Course Name");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Course Code");

        jLabel4.setText("Teacher Name");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_back_arrow_20px.png"))); // NOI18N
        jButton1.setText("Back to Main");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        regBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_check_document_20px.png"))); // NOI18N
        regBtn.setText("Register");
        regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameField)
                            .addComponent(codeField, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(regBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(regBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Register Course", jPanel2);

        jPanel3.setBackground(new java.awt.Color(229, 229, 220));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Course Registration");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel5)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Record", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminMenu am = new AdminMenu();
        am.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBtnActionPerformed
        // TODO add your handling code here:
        if (action.equals("Edit"))
        {
            String Name = nameField.getText();
            String Code = codeField.getText();
            String Tname = combo.getSelectedItem().toString();


            int count1 = 0;

            if (strValid(Name)) 
            {
                jLabel6.setFont(new Font("Times New Roman", Font.PLAIN, 11));
                jLabel6.setForeground(Color.BLACK);
                jLabel6.setText("Valid");
                count1++;
            } 
            else 
            {
                jLabel6.setFont(new Font("Times New Roman", Font.PLAIN, 11));
                jLabel6.setForeground(Color.RED);
                jLabel6.setText("Invalid");
            }

            if (codeValid(Code))
            {
                jLabel7.setFont(new Font("Times New Roman", Font.PLAIN, 11));
                jLabel7.setForeground(Color.BLACK);
                jLabel7.setText("Valid");
                count1++;
            }
            else 
            {
                jLabel7.setFont(new Font("Times New Roman", Font.PLAIN, 11));
                jLabel7.setForeground(Color.RED);
                jLabel7.setText("Invalid");
            }
            
            if (count1 == 2)
            {
                Courses c1 = new Courses();
                c1.setName(Name);
                c1.setCode(Code);
                c1.setTName(Tname);

                CoursesInfo.getCInstance().updateCourse(name,c1);
            }
        }
        
        else if (action.equals("Delete"))
        {
            CoursesInfo.getCInstance().deleteCourse(name);
        }
        
        else if (action.equals("Add"))
        {
            String Name = nameField.getText();
            String Code = codeField.getText();
            String Tname = combo.getSelectedItem().toString();


            int count1 = 0;

            if (strValid(Name)) 
            {
                jLabel6.setFont(new Font("Times New Roman", Font.PLAIN, 11));
                jLabel6.setForeground(Color.BLACK);
                jLabel6.setText("Valid");
                count1++;
            } 
            else 
            {
                jLabel6.setFont(new Font("Times New Roman", Font.PLAIN, 11));
                jLabel6.setForeground(Color.RED);
                jLabel6.setText("Invalid");
            }

            if (codeValid(Code))
            {
                jLabel7.setFont(new Font("Times New Roman", Font.PLAIN, 11));
                jLabel7.setForeground(Color.BLACK);
                jLabel7.setText("Valid");
                count1++;
            }
            else 
            {
                jLabel7.setFont(new Font("Times New Roman", Font.PLAIN, 11));
                jLabel7.setForeground(Color.RED);
                jLabel7.setText("Invalid");
            }
            
            if (count1 == 2)
            {
                Courses c1 = new Courses();
                c1.setName(Name);
                c1.setCode(Code);
                c1.setTName(Tname);
                CoursesInfo.getCInstance().addCourse(c1);
                //System.out.print(TeacherInfo.getTInstance().teacherList.get(0).getName());
            }           
        }
    }//GEN-LAST:event_regBtnActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CourseForm().setVisible(true);
            }
        });
    }
    
    public boolean strValid(String str)
    {
        for (int i=0 ; i<str.length() ; i++)
        {
            if (!((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) == ' ')))
            {
                return false;
            }
        }
        return true;
    }
    
    public boolean codeValid(String code)
    {
        int size = code.length();
        boolean flag = false;
        if (size == 4)
        {
            if (code.charAt(0) >= '0' && code.charAt(0) <= '9')
            {
                if (code.charAt(1) >= '0' && code.charAt(1) <= '9')
                {
                    if (code.charAt(2) >= '0' && code.charAt(2) <= '9')
                    {
                        if (code.charAt(3) >= 'A' && code.charAt(3) <= 'Z')
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        
        if (flag == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codeField;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton regBtn;
    // End of variables declaration//GEN-END:variables
}