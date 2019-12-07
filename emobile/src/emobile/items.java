/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emobile;

public class items 
{
 private String Item_code;
 private String Name;
 private String Description;
 private int Reorder_Level;
 private double Unit_Price;
 private String Remarks;

    public String getItem_code() {
        return Item_code;
    }
    public void setItem_code(String Item_code) {
        this.Item_code = Item_code;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }
    public int getReorder_Level() {
        return Reorder_Level;
    }
    public void setReorder_Level(int Reorder_Level) {
        this.Reorder_Level = Reorder_Level;
    }
    public double getUnit_Price() {
        return Unit_Price;
    }
    public void setUnit_Price(double Unit_Price) {
        this.Unit_Price = Unit_Price;
    }
    public String getRemarks() {
        return Remarks;
    }
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }
    public void additems(items obj) throws Exception
    {           
      String SQL = "insert into [items] values('"+obj.Item_code+"','"+obj.Name+"','"
              +obj.Description+"','"+obj.Reorder_Level+"','"+obj.Unit_Price+"','"+obj.Remarks+"')";  
        DBConnection objcon=new DBConnection();
        System.out.println(" "+SQL);
        objcon.addvalue(SQL);
    }
}
