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
public class NewUser 
{
    private String UserName;
    private String Type;
    private String Password;
    private String ConfirmPassword;

    
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    public String getType() {
        return Type;
    }
    public void setType(String Type) {
        this.Type = Type;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getConfirmPassword() {
        return ConfirmPassword;
    }
    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }
    public void addUsers(NewUser obj) throws Exception
    {
        String SQL ="insert into [Users] values('"+obj.UserName+"','"+obj.Password+"',"
                + "'"+obj.ConfirmPassword+"','"+obj.Type+"')";
        DBConnection objcon=new DBConnection();
        System.out.println(" "+SQL);
        objcon.addvalue(SQL);
    }
    
}
