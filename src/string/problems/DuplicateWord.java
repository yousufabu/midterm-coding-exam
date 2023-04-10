package string.problems;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
        // Create a MySQL database connection
        String url = "jdbc:mysql://localhost:3306/primes?useSSL=false";
        String username = "root";
        String password = "password";
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Create a table to store prime numbers
            String createTableQuery = "CREATE TABLE IF NOT EXISTS primes (number INT PRIMARY KEY)";
            PreparedStatement createTableStmt = connection.prepareStatement(createTableQuery);
            createTableStmt.executeUpdate();


            int n = 1000000; // Range upper limit
            boolean[] isPrime = new boolean[n + 1]; // Boolean array to store prime numbers


            // Initialize all numbers as prime
            for (int i = 2; i <= n; i++) {
                isPrime[i] = true;
            }


            // Mark multiples of prime numbers as not prime
            for (int i = 2; i * i <= n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }


            // Insert prime numbers into the database
            String insertQuery = "INSERT INTO primes (number) VALUES (?)";
            PreparedStatement insertStmt = connection.prepareStatement(insertQuery);
            for (int i = 2; i <= n; i++) {
                if (isPrime[i]) {
                    insertStmt.setInt(1, i);
                    insertStmt.executeUpdate();
                }
            }


            System.out.println("Total number of prime numbers: " + (n - 1)); // Excluding 1 from the count
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
