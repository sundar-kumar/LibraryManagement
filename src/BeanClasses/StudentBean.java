/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanClasses;

/**
 *
 * @author ADMIN
 */
public class StudentBean {
    
    private int batchId;
    private int stdId;
    private String stdName;
    private String fname;
    private String surname;
    private String rollNo;
    private String gender;
    private String remarks;
    
    public void setBatchId(int batchid)
    {
        this.batchId=batchid;
    }
    public void setStdId(int stdId)
    {
        this.stdId=stdId;
    }
    public void setStdName(String stdName)
    {
        this.stdName=stdName;
    }
    public void setFname(String fname)
    {
        this.fname=fname;
    }
    public void setSurname(String surname)
    {
        this.surname=surname;
    }
    public void setRollNo(String rollNo)
    {
        this.rollNo=rollNo;
    }
    public void setRemarks(String remarks)
    {
        this.remarks=remarks;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
   
    public int getBatchId()
    {
        return batchId;
    }
    public int getStdId()
    {
        return  stdId;
    }
    public String getStdName()
    {
        return stdName;
    }
    public String getFname()
    {
        return fname;
    }
    public String getSurname()
    {
        return surname;
    }
    public String getRollNo()
    {
        return rollNo;
    }
    public String getRemarks()
    {
        return remarks;
    }
    public String getGender() {
        return gender;
        
    }
    public String toString()
    {
        return stdName+"--"+rollNo;
    }
    
    
}
