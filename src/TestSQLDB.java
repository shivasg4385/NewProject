import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSQLDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=EMPLOYEE_DB;user=sa;password=Test1234$";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String SQL = "SELECT * FROM emp";
            ResultSet rs = stmt.executeQuery(SQL);

            System.out.println("Empno\t\t Ename\t\t Job\t\t Manager\t\t HireDate\t\t Salary\t\t Comm\t\t Deptno");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                //System.out.println(rs.getString("ename") + "\t " + rs.getString("job"));
                
                System.out.println(rs.getInt(1) + "\t\t " + rs.getString("ename")+"\t\t" +rs.getString("job") + "\t\t " + rs.getString("mgr")+"\t\t"+rs.getString("hiredate") + 
                		"\t\t" + rs.getString("sal")+"\t\t"+rs.getString("comm") + "\t\t" + rs.getString("deptno"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally
        {
        	System.out.println("User is able to connect SQL Server successfully!!!");
        }
	}

}
