import java.sql.*;

public class DatabaseSelect {
    // Database connection details
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/company_db?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static void runQuery() {
        String query = "SELECT * FROM EMP";

        try {
            // Loading MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishing Connection
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Connected to database!");

            // Creating a Statement
            Statement stmt = conn.createStatement();

            // Executing the Query
            ResultSet rs = stmt.executeQuery(query);

            // Processing the Results
            System.out.println("\nEMP Table Data:");
            while (rs.next()) {
                int empNo = rs.getInt("EMPNO");
                String eName = rs.getString("ENAME");
                String job = rs.getString("JOB");
                int mgr = rs.getInt("MGR");
                Date hireDate = rs.getDate("HIREDATE");
                double sal = rs.getDouble("SAL");
                Double comm = rs.getObject("COMM") != null ? rs.getDouble("COMM") : null;
                int deptNo = rs.getInt("DEPTNO");

                System.out.printf("%d | %s | %s | %d | %s | %.2f | %s | %d\n",
                        empNo, eName, job, mgr, hireDate, sal, comm, deptNo);
            }

            // Closing resources
            rs.close();
            stmt.close();
            conn.close();
            System.out.println("\n✅ Query executed successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
