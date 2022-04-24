
import BeanClasses.FacultyBean;
import java.util.Vector;
import javax.swing.JOptionPane;
import org.hsqldb.DatabaseManager;
import DatabaseManager.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Faculty extends javax.swing.JFrame implements ListSelectionListener{

    /**
     * Creates new form Faculty
     * 
     */
   
    
    public Faculty() {
        initComponents();
        try{
            Facultylist.addListSelectionListener(this);
            faculty();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
   // getFaculty();
    private void faculty(){
        try {
            Vector v=Databasemanager.getFaculty();
            Facultylist.setListData(v);
          
                
            }
         catch (Exception e) {
            e.printStackTrace();
             JOptionPane.showMessageDialog(this,"Error :"+e.getMessage());
        }
        
    }
    public void valueChanged(ListSelectionEvent e)
    {
        FacultyBean bean=(FacultyBean)Facultylist.getSelectedValue();
        if(bean==null) return;
        setfacid.setText(""+bean.getFacid());
        setfacname.setText(""+bean.getfacName());
        setremarks.setText(""+bean.getRemarks());
    }
    private void clear()
    {
        setfacid.setText("");
        setfacname.setText("");
        setremarks.setText("");
    }
    private void addrecords()
    {
       // int id=Integer.parseInt(setfacid.getText());
        String facName=setfacname.getText();
        String remarks=setremarks.getText();
        try
        {
            int rows=Databasemanager.addFaculty(facName, remarks);
            if(rows>=1)
            {
                JOptionPane.showMessageDialog(this,rows+"Recordinserted");
                clear();
                faculty();
            }
                    }catch(Exception e)
                    {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
                    }
    }
    private void Update()
    {
        FacultyBean bean=(FacultyBean)Facultylist.getSelectedValue();
        if(bean==null )return;
        
        try {
            int rows=Databasemanager.UpdateFaculty(bean.getFacid(), setfacname.getText(), setremarks.getText());
           
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
 private void DeleteRecod()
 {
     FacultyBean bean=(FacultyBean)Facultylist.getSelectedValue();
     if(bean==null) return;
     try {
         int rows=Databasemanager.deleteFaculty(bean.getFacid());
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
        setfacid = new java.awt.TextField();
        setfacname = new java.awt.TextField();
        setremarks = new java.awt.TextArea();
        label1 = new java.awt.Label();
        setadd = new javax.swing.JButton();
        setUpdate = new javax.swing.JButton();
        setDelete = new javax.swing.JButton();
        setclear = new javax.swing.JButton();
        setback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Facultylist = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("        FACULTY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("       Fac ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Faculty Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Remarks");

        setfacid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setfacidActionPerformed(evt);
            }
        });

        setfacname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setfacnameActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("Faculties");

        setadd.setBackground(new java.awt.Color(102, 255, 255));
        setadd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        setadd.setText("ADD");
        setadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaddActionPerformed(evt);
            }
        });

        setUpdate.setBackground(new java.awt.Color(102, 255, 255));
        setUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        setUpdate.setText("UPDATE");
        setUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setUpdateActionPerformed(evt);
            }
        });

        setDelete.setBackground(new java.awt.Color(102, 255, 255));
        setDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        setDelete.setText("DELETE");
        setDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDeleteActionPerformed(evt);
            }
        });

        setclear.setBackground(new java.awt.Color(102, 255, 255));
        setclear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        setclear.setText("CLEAR");
        setclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setclearActionPerformed(evt);
            }
        });

        setback.setBackground(new java.awt.Color(102, 255, 255));
        setback.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        setback.setText("BACK");
        setback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setbackActionPerformed(evt);
            }
        });

        Facultylist.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Facultylist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(setfacid, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(setfacname, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(385, 385, 385)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(setremarks, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(101, 101, 101))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(setadd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(setUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(setDelete)
                        .addGap(117, 117, 117)
                        .addComponent(setclear, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(setback, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(setfacid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(setfacname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(23, 23, 23)
                                .addComponent(setremarks, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(132, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(setadd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setUpdate)
                                    .addComponent(setDelete)
                                    .addComponent(setclear)
                                    .addComponent(setback))
                                .addGap(23, 23, 23))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setbackActionPerformed
        // TODO add your handling code here:
      
       this.dispose();
    }//GEN-LAST:event_setbackActionPerformed

    private void setfacidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setfacidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setfacidActionPerformed

    private void setfacnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setfacnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setfacnameActionPerformed

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

    private void setDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDeleteActionPerformed
        // TODO add your handling code here:
        DeleteRecod();
        
    }//GEN-LAST:event_setDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList Facultylist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JButton setDelete;
    private javax.swing.JButton setUpdate;
    private javax.swing.JButton setadd;
    private javax.swing.JButton setback;
    private javax.swing.JButton setclear;
    private java.awt.TextField setfacid;
    private java.awt.TextField setfacname;
    private java.awt.TextArea setremarks;
    // End of variables declaration//GEN-END:variables
}