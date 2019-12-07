/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emobile;

/**
 *
 * @author hnd
 */
public class Payments
{
    private String InvoiceNo;
    private String ItemCode;
    private String ItemName;
    private int Quantity;
    private double UnitPrice;
    private double Total;

    public String getInvoiceNo() {
        return InvoiceNo;
    }
    public void setInvoiceNo(String InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }
    public String getItemCode() {
        return ItemCode;
    }
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }
    public String getItemName() {
        return ItemName;
    }
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    public double getUnitPrice() {
        return UnitPrice;
    }
    public void setUnitPrice(double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }
    public double getTotal() {
        return Total;
    }
    public void setTotal(double Total) {
        this.Total = Total;
    }

    public void addPayments(Payments obj) throws Exception
    {
        String SQL = "insert into [Payments] values('"+obj.InvoiceNo+"','"+obj.ItemCode+"','"
              +obj.ItemName+"','"+obj.Quantity+"','"+obj.UnitPrice+"','"+obj.Total+"')";  
       DBConnection objcon=new DBConnection();
        System.out.println(" "+SQL);
        objcon.addvalue(SQL);
    }
    
}
