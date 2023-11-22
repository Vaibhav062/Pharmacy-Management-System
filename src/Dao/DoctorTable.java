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
public class DoctorTable {
    
    public static void main(String[] args){
        
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("create table doctorInfo(doctor_id int AUTO_INCREMENT primary key, doctorname varchar(200), speciality varchar(200), date varchar(200), patientname varchar(200))");
            st.executeUpdate("insert into doctorInfo(doctorname,speciality,date,patientname) values('Dr.Ashok Mishra','General Surgery','12-04-2023','VivekGupta')");
            JOptionPane.showMessageDialog(null, "Table create Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
