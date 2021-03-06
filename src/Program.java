
import BeanClasses.DepartmentBean;
import BeanClasses.FacultyBean;
import BeanClasses.ProgramBean;
import DatabaseManager.Databasemanager;
import java.util.Vector;
import javax.swing.JOptionPane;
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
public class Program extends javax.swing.JFrame implements ListSelectionListener{

    /**
     * Creates new form Program
     */
    public Program() {
        initComponents();
        try{
            proglist.addListSelectionListener(this);
            faculty();
           
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
  int s;
              private void faculty(){
        try {
            Vector v=Databasemanager.getFaculty();
               factcombo.removeAllItems();
            for(int i=0; i<v.size(); i++){
                FacultyBean bean =(FacultyBean)v.elementAt(i);
                factcombo.addItem(bean);
              
            } 
        //s=factcombo.getSelectedIndex();
            }
         catch (Exception e) {
            e.printStackTrace();
             JOptionPane.showMessageDialog(this,"Error :"+e.getMessage());
        }
        
    }
                  private void department(){
                   
    
        FacultyBean bean=(FacultyBean)factcombo.getSelectedItem();
        if(bean==null) return ;
       try{
           deptcombo.removeAllItems();
           Vector v=Databasemanager.getDepartment(bean.getFacid());
           for(int i=0; i<v.size(); i++)
           {
               DepartmentBean bean1=(DepartmentBean)v.elementAt(i);
               deptcombo.addItem(bean1);
           } //end for loop
       }catch(Exception e)
       {
           e.printStackTrace();
           JOptionPane.showMessageDialog(this,"Error "+e.getMessage());
       }
        
    
                  }
              private void getprogram(){
             DepartmentBean bean=(DepartmentBean)deptcombo.getSelectedItem();
        if(bean==null) return ;
        try {
            Vector v=Databasemanager.getProgram(bean.getDeptId());
            proglist.setListData(v);
        } catch (Exception e) {
            e.printStackTrace();
             JOptionPane.showMessageDialog(this,"Error :"+e.getMessage());
        }
                  
              }
              public void valueChanged(ListSelectionEvent e)
              {
                  ProgramBean bean=(ProgramBean)proglist.getSelectedValue();
                  if(bean==null) return;
                  setprogid.setText(""+bean.getProgId());
                  setprogname.setText(""+bean.getProgName());
                  setremarks.setText(""+bean.getRemarks());
                  setduration.setText(""+bean.getDuration());
              }
private void clear()
{
    setprogid.setText("");
    setprogname.setText("");
    setduration.setText("");
    setremarks.setText("");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
private void addrecords()
{
    DepartmentBean bean=(DepartmentBean)deptcombo.getSelectedItem();
    if(bean==null) return;
    String progname=setprogname.getText();
    int  duration=Integer.parseInt(setduration.getText());
    String remarks=setremarks.getText();
    
    try {
        int rows=Databasemanager.addProg(bean.getDeptId(), progname,duration, remarks);
       
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
    }
    
} //end addRecord 
private void Update()
{
    ProgramBean bean=(ProgramBean)proglist.getSelectedValue();
    if(bean==null) return;
    try {
        int rows=Databasemanager.UpdateProg(bean.getDeptId(), bean.getProgId(), setprogname.getText(),
               Integer.parseInt( setduration.getText()),  setremarks.getText());
    } catch (Exception e) {
        e.printStackTrace();
    }
}
private void DeleteProg()
{
    ProgramBean bean=(ProgramBean)proglist.getSelectedValue();
    if(bean==null)  return;
    try {
        int row=Databasemanager.deleteProgram(bean.getProgId());
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        factcombo = new javax.swing.JComboBox();
        deptcombo = new javax.swing.JComboBox();
        setprogid = new javax.swing.JTextField();
        setprogname = new javax.swing.JTextField();
        setduration = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        setremarks = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        setadd = new javax.swing.JButton();
        Setupdate = new javax.swing.JButton();
        setDelete = new javax.swing.JButton();
        setclear = new javax.swing.JButton();
        setback = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        proglist = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PROGRAM");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PROGRAM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("FACULTY");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DEPARTMENT");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PROGRAM ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("PROGRAM NAME");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DURATION IN SEMESTER");

        factcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        factcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factcomboActionPerformed(evt);
            }
        });

        deptcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        deptcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptcomboActionPerformed(evt);
            }
        });

        setprogid.setText("jTextField1");

        setremarks.setColumns(20);
        setremarks.setRows(5);
        jScrollPane1.setViewportView(setremarks);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("PROGRAMS");

        setadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setadd.setText("ADD");
        setadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaddActionPerformed(evt);
            }
        });

        Setupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Setupdate.setText("UPDATE");
        Setupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetupdateActionPerformed(evt);
            }
        });

        setDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setDelete.setText("DELETE");
        setDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDeleteActionPerformed(evt);
            }
        });

        setclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setclear.setText("CLEAR");
        setclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setclearActionPerformed(evt);
            }
        });

        setback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setback.setText("BACK");
        setback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setbackActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("REMARKS");

        proglist.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(proglist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(setadd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Setupdate)
                        .addGap(54, 54, 54)
                        .addComponent(setDelete)
                        .addGap(84, 84, 84)
                        .addComponent(setclear)
                        .addGap(73, 73, 73)
                        .addComponent(setback))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deptcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setprogid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(setduration, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(factcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35)
                        .addComponent(setprogname, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(factcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(deptcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(setprogid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(setduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(setprogname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setadd)
                    .addComponent(Setupdate)
                    .addComponent(setDelete)
                    .addComponent(setclear)
                    .addComponent(setback))
                .addGap(311, 311, 311))
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
       getprogram();
    }//GEN-LAST:event_deptcomboActionPerformed

    private void setclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setclearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_setclearActionPerformed

    private void setaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaddActionPerformed
        // TODO add your handling code here:
        addrecords();
    }//GEN-LAST:event_setaddActionPerformed

    private void SetupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetupdateActionPerformed
        // TODO add your handling code here:
        Update();
    }//GEN-LAST:event_SetupdateActionPerformed

    private void setDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDeleteActionPerformed
        // TODO add your handling code here:
        DeleteProg();
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
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Setupdate;
    private javax.swing.JComboBox deptcombo;
    private javax.swing.JComboBox factcombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList proglist;
    private javax.swing.JButton setDelete;
    private javax.swing.JButton setadd;
    private javax.swing.JButton setback;
    private javax.swing.JButton setclear;
    private javax.swing.JTextField setduration;
    private javax.swing.JTextField setprogid;
    private javax.swing.JTextField setprogname;
    private javax.swing.JTextArea setremarks;
    // End of variables declaration//GEN-END:variables
}
