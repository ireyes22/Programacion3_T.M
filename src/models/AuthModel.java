package models;
import java.sql.*;  

public class AuthModel {

    public AuthModel() {
        // Constructor
    }
    
    public void login(String userName, String password) 
    {
//        if(userName.equals("Irais") && password.equals("Reyes"))
//        {
//            System.out.println("holi");
//        }
//        else 
//        {
//            System.out.println("verifica tus datos");
//        }
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://sql.freedb.tech:3306/freedb_testeodb", "freedb_irais2301", "F%ZWqAFw2d3*jbB");
            
            Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");  
            
            if (rs.equals(rs)) {
                System.out.println("Bienvenido");
                while(rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));  
                }
            } else {
                System.out.println("Verifica tus datos");
            }
             
            con.close();  
            
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    } 
}