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
public class ProgramBean {
    private  int deptId;
    private int progId;
    private String progName;
    private int durationsem;
    private String remarks;
    public void setDeptId(int deptId)
    {
        this.deptId=deptId;
    }
    public void setProgId(int progId)
    {
        this.progId=progId;
    }
    public void setProgName(String progName)
    {
        this.progName=progName;
    }
    public void setDuration(int durationsem)
    {
        this.durationsem=durationsem;
    }
    public void setRemarks(String remarks)
    {
        this.remarks=remarks;
    }
    public int getDeptId()
    {
        return deptId;
    }
    public int getProgId()
    {
        return progId;
    }
    public String  getProgName()
    {
        return progName;
    }
    public int getDuration()
    {
        return durationsem;
    }
    public String getRemarks()
    {
        return  remarks;
    }
    @Override
    public String toString()
    {
        return progName;
    }
    }
            
