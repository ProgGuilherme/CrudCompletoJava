
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conecxao {
    private static final String DRIVER = "#";
    private static final String URL = "#";
    private static final String USER = "#";
    private static final String PASS = "#";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro ao conectar com o banco de dados. ", ex);
        }
    }   
    
    public static void closeConnection(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados.",ex);
        }
    }
    
    public static void closeConnection(Connection con,PreparedStatement stmt){
        closeConnection(con);
        try {
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados.",ex);
        }
    }
    
    public static void closeConnection(Connection con,PreparedStatement stmt,ResultSet rs){
        closeConnection(con, stmt);
        try {
            rs.close();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados.",ex);
        }
    }
}
