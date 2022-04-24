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
public class BookIssueBean
{
    private int std_id;
    private int book_id;
    private int book_issue_id;
    private String date_of_issue;
    private String date_of_return;
    private String fine;
    private String remarks;
    public void setBookIssueId(int book_issueid)
    {
        this.book_issue_id=book_issueid;
    }
    public void setStdId(int std_id)
    {
        this.std_id=std_id;
    }
    public void setBookId(int book_id)
    {
        this.book_id=book_id;
    }
    public void setBookIssueDate(String date_of_issue)
    {
        this.date_of_issue=date_of_issue;
    }
    public void setBookReturnDate(String date_of_return)
    {
        this.date_of_return=date_of_return;
    }
    public void setFine(String fine)
    {
        this.fine=fine;
    }
    public void setRemarks(String remarks)
    {
        this.remarks=remarks;
    }
    public int getBookIssueId()
    {
        return book_issue_id;
    }
    
    public int getStdId()
    {
        return std_id;
    }
    public int getBookId()
    {
        return book_id;
    }
    public String getDateOfIssue()
    {
        return date_of_issue;
    }
    public String getDateOfReturn()
    {
        return date_of_return;
    }
    public String getFine()
    {
        return fine;
        
    }
    public String getRemarks()
        {
            return remarks;
        }
        
    public String toString()
    {
        return date_of_issue;
    }
    
    
}
