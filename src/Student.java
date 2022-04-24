

import BeanClasses.DepartmentBean;
import BeanClasses.FacultyBean;
import BeanClasses.ProgramBean;
import BeanClasses.BatchBean;
import BeanClasses.StudentBean;
import java.util.Vector;
import DatabaseManager.*;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import DatabaseManager.Decoder;
import DatabaseManager.Encoder;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Student extends javax.swing.JFrame  implements ListSelectionListener{

    /**
     * Creates new form Student
     */
    public Student() {
        initComponents();
        try {
          setgender.addItem("Male");
          setgender.addItem("Female");
            rollnolist.addListSelectionListener(this);
            faculy();
            department();
            program();
            batch();
    
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private  void faculy()
    {
        try{
        Vector v=Databasemanager.getFaculty();
        factcombo.removeAllItems();
        for(int i=0; i<v.size(); i++)
        {
            FacultyBean bean=(FacultyBean)v.elementAt(i);
            factcombo.addItem(bean);
        }
        }catch(Exception e)
        {
          e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
    }
    private void department()
    {
        FacultyBean bean=(FacultyBean)factcombo.getSelectedItem();
        if(bean==null) return;
        try
        {
            deptcombo.removeAllItems();
            Vector v=Databasemanager.getDepartment(bean.getFacid());
            for(int i=0; i<v.size(); i++){
                DepartmentBean bean1=(DepartmentBean)v.elementAt(i);
                deptcombo.addItem(bean1);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
    } //end department method
    private void program()
    {
        DepartmentBean bean=(DepartmentBean)deptcombo.getSelectedItem();
        if(bean==null)
            return;
        try
        {
            progcombo.removeAllItems();
            Vector v=Databasemanager.getProgram(bean.getDeptId());
            for(int i=0; i<v.size(); i++)
            {
                ProgramBean bean1=(ProgramBean)v.elementAt(i);
                progcombo.addItem(bean1);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
    }
    private void batch()
    {
        ProgramBean bean=(ProgramBean)progcombo.getSelectedItem();
        if(bean==null) return;
        try
        {
            batchcombo.removeAllItems();
            Vector v=Databasemanager.getBatch(bean.getProgId());
            for(int i=0; i<v.size(); i++)
            {
                BatchBean bean1=(BatchBean)v.elementAt(i);
                batchcombo.addItem(bean1);
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this ,"Error"+e.getMessage());
        }
    }
    private void getstudent()
    {
        BatchBean bean=(BatchBean)batchcombo.getSelectedItem();
        if(bean==null) return;
        try {
            setshift.setText(bean.getShift());
            setgroup.setText(bean.getGroupDesc());
         
            Vector v=Databasemanager.getStudent(bean.getBatchId());
            rollnolist.setListData(v);
                
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
    }
    public void valueChanged(ListSelectionEvent e)
    {
        StudentBean bean=(StudentBean)rollnolist.getSelectedValue();
        if(bean==null) return;
        
        setstdid.setText(""+bean.getStdId());
        setstdname.setText(""+bean.getStdName());
        setstdfname.setText(""+bean.getFname());
        setsurname.setText(""+bean.getSurname());
        setrollno.setText(""+bean.getRollNo());
       String gender=Decoder.genderdecode(""+bean.getGender());
        setgender.setSelectedItem(gender);
       setremarks.setText(""+bean.getRemarks());
       ImageIcon icon=new ImageIcon("Picture/"+bean.getStdId()+".jpg");
       setImage.setIcon(icon);
      
                
        
    }
    private void clear()
    {
        setstdid.setText("");
        setstdname.setText("");
       
        setstdfname.setText("");
        setsurname.setText("");
        setrollno.setText("");
        
        setremarks.setText("");
    }
    private void addrecords()
    {
        BatchBean bean=(BatchBean)batchcombo.getSelectedItem();
       // StudentBean bean1=(StudentBean)rollnolist.getSelectedValue();
        if(bean==null) return;
        String name=setstdname.getText();
        String fname=setstdfname.getText();
        String surname=setsurname.getText();
        int rollno=Integer.parseInt(setrollno.getText());
       String gender=Encoder.genderEncode((String)setgender.getSelectedItem());
             
        String remarks=setremarks.getText();
        try {
            int rows=Databasemanager.addStudent(bean.getBatchId(), name, fname, surname, rollno, remarks,gender);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
    }
    private void Update(){
        StudentBean bean=(StudentBean)rollnolist.getSelectedValue();
        if(bean==null) return;
        try {
            String gender=Encoder.genderEncode((String)setgender.getSelectedItem());
            int rows=Databasemanager.UpdateStudent(bean.getBatchId(), bean.getStdId(), setstdname.getText(), setstdfname.getText()
                    , setsurname.getText(), setrollno.getText(), setremarks.getText(),gender);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
                private void DeleteRecord()
                {
                    StudentBean bean=(StudentBean)rollnolist.getSelectedValue();
                    if(bean==null) return;
                    try {
                        int row=Databasemanager.deleteStudent(bean.getStdId());
                    } catch (Exception e) {
                        e.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        progcombo = new javax.swing.JComboBox();
        batchcombo = new javax.swing.JComboBox();
        deptcombo = new javax.swing.JComboBox();
        factcombo = new javax.swing.JComboBox();
        setstdid = new javax.swing.JTextField();
        setstdname = new javax.swing.JTextField();
        setstdfname = new javax.swing.JTextField();
        setsurname = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        setremarks = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        setrollno = new javax.swing.JTextField();
        setadd = new javax.swing.JButton();
        setUpdate = new javax.swing.JButton();
        setdelte = new javax.swing.JButton();
        setclear = new javax.swing.JButton();
        setback = new javax.swing.JButton();
        setgroup = new javax.swing.JTextField();
        setshift = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        rollnolist = new javax.swing.JList();
        setgender = new javax.swing.JComboBox();
        setImage = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Student");

        jLabel2.setText("Faculty");

        jLabel3.setText("Department");

        jLabel4.setText("Program");

        jLabel5.setText("Batch Year");

        jLabel6.setText("Shift");

        jLabel7.setText("Group");

        jLabel8.setText("Student ID");

        jLabel9.setText("Name");

        jLabel10.setText("Surname");

        jLabel11.setText("Roll No");

        jLabel12.setText("Gender");

        jLabel13.setText("Remarks");

        progcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progcomboActionPerformed(evt);
            }
        });

        batchcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchcomboActionPerformed(evt);
            }
        });

        deptcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptcomboActionPerformed(evt);
            }
        });

        factcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factcomboActionPerformed(evt);
            }
        });

        jLabel18.setText("RollNo");

        setremarks.setColumns(20);
        setremarks.setRows(5);
        jScrollPane2.setViewportView(setremarks);

        jLabel19.setText("Fname");

        setadd.setText("ADD");
        setadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaddActionPerformed(evt);
            }
        });

        setUpdate.setText("UPDATE");
        setUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setUpdateActionPerformed(evt);
            }
        });

        setdelte.setText("DELETE");
        setdelte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setdelteActionPerformed(evt);
            }
        });

        setclear.setText("CLEAR");
        setclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setclearActionPerformed(evt);
            }
        });

        setback.setText("Back");
        setback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setbackActionPerformed(evt);
            }
        });

        setgroup.setEditable(false);

        setshift.setEditable(false);

        rollnolist.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(rollnolist);

        setImage.setBackground(new java.awt.Color(0, 255, 255));

        jLabel15.setText("Student Image");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(88, 88, 88))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(37, 37, 37)
                                .addComponent(setshift, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(setstdname, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setstdfname, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setrollno, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setgender, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setstdid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(factcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(deptcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(progcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(batchcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(setgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel18))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(setadd)
                                .addGap(67, 67, 67)
                                .addComponent(setUpdate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(setdelte)
                                .addGap(51, 51, 51)
                                .addComponent(setclear))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(setback))
                            .addComponent(setImage, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(setshift, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(setgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel19)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(factcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(deptcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(progcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(batchcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(setstdid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(setstdname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(setstdfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(setsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(setrollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(setgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel15)
                        .addGap(30, 30, 30)
                        .addComponent(setImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(setadd)
                            .addComponent(setUpdate))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(setdelte)
                            .addComponent(setclear))
                        .addGap(27, 27, 27)
                        .addComponent(setback)))
                .addGap(2, 2, 2)
                .addComponent(jLabel13)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setbackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_setbackActionPerformed

    private void factcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factcomboActionPerformed
        // TODO add your handling code here:
        department();
    }//GEN-LAST:event_factcomboActionPerformed

    private void deptcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptcomboActionPerformed
        // TODO add your handling code here:
        program();
    }//GEN-LAST:event_deptcomboActionPerformed

    private void progcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progcomboActionPerformed
        // TODO add your handling code here:
        batch();
    }//GEN-LAST:event_progcomboActionPerformed

    private void batchcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchcomboActionPerformed
        // TODO add your handling code here:
        getstudent();
    }//GEN-LAST:event_batchcomboActionPerformed

    private void setclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setclearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_setclearActionPerformed

    private void setaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaddActionPerformed
        // TODO add your handling code here:
        addrecords();
    }//GEN-LAST:event_setaddActionPerformed

    private void setUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setUpdateActionPerformed
        // TODO add your handling code here:
        Update();
    }//GEN-LAST:event_setUpdateActionPerformed

    private void setdelteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setdelteActionPerformed
        // TODO add your handling code here:
        DeleteRecord();
    }//GEN-LAST:event_setdelteActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox batchcombo;
    private javax.swing.JComboBox deptcombo;
    private javax.swing.JComboBox factcombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox progcombo;
    private javax.swing.JList rollnolist;
    private javax.swing.JLabel setImage;
    private javax.swing.JButton setUpdate;
    private javax.swing.JButton setadd;
    private javax.swing.JButton setback;
    private javax.swing.JButton setclear;
    private javax.swing.JButton setdelte;
    private javax.swing.JComboBox setgender;
    private javax.swing.JTextField setgroup;
    private javax.swing.JTextArea setremarks;
    private javax.swing.JTextField setrollno;
    private javax.swing.JTextField setshift;
    private javax.swing.JTextField setstdfname;
    private javax.swing.JTextField setstdid;
    private javax.swing.JTextField setstdname;
    private javax.swing.JTextField setsurname;
    // End of variables declaration//GEN-END:variables
}
