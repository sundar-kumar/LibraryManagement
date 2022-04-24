
import BeanClasses.DepartmentBean;
import BeanClasses.FacultyBean;
import BeanClasses.BookBean;
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
public class Book extends javax.swing.JFrame implements ListSelectionListener{

    /**
     * Creates new form Book
     */
    public Book() {
        initComponents();
        try {
            booklist.addListSelectionListener(this);
            getfaculty();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void getfaculty()
    {
        try {
            Vector v=Databasemanager.getFaculty();
            factcombo.removeAllItems();
            for(int i=0; i<v.size(); i++)
            {
                FacultyBean bean=(FacultyBean)v.elementAt(i);
                factcombo.addItem(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void getdepartment()
    {
        FacultyBean bean=(FacultyBean)factcombo.getSelectedItem();
        if(bean==null)
            return;
        deptcombo.removeAllItems();
        try {
            
     
        Vector v=Databasemanager.getDepartment(bean.getFacid());
        for(int i=0; i<v.size(); i++)
        {
            DepartmentBean bean1=(DepartmentBean)v.elementAt(i);
            deptcombo.addItem(bean1);
        }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private void getbook()
    {
        DepartmentBean bean=(DepartmentBean)deptcombo.getSelectedItem();
        if(bean==null) return;
        try {
            Vector v=Databasemanager.getBook(bean.getDeptId());
            booklist.setListData(v);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    ////add method start
    private void AddBook(){
        DepartmentBean bean=(DepartmentBean)deptcombo.getSelectedItem();
        BookBean bean1=(BookBean)booklist.getSelectedValue();
        if(bean==null) return;
      //  int bookid=Integer.parseInt(setbookid.getText());
        String booktitle=setbookname.getText();
        String authorname=setauthor.getText();
        String purchasefrom=setpurchase.getText();
        int purchasedate=Integer.parseInt(setpurchasedate.getText());
        int quantity=Integer.parseInt(setquantity.getText());
        int price=Integer.parseInt(setprice.getText());
        int publisheryear=Integer.parseInt(setpublishyear.getText());
        
        String publishername=setpublishername.getText();
        int isbno=Integer.parseInt(setisbno.getText());
        int accessno=Integer.parseInt(setaccessno.getText());
        int page=Integer.parseInt(setpage.getText());
        int edition=Integer.parseInt(setedition.getText());
        String remarks=setremarks.getText();
        try {
            int rows=Databasemanager.addBook(bean.getDeptId(), booktitle, authorname, 
                    publishername, publisheryear, purchasefrom, purchasedate, page, isbno, accessno, quantity, price, remarks);
        } catch (Exception e) {
            e.printStackTrace();
           
                JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
        
    }
    //////////////////////////////////////////////////////
    private void update()
    {
        BookBean bean=(BookBean)booklist.getSelectedValue();
        if(bean==null)
            return;
        try {
   int rows=Databasemanager.UpdateBook(bean.getDeptId(), bean.getBookId(), setbookname.getText(), setauthor.getText(),setpublishername.getText(),
           Integer.parseInt( setpublishyear.getText()),  setpurchase.getText(),
                    Integer.parseInt(setpurchasedate.getText()), Integer.parseInt(setpage.getText()),
                    Integer.parseInt(setisbno.getText()),Integer.parseInt(setaccessno.getText()),
                    Integer.parseInt(setquantity.getText()),
                    Integer.parseInt(setprice.getText()), setremarks.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /////////////////////////////////////////////
    private void delete()
    {
        BookBean bean=(BookBean)booklist.getSelectedValue();
        if(bean==null)
            return;
        try {
            int rows=Databasemanager.deleteBook(bean.getBookId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
         /////////////////////////////////////////////////////////////   
    private void clear()
    {
        setaccessno.setText("");
        setauthor.setText("");
        setbookid.setText("");
        setbookname.setText("");
        setedition.setText("");
        setisbno.setText("");
        setpage.setText("");
        setprice.setText("");
        setpublishername.setText("");
        setpublishyear.setText("");
        setpurchase.setText("");
        setpurchasedate.setText("");
        setquantity.setText("");
        setremarks.setText("");
        
    }
    ////////////////////////////
    public void valueChanged(ListSelectionEvent e)
    {
        BookBean bean=(BookBean)booklist.getSelectedValue();
        if(bean==null)
            return;
        setbookname.setText(""+bean.getBookName());
        setbookid.setText(""+bean.getBookId());
        setauthor.setText(""+bean.getAuthorName());
        setedition.setText(""+bean.getEdition());
        setaccessno.setText(""+bean.getAccessNo());
        setisbno.setText(""+bean.getIsbNo());
        setpage.setText(""+bean.getNumberOfPages());
        setprice.setText(""+bean.getPrice());
        setpublishyear.setText(""+bean.getYearOfPublish());
        setpurchasedate.setText(""+bean.getDateOfPurchase());
        setpublishername.setText(""+bean.getPublisherName());
        setpurchase.setText(""+bean.getPurchaseFrom());
        setquantity.setText(""+bean.getQuantity());
        setremarks.setText(""+bean.getRemarks());
       
    }
    /////////////////////////////////////////////////

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
        factcombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        deptcombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        setbookid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        setprice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        setauthor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        setisbno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        setedition = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        setpurchase = new javax.swing.JTextField();
        setpurchasedate = new javax.swing.JTextField();
        setaccessno = new javax.swing.JTextField();
        setpublishername = new javax.swing.JTextField();
        setpublishyear = new javax.swing.JTextField();
        setpage = new javax.swing.JTextField();
        setbookname = new javax.swing.JTextField();
        setquantity = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booklist = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        setremarks = new javax.swing.JTextArea();
        setadd = new javax.swing.JButton();
        setupdate = new javax.swing.JButton();
        serdelete = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BOOK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 11, 99, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("FACULTY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 46, 112, 23));

        factcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        factcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factcomboActionPerformed(evt);
            }
        });
        getContentPane().add(factcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 49, 195, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DEPARTMENT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 122, -1));

        deptcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        deptcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptcomboActionPerformed(evt);
            }
        });
        getContentPane().add(deptcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 83, 193, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("BOOK_ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 117, -1, -1));
        getContentPane().add(setbookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 114, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("BOOK_TITLE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 23));
        getContentPane().add(setprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 172, 193, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("AUTHOR");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 198, 72, -1));
        getContentPane().add(setauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 198, 193, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("ISB_NO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 236, -1, -1));
        getContentPane().add(setisbno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 236, 193, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("EDITION");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 274, 74, -1));
        getContentPane().add(setedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 274, 193, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("PURCHASE FROM");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 316, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("DATE_OF_PURCHASE");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 354, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("YEAR_OF _PUBLISH");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("PUBLISHER NAME");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 392, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("REMARKS");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("NUMBER_OF_PAGES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 481, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("QUANTITY");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 519, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("PRICE");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 181, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("ACCESS_NO");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 557, -1, 22));
        getContentPane().add(setpurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 316, 198, -1));
        getContentPane().add(setpurchasedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 354, 89, -1));
        getContentPane().add(setaccessno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 92, -1));
        getContentPane().add(setpublishername, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 392, 191, -1));
        getContentPane().add(setpublishyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 444, 76, -1));
        getContentPane().add(setpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 481, 174, -1));
        getContentPane().add(setbookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 143, 223, -1));
        getContentPane().add(setquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 519, 92, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("BOOKS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 109, -1, -1));

        booklist.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(booklist);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 144, 176, 278));

        setremarks.setColumns(20);
        setremarks.setRows(5);
        jScrollPane2.setViewportView(setremarks);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 484, 452, -1));

        setadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setadd.setText("ADD");
        setadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaddActionPerformed(evt);
            }
        });
        getContentPane().add(setadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 586, -1, -1));

        setupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setupdate.setText("UPDATE");
        setupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setupdateActionPerformed(evt);
            }
        });
        getContentPane().add(setupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 586, -1, -1));

        serdelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        serdelete.setText("DELETE");
        serdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(serdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 586, -1, -1));

        clearbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearbutton.setText("CLEAR");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(clearbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 586, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 586, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void factcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factcomboActionPerformed
        // TODO add your handling code here:
        getdepartment();
    }//GEN-LAST:event_factcomboActionPerformed

    private void deptcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptcomboActionPerformed
        // TODO add your handling code here:
        getbook();
    }//GEN-LAST:event_deptcomboActionPerformed

    private void setaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaddActionPerformed
        // TODO add your handling code here:
        AddBook();
    }//GEN-LAST:event_setaddActionPerformed

    private void setupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setupdateActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_setupdateActionPerformed

    private void serdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serdeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_serdeleteActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList booklist;
    private javax.swing.JButton clearbutton;
    private javax.swing.JComboBox deptcombo;
    private javax.swing.JComboBox factcombo;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton serdelete;
    private javax.swing.JTextField setaccessno;
    private javax.swing.JButton setadd;
    private javax.swing.JTextField setauthor;
    private javax.swing.JTextField setbookid;
    private javax.swing.JTextField setbookname;
    private javax.swing.JTextField setedition;
    private javax.swing.JTextField setisbno;
    private javax.swing.JTextField setpage;
    private javax.swing.JTextField setprice;
    private javax.swing.JTextField setpublishername;
    private javax.swing.JTextField setpublishyear;
    private javax.swing.JTextField setpurchase;
    private javax.swing.JTextField setpurchasedate;
    private javax.swing.JTextField setquantity;
    private javax.swing.JTextArea setremarks;
    private javax.swing.JButton setupdate;
    // End of variables declaration//GEN-END:variables
}
