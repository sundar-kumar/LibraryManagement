/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class TestFram extends javax.swing.JFrame {

    /**
     * Creates new form TestFram
     */
    public TestFram() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        issuebooklist = new javax.swing.JList<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bookcombo = new javax.swing.JComboBox();
        rollcombo = new javax.swing.JComboBox();
        setadd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        setdelet = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        setgroup = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        factcombo1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        setpurchase = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        setshift = new javax.swing.JTextField();
        setgender = new javax.swing.JComboBox();
        batchcombo = new javax.swing.JComboBox();
        deptcombo = new javax.swing.JComboBox();
        factcombo = new javax.swing.JComboBox();
        setstdid = new javax.swing.JTextField();
        setstdname = new javax.swing.JTextField();
        setstdfname = new javax.swing.JTextField();
        setsurname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        setdateofpurchase = new javax.swing.JTextField();
        deptcombo1 = new javax.swing.JComboBox();
        setaccess = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        setpublishername = new javax.swing.JTextField();
        setbookid = new javax.swing.JTextField();
        setyearofpublish = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        setprice = new javax.swing.JTextField();
        setpage = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        setremarks = new javax.swing.JTextArea();
        setreturndate = new javax.swing.JTextField();
        setquantity = new javax.swing.JTextField();
        setissuedate = new javax.swing.JTextField();
        setauthor = new javax.swing.JTextField();
        setissueid = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        setfine = new javax.swing.JTextField();
        setibn = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        setedition = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        progcombo = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        issuebooklist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(issuebooklist);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(690, 550, 140, 180);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("YEAR_OF _PUBLISH");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(460, 270, 143, 17);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("PUBLISHER NAME");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(460, 240, 130, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("FACULTY");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 90, 80, 17);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("FNAME");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(20, 360, 51, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DEPARTMENT");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 130, 100, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PROGRAM");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 170, 73, 17);

        bookcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookcomboActionPerformed(evt);
            }
        });
        jPanel2.add(bookcombo);
        bookcombo.setBounds(650, 150, 160, 22);

        rollcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        rollcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollcomboActionPerformed(evt);
            }
        });
        jPanel2.add(rollcombo);
        rollcombo.setBounds(150, 240, 160, 20);

        setadd.setText("ADD");
        jPanel2.add(setadd);
        setadd.setBounds(20, 720, 53, 23);

        jButton2.setText("UPDATE");
        jPanel2.add(jButton2);
        jButton2.setBounds(150, 720, 71, 23);

        setdelet.setText("DELETE");
        jPanel2.add(setdelet);
        setdelet.setBounds(300, 720, 69, 23);

        jButton4.setText("CLEAR");
        jPanel2.add(jButton4);
        jButton4.setBounds(450, 720, 65, 23);

        BACK.setText("BACK");
        jPanel2.add(BACK);
        BACK.setBounds(590, 720, 59, 23);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("NUMBER_OF_PAGES");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(460, 480, 147, 17);
        jPanel2.add(jScrollPane6);
        jScrollPane6.setBounds(650, 330, 2, 2);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("QUANTITY");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(460, 450, 76, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("BOOK INFORMATION");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(520, 40, 194, 22);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("PRICE");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(460, 420, 44, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("BATCH YEAR");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 210, 91, 17);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("FACULTY");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(460, 80, 63, 17);

        setgroup.setEditable(false);
        jPanel2.add(setgroup);
        setgroup.setBounds(250, 270, 60, 20);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("ACCESS_NO");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(460, 510, 86, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("SHIFT");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 270, 44, 17);

        factcombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factcombo1ActionPerformed(evt);
            }
        });
        jPanel2.add(factcombo1);
        factcombo1.setBounds(650, 80, 160, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("GROUP");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(180, 270, 50, 17);
        jPanel2.add(setpurchase);
        setpurchase.setBounds(650, 300, 160, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("STUDENT ID");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 300, 90, 17);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("BOOK ISSUE");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(350, 540, 190, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("NAME");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 330, 43, 17);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("ISSUE ID");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(10, 570, 66, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("SURNAME");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 390, 72, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("ROLLNO");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 240, 59, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("GENDER");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 420, 60, 17);

        setshift.setEditable(false);
        jPanel2.add(setshift);
        setshift.setBounds(110, 270, 50, 20);

        jPanel2.add(setgender);
        setgender.setBounds(160, 420, 80, 20);

        batchcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchcomboActionPerformed(evt);
            }
        });
        jPanel2.add(batchcombo);
        batchcombo.setBounds(150, 210, 160, 22);

        deptcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptcomboActionPerformed(evt);
            }
        });
        jPanel2.add(deptcombo);
        deptcombo.setBounds(150, 130, 160, 22);

        factcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factcomboActionPerformed(evt);
            }
        });
        jPanel2.add(factcombo);
        factcombo.setBounds(150, 90, 160, 22);
        jPanel2.add(setstdid);
        setstdid.setBounds(150, 300, 160, 20);
        jPanel2.add(setstdname);
        setstdname.setBounds(150, 330, 160, 20);
        jPanel2.add(setstdfname);
        setstdfname.setBounds(150, 360, 160, 20);
        jPanel2.add(setsurname);
        setsurname.setBounds(150, 390, 160, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("DEPARTMENT");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(460, 120, 100, 17);
        jPanel2.add(setdateofpurchase);
        setdateofpurchase.setBounds(660, 330, 140, 20);

        deptcombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptcombo1ActionPerformed(evt);
            }
        });
        jPanel2.add(deptcombo1);
        deptcombo1.setBounds(650, 120, 160, 22);
        jPanel2.add(setaccess);
        setaccess.setBounds(660, 510, 160, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("BOOK_ID");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(460, 180, 69, 17);
        jPanel2.add(setpublishername);
        setpublishername.setBounds(650, 240, 150, 20);
        jPanel2.add(setbookid);
        setbookid.setBounds(650, 180, 100, 20);
        jPanel2.add(setyearofpublish);
        setyearofpublish.setBounds(650, 270, 110, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("BOOK_TITLE");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(460, 150, 93, 17);
        jPanel2.add(setprice);
        setprice.setBounds(660, 420, 100, 20);
        jPanel2.add(setpage);
        setpage.setBounds(660, 480, 100, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("AUTHOR");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(460, 210, 61, 17);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("ISSUE DATE");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(300, 570, 87, 17);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("RETURN DATE");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(10, 610, 102, 17);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("FINE");
        jPanel2.add(jLabel33);
        jLabel33.setBounds(300, 610, 35, 17);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("REMARKS");
        jPanel2.add(jLabel34);
        jLabel34.setBounds(20, 650, 80, 17);

        setremarks.setColumns(20);
        setremarks.setRows(5);
        jScrollPane2.setViewportView(setremarks);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(120, 640, 510, 70);
        jPanel2.add(setreturndate);
        setreturndate.setBounds(140, 610, 120, 20);
        jPanel2.add(setquantity);
        setquantity.setBounds(660, 450, 100, 20);
        jPanel2.add(setissuedate);
        setissuedate.setBounds(460, 570, 160, 20);
        jPanel2.add(setauthor);
        setauthor.setBounds(650, 210, 160, 20);
        jPanel2.add(setissueid);
        setissueid.setBounds(140, 570, 70, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("ISB_NO");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(460, 360, 57, 17);
        jPanel2.add(setfine);
        setfine.setBounds(460, 610, 90, 20);
        jPanel2.add(setibn);
        setibn.setBounds(660, 360, 110, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("EDITION");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(460, 390, 65, 17);
        jPanel2.add(setedition);
        setedition.setBounds(660, 390, 100, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("PURCHASE FROM");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(460, 300, 123, 17);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("DATE_OF_PURCHASE");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(460, 330, 153, 17);

        progcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progcomboActionPerformed(evt);
            }
        });
        jPanel2.add(progcombo);
        progcombo.setBounds(150, 170, 30, 22);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setText("BOOK ISSUE ");
        jPanel2.add(jLabel35);
        jLabel35.setBounds(340, 10, 170, 22);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setText("STUDENT IFORMATION");
        jPanel2.add(jLabel36);
        jLabel36.setBounds(30, 50, 230, 22);

        jScrollPane3.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookcomboActionPerformed
        // TODO add your handling code here:
        valuechange();
    }//GEN-LAST:event_bookcomboActionPerformed

    private void rollcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollcomboActionPerformed
        // TODO add your handling code here:
        valueChange();
    }//GEN-LAST:event_rollcomboActionPerformed

    private void factcombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factcombo1ActionPerformed
        // TODO add your handling code here:\\
        getdepartmetbook();
    }//GEN-LAST:event_factcombo1ActionPerformed

    private void batchcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchcomboActionPerformed
        // TODO add your handling code here:
        getStudent();
    }//GEN-LAST:event_batchcomboActionPerformed

    private void deptcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptcomboActionPerformed
        // TODO add your handling code here:
        getprogram();
    }//GEN-LAST:event_deptcomboActionPerformed

    private void factcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factcomboActionPerformed
        // TODO add your handling code here:
        getDepartment();
    }//GEN-LAST:event_factcomboActionPerformed

    private void deptcombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptcombo1ActionPerformed
        // TODO add your handling code here:
        getBook();
    }//GEN-LAST:event_deptcombo1ActionPerformed

    private void progcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progcomboActionPerformed
        // TODO add your handling code here:
        getBatch();
    }//GEN-LAST:event_progcomboActionPerformed

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
            java.util.logging.Logger.getLogger(TestFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JComboBox batchcombo;
    private javax.swing.JComboBox bookcombo;
    private javax.swing.JComboBox deptcombo;
    private javax.swing.JComboBox deptcombo1;
    private javax.swing.JComboBox factcombo;
    private javax.swing.JComboBox factcombo1;
    private javax.swing.JList<String> issuebooklist;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox progcombo;
    private javax.swing.JComboBox rollcombo;
    private javax.swing.JTextField setaccess;
    private javax.swing.JButton setadd;
    private javax.swing.JTextField setauthor;
    private javax.swing.JTextField setbookid;
    private javax.swing.JTextField setdateofpurchase;
    private javax.swing.JButton setdelet;
    private javax.swing.JTextField setedition;
    private javax.swing.JTextField setfine;
    private javax.swing.JComboBox setgender;
    private javax.swing.JTextField setgroup;
    private javax.swing.JTextField setibn;
    private javax.swing.JTextField setissuedate;
    private javax.swing.JTextField setissueid;
    private javax.swing.JTextField setpage;
    private javax.swing.JTextField setprice;
    private javax.swing.JTextField setpublishername;
    private javax.swing.JTextField setpurchase;
    private javax.swing.JTextField setquantity;
    private javax.swing.JTextArea setremarks;
    private javax.swing.JTextField setreturndate;
    private javax.swing.JTextField setshift;
    private javax.swing.JTextField setstdfname;
    private javax.swing.JTextField setstdid;
    private javax.swing.JTextField setstdname;
    private javax.swing.JTextField setsurname;
    private javax.swing.JTextField setyearofpublish;
    // End of variables declaration//GEN-END:variables
}