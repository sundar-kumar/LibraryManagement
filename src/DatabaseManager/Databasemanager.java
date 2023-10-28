/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseManager;

/**
 *
 * @author ADMIN
 */
import BeanClasses.BookBean;

import BeanClasses.DepartmentBean;
import BeanClasses.FacultyBean;
import BeanClasses.ProgramBean;
import BeanClasses.StudentBean;
import BeanClasses.BatchBean;
import BeanClasses.BookIssueBean;
import java.sql.*;
import java.util.*;
import DatabaseManager.*;
public class Databasemanager {
    private static Connection con;
    static{
        try {
            
                init();
                
        } catch (Exception e) {
                e.printStackTrace();
                }
        } //end static block
    
    private static void  init()throws  Exception
    {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        con=DriverManager.getConnection("jdbc:ucanaccess://E:\\Databasecenter\\Libaray.accdb");
        System.out.println("Connection Succusfully established ");
    }
    public static  Vector getFaculty()throws Exception
    {
        String query="Select * from Faculty";
        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        
        try {
            st=con.createStatement();
            result=st.executeQuery(query);
            Vector v=new Vector();
            while(result.next())
            {
                FacultyBean bean =new FacultyBean();
                bean.setFacId(result.getInt("fac_id"));
                bean.setFacName(result.getString("fac_name"));
                bean.setRemarks(result.getString("Remarks"));
                v.addElement(bean);
            
            } //end while 
            return  v;
        } // end try
        finally{
            if(result!=null) 
                result.close();
            if(st!=null)
                st.close();
    } //end finalyy
    } //end getFaculty method 
     public static  Vector getDepartment(int facId)throws Exception
    {
        String query="Select * from Department where fac_id="+facId;
        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        
        try {
            st=con.createStatement();
            result=st.executeQuery(query);
            Vector v=new Vector();
            while(result.next())
            {
                DepartmentBean bean =new DepartmentBean();
                bean.setFactId(result.getInt("fac_id"));
                bean.setDeptId(result.getInt("dept_id"));
                bean.setDeptName(result.getString("dept_name"));
                bean.setRemarks(result.getString("remarks"));
                v.addElement(bean);
            
            } //end while 
            return  v;
        } // end try
        finally{
            if(result!=null) 
                result.close();
            if(st!=null)
                st.close();
    } //end finalyy
    } //end getDepartment method 
     public static  Vector getProgram(int DeptId)throws Exception
    {
        String query="Select * from Program where dept_id ="+DeptId;
        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        
        try {
            st=con.createStatement();
            result=st.executeQuery(query);
            Vector v=new Vector();
            while(result.next())
            {
                ProgramBean bean =new ProgramBean();
                 bean.setDeptId(result.getInt("dept_id"));
                bean.setProgId(result.getInt("prog_id"));
                bean.setProgName(result.getString("prog_name"));
                bean.setDuration(result.getInt("duration_in_sem"));
                bean.setRemarks(result.getString("remarks"));
                
                v.addElement(bean);
            
            } //end while 
            return  v;
        } // end try
        finally{
            if(result!=null) 
                result.close();
            if(st!=null)
                st.close();
    } //end finalyy
    } //end getProgram method 
       public static  Vector getBatch(int prodId)throws Exception
    {
        String query="Select * from Batch where prog_id="+prodId;
        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        
        try {
            st=con.createStatement();
            result=st.executeQuery(query);
            Vector v=new Vector();
            while(result.next())
            {
                BatchBean bean=new BatchBean();
               
                bean.setProgId(result.getInt("prog_id"));
                bean.setBatchId(result.getInt("batch_id"));
                bean.setBatchYear(result.getString("batch_year"));
                bean.setGroupDesc(result.getString("group_desc"));
                bean.setShift(result.getString("shift"));
                bean.setRemarks(result.getString("remarks"));
                
                v.addElement(bean);
            
            } //end while 
            return  v;
        } // end try
        finally{
            if(result!=null) 
                result.close();
            if(st!=null)
                st.close();
    } //end finalyy
    } //end getBatch method 
         public static  Vector getStudent(int batchId)throws Exception
    {
        String query="Select * from Student where batch_id="+batchId;
        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        
        try {
            st=con.createStatement();
            result=st.executeQuery(query);
            Vector v=new Vector();
            while(result.next())
            {
                StudentBean bean =new StudentBean();
                 bean.setBatchId(result.getInt("batch_id"));
                bean.setStdId(result.getInt("std_id"));
                bean.setStdName(result.getString("std_name"));
                bean.setFname(result.getString("fname"));
                bean.setSurname(result.getString("surname"));
                bean.setRollNo(result.getString("roll_no"));
                bean.setRemarks(result.getString("remarks"));
                bean.setGender(result.getString("gender"));
               // String gender=(result.getString("gender"));
               // gender=Decoder.genderdecode(gender);
               // bean.setGender(gender);
              
                
                v.addElement(bean);
            
            } //end while 
            return  v;
        } // end try
        finally{
            if(result!=null) 
                result.close();
            if(st!=null)
                st.close();
    } //end finalyy
    } //end getStudent method 
           public static Vector getBook(int deptId)throws Exception
         {
             String query="Select * from Book where dept_id="+deptId;
             System.out.print(query);
             Statement st=null;
             ResultSet result=null;
             try {
                 st=con.createStatement();
                 result=st.executeQuery(query);
                 Vector v=new Vector();
                 while(result.next())
                 {
                     BookBean bean=new BookBean();
                     bean.setDeptId(result.getInt("dept_id"));
                     bean.setBookId(result.getInt("book_id"));
                     bean.setBookName(result.getString("book_name"));
                     bean.setAuthorName(result.getString("author_name"));
                     bean.setPurchaseFrom(result.getString("purchase_from"));
                     bean.setDateOfPurchase(result.getInt("date_of_purchase"));
                     bean.setIsbNo(result.getInt("isb_no"));
                     bean.setAccessNo(result.getInt("acces_no"));
                     bean.setNumberOfPages(result.getInt("number_of_page"));
                     bean.setPrice(result.getInt("price"));
                     bean.setPublisherName(result.getString("publisher_name"));
                     bean.setYearOfPublish(result.getInt("year_of_publish"));
                     bean.setDateOfPurchase(result.getInt("date_of_purchase"));
                     bean.setremarks(result.getString("remarks"));
                     v.addElement(bean);
                 } //while end
                 return v;
                 
             } //end try
                 finally   {
                             if(result!=null)
                                 result.close();
                             if(st!=null)
                                 st.close();
                         }  //end finalyy 
                         
         } //end getBook method 
          public static Vector getbookissue(int bookid,int stdid)throws Exception{
               String query="select * from BookIssue where book_id="+bookid+"And std_id="+stdid;
               System.out.println(query);
               Statement st=null;
               ResultSet result=null;
               try {
                  st=con.createStatement();
                  result=st.executeQuery(query);
                  Vector v=new Vector();
                  while(result.next())
                  {
                      BookIssueBean bean=new BookIssueBean();
                      bean.setBookIssueId(result.getInt("book_issue_id"));
                      bean.setBookId(result.getInt("book_id"));
                      bean.setStdId(result.getInt("std_id"));
                      bean.setBookIssueDate(result.getString("date_of_issue"));
                      bean.setBookReturnDate(result.getString("date_of_return"));
                      bean.setFine(result.getString("fine"));
                      bean.setRemarks(result.getString("remarks"));
                      v.addElement(bean);
                  }
                  return v;
              } finally {
                   if(result!=null)
                       result.close();
                   if(st!=null)
                       st.close();
              }
               
           }
          /////////////////////////////////////////
           public static Vector getbookissue(int bookid)throws Exception{
               String query="select * from BookIssue where book_id="+bookid;
               System.out.println(query);
               Statement st=null;
               ResultSet result=null;
               try {
                  st=con.createStatement();
                  result=st.executeQuery(query);
                  Vector v=new Vector();
                  while(result.next())
                  {
                      BookIssueBean bean=new BookIssueBean();
                      bean.setBookIssueId(result.getInt("book_issue_id"));
                      bean.setBookId(result.getInt("book_id"));
                      bean.setStdId(result.getInt("std_id"));
                      bean.setBookIssueDate(result.getString("date_of_issue"));
                      bean.setBookReturnDate(result.getString("date_of_return"));
                      bean.setFine(result.getString("fine"));
                      bean.setRemarks(result.getString("remarks"));
                      v.addElement(bean);
                  }
                  return v;
              } finally {
                   if(result!=null)
                       result.close();
                   if(st!=null)
                       st.close();
              }
            }
          /*
            /////////////////////////////////////////////  
              public static Vector getbookissue(String stdid)throws Exception{
               String query="select * from BookIssue where  std_id="+stdid;
               System.out.println(query);
               Statement st=null;
               ResultSet result=null;
               try {
                  st=con.createStatement();
                  result=st.executeQuery(query);
                  Vector v=new Vector();
                  while(result.next())
                  {
                      BookIssueBean bean=new BookIssueBean();
                      bean.setBookIssueDate(result.getString("book_issue_id"));
                      bean.setBookId(result.getInt("book_id"));
                      bean.setStdId(result.getInt("std_id"));
                      bean.setBookIssueDate(result.getString("date_of_issue"));
                      bean.setBookReturnDate(result.getString("date_of_return"));
                      bean.setFine(result.getString("fine"));
                      bean.setRemarks(result.getString("remarks"));
                      v.addElement(bean);
                  }
                  return v;
              } finally {
                   if(result!=null)
                       result.close();
                   if(st!=null)
                       st.close();
              }
              }*/
            /////////////////////////////////////////////
        public static int deleteFaculty(int facId) throws Exception
         {
             String query="delete from Faculty where fac_id="+facId;
             System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end deleteFaculty method
               public static int deleteDepartment(int deptId) throws Exception
         {
             String query="delete from Department where dept_id="+deptId;
             System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end deleteDepartemt method
                 public static int deleteProgram(int progId) throws Exception
         {
             String query="delete from Program where prog_id="+progId;
             System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end deletProgram method 
                   public static int deleteBatch(int batchId) throws Exception
         {
             String query="delete from Batch where batch_id="+batchId;
             System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end deleteBatch method
                     public static int deleteStudent(int stdId) throws Exception
         {
             String query="delete from Student where std_id="+stdId;
             System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //deleteStudent method end
              public static int deleteBook(int bookid) throws Exception
              {
                  String query="delete from Book where book_id="+bookid;
                  System.out.println(query);
                  Statement st=null;
                  try {
                      st=con.createStatement();
                      int rows=st.executeUpdate(query);
                      return  rows;
                  } finally {
                      if(st!=null)
                          st.close();
                  } //end finaly 
                  
              } //end deleteBook method
              //////////////////////////////////////////////////
              public static int deletebookissue(int bookissue)throws Exception
              {
                  String query ="delete from BookIssue where book_issue_id="+bookissue;
                  System.out.println(query);
                  Statement st=null;
                  try {
                      st=con.createStatement();
                      int rows=st.executeUpdate(query);
                      return rows;
                  } finally {
                      if(st!=null)
                          st.close();
                  }
              }   //deted bookissue
                     ////////////////////////////update start//////////////////////////////
           public static int UpdateFaculty(int facId,String facName,String remarks)throws Exception
           {
               String query= "update Faculty set fac_name ='"+facName+"',remarks='"+remarks+"'where fac_id="+facId;
                 System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end updateFaculty method
             public static int UpdateDept(int facId,int deptId,String deptName,String remarks)throws Exception
           {
               String query= "update Department set dept_name ='"+deptName+"',remarks='"+remarks+"',fac_id='"+facId+"'where dept_id="+deptId;
                 System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end updatedept method
             /////////////////////////////////////////////////
            public static int UpdateProg(int deptId,int progId,String progName,int duration,String remarks)throws Exception
           {
   String query= "update Program set prog_name ='"+progName+"',remarks='"+remarks+"',dept_id='"+deptId+"',duration_in_sem='"+duration+
                       "'where prog_id="+progId;
                 System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end updateprogram method
            ////////////////////////////////////////////////////////
       public static int UpdateBatch(int progId,int batchId,String  batchyear,String shift,String group,String remarks)throws Exception
           {
   String query= "update Batch set batch_year ='"+batchyear+"',remarks='"+remarks+"',prog_id='"+progId+"',shift='"+shift+
                       "',group_desc='"+group+"'where batch_id="+batchId;
                 System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end updateprog method
       ////////////////////////////////////////////////////////////
        public static int UpdateStudent(int batchId,int stdId,String stdname,String fname,String surname,
           String rollno,String remarks,String gender)throws Exception
           {
   String query= "update Student set batch_id ="+batchId+",remarks='"+remarks+"',std_name='"+stdname+"',fname='"+fname+
                       "',surname='"+surname+"',roll_no='"+rollno+"',gender='"+gender+"' where std_id="+stdId;
                 System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end updatestudent method
        public static int UpdateBook(int deptid,int bookid,String bookname,String authorname,String publishername,int publishyear
        ,String purchasefrom,int dateofpurchase,int numberofpages,int isbno,int accesno,int quantity,int price,String remarks)
                throws Exception
        {
            String query="update Book set dept_id="+deptid+",book_name='"+bookname+"',author_name='"+authorname+"'"
                    + " ,publisher_name='"+publishername+"',year_of_publish='"+publishyear+"',purchase_from='"+purchasefrom+"'"
                    + ",date_of_purchase="+dateofpurchase+",number_of_page="+numberofpages+",isb_no="+isbno+",acces_no="+accesno+""
                    + ",quantity="+quantity+",price="+price+",remarks='"+remarks+ "' where book_id="+ bookid;
            System.out.println(query);
            Statement st=null;
            try {
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
            } finally {
                if(st!=null)
                    st.close();
            }
            
         
    } //end UpadteBook method
        //////////////////////////////////////
       public static int updatebookissue(int bookid,int stdid,int bookissueid,String dateofissue,String dateofreturn,String fine,String remarks)throws Exception
        {
            String query = "update BookIssue set book_id="+bookid+"," + "std_id="+stdid+" "
                            + ",date_of_issue='"+dateofissue+"'"
                    + ",date_of_return ='"+dateofreturn+"',fine='"+fine+"',remarks='"+remarks+"' where book_issue_id="+bookissueid;
            System.out.println(query);
            Statement st=null;
            try {
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
            } finally {
                if(st!=null)
                    st.close();
            }
        } //update bookissue
         ///////////////////////add methods start/////////////////////
         public static int addFaculty(String facName,String remarks) throws Exception{
            String query="insert into Faculty(fac_name,remarks)values ('"+facName+"','"+remarks+"')";
            System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end addfaculty method
         ///////////////////////////////////////////////////////////
           public static int addDept(int facId,String deptName,String remarks) throws Exception{
   String query="insert into Department(fac_id,dept_name,remarks)values ('"+facId+"','"+deptName+"','"+remarks+"')";
            System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end adddept method
           ///////////////////////////////////////////////////////////////
            public static int addProg(int deptId,String progName,int duration,String remarks) throws Exception{
   String query="insert into Program(dept_id,prog_name,duration_in_sem,remarks)values ('"+deptId+"','"+progName+"',"+duration+",'"+remarks+"')";
            System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end addprog method
            /////////////////////////////////////////////////////////
             public static int addBatch(int progId,String batchyear,String shift,String group,String remarks) throws Exception{
   String query="insert into Batch(prog_id,batch_year,shift,group_desc,remarks)values "
           + "("+progId+","+batchyear+",'"+shift+"','"+group+"','"+remarks+"')";
            System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end addbatch method
             ///////////////////////////////////////////////////////
                public static int addStudent(int batchId,String stdname,String fname,String surname,
                        int  rollno,String remarks,String gender) throws Exception{
                    gender=Decoder.genderdecode(gender);
   String query="insert into Student(batch_id,std_name,fname,surname,roll_no,remarks,gender)values "
           + "("+batchId+",'"+stdname+"','"+fname+"','"+surname+"',"+rollno+",'"+remarks+"','"+gender+"')";
            System.out.println(query);
             Statement st=null;
             try {
                 
                     st=con.createStatement();
                     int rows=st.executeUpdate(query);
                     return rows;
             } finally{
                     if(st!=null)
                         st.close();
                     }
             } //end addstudent method
           
  public static int addBook(int deptid,String bookname,String authorname,String publishername,int publishyear,
        String purchasefrom,int dateofpurchase,int numberofpages,int isbno,int accesno,int quantity,int price,String remarks)
                throws Exception{

String query="insert into Book(dept_id,book_name,author_name,publisher_name,year_of_publish,purchase_from,date_of_purchase"
        + ",number_of_page,isb_no,acces_no,quantity,price,remarks)values"+"('"+deptid+"','"+bookname+"','"+authorname+"'"
        + ",'"+publishername+"','"+publishyear+"','"+purchasefrom+"','"+dateofpurchase+"','"+numberofpages+"','"+isbno+"','"+accesno+"'"
        + ",'"+quantity+"','"+price+"','"+remarks+"')";
   System.out.println(query);
   Statement st=null;
      try {
          st=con.createStatement();
          int rows=st.executeUpdate(query);
          return rows;
      } finally{
          if(st!=null)
              st.close();
      } //end finally

} //end addbook
  public static int addBookisuue(int stdid,int bookid,String datofissue,String dateofreturn,String fine,String remarks) throws Exception
  {
      String query="insert into BookIssue(book_id,std_id,date_of_issue,date_of_return,fine,remarks)values"+"("+bookid+","+stdid+""
              + ",'"+datofissue+"','"+dateofreturn+"','"+fine+"','"+remarks+"')";
      System.out.println(query);
      Statement st=null;
      try {
          st=con.createStatement();
          int rows=st.executeUpdate(query);
          return rows;
          
      } finally {
          if(st!=null)
              st.close();
      }
  } //end addBookissue
  public static Vector getDefaulter(String startdate,String enddate) throws Exception
  {
    //  String query="select std_name,fname,surname,roll_no,date_of_issue,book_name from Student,Book, BookIssue where Book.book_id=BookIssue.book_id"
            //  + " And Student.std_id=BookIssue.std_id  And date_of_return is null";
      String query="select std_name,fname,surname,roll_no,date_of_issue,book_name from Student,Book, BookIssue where Book.book_id=BookIssue.book_id"
              + " And Student.std_id=BookIssue.std_id And date_of_issue>='"+startdate+"' And date_of_issue<='"+enddate+"' And"
              + " date_of_return is null";
      System.out.println(query);
      Statement st=null;
      ResultSet result=null;
      try {
          st=con.createStatement();
          result=st.executeQuery(query);
          Vector rowVector=new Vector();
          for(; result.next();)
          {
              Vector r=new Vector();
              r.addElement(result.getString("std_name"));
              r.addElement(result.getString("fname"));
              r.addElement(result.getString("surname"));
              r.addElement(result.getString("roll_no"));
              r.addElement(result.getString("book_name"));
              r.addElement(result.getString("date_of_issue"));
              rowVector.addElement(r);
          }
          return rowVector;
      } finally {
          if(result!=null)
              result.close();
          if(st!=null)
              st.close();
      }
      
  }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
   
} //end class

               
                          
        

    
    

