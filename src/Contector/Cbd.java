/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Contector;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author back
 */
public class Cbd {
      public String bd="juego_matematicas";
    public String Us="root";
    public String Co="";
    public String Url="jdbc:mysql://localhost/"+bd;;
    public String Com= null;
    
    public Cbd(){
        
    }
    
    public Connection Conectar(){
        
       Connection link= null;
       try{
           Class.forName("org.gjt.mm.mysql.Driver");
           link=DriverManager.getConnection(this.Url,this.Us,this.Co);
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       return link; 
    }
    
    
}
