
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class DefaulterList {
    public static void main(String arg[])
    {
        Vector vcol=new Vector();
        Vector rowVector=new Vector();
       JTable table=new JTable(rowVector, vcol);
        JScrollPane scrol=new JScrollPane(table);
       
        
        JFrame win=new JFrame();
        Container con=win.getContentPane();
        con.setLayout(new BorderLayout());
        con.add(scrol,BorderLayout.CENTER);
        Toolkit kit=win.getToolkit();
        Dimension d=kit.getScreenSize();
        System.out.println(d);
        win.setBounds(0,0,d.width,d.height);
        vcol.addElement("Name");
        vcol.addElement("Subject");
        vcol.addElement("RollNo");
        try {
            rowVector=DatabaseManager.Databasemanager.getDefaulter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        win.show();
         
    
    } 
}
