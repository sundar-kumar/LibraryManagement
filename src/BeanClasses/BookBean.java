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
public class BookBean {
    private int dept_id;
    private int book_id;
    private String book_name;
    private String author_name;
    private int edition;
    private int quantity;
    private int price;
    private String purchase_from;
    private int date_of_purchase;
    private int isb_no;
    private int access_no;
    private int year_of_publish;
    private int no_of_pages;
    private String publisher_name;
    private String remarks;
    
    public  void setDeptId(int dept_id)
    {
        this.dept_id=dept_id;
    }
    public void setBookId(int book_id)
    {
        this.book_id=book_id;
    }
    public void setBookName(String book_name)
    {
        this.book_name=book_name;
    }
    public void setAuthorName(String author_name)
    {
        this.author_name=author_name;
    }
    public void setEdition(int edition)
    {
        this.edition=edition;
    }
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public void setPurchaseFrom(String purchase_from)
    {
        this.purchase_from=purchase_from;
    }
    public void setDateOfPurchase(int date_of_purchase)
    {
        this.date_of_purchase=date_of_purchase;
    }
    public void setIsbNo(int isb_no)
    {
        this.isb_no=isb_no;
       
    }
    public void setAccessNo(int access_no)
    {
        this.access_no=access_no;
    }
    public void setYearOfPublish(int year_of_publish)
    {
        this.year_of_publish=year_of_publish;
    }
    public void setNumberOfPages(int no_of_pages)
    {
        this.no_of_pages=no_of_pages;
    }
    public void setPublisherName(String publisher_name)
    {
        this.publisher_name=publisher_name;
      
    }
    public void setremarks(String remarks)
    {
        this.remarks=remarks;
               
    }
    public int getDeptId()
    {
        return dept_id;
    }
    public int getBookId()
    {
        return book_id;
    }
    public String getBookName()
    {
        return book_name;
    }
    public String getAuthorName()
    {
        return author_name;
    }
    public int getEdition()
    {
        return edition;
    }
    
   public int getQuantity()
   {
       return quantity;
   }
   public int getPrice()
   {
       return price;
   }
   public String getPurchaseFrom()
   {
       return purchase_from;
   }
   public int getDateOfPurchase()
   {
       return date_of_purchase;
   }
   public int getIsbNo()
   {
       return isb_no;
   }
   public int getAccessNo()
   {
       return access_no;
   }
   public String getPublisherName()
   {
       return publisher_name;
   }
   public int getYearOfPublish()
   {
       return year_of_publish;
   }
   public int getNumberOfPages()
   {
       return no_of_pages;
   }
   public String getRemarks()
   {
       return remarks;
   }
   public String toString()
   {
       return  book_name;
   }
 
    
    
}
