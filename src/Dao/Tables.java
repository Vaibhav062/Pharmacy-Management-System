/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Tables {
    public static void main(String[] args){
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("create table appuser(appuser_id int AUTO_INCREMENT primary key,name varchar(200),dob varchar(200),phoneNumber varchar(50),email varchar(200),username varchar(200),password varchar(200))");
            st.executeUpdate("insert into appuser (name,email,password,username,phoneNumber,dob) values('Vivek','vivek@gmail.com','112233','vivek123','4523561289','14-10-2000')");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
}
