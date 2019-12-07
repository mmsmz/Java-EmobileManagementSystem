/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emobile;


public class Customer {
    private int Id;
    private String CustomerName;
    private String HomeAddress;
    private String NIC;
    private String EmailAddress;
    private int ContactNo;
    private String InvoiceNo;

    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getCustomerName() {
        return CustomerName;
    }
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }
    public String getHomeAddress() {
        return HomeAddress;
    }
    public void setHomeAddress(String HomeAddress) {
        this.HomeAddress = HomeAddress;
    }
    public String getNIC() {
        return NIC;
    }
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
    public String getEmailAddress() {
        return EmailAddress;
    }
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }
    public int getContactNo() {
        return ContactNo;
    }
    public void setContactNo(int ContactNo) {
        this.ContactNo = ContactNo;
    }
    public String getInvoiceNo() {
        return InvoiceNo;
    }
    public void setInvoiceNo(String InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }
 public void addCustomer(Customer obj) throws Exception
    {
        String SQL ="insert into [Customer] values('"+obj.Id+"','"+obj.CustomerName+"',"
     + "'"+obj.HomeAddress+"','"+obj.NIC+"','"+obj.EmailAddress+"','"+obj.ContactNo+"','"+obj.InvoiceNo+"')";
        DBConnection objcon=new DBConnection();
        System.out.println(" "+SQL);
        objcon.addvalue(SQL);
    }  


  



    
}
