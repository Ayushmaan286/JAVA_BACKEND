import java.sql.*;
public class common_function {
    public static void main(String[] args) {

        //driver loaded
        Connection connect=null;
        Statement statement=null;
        try
         {
            Class.forName("com.mysql.cj.jdbc.Driver");
        //connection establishment
        String url="jdbc:mysql://localhost:3306/jdbc_learning";
        String user="root";
        String pass="Ahg@286!#$&"; 
        connect= DriverManager.getConnection(url,user,pass);

        //creating statment 
        statement=connect.createStatement();

        //exectuing query 
        // String sql="INSERT INTO studentinfo(ID,SNAME,SAGE,SCITY) VALUES (1,'Aman',45,'Lucknow')";
        String sql="SELECT * FROM studentinfo";
        // String sql="UPDATE studentinfo SET SCITY='KASHMIR' WHERE ID=1 OR ID=2 OR ID=3 ";
        boolean stats=statement.execute(sql);// true--> SELECT query , false--> NON SELECT query

        if(stats)
        {
            ResultSet rs=statement.getResultSet();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" ");
            }
        }
        else
        {
            //non select query
            System.out.println(statement.getUpdateCount()); 
        }

        }
        catch(SQLException ee)
        {
            ee.printStackTrace();
        } 
        catch(ClassNotFoundException df)
        {
            df.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try 
            {
                connect.close();
                statement.close();
            } catch (Exception e) 
            {
                e.printStackTrace();
            }
            
        }


    }
}
