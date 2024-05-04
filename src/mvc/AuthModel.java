package mvc;

import java.awt.CardLayout;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AuthModel {

	String usr;
	String pwd;
	
	public AuthModel() {
		// TODO Auto-generated constructor stub
		
	}
	
	public boolean login(String userName, String password) {
//		if(userName.equals("admin") && password.equals("123"))
//		{
//			return true;
//		}
//		return false;
		
		JSONParser parser = new JSONParser();
		
		usr = userName; 
	    pwd = password;
	    boolean found = false;
	    
	    try {
            
            Object obj = parser.parse(new FileReader("src/user")); 
            JSONObject jsonObject = (JSONObject) obj;
           
            JSONArray users = (JSONArray) jsonObject.get("users");

            for (Object user : users) //muestra los usuarios y las contraseñas del JSON
            {
                JSONObject userObject = (JSONObject) user;
                String username = (String) userObject.get("username");
                String passWord = (String) userObject.get("password");
                
                System.out.println("Username: " + username);
                System.out.println("Password: " + passWord);
                System.out.println();
                
                if (usr.equals(username) && pwd.equals(passWord))//verifica si la contraseña ingresada se encuentra en el JSON
                {
                    found = true;
                    
                    break;
                    
                }
                
            }
            
            if (found)//si encuentra la contraseña, lanza un mensaje y cambia de panel 
            {
                found = true;
                JOptionPane.showMessageDialog(null, "Welcome " + usr + "!");
                return true;
                
                
		     }
            else//si no lo encuentra lanza un mensaje de error
            {
            	JOptionPane.showMessageDialog(null, "Incorrect username or password. Please try again.");
            }
            
        } catch (IOException e1) 
		{
            e1.printStackTrace();
        } //Read json file path where json file in system
		catch (org.json.simple.parser.ParseException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	    return false;
	    
	}

}
