import javax.xml.transform.Result;
import java.sql.*;

public class DBConnect {
    public static void main(String[] args){
        Connection connect = null;
        String url = "jdbc:mysql://localhost/employees?user=root&password=mysql";
        String sql = "SELECT * FROM employees";
        try{
            connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);
            while( data.next()){
                System.out.println("ID: " + data.getInt(1));
                System.out.println("Name: " + data.getString(2));
                System.out.println("Position: " + data.getString(3));
                System.out.println("Salary: " + data.getInt(4));
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
