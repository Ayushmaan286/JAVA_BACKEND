import java.sql.*;

public class data_insertion {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        //load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //establish the connection
        String url="jdbc:mysql://localhost:3306/jdbc_learning";
        String user="root";
        String password="Ahg@286!#$&";
        Connection connect = DriverManager.getConnection(url, user , password);

        // creating statement
        Statement statement = connect.createStatement();
        
        //exceute the query
        String sql=" INSERT INTO studentinfo(ID,SNAME,SAGE,SCITY) VALUES(3,'ARYANMANN',44,'GOA') ";

        int rowAffected= statement.executeUpdate(sql); 
        if(rowAffected==0)
        {
            System.out.println("Unable to insert data");
        }
        else
        {
            System.out.println("data inserted succesfully and rows affected are "+rowAffected);
        }
        // process the result

        //close the resources
        
        statement.close();
        connect.close();


    }
    
}
