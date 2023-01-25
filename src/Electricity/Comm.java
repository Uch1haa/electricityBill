package Electricity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Comm {
    Connection c;
    Statement s;
    public Comm(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jbdc:mysql:///ebs","root","mysql123");
            s = c.createStatement();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
