/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.sql.*;
public class TestDB {
    public static void main(String arg[]) throws Exception
    {
       
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        System.err.println("ok ");
        try (Connection con = DriverManager.getConnection("jdbc:ucanaccess://E:\\Databasecenter\\Firstdatabase.accdb")) {
            System.out.println("Succesfully connected with DB");
            String query= "Select fac_id,fac_name,remarks from Faculty";
            System.out.println(query);
            try (Statement st = con.createStatement(); ResultSet result = st.executeQuery(query)) {
                while(result.next()){
                    String facId=result.getString("fac_id");
                    String facName=result.getString("fac_name");
                    String remarks=result.getString("Remarks");
                    System.out.println("Fac_id :"+facId);
                    System.out.println("Fac_name :"+facName);
                    System.out.println("Remarks :"+remarks);
                    System.out.println("*************************");
                }
            }
        }
        System.out.println("Close Connection");
            
             
    }
        
    
}
